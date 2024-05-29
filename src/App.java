import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Producto> productos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite el Id del producto: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Digite el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Digite la marca del producto: ");
            String marca = scanner.nextLine();

            System.out.print("Digite el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 

            Producto producto = new Producto(id, nombre, marca, precio);

            productos.add(producto);

            System.out.print("Quiere registrar otro producto? (s/n): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("s");

          
        }
    
        productos.sort((a, b) -> { return 1* Double.compare(a.getId(), b.getId());});

        System.out.println("\nProductos registrados:");
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            Producto producto = it.next();
            System.out.println("Id: " + producto.getId() +
                    ", Nombre: " + producto.getNombre() +
                    ", Marca: " + producto.getMarca() +
                    ", Precio: " + producto.getPrecio());
        }

        scanner.close();

    }
}
