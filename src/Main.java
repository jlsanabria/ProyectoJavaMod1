import credencial.Usuario;
import operaciones.algebraicas.MenuAlgebraicas;
import operaciones.comparacion.OperacionesComparacion;
import operaciones.matematicas.MenuMatematicas;
import operaciones.matematicas.OperacionesMatematicas;
import util.DateUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Clase principal

        System.out.println("==============================");

        Scanner teclado = new Scanner(System.in);
        Usuario usuario = new Usuario();

        System.out.print("Usuario: ");
        usuario.setNombre(teclado.nextLine());

        System.out.print("Bienvenido(a): " + usuario.getNombre());
        // \n --> Caracter de escape para una nueva linea
        System.out.println("\nSesión iniciada: " + DateUtil.obtenerFechaHora());

        // Ménu de opciones
        boolean continuar = true;
        do {
            System.out.println("-----  CALCULADORA  -----");
            System.out.println("A. Operaciones matamáticas");
            System.out.println("B. Operaciones de comparación");
            System.out.println("C. Operaciones algebraicas");
            System.out.println("G. Salir");
            System.out.print("> Intro opción: ");
            String opcion = teclado.nextLine();


            switch (opcion) {
                case "A":
                    MenuMatematicas menuMate = new MenuMatematicas();
                    menuMate.mostrarMenu();
                    // ...
                    break;
                case "B":
                    //OperacionesComparacion opeComp = new OperacionesComparacion();
                    break;

                case "C":
                    MenuAlgebraicas menuAlge = new MenuAlgebraicas();
                    menuAlge.mostrarMenu();
                    break;

            }

            continuar = !opcion.equals("G");

        } while (continuar);
    }
}