import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {

        System.out.println("***************************************************************");
        System.out.println("*                   Adivina el número                         *");
        System.out.println("***************************************************************");

        Scanner prompt = new Scanner(System.in);
        int numberRandom = new Random().nextInt(100);
        System.out.println(numberRandom);

        int intentos = 1;



        while( intentos <= 5){

            System.out.println("                 Ingresa un número:                            ");

            int number =  prompt.nextInt();

            if(number != numberRandom){
                if(number < numberRandom){
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("|               El numero ingresado es menor                  |");
                    System.out.println("---------------------------------------------------------------");

                } else{
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("|                 El numero ingresado es mayor                |");
                    System.out.println("---------------------------------------------------------------");


                }
            }else{
                System.out.println("---------------------------------------------------------------");
                System.out.println("|               ¡Felicidades Adivinaste el número!             |");
                System.out.println("|            Adivinaste en el " + intentos + " intento         |");
                System.out.println("---------------------------------------------------------------");
                return;
            }

            intentos++;


        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("|               ¡Perdiste,número de intentos agotados!         |");
        System.out.println("---------------------------------------------------------------");



    }
}
