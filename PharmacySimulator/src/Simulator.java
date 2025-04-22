import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Nombre del medicamento: ");
        String nombre = sc.nextLine();

        System.out.print("Precio unitario: $");
        double precioUnitario = sc.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = sc.nextInt();

        // Cálculo del total sin descuento
        var totalSinDescuento = precioUnitario * cantidad;

        // Verificar si aplica descuento (15%) usando operador ternario
        boolean aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0.0;
        double totalConDescuento = totalSinDescuento - descuento;

        // Mostrar resumen
        System.out.println("\n--- Resumen de Compra ---");
        System.out.println("Medicamento: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        sc.close();
    }
}
