package com.company.ClassAssignmentREST.util;

import java.sql.Date;

public class DateUtil {

	public static Date convertStringDateToSqlDate(int dd,int mm,int yyyy) {
		String str= yyyy+"-"+mm+"-"+dd;//for e.g: 2015-03-31  
	    return Date.valueOf(str);//converting string into sql date  
	}
}
