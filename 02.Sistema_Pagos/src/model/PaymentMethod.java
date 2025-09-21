package model;

/**
 * Representa un metodo genérico para realizar pagos.
 */
public interface PaymentMethod {
    /**
     * Permite realizar un pago de una cantidad determinada.
     * La forma de implementación se especificará en las clases que
     * implementen esta interfaz.
     */
    void pay(double amount);
}