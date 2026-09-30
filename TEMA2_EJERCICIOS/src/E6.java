
import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DIME EL PRECIO");
        double precio = sc.nextDouble();
        System.out.println("Dime que tipo de cliente eres: NORMAL, SOCIO, EMPLEADO");
        sc.nextLine();
        String tipo = sc.nextLine();

        tipo = tipo.toUpperCase();

        double preciofinal = precio * 0.21;
        
        switch (tipo){
            case "NORMAL" -> preciofinal += precio;
            case "SOCIO" -> preciofinal += precio * 0.90;
            case "EMPLEADO" -> preciofinal += precio * 0.75;
            default -> preciofinal = precio;
        }

        System.out.printf("Precio final: %.2f%n" , preciofinal);

        sc.close();

    }

}
