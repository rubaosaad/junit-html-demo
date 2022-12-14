package io.javabrains.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CalcTest {

    private Calc calc;


    @BeforeEach
    void initEach() {
        calc = new Calc();
    }


    @Test
    void testeSomaPositiva() {
        assertEquals(2, calc.sum(1, 1),
                "Metodo devolve a soma de dois numeros");
    }

    @Test
    void testeSomaNegativos() {
        assertEquals(-2, calc.sum(-1, -1),
                "Metodo devolve a soma de dois numero");
    }

    @Test
    void testeSomaPositivaNegativa() {
        assertEquals(0, calc.sum(-1, 1),
                "Metodo devolve a soma de dois numero");
    }

    @Test
    void testeMultiplicacao() {
        assertAll(
                () -> assertEquals(0, calc.multi(1, 0)),
                () -> assertEquals(1, calc.multi(1, 1)),
                () -> assertEquals(6, calc.multi(2, 3))
        );
    }

    @Test
    void testeSubtracao() {
        assertEquals(3, calc.sub(5, 2),
                "Metodo devolve a subtracao de dois numeros");
    }

    @Test
    void testeDivisao() {
        assertThrows(ArithmeticException.class, () -> calc.div(1, 0),
                "Lança erro");
    }


}