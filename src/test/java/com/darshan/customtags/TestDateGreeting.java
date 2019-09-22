package com.darshan.customtags;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestDateGreeting {
    private DateGreeting dateGreeting;
    @BeforeEach
    public void setUp() {
        dateGreeting = new DateGreeting();
    }
    @Test
    public void testGetDateGreeting() throws IOException {
        System.out.println(dateGreeting.getDateGreeting());
    }
    @Test
    public void testNewYears() throws IOException {

        assertEquals(dateGreeting.getHoliday(1,1),"New Year's Day");
    }
}

