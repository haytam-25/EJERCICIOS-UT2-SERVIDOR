
import java.util.Scanner;

public class E4 {


    public static void main(String[] args) {
        
        String tipo;
        Scanner sc = new  Scanner(System.in);

        System.out.println("dime codigo");
        int codigo=sc.nextInt();

        switch (codigo/100){
            case 2 -> tipo="OK";
            case 4 -> tipo="Error del Cliente";
            case 5 -> tipo="Error del servidor";
            default -> tipo ="OTRO";
        }
        System.out.println(tipo);
        sc.close();
    }

}
