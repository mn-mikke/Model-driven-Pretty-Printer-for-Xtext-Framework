package it.xtypes.ui.popup.actions;



import it.xtypes.typesystem.TypeSystemDefinition;
import it.xtypes.ui.util.XTypeSUiUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

public class GenerateTypeSystemCode implements IObjectActionDelegate {

	public class CompilationError extends Exception {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public CompilationError(String string) {
			super(string);
		}

	}

	protected static final int SUBMONITOR_TICKS = 100;

	protected static final int NUM_OF_KNOWN_GENERATED_CLASSES = 3;

	protected Shell shell;

	protected IStructuredSelection selection;

	protected static String outputFolder = "/src-gen-ts";

	/**
	 * Constructor for Action1.
	 */
	public GenerateTypeSystemCode() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
	

		IWorkbench wb = PlatformUI.getWorkbench();
		IProgressService ps = wb.getProgressService();
		try {
			ps.busyCursorWhile(new IRunnableWithProgress() {

				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {

				
				}
			});
		} catch (InvocationTargetException e1) {
			MessageDialog.openInformation(shell, "Compilation errors", e1
					.getCause().getMessage());
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		try {
			ResourcesPlugin.getWorkspace().getRoot()
					.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			this.selection = iStructuredSelection;
		}
	}




	private void validateTypeSystemDefinition(
			TypeSystemDefinition typeSystemDefinition, IPath resourcePath) throws CompilationError {
		Injector injector = null;
		IResourceServiceProvider serviceProvider = injector
				.getInstance(IResourceServiceProvider.class);
		IResourceValidator resourceValidator = serviceProvider
				.getResourceValidator();
		List<Issue> validate = resourceValidator.validate(
				typeSystemDefinition.eResource(), CheckMode.ALL, null);
		if (validate.size() == 0)
			return;
		StringBuffer errors = new StringBuffer();
		errors.append("FILE: " + resourcePath + "\n");
		for (Issue issue : validate) {
			errors.append(issue.getMessage() + "\n");
		}
		throw new CompilationError(errors.toString());
	}
}
