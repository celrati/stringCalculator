package com.exalt.company;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class StringCalculatorKata {

    int add(String numbers) {

        String separator = ",\n";
        if(StringUtils.isEmpty(numbers)){
            return 0;
        }

        List<String> numbersList = Arrays.asList(StringUtils.split(numbers, separator));
        Integer sum = numbersList.stream()
                .map(num -> Integer.parseInt(num))
                .reduce(0, (a, b) -> a + b);
        return sum;
    }



}
