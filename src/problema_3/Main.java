package problema_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos: ");
        int n = sc.nextInt();
        sc.nextLine();

        Producto[] productos = new Producto[n];
        double totalInventario = 0;

        // Ciclo para ingresar productos
        for (int i = 0; i < n; i++) {
            System.out.println("\nProducto #" + (i + 1));
            System.out.print("Código: ");
            String codigo = sc.nextLine();

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            productos[i] = new Producto(codigo, nombre, precio, cantidad);

            // Mostrar info del producto
            productos[i].mostrarinfo();

            // Acumular total inventario
            totalInventario += productos[i].calcularTotal();
        }

        // Mostrar total final
        System.out.println("\n===== RESUMEN FINAL =====");
        System.out.println("Valor total del inventario: " + totalInventario);
    }

}
