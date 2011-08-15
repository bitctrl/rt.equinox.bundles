/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/
package org.eclipse.equinox.bidi.advanced;

public interface ISTextExpertStateful extends ISTextExpert {

	public void setState(Object state);

	public Object getState();

	/**
	 * Resets non-shared expert state to initial.
	 */
	public void resetState();

}
