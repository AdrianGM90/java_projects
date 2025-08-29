package main;

import model.PaymentMethod;
import model.CreditCardPayment;
import model.PayPalPayment;
import model.CryptoPayment;
import model.PaymentCart;

/**
 * Clase principal para probar el carrito de pagos con diferentes métodos.
 */
public class MainCarrito {
    public static void main(String[] args) {
// Creación de instancias de métodos de pago
        PaymentMethod tarjeta = new CreditCardPayment("1234567812345678", "Juan Pérez", "12/27", "123");
        PaymentMethod paypal = new PayPalPayment("juan.perez@email.com", "passwordgenerica");
        PaymentMethod crypto = new CryptoPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa", "Bitcoin");
// Creación del carrito de pagos
        PaymentCart cart = new PaymentCart();
// Agregar pagos al carrito
        cart.addPayment(tarjeta, 120.50);
        cart.addPayment(paypal, 75.00);
        cart.addPayment(crypto, 0.002345);
// Procesamiento de los pagos del carrito
        System.out.println("\n=== Procesando pagos del carrito ===");
        cart.processAllPayments();
    }
}