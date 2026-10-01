
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public record E12_Catalogo() {

    record Articulo(String codigo, String nombre, double precio){
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Articulo> listacatalogo = new ArrayList<>();


        Articulo ordenador = new Articulo("1a", "Ordenador", 200.50);
        Articulo monitor = new Articulo("1B", "Monitor", 100);
        Articulo raton = new Articulo("1c", "raton", 10.20);

        

        listacatalogo.add(ordenador);
        listacatalogo.add(monitor);
        listacatalogo.add(raton);

        int menu=0;

        do { 
            System.out.println("1. Imprimir catálogo\n" + //
                                "2. Mostrar total\n" + //
                                "3. Mostrar artículo más caro\n" + //
                                "4. Salir");

            menu=sc.nextInt();

            double total=0;
            if(menu==1){
                for (Articulo object : listacatalogo) {
                System.out.println(object.toString());
                }
            }

            if(menu==2){
                for (Articulo prod : listacatalogo) {
                boolean mascaro=true;

                total += prod.precio();
                }
                System.out.println("Total del catalogo : "+total);
            }
            if(menu==3){
                for (Articulo prod : listacatalogo) {
                    boolean mascaro=true;
                    for (Articulo object : listacatalogo) {
                        if (prod.precio() < object.precio()) {
                        mascaro=false;
                        }
                    }
                    if(mascaro){
                        System.out.println("El mas caro es "+prod.nombre()+" "+prod.precio+"$");
                    }
                }
                
            }
            
        } while (menu!=4);

        sc.close();

    }



}


