package com.darshan.customtags;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateGreeting {
    public String getDateGreeting() throws IOException {
        String Greeting = "Good ";
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new Date());
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        if(hourOfDay >= 0 && hourOfDay <12) {
            Greeting = Greeting + "Morning";
        } else if(hourOfDay >= 12 && hourOfDay <16) {
            Greeting = Greeting + "Afternoon";
        } else if(hourOfDay >= 16 && hourOfDay <20) {
            Greeting = Greeting + "Evening";
        } else {
            Greeting = Greeting + "Night";
        }
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.MONTH));
        String holidayGreeting = getHoliday(calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
        if(holidayGreeting.equals("No National Holiday")) {
            Greeting = Greeting + ". No holiday to report";
            return Greeting;
        }
        return Greeting + ". It's " + holidayGreeting;
    }
    public String getHoliday(int month, int day) throws IOException {
        if(month == 1 && day ==1) {
            return "New Year's Day";
        } else if (month == 1 && day ==15) {
            return "Martin Luther King, Jr. Day";
        } else if (month == 2 && day ==19) {
            return "George Washington's Birthday";
        } else if (month == 5 && day ==28) {
            return "Memorial Day";
        } else if (month == 7 && day ==4) {
            return "Independence Day";
        } else if (month == 9 && day ==3) {
            return "Labor Day";
        } else if (month == 10 && day ==8) {
            return "Columbus Day";
        } else if (month == 11 && day ==11) {
            return "Veterans Day";
        } else if (month == 11 && day ==22) {
            return "Thanksgiving Day";
        } else if (month == 12 && day ==25) {
            return "Christmas Day";
        }
        return "No National Holiday";
    }
}
