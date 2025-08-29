package service;

import java.util.ArrayList;
import java.util.List;

import model.PaymentMethod;

/**
 * Clase que representa un carrito de pagos.
 * Se ocupa de añadir, almacenar y procesar listas de pagos.
 */
public class PaymentCart {
    private List<PaymentEntry> paymentList;

    /**
     * Crea una instancia de un carrito de pagos vacío.
     *
     * @param paymentList Listado de pagos.
     */
    public PaymentCart() {
        this.paymentList = new ArrayList<>();
    }

    /**
     * Agrega un nuevo pago al carrito de pagos.
     *
     * @param method Método específico con el que se efectúa el pago.
     * @param amount Cantidad que se desea pagar.
     */
    public void addPayment(PaymentMethod method, double amount) {
        paymentList.add(new PaymentEntry(method, amount));
    }

    /**
     * Procesa todos los pagos en el carrito, uno por uno.
     */
    public void processAllPayments() {
        if (paymentList.isEmpty()) {
            System.out.println("El carrito de pagos está vacío.");
            return;
        }
        PaymentProcessor processor = new PaymentProcessor();
        for (PaymentEntry entry : paymentList) {
            System.out.println("\nProcesando nuevo pago:");
            processor.processPayment(entry.getMethod(), entry.getAmount());
        }
        paymentList.clear();
    }
}