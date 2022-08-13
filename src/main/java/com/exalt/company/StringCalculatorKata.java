package com.exalt.company;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class StringCalculatorKata {

    int add(String numbers) {

        String defaultSeparator = ",\n";
        int startingPoint = 0;

        if(!StringUtils.containsAny(numbers, "0123456789")){
            return 0;
        }

        if(numbers.length() > 4 && StringUtils.startsWith(numbers,"//")) {
            defaultSeparator = String.valueOf(numbers.charAt(2)) + "\n";
            startingPoint = 4;

        }

        List<String> numbersList = Arrays.asList(StringUtils.split(numbers.substring(startingPoint), defaultSeparator));
        Integer sum = numbersList.stream()
                .map(num -> {
                    Integer ret = Integer.parseInt(num);
                    if(ret < 0) {
                        throw new UnsupportedOperationException("negatives not allowed");
                    }
                    return ret;
                })
                .reduce(0, (a, b) -> a + b);
        return sum;
    }



}
