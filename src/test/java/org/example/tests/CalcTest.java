package org.example.tests;

import org.example.Calc;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("before all");
    }

    @BeforeEach
    public void setupEach() {
        System.out.println("after all");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("after each");
    }


    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1,2,3", "-1,2,1", "0,0,0"})
    @DisplayName("Проверка суммирования")
    @Tag("sum")
    void sum(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.sum(a, b);
        Assertions.assertEquals(expectedResult, result, "Провален");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"2,1,1", "-1,2,-3", "-1,-2,1", "0,0,0"})
    @DisplayName("Проверка вычитания")
    @Tag("sub")
    void sub(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.sub(a, b);
        Assertions.assertEquals(expectedResult, result, "Провален");
    }
}