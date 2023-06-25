package com.example.tutorium.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateService {

    public LocalTime getTime() {
        return LocalTime.now();
    }

    public String getDate(String format) {
        LocalDate localDate = LocalDate.now();
        if (format != null) {
            //es wurde ein format übergeben
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format); //yyyy-MM-dd
            return dtf.format(localDate);
        }
        // es wurde kein format übergeben
        return localDate.toString();
    }


}
