package br.com.redew.model.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraImplTest {

    private static CalculadoraImpl calculadoraImpl;
    private static double resultadoEsperado = 3;

    @BeforeAll
    static void initAll() {
        calculadoraImpl = new CalculadoraImpl();
    }

    @Test
    void deveSomarDoisValores() {
        double numero1 = 1;
        double numero2 = 2;
        double resultado = calculadoraImpl.soma(numero1, numero2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void deveSubtrairDoisValores() {
        double numero1 = 4;
        double numero2 = 1;
        double resultado = calculadoraImpl.subtracao(numero1, numero2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void deveMultiplicarDoisValores() {
        double numero1 = 3;
        double numero2 = 1;
        double resultado = calculadoraImpl.multiplicacao(numero1, numero2);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void deveDividirDoisValores() {
        double numero1 = 3;
        double numero2 = 1;
        double resultado = calculadoraImpl.divisao(numero1, numero2);

        assertEquals(resultadoEsperado, resultado);
    }
}