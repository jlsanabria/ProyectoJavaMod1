package operaciones.algebraicas;

import java.util.Scanner;

public class MenuAlgebraicas {
    private Scanner teclado = new Scanner(System.in);

    public void mostrarMenu() {
        // Ménu de opciones
        boolean continuar = true;
        do {
            System.out.println("\n---------------------------------------");
            System.out.println("--> Operaciones Algebraicas");
            System.out.println("\t1.  Producto notable (a + b) ^ 2"); // \t  --> caracter de espape que da un TAB
            System.out.println("\t2.  ");
            System.out.println("\t3.  ");
            System.out.println("\t4.  ");
            System.out.println("\t5.  Fórmula cuadrática: x = (-b +- sqrt(b ^ 2 - 4 * a * c)) / (2 * a)");
            System.out.println("\t6. Volver");
            System.out.print("  > Opción: ");
            String opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("  > Primer número: ");
                    int numero1 = teclado.nextInt();
                    System.out.print("  > Segundo número: ");
                    int numero2 = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println(" => Resultado: " + OperacionesAlgebraicas.productoNotable2(numero1, numero2));
                    // ...
                    break;
                case "2":

                    break;

                case "5":

                    break;

            }

            continuar = !opcion.equals("6");

        } while (continuar);
    }
}
