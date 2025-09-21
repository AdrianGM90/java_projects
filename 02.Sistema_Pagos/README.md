# Sistema de Pagos

Este proyecto implementa un sistema modular de pagos en Java, permitiendo gestionar múltiples métodos de pago: tarjeta de crédito, PayPal y criptomonedas.
Está diseñado siguiendo principios sólidos de programación orientada a objetos y emplea el patrón de diseño **Factory** para crear instancias de métodos de pago de forma flexible.

## Tecnologías y conceptos aplicados

- Java 17.
- Programación orientada a objetos (POO).
- Interfaces (`PaymentMethod`).
- Herencia y polimorfismo.
- Patrón de diseño Factory (`PaymentFactory`).
- Scanner para entrada por consola.
- Separación en capas: `model`, `service`, `factory`, `main`.

## Estructura del proyecto

src/
├── factory/
│ └── PaymentFactory.java
├── model/
│ ├── PaymentMethod.java
│ ├── CreditCardPayment.java
│ ├── PayPalPayment.java
│ ├── CryptoPayment.java
├── service/
│ ├── PaymentEntry.java
│ ├── PaymentCart.java
│ ├── PaymentProcessor.java
├── main/
│ ├── MainSistemaPagos.java ← Demostración simple
│ ├── MainCarrito.java ← Carrito con métodos de pago predefinidos
│ └── MainCarritoFactory.java ← Versión interactiva con Scanner + Factory

## Modo de ejecución

1. Clona el repositorio o descarga el proyecto.
2. Abre el proyecto en tu IDE.
3. Ejecuta una de las siguientes clases:

- `MainSistemaPagos`: pruebas directas de cada método de pago.
- `MainCarrito`: añade métodos de pago al carrito manualmente desde código.
- `MainCarritoFactory`: añade métodos interactivos desde consola.

## Materia repasada en este proyecto

- Diseño limpio y organizado de clases.
- Interfaces y polimorfismo.
- Uso del patrón **Factory** para desacoplar la creación de objetos.
- Modularidad y mantenimiento del código.

## Mejoras en futuras versiones

- Validación de datos de entrada.
- Persistencia de datos.
- Interfaz gráfica o API REST.