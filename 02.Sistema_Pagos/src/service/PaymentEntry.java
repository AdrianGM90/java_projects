package service;

import model.PaymentMethod;

/**
 * Representa una entrada en el carrito de pagos, compuesta por un
 * método de pago y una cantidad
 */
public class PaymentEntry {
    private PaymentMethod method;
    private double amount;

    /**
     * Crea una instancia de un pago para el carrito de pagos.
     *
     * @param method Especifica el método de pago que se a a emplear.
     * @param amount Cantidad que se va a pagar.
     */
    public PaymentEntry(PaymentMethod method, double amount) {
        this.method = method;
        this.amount = amount;
    }

    /**
     * Getter para devolver el valor de method.
     */
    public PaymentMethod getMethod() {
        return method;
    }

    /**
     * Getter para devolver el valor de amount.
     */
    public double getAmount() {
        return amount;
    }
}