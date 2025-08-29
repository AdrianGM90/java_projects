package model;

/**
 * Representa una cuenta PayPal con un conjunto de atributos y métodos
 * particulares para su utilización.
 */
public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    /**
     * Crea una instancia de una cuenta en PayPal.
     *
     * @param email    Nombre de la cuenta de correo electrónico del usuario.
     * @param password Contraseña de la cuenta de correo electrónico del usuario.
     */
    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Permite realizar un pago de una cantidad determinada mediante una cuenta PayPal.
     *
     * @param amount Cantidad a pagar.
     */
    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("La cantidad a pagar debe ser mayor que cero.");
            return;
        }
        System.out.printf("Pagando %.2f usando Paypal con la cuenta %s %n", amount, email);
    }
}