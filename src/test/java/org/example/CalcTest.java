package org.example;

import org.junit.jupiter.api.*;

class CalcTest {

    @BeforeAll
    public  static  void setUp() {
        System.out.println("before all");
    }

    @BeforeEach
    public void  setupEach() {
        System.out.println("after all");
    }

    @AfterEach
    public void afretEach() {
        System.out.println("after each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    void sum() {
        Calc calc = new Calc();
        int result = calc.summ(1, 10);
        Assertions.assertEquals(11, result, "Провален");

    }

    @Test
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)
    @Tag("regress")
    void sum2() {
        Calc calc = new Calc();
        int result = calc.summ(1, 10);
        Assertions.assertEquals(11, result, "Провален");

    }
}