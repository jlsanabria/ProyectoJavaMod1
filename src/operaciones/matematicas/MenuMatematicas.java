package operaciones.matematicas;

import java.util.Scanner;

public class MenuMatematicas {
    private Scanner teclado = new Scanner(System.in);

    public void mostrarMenu() {
        // Ménu de opciones
        boolean continuar = true;
        do {
            System.out.println("\n---------------------------------------");
            System.out.println("--> Operaciones Matematicas");
            System.out.println("\t1.  Suma"); // \t  --> caracter de espape que da un TAB
            System.out.println("\t2.  Resta");
            System.out.println("\t3.  Multiplicación");
            System.out.println("\t4.  División");
            System.out.println("\t5.  Suma de N números");
            System.out.println("\t6.  Multiplicación de N números");
            System.out.println("\t7.  Potencia de un número");
            System.out.println("\t.....");
            System.out.println("\t14. Volver");
            System.out.print("  > Opción: ");
            String opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("  > Primer número: ");
                    int numero1 = teclado.nextInt();
                    System.out.print("  > Segundo número: ");
                    int numero2 = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println(" => Resultado: " + OperacionesMatematicas.suma(numero1, numero2));
                    // ...
                    break;
                case "2":

                    break;

                case "5":
                    System.out.print("  > Intro números: ");
                    String dato = teclado.nextLine(); // 2 3 5 7 11 13
                    String textoNumeros[] = dato.split(" ");
                    int numeros[] = new int[textoNumeros.length];
                    for (int i = 0; i < textoNumeros.length; i++) {
                        numeros[i] = Integer.parseInt(textoNumeros[i]);
                    }
                    System.out.println(" => Resultado: " + OperacionesMatematicas.sumaNumeros(numeros));
                    break;

                case "7":
                    System.out.print("  > Número base: ");
                    double base = teclado.nextDouble();
                    System.out.print("  > Exponente: ");
                    double exponente = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println(" => Resultado: " + OperacionesMatematicas.potencia(base, exponente));
                    break;

            }

            continuar = !opcion.equals("14");

        } while (continuar);
    }
}
