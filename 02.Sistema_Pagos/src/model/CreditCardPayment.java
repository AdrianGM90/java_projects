package model;

/**
 * Representa una tarjeta de crédito general con un conjunto de atributos
 * y métodos específicos para su utilización.
 */
public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

    /**
     * Crea una instancia de tarjeta de crédito con sus atributos específicos.
     *
     * @param cardNumber     IBAN de la tarjeta de crédito.
     * @param cardHolderName Nombre completo del titular de la tarjeta de crédito.
     * @param expirationDate Fecha de expiración de la tarjeta de crédito.
     * @param cvv            Número de seguridad de la tarjeta de crédito.
     */
    public CreditCardPayment(String cardNumber, String cardHolderName,
                             String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    /**
     * Permite realizar un pago de una cantidad determinada mediante una tarjeta
     * de crédito.
     *
     * @param amount Cantidad a pagar.
     */
    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("La cantidad a pagar debe ser mayor que cero.");
            return;
        }
        System.out.printf("Pagando %.2f con tarjeta de crédito de %s"
                + "(**** **** **** % s % n)", amount, cardHolderName, cardNumber.substring(12, 16));
    }
}