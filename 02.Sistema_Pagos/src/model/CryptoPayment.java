package model;

/**
 * Representa una cuenta en un broker de criptomonedas con una serie
 * de atributos y métodos específicos para su correcta utilización.
 */
public class CryptoPayment implements PaymentMethod {
    private String walletAddress;
    private String cryptoType;

    /**
     * Crea una instancia de una cuenta de criptomonedas en un broker.
     *
     * @param walletAddress Dirección de la cuenta.
     * @param cryptoType    Nombre de la criptomoneda.
     */
    public CryptoPayment(String walletAddress, String cryptoType) {
        this.walletAddress = walletAddress;
        this.cryptoType = cryptoType;
    }

    /**
     * Permite realizar un pago de una cantidad determinada mediante una
     * cuenta de criptomonedas.
     *
     * @param amount Cantidad a pagar.
     */
    @Override
    public void pay(double amount) {
        if (amount <= 0) {
            System.out.println("La cantidad a pagar debe ser mayor que cero.");
            return;
        }
        System.out.printf("Pagando %.6f usando %s a través de la wallet %s %n", amount,
                cryptoType, walletAddress);
    }
}