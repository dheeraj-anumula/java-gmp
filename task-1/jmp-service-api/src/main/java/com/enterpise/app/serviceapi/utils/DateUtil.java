package com.enterpise.app.serviceapi.utils;

import java.time.LocalDate;

public class DateUtil {

    public static double getAge(LocalDate birthDate) {
        return LocalDate.now().getYear() - birthDate.getYear();
    }
}
