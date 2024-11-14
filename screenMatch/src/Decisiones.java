import java.sql.SQLOutput;

public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if(fechaDeLanzamiento >= 2022){
            System.out.println("Las peliculas mas populares");
        } else {
            System.out.println("Peliculas retro que vale la pena ver");
        }

        if(incluidoEnElPlan || tipoPlan.equals("plus")){
            System.out.println("Disfrute su pelicula");
        }else{
            System.out.println("Peliculas no disponible para su plan actual");
        }
    }
}
