public class Cronometro {
    public static void main(String[] arg) {
        int segundo, minuto, hora;
        segundo = 0;
        minuto = 0;             //Variables
        hora = 0;
        while (hora == 24) {
            String Display = String.format("%02d:%02d:%02d", hora, minuto, segundo); //Metodo para escribir 00:00:00
            System.out.println(Display);
            segundo++;          //Suma de segundos
            try {
            Thread.sleep(1000); //Delay de 1 segundo
            }           
            catch (InterruptedException ignored) {
            }
            if (segundo == 60) {
                minuto++;       //Suma de minutos
                segundo = 0;
            }
            if (minuto == 60) {
                hora++;        //Suma de horas
                minuto = 0;
            }
        }
    }
}
