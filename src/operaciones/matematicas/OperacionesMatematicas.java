package operaciones.matematicas;

/**
 * Clase que resuelve las operaciones matemáticas del menú A. Operaciones Matemáticas
 */
public final class OperacionesMatematicas {

    protected static int suma(int a, int b) {
        return a + b;
    }

    // ...

    /**
     * Utilizando varargs -> argumento de longitud variable
     * 2 3 5 7 11  -->  | 2 | 3 | 5 | 7 | 11 |
     *                    0   1   2   3   4
     * @return
     */
    protected static int sumaNumeros(int ... numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i]; // suma = suma + numeros[i]
        }
        return suma;
    }

    protected static double potencia(double b, double e) {
        return Math.pow(b, e);
    }

    protected static int menor(int a, int b) {
        return Math.min(a, b);
    }
}
