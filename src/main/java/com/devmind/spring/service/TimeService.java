package com.devmind.spring.service;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeService {

    public String getTimeAndDate(Locale locale) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        return dateFormat.format(date);
    }
}
