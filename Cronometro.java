import java.util.Scanner;
public class Cronometro {
    public static void main(String[] arg) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa el limite de segundos: ");
            int segundolimite = sc.nextInt();
            System.out.println("Ingresa el limite de minutos: ");   //Variables ingresadas por el usuario
            int minutolimite = sc.nextInt();
            System.out.println("Ingresa el limite de horas: ");
            int horalimite = sc.nextInt();
            sc.close();
            if (segundolimite > 60 || minutolimite > 60 || horalimite > 24) {
                System.out.println("Datos ingresados no validos");
                break;
            }
            else {
                int segundo, minuto, hora;
                segundo = 0;
                minuto = 0;     //Variables base
                hora = 0;
                while (true) {
                    if (segundo < segundolimite || minuto < minutolimite || hora < horalimite) {
                    String Display = String.format("%02d:%02d:%02d", hora, minuto, segundo); //Metodo para escribir 00:00:00
                    System.out.println(Display);
                    segundo++;          //Suma de segundos
                    try {
                        Thread.sleep(1000); //Delay de 1 segundo
                    }           
                        catch (InterruptedException ignored) {
                    }
                    if (segundo >= 60) {
                        minuto++;       //Suma de minutos
                        segundo = 0;
                    }
                    if (minuto >= 60) {
                        hora++;        //Suma de horas
                        minuto = 0;
                    }
                    }
                }
            }
        }
    }
}
