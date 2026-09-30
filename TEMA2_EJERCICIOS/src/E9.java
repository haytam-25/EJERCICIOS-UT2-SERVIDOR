import java.util.ArrayList;
import java.util.List;

public class E9 {

    record Equipo(String nombre, List<String> jugadores) {}

    public static void main(String[] args) {

        List<String> jugadore = new ArrayList<>();
        jugadore.add("james");
        jugadore.add("ney");
        jugadore.add("leo");

        var betis = new Equipo("betis", jugadore);

        // no se puede es inmutable

    }

}
