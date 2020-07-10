package com.barauna.fizzbuzz.business;

import java.util.stream.IntStream;

import com.barauna.fizzbuzz.exception.FizzBuzzException;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzBusiness {

    public String play(Integer value) throws FizzBuzzException {
        if (value <= 0) {
            throw new FizzBuzzException("Necessario elemento maior que zero !");
        }

        final StringBuilder builder = new StringBuilder();
        IntStream.range(1, ++value).forEach(x -> {
            if (x % 3 == 0 && x % 5 == 0) {
                builder.append(" Fizz Buzz,");
            } else if (x % 3 == 0) {
                builder.append(" Fizz,");
            } else if (x % 5 == 0) {
                builder.append(" Buzz,");
            } else {
                builder.append(String.format(" %d,", x));
            }
        });

        return builder.substring(0, builder.length() - 1).trim();
    }

}
