public class EjemploDebug {

    public static void main(String[] args) {
        int numero = 5;
        int resultado = duplicar(numero);
        System.out.println("El resultado es: " + resultado);
    }

    public static int duplicar(int num) {
        int resultado = num * 2;
        return resultado;
    }
}
