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

public abstract interface JposConst
{
	public static final int JPOS_S_CLOSED = 1;
	public static final int JPOS_S_IDLE = 2;
	public static final int JPOS_S_BUSY = 3;
	public static final int JPOS_S_ERROR = 4;
	public static final int JPOSERR = 100;
	public static final int JPOSERREXT = 200;
	public static final int JPOS_SUCCESS = 0;
	public static final int JPOS_E_CLOSED = 101;
	public static final int JPOS_E_CLAIMED = 102;
	public static final int JPOS_E_NOTCLAIMED = 103;
	public static final int JPOS_E_NOSERVICE = 104;
	public static final int JPOS_E_DISABLED = 105;
	public static final int JPOS_E_ILLEGAL = 106;
	public static final int JPOS_E_NOHARDWARE = 107;
	public static final int JPOS_E_OFFLINE = 108;
	public static final int JPOS_E_NOEXIST = 109;
	public static final int JPOS_E_EXISTS = 110;
	public static final int JPOS_E_FAILURE = 111;
	public static final int JPOS_E_TIMEOUT = 112;
	public static final int JPOS_E_BUSY = 113;
	public static final int JPOS_E_EXTENDED = 114;
	public static final int JPOS_E_DEPRECATED = 115;
	public static final int JPOS_ESTATS_ERROR = 280;
	public static final int JPOS_EFIRMWARE_BAD_FILE = 281;
	public static final int JPOS_ESTATS_DEPENDENCY = 282;
	public static final int JPOS_BC_NONE = 0;
	public static final int JPOS_BC_NIBBLE = 1;
	public static final int JPOS_BC_DECIMAL = 2;
	public static final int JPOS_CH_INTERNAL = 1;
	public static final int JPOS_CH_EXTERNAL = 2;
	public static final int JPOS_CH_INTERACTIVE = 3;
	public static final int JPOS_PR_NONE = 0;
	public static final int JPOS_PR_STANDARD = 1;
	public static final int JPOS_PR_ADVANCED = 2;
	public static final int JPOS_PN_DISABLED = 0;
	public static final int JPOS_PN_ENABLED = 1;
	public static final int JPOS_PS_UNKNOWN = 2000;
	public static final int JPOS_PS_ONLINE = 2001;
	public static final int JPOS_PS_OFF = 2002;
	public static final int JPOS_PS_OFFLINE = 2003;
	public static final int JPOS_PS_OFF_OFFLINE = 2004;
	public static final int JPOS_CFV_FIRMWARE_OLDER = 1;
	public static final int JPOS_CFV_FIRMWARE_SAME = 2;
	public static final int JPOS_CFV_FIRMWARE_NEWER = 3;
	public static final int JPOS_CFV_FIRMWARE_DIFFERENT = 4;
	public static final int JPOS_CFV_FIRMWARE_UNKNOWN = 5;
	public static final int JPOS_EL_OUTPUT = 1;
	public static final int JPOS_EL_INPUT = 2;
	public static final int JPOS_EL_INPUT_DATA = 3;
	public static final int JPOS_ER_RETRY = 11;
	public static final int JPOS_ER_CLEAR = 12;
	public static final int JPOS_ER_CONTINUEINPUT = 13;
	public static final int JPOS_SUE_POWER_ONLINE = 2001;
	public static final int JPOS_SUE_POWER_OFF = 2002;
	public static final int JPOS_SUE_POWER_OFFLINE = 2003;
	public static final int JPOS_SUE_POWER_OFF_OFFLINE = 2004;
	public static final int JPOS_SUE_UF_PROGRESS = 2100;
	public static final int JPOS_SUE_UF_COMPLETE = 2200;
	public static final int JPOS_SUE_UF_FAILED_DEV_OK = 2201;
	public static final int JPOS_SUE_UF_FAILED_DEV_UNRECOVERABLE = 2202;
	public static final int JPOS_SUE_UF_FAILED_DEV_NEEDS_FIRMWARE = 2203;
	public static final int JPOS_SUE_UF_FAILED_DEV_UNKNOWN = 2204;
	public static final int JPOS_SUE_UF_COMPLETE_DEV_NOT_RESTORED = 2205;
	public static final int JPOS_FOREVER = -1;
}
