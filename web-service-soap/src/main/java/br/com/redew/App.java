package br.com.redew;

import javax.xml.ws.Endpoint;

import br.com.redew.model.calculadora.CalculadoraImpl;

public class App {
    public static void main(String[] args) {
        // Permite publicar um serviço em um servidor
        Endpoint.publish("http://127.0.0.1:80/calculadora", new CalculadoraImpl());
        // Para acessar http://127.0.0.1/calculadora?wsdl
    }
}
