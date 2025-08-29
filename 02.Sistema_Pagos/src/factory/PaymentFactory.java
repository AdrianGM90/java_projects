package factory;

import java.util.Scanner;

import model.PaymentMethod;
import model.CreditCardPayment;
import model.CryptoPayment;
import model.PayPalPayment;

/**
 * Clase fábrica para crear instancias de métodos de pago.
 */
public class PaymentFactory {
    /**
     * Crea un método de pago en base a un tipo especificado.
     *
     * @param type    Tipo de método de pago ("paypal", "tarjeta", "cripto").
     * @param scanner Scanner para la entrada de datos
     * @return Instancia de PaymentMethod correspondiente o null si el tipo es
     * inválido.
     */
    public static PaymentMethod create(String type, Scanner scanner) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type.toLowerCase().substring(0, 1)) {
            case "p":
                System.out.print("Introduce el email de PayPal: ");
                String email = scanner.nextLine();
                System.out.print("Introduce la contraseña: ");
                String password = scanner.nextLine();
                return new PayPalPayment(email, password);
            case "t":
                System.out.print("Introduce el número de la tarjeta: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Introduce el nombre del titular de"
                        + " la tarjeta: ");
                String cardHolderName = scanner.nextLine();
                System.out.print("Introduce la fecha de expiracion de"
                        + " la tarjeta: ");
                String expirationDate = scanner.nextLine();
                System.out.print("Introduce el número de seguridad de"
                        + " la tarjeta: ");
                String cvv = scanner.nextLine();
                return new CreditCardPayment(cardNumber, cardHolderName,
                        expirationDate, cvv);
            case "c":
                System.out.print("Introduce la dirección de la wallet: ");
                String walletAddress = scanner.nextLine();
                System.out.print("Introduce la criptomoneda para"
                        + " efectuar el pago: ");
                String cryptoType = scanner.nextLine();
                return new CryptoPayment(walletAddress, cryptoType);
            default:
                System.out.println("Método de pago introducido desconocido.");
                System.out.println("Pruebe con \"tarjeta de crédito\","
                        + " \"paypal\" o \"criptomonedas\".");
                return null;
        }
    }
}