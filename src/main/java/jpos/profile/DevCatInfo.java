/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.profile;

public abstract interface DevCatInfo
{
	public abstract Profile getProfile();

	public abstract DevCat getDevCat();

	public abstract PropInfoList getStandardProps();

	public abstract PropInfoList getRequiredProps();

	public abstract PropInfoList getOptionalProps();

	public abstract String toString();
}
