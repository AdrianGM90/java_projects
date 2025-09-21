# Java Projects

Repositorio con proyectos prácticos en Java que he desarrollado para mejorar mis habilidades en programación orientada a objetos y patrones de diseño.

## Proyectos incluidos

### 01.Gestion_Biblioteca
Sistema sencillo para gestionar libros en una biblioteca.

- Añadir, listar, buscar y eliminar libros.
- Uso de listas y mapas en Java.
- Enfoque en estructura y manejo de datos básicos.

### 02.Sistema_Pagos
Sistema modular para gestionar pagos con diferentes métodos (tarjeta, PayPal, criptomonedas).

- Implementación de interfaces y polimorfismo.
- Uso del patrón de diseño Factory para la creación de objetos.
- Simulación de un carrito de pagos con procesamiento modular.

## Tecnologías y conceptos aplicados

- Java 17.
- Programación orientada a objetos (POO).
- Patrones de diseño: Factory.
- Uso de colecciones Java (`List`, `Map`).
- Entrada por consola con `Scanner`.
- Organización en paquetes (`model`, `service`, `factory`, `main`, etc.).

## Modo de ejecución de los proyectos

Cada proyecto tiene su propia clase `main` para probar su funcionalidad. Puedes ejecutar desde tu IDE las clases principales correspondientes a cada proyecto:

- `gestion.biblioteca.Main` para el proyecto **01.Gestion_Biblioteca**.
- `main.MainSistemaPagos`, `main.MainCarrito` o `main.MainCarritoFactory` para el proyecto **02.Sistema_Pagos**.

## Próximos pasos y mejoras

- Añadir validaciones y manejo de errores más robusto.
- Persistencia de datos para guardar la información entre ejecuciones.
- Refactorización para separar responsabilidades.
- Añadir interfaz gráfica (JavaFX o Swing) o una API REST con Spring Boot.