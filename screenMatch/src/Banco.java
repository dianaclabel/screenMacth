import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner opcion = new Scanner(System.in);
        double saldo = 1599.99;

        System.out.println("********************************************");
        System.out.println("         Nombre del cliente: Tony Stark     ");
        System.out.println("         Tipo de cuenta: Corriente          ");
        System.out.println("         Saldo disponible: " + saldo + "$   ");
        System.out.println("********************************************");

        boolean ingresoBanco = true;
        while( ingresoBanco  ){
            System.out.println("**Escriba el número de la opción deseada**");
            System.out.println("*******************************************");
            System.out.println("*             1 - Consultar saldo         *");
            System.out.println("*             2 - Retirar                 *");
            System.out.println("*             3 - Depositar               *");
            System.out.println("*             9 - Salir                   *");
            System.out.println("*******************************************");
            int optionElegido = opcion.nextInt();

            switch (optionElegido){
                case 1:
                    System.out.println("*******************************************");
                    System.out.println("         Saldo disponible: " + saldo + "$  ");
                    System.out.println("*******************************************");
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double retiro = opcion.nextDouble();

                    if ( retiro > saldo){
                        System.out.println("*******************************************");
                        System.out.println("*              Saldo insuficiente         *");
                        System.out.println("*******************************************");

                    }else{
                        saldo = saldo - retiro;
                        System.out.println("*******************************************");
                        System.out.println("*         saldo restante: " + saldo +"$   *");
                        System.out.println("*******************************************");

                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea depositar?");
                    double deposito = opcion.nextDouble();

                    if (deposito < 0 ){
                        System.out.println("*******************************************");
                        System.out.println("        No puede depositar ese monto       ");
                        System.out.println("*******************************************");
                        break;
                    }


                    saldo = saldo + deposito;

                    System.out.println("*******************************************");
                    System.out.println("*         saldo actual: " + saldo +"$   *");
                    System.out.println("*******************************************");
                    break;

                case 9:
                    System.out.println("*******************************************");
                    System.out.println("*    Gracias por usar nuestros servicios  *");
                    System.out.println("*******************************************");
                    ingresoBanco = false;
                    break;

            }


        }


    }
}