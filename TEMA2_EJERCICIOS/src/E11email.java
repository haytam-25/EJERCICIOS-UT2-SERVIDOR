public class E11email implements E11interfaz {

    @Override
    public void notificar(String mensaje){
        System.out.println("Enviando email: " + mensaje);
    }

}
