package service;

import model.PaymentMethod;

/**
 * Clase encargada de procesar pagos utilizando un método de pago específico.
 */
public class PaymentProcessor {
    /**
     * Efectúa el pago de una cantidad determinada considerando el método de pago
     * específico.
     *
     * @param method Método de pago específico a emplear.
     * @param amount Cantidad a pagar.
     */
    public void processPayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}