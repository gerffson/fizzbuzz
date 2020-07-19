package com.barauna.fizzbuzz.business;

import java.util.stream.IntStream;

import com.barauna.fizzbuzz.exception.FizzBuzzException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FizzBuzzBusiness {

    private static final Logger log = LoggerFactory.getLogger(FizzBuzzBusiness.class);

    public String play(final Integer value) throws FizzBuzzException {
        log.info(String.format("Calculando o fizbuzz do numero %d", value ));

        if (value <= 0) {
                throw new FizzBuzzException("Necessario elemento maior que zero !");
        }

        final StringBuilder builder = new StringBuilder();
        Integer maxElements = value;
        IntStream.range(1, ++maxElements).forEach(x -> {
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

        String fizzbuzz = builder.substring(0, builder.length() - 1).trim();
        log.info(String.format("Calculado o fizbuzz do numero %d : %s", value, fizzbuzz));
        return fizzbuzz;
    }

}
