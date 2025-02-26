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
import jpos.loader.JposServiceInstance;

public abstract interface RFIDScannerService112 extends BaseService, JposServiceInstance
{
	public abstract boolean getCapCompareFirmwareVersion() throws JposException;

	public abstract boolean getCapContinuousRead() throws JposException;

	public abstract boolean getCapDisableTag() throws JposException;

	public abstract boolean getCapLockTag() throws JposException;

	public abstract int getCapMultipleProtocols() throws JposException;

	public abstract int getCapPowerReporting() throws JposException;

	public abstract boolean getCapReadTimer() throws JposException;

	public abstract boolean getCapRealTimeData() throws JposException;

	public abstract boolean getCapStatisticsReporting() throws JposException;

	public abstract boolean getCapUpdateFirmware() throws JposException;

	public abstract boolean getCapUpdateStatistics() throws JposException;

	public abstract int getCapWriteTag() throws JposException;

	public abstract boolean getAutoDisable() throws JposException;

	public abstract void setAutoDisable( boolean paramBoolean ) throws JposException;

	public abstract boolean getContinuousReadMode() throws JposException;

	public abstract byte[] getCurrentTagID() throws JposException;

	public abstract int getCurrentTagProtocol() throws JposException;

	public abstract byte[] getCurrentTagUserData() throws JposException;

	public abstract int getDataCount() throws JposException;

	public abstract boolean getDataEventEnabled() throws JposException;

	public abstract void setDataEventEnabled( boolean paramBoolean ) throws JposException;

	public abstract int getOutputID() throws JposException;

	public abstract int getPowerNotify() throws JposException;

	public abstract void setPowerNotify( int paramInt ) throws JposException;

	public abstract int getPowerState() throws JposException;

	public abstract int getProtocolMask() throws JposException;

	public abstract void setProtocolMask( int paramInt ) throws JposException;

	public abstract int getReadTimerInterval() throws JposException;

	public abstract void setReadTimerInterval( int paramInt ) throws JposException;

	public abstract int getTagCount() throws JposException;

	public abstract void clearInput() throws JposException;

	public abstract void clearInputProperties() throws JposException;

	public abstract void clearOutput() throws JposException;

	public abstract void compareFirmwareVersion( String paramString, int[] paramArrayOfInt ) throws JposException;

	public abstract void disableTag( byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2 ) throws JposException;

	public abstract void firstTag() throws JposException;

	public abstract void lockTag( byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2 ) throws JposException;

	public abstract void nextTag() throws JposException;

	public abstract void previousTag() throws JposException;

	public abstract void readTags( int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, int paramInt4, byte[] paramArrayOfByte3 ) throws JposException;

	public abstract void resetStatistics( String paramString ) throws JposException;

	public abstract void retrieveStatistics( String[] paramArrayOfString ) throws JposException;

	public abstract void startReadTags( int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, byte[] paramArrayOfByte3 ) throws JposException;

	public abstract void stopReadTags( byte[] paramArrayOfByte ) throws JposException;

	public abstract void updateFirmware( String paramString ) throws JposException;

	public abstract void updateStatistics( String paramString ) throws JposException;

	public abstract void writeTagData( byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, byte[] paramArrayOfByte3 ) throws JposException;

	public abstract void writeTagID( byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt, byte[] paramArrayOfByte3 ) throws JposException;
}
