package ru.netology.javaqa.javamvn.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
// import ru.netology.javaqa.javamvn.services.RestService;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void howManyMonthRest(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

        // int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        System.out.println("Количество месяцев отдыха в году " + actual);
        Assertions.assertEquals(expected, actual);
    }
}