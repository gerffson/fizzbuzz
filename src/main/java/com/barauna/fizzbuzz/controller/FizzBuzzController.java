package com.barauna.fizzbuzz.controller;

import com.barauna.fizzbuzz.business.FizzBuzzBusiness;
import com.barauna.fizzbuzz.exception.FizzBuzzException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzbuzz")
public class FizzBuzzController {

    private static Logger log = LoggerFactory.getLogger(FizzBuzzController.class);

    @Autowired
    private FizzBuzzBusiness fizzBuzzBusiness;

    @GetMapping("/play/{number}")
    public String play(@PathVariable Integer number) {
        try {
            return fizzBuzzBusiness.play(number);
        } catch (FizzBuzzException e) {
            return "Erro ao calcular Rizzbuzz";
        }
    }

    @GetMapping("/logs")
    public String logs() {
        log.trace("Logando o trace");
        log.info("Logando o info");
        log.warn("Logando o warn");
        log.error("Logando o error");

        return "Teste de coleta de logs";
    }
}
