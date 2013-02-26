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

package biz.vidal.protobuf4e.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class ProtobufFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		biz.vidal.protobuf4e.services.ProtobufGrammarAccess f = (biz.vidal.protobuf4e.services.ProtobufGrammarAccess) getGrammarAccess();

		//...
	}
}
