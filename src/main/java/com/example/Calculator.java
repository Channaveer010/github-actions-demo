package com.example;

import java.util.Comparator;
import java.util.List;

public class Calculator {

    public boolean isEven(int number){
        return number % 2 == 0;
    }

    public int secondHighestNumber(List<Integer> numbers) throws Exception {

        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new Exception("No Second Number found"));

    }
}
