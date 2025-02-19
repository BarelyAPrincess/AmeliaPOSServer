/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.events;

public class DataEvent extends JposEvent
{
	protected int status;

	public DataEvent( Object paramObject, int paramInt )
	{
		super( paramObject );
		status = paramInt;
	}

	public int getStatus()
	{
		return status;
	}
}
