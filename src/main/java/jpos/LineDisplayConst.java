/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2019 Miss Amelia Sara (Millie) <me@missameliasara.com>
 * Copyright (c) 2019 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package jpos;

public abstract interface LineDisplayConst
{
	public static final int DISP_CB_NOBLINK = 0;
	public static final int DISP_CB_BLINKALL = 1;
	public static final int DISP_CB_BLINKEACH = 2;
	public static final int DISP_CCS_NUMERIC = 0;
	public static final int DISP_CCS_ALPHA = 1;
	public static final int DISP_CCS_ASCII = 998;
	public static final int DISP_CCS_KANA = 10;
	public static final int DISP_CCS_KANJI = 11;
	public static final int DISP_CCS_UNICODE = 997;
	public static final int DISP_CCT_NONE = 0;
	public static final int DISP_CCT_FIXED = 1;
	public static final int DISP_CCT_BLOCK = 2;
	public static final int DISP_CCT_HALFBLOCK = 4;
	public static final int DISP_CCT_UNDERLINE = 8;
	public static final int DISP_CCT_REVERSE = 16;
	public static final int DISP_CCT_OTHER = 32;
	public static final int DISP_CCT_BLINK = 64;
	public static final int DISP_CRB_NONE = 0;
	public static final int DISP_CRB_SINGLE = 1;
	public static final int DISP_CR_NONE = 0;
	public static final int DISP_CR_REVERSEALL = 1;
	public static final int DISP_CR_REVERSEEACH = 2;
	public static final int DISP_CS_UNICODE = 997;
	public static final int DISP_CS_ASCII = 998;
	public static final int DISP_CS_ANSI = 999;
	public static final int DISP_CT_NONE = 0;
	public static final int DISP_CT_FIXED = 1;
	public static final int DISP_CT_BLOCK = 2;
	public static final int DISP_CT_HALFBLOCK = 3;
	public static final int DISP_CT_UNDERLINE = 4;
	public static final int DISP_CT_REVERSE = 5;
	public static final int DISP_CT_OTHER = 6;
	public static final int DISP_CT_BLINK = 268435456;
	public static final int DISP_MT_NONE = 0;
	public static final int DISP_MT_UP = 1;
	public static final int DISP_MT_DOWN = 2;
	public static final int DISP_MT_LEFT = 3;
	public static final int DISP_MT_RIGHT = 4;
	public static final int DISP_MT_INIT = 5;
	public static final int DISP_MF_WALK = 0;
	public static final int DISP_MF_PLACE = 1;
	public static final int DISP_GT_SINGLE = 1;
	public static final int DISP_DT_NORMAL = 0;
	public static final int DISP_DT_BLINK = 1;
	public static final int DISP_DT_REVERSE = 2;
	public static final int DISP_DT_BLINK_REVERSE = 3;
	public static final int DISP_ST_UP = 1;
	public static final int DISP_ST_DOWN = 2;
	public static final int DISP_ST_LEFT = 3;
	public static final int DISP_ST_RIGHT = 4;
	public static final int DISP_SD_OFF = 0;
	public static final int DISP_SD_ON = 1;
	public static final int DISP_SD_BLINK = 2;
	public static final int DISP_BM_ASIS = -11;
	public static final int DISP_BM_LEFT = -1;
	public static final int DISP_BM_CENTER = -2;
	public static final int DISP_BM_RIGHT = -3;
	public static final int DISP_BM_TOP = -1;
	public static final int DISP_BM_BOTTOM = -3;
	public static final int JPOS_EDISP_TOOBIG = 201;
	public static final int JPOS_EDISP_BADFORMAT = 202;
}
