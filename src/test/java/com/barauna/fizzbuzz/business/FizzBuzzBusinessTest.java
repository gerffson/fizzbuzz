package com.barauna.fizzbuzz.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.annotation.security.RunAs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;

import com.barauna.fizzbuzz.exception.FizzBuzzException;

@TestInstance(Lifecycle.PER_CLASS)
public class FizzBuzzBusinessTest {

    @InjectMocks
    private FizzBuzzBusiness fizzBuzzBusiness;

    @BeforeAll
    public void setUp() {
        fizzBuzzBusiness = new FizzBuzzBusiness();
    }

    @Test
    public void testeComElementosNegativos() {
        Integer value = -1;
        assertThrows(FizzBuzzException.class,
                () -> {
                    fizzBuzzBusiness.play(value);
                });
    }

    @Test
    public void testeComZeroElementos() {
        Integer value = 0;
        assertThrows(FizzBuzzException.class,
                () -> {
                    fizzBuzzBusiness.play(value);
                });
    }

    @Test
    public void testeComTresElementos() throws FizzBuzzException {
        Integer value = 3;
        String expectedFizzBuzz = "1, 2, Fizz";
        String result = fizzBuzzBusiness.play(value);
        assertEquals(expectedFizzBuzz, result);
    }

    @Test
    public void testeComCincoElementos() throws FizzBuzzException {
        Integer value = 5;
        String expectedFizzBuzz = "1, 2, Fizz, 4, Buzz";
        String result = fizzBuzzBusiness.play(value);
        assertEquals(expectedFizzBuzz, result);
    }

    @Test
    public void testeComQuinzeElementos() throws FizzBuzzException {
        Integer value = 15;
        String expectedFizzBuzz = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz";
        String result = fizzBuzzBusiness.play(value);
        assertEquals(expectedFizzBuzz, result);
    }

}
