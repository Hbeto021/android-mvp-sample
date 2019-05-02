package com.hbeto021.mvp.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    /**
     * Converts a date to String
     */
    public static String dateToString(Date date){
        SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyy-MM-dd ");
        return dateFormat.format(date);
    }

}
