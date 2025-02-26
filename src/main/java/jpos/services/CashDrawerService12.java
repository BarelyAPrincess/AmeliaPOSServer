/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.services;

import jpos.JposException;

public abstract interface CashDrawerService12 extends BaseService
{
	public abstract boolean getCapStatus() throws JposException;

	public abstract boolean getDrawerOpened() throws JposException;

	public abstract void openDrawer() throws JposException;

	public abstract void waitForDrawerClose( int paramInt1, int paramInt2, int paramInt3, int paramInt4 ) throws JposException;
}
