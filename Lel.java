public class Lel {

    public static void main(String[] arg) {
        int numero;
        numero = 1;
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
            try {
            Thread.sleep(1000);
            }           
            catch (InterruptedException ignored) {
            }
        }
    }
}
