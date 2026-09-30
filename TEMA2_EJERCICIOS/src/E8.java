public class E8 {

    public static void main(String[] args) {
        record Producto(String nombre , double precio){

            Producto{
                if (nombre.isBlank() || nombre == null || precio <0){
                    throw new IllegalArgumentException("ERROR VALORES INVALIDOS");
                }
            }
        }
    }

}
