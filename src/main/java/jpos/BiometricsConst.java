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

public abstract interface BiometricsConst
{
	public static final int BIO_CSC_MONO = 1;
	public static final int BIO_CSC_GRAYSCALE = 2;
	public static final int BIO_CSC_16 = 4;
	public static final int BIO_CSC_256 = 8;
	public static final int BIO_CSC_FULL = 16;
	public static final int BIO_CSO_NORMAL = 1;
	public static final int BIO_CSO_RIGHT = 2;
	public static final int BIO_CSO_INVERTED = 4;
	public static final int BIO_CSO_LEFT = 8;
	public static final int BIO_CST_FACIAL_FEATURES = 1;
	public static final int BIO_CST_VOICE = 2;
	public static final int BIO_CST_FINGERPRINT = 4;
	public static final int BIO_CST_IRIS = 8;
	public static final int BIO_CST_RETINA = 16;
	public static final int BIO_CST_HAND_GEOMETRY = 32;
	public static final int BIO_CST_SIGNATURE_DYNAMICS = 64;
	public static final int BIO_CST_KEYSTROKE_DYNAMICS = 128;
	public static final int BIO_CST_LIP_MOVEMENT = 256;
	public static final int BIO_CST_THERMAL_FACE_IMAGE = 512;
	public static final int BIO_CST_THERMAL_HAND_IMAGE = 1024;
	public static final int BIO_CST_GAIT = 2048;
	public static final int BIO_CST_PASSWORD = 4096;
	public static final int BIO_SC_MONO = 1;
	public static final int BIO_SC_GRAYSCALE = 2;
	public static final int BIO_SC_16 = 3;
	public static final int BIO_SC_256 = 4;
	public static final int BIO_SC_FULL = 5;
	public static final int BIO_SO_NORMAL = 1;
	public static final int BIO_SO_RIGHT = 2;
	public static final int BIO_SO_INVERTED = 3;
	public static final int BIO_SO_LEFT = 4;
	public static final int BIO_ST_FACIAL_FEATURES = 1;
	public static final int BIO_ST_VOICE = 2;
	public static final int BIO_ST_FINGERPRINT = 3;
	public static final int BIO_ST_IRIS = 4;
	public static final int BIO_ST_RETINA = 5;
	public static final int BIO_ST_HAND_GEOMETRY = 6;
	public static final int BIO_ST_SIGNATURE_DYNAMICS = 7;
	public static final int BIO_ST_KEYSTROKE_DYNAMICS = 8;
	public static final int BIO_ST_LIP_MOVEMENT = 9;
	public static final int BIO_ST_THERMAL_FACE_IMAGE = 10;
	public static final int BIO_ST_THERMAL_HAND_IMAGE = 11;
	public static final int BIO_ST_GAIT = 12;
	public static final int BIO_ST_PASSWORD = 13;
	public static final boolean BIO_FAR_PRECEDENCE = true;
	public static final boolean BIO_FRR_PRECEDENCE = false;
	public static final int BIO_DATA_ENROLL = 1;
	public static final int BIO_DATA_VERIFY = 2;
	public static final int BIO_SUE_RAW_DATA = 1;
	public static final int BIO_SUE_MOVE_LEFT = 2;
	public static final int BIO_SUE_MOVE_RIGHT = 3;
	public static final int BIO_SUE_MOVE_DOWN = 4;
	public static final int BIO_SUE_MOVE_UP = 5;
	public static final int BIO_SUE_MOVE_CLOSER = 6;
	public static final int BIO_SUE_MOVE_AWAY = 7;
	public static final int BIO_SUE_MOVE_BACKWARD = 8;
	public static final int BIO_SUE_MOVE_FORWARD = 9;
	public static final int BIO_SUE_MOVE_SLOWER = 10;
	public static final int BIO_SUE_MOVE_FASTER = 11;
	public static final int BIO_SUE_SENSOR_DIRTY = 12;
	public static final int BIO_SUE_FAILED_READ = 13;
	public static final int BIO_SUE_SENSOR_READY = 14;
	public static final int BIO_SUE_SENSOR_COMPLETE = 15;
}
