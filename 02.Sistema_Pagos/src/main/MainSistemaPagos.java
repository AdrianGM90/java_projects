package main;

import model.PaymentMethod;
import model.CreditCardPayment;
import model.PayPalPayment;
import model.CryptoPayment;
import service.PaymentProcessor;

/**
 * Clase principal para probar el sistema de pagos con diferentes métodos.
 */
public class MainSistemaPagos {
    public static void main(String[] args) {
// Creación de instancias de métodos de pago
        PaymentMethod tarjeta = new CreditCardPayment("1234567812345678", "Juan Pérez", "12/27", "123");
        PaymentMethod paypal = new PayPalPayment("juan.perez@email.com", "passwordgenerica");
        PaymentMethod crypto = new CryptoPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa", "Bitcoin");
// Creación del procesador de pagos
        PaymentProcessor processor = new PaymentProcessor();
// Procesar pagos utilizando los diferentes métodos.
        System.out.println("=== Pago con tarjeta de crédito ===");
        processor.processPayment(tarjeta, 120.50);
        System.out.println("\n=== Pago con PayPal ===");
        processor.processPayment(paypal, 75.00);
        System.out.println("\n=== Pago con criptomonedas ===");
        processor.processPayment(crypto, 0.002345);
    }
}