public class Primos {
    public static void main(String[] args) {
        int contador = 0;
        int num = 2;

        while (contador < 100) {
            if (esPrimo(num)) {
                System.out.println(num);
                contador++;
            }
            num++;
        }
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
