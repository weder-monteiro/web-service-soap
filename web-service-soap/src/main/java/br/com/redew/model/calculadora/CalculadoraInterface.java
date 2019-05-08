package br.com.redew.model.calculadora;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService // Indica que o arquivo atual corresponde à definição SEI (Service Endpoint
            // Interface) de um serviço Web.
@SOAPBinding(style = Style.RPC) // Indica que o serviço utilizará a abordagem SOAP e não Rest que é a outra
                                // abordagem suportada.
public interface CalculadoraInterface {
    @WebMethod // Indica que um determinado método corresponde a uma operação de serviço e
               // assim pode ser invocado por um cliente.
    double soma(double numero1, double numero2);

    @WebMethod
    double subtracao(double numero1, double numero2);

    @WebMethod
    double multiplicacao(double numero1, double numero2);

    @WebMethod
    double divisao(double numero1, double numero2);
}