package br.com.redew;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.Endpoint;

import br.com.redew.model.calculadora.CalculadoraImpl;
import br.com.redew.model.calculadora.CalculadoraInterface;

public class App {
    public static void main(String[] args) {
        // Permite publicar um serviço em um servidor acesso
        // http://127.0.0.1/calculadora?wsdl
        Endpoint.publish("http://127.0.0.1:80/calculadora", new CalculadoraImpl());

        // Utilizando serviço
        try {
            // Indicando onde o WSDL do serviço poderá ser encontrado
            URL url = new URL("http://127.0.0.1:80/calculadora?wsdl");

            // Indica uma URI (namespace) e o nome do serviço deve passar o caminho e o nome
            // da classe de implementação com service no final.
            QName qname = new QName("http://calculadora.model.redew.com.br/", "CalculadoraImplService");

            // Temos como retorno uma referência a um objeto que pode invocar as operações
            // oferecidas pelo serviço
            Service service = Service.create(url, qname);

            // Acessamos a interface de ponto final (endpoint) que é tipo SEI do serviço,
            // sendo capaz de acessar seus métodos.
            CalculadoraInterface calculadora = service.getPort(CalculadoraInterface.class);

            System.out.println("Soma (5+1): " + calculadora.soma(5, 1));
            System.out.println("Subtracao (5-1): " + calculadora.subtracao(5, 1));
            System.out.println("Multiplicacao (5*1): " + calculadora.multiplicacao(5, 1));
            System.out.println("Divisao (5/1): " + calculadora.divisao(5, 1));
        } catch (MalformedURLException mue) {
            System.out.println("Cara você escreveu uma url inválida");
        }
    }
}
