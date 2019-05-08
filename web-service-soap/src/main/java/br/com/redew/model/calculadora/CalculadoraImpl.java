package br.com.redew.model.calculadora;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.redew.model.calculadora.CalculadoraInterface") // Faz com que a SIB(Service Implementation Bean), ligue-se com
                                                        // a SEI(Service Endpoint Interface) especificada
public class CalculadoraImpl implements CalculadoraInterface {

    public CalculadoraImpl() {
    }

    public double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    @Override
    public double subtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }

    @Override
    public double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }

    @Override
    public double divisao(double numero1, double numero2) {
        return numero1 / numero2;
    }
}