package com.pitavya.breathe.utils;

import java.sql.Timestamp;

public class DateUtils {

	public static Timestamp getTimeStamp() {
		return new Timestamp(System.currentTimeMillis());
	}

}
