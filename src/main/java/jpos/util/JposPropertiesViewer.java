/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos.util;

import java.io.PrintStream;

import jpos.loader.JposServiceLoader;
import jpos.loader.JposServiceManager;

public class JposPropertiesViewer
{
	public static void main( String[] paramArrayOfString )
	{
		System.out.println( "<!-- JavaPOS jpos.config/loader (JCL) defined Java properties: -->" );
		System.out.println( "<!-- name = \"propName\" value = \"propValue\" -->" );
		System.out.println( JposServiceLoader.getManager().getProperties() );
	}
}
