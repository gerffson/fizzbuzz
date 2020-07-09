package com.barauna.fizzbuzz.business;

import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.barauna.fizzbuzz.exception.FizzBuzzException;

@Service
public class FizzBuzzBussiness {

	public String play(Integer value) throws FizzBuzzException {
		
		if(value<=0) {
			throw new FizzBuzzException("");
		}

		StringBuilder builder = new StringBuilder();

		IntStream.range(1, ++value).forEach(x -> {
			
			if (x % 3 == 0 && x % 5 == 0) {
				builder.append(" Fizz Buzz,");
			} else if (x % 3 == 0) {
				builder.append(" Fizz,");
			} else if (x % 5 == 0) {
				builder.append(" Buzz,");
			} else {
				builder.append(" ").append(x).append(",");
			}
			
		});
		
		return builder.substring(0,builder.length()-1).trim();
	}

}
