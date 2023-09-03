package semana03;
import java.util.Scanner;

public class Semana03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float descuento;
        byte cantidadObsequio = 0;
        System.out.print("Ingrese la cantidad del producto en docena: ");
        byte cantidadProducto = teclado.nextByte();
        System.out.print("Ingrese el precio del producto: ");
        float precioProducto = teclado.nextFloat();
        float montoPagar = cantidadProducto * precioProducto;
        System.out.printf("El monto de la pagar es S/%.2f Soles.%n",montoPagar);
        if (cantidadProducto >3) {
            descuento = (float) (montoPagar * 0.15);
            cantidadObsequio = (byte) (cantidadProducto - 3);
        } else {
            descuento = (float) (montoPagar * 0.1);
        }
        float montoTotal = montoPagar - descuento;
        System.out.printf("Monto del descuneto es S/%.2f Soles. %n",descuento);
        System.out.printf("Monto total a pagar es S/%.2f Soles. %n",montoTotal);
        System.out.printf("El número de unidades de obsequio por la compra es %d.%n",cantidadObsequio);
    }
}
