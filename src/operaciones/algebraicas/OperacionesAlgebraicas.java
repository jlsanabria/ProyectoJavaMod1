package operaciones.algebraicas;

public final class OperacionesAlgebraicas {

    protected static int productoNotable2(int a, int b) {
        // (a + b) ^ 2 = a ^ 2 + 2 * a * b + b ^ 2;
        int resultado = a * a + 2 * a * b + b * b;
        return resultado;
    }
}
