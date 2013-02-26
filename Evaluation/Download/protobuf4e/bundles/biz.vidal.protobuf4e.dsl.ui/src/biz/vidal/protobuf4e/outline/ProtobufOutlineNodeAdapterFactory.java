/*******************************************************************************
 * Copyright (c) 2010 Cedric Vidal
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cedric Vidal - original idea, initial contribution and API
 *******************************************************************************/

package biz.vidal.protobuf4e.outline;

import org.eclipse.xtext.ui.common.editor.outline.actions.DefaultContentOutlineNodeAdapterFactory;

public class ProtobufOutlineNodeAdapterFactory extends DefaultContentOutlineNodeAdapterFactory {

	private static final Class[] types = { 
		// provide list of classes to adapt to, e.g.:
		// Entity.class
		// Service.class
	};

	@Override
	public Class[] getAdapterList() {
		return types;
	}

}

