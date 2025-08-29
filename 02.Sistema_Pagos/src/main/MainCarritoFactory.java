package main;

import java.util.Scanner;

import model.PaymentMethod;
import service.PaymentCart;
import factory.PaymentFactory;

/**
 * Clase principal para probar el carrito de pagos con diferentes métodos
 * utilizando la Factory.
 */
public class MainCarritoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentCart cart = new PaymentCart();
        String continuar;
        do {
            System.out.print("\nElige un método de pago (paypal, tarjeta, crypto): ");
            String tipo = scanner.nextLine();
            PaymentMethod method = PaymentFactory.create(tipo, scanner);
            if (method != null) {
                System.out.print("Introduce el importe a pagar: ");
                double amount = Double.parseDouble(scanner.nextLine());
                cart.addPayment(method, amount);
                System.out.println("Pago agregado al carrito.");
            }
            System.out.print("\n¿Deseas añadir otro pago? (s/n)");
            continuar = scanner.nextLine().trim().toLowerCase();
        } while (continuar.equals("s"));
        System.out.println("\n=== Procesando pagos del carrito ===");
        cart.processAllPayments();
        scanner.close();
    }
}