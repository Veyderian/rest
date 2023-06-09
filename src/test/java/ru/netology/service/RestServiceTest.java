package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class RestServiceTest {

    @ParameterizedTest
    // @CsvSource({
    //       "10000,3000,20000,3",
    //       "100000,60000,150000,2"
    // })
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouilTestCalculateRestMonthes1(int income, int expenses, int threshold, int expected) {
        RestService service = new RestService();
        int actual = service.calculate(income, expenses, threshold);
        //     int expected = 3;

        Assertions.assertEquals(actual, expected);

    }
    //   @Test

    //  void shouldTestCalculateRestMonthes2() {
    //       RestService service = new RestService();
    //     int actual = service.calculate(100_000, 60_000, 150_000);
    //     int expected = 2;

    //     Assertions.assertEquals(actual, expected);
    // }
}