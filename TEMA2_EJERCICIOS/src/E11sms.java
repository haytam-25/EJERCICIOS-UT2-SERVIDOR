public class E11sms implements E11interfaz{

    @Override
    public void notificar(String mensaje){
        System.out.println("Enviando SMS: " + mensaje);
    }

}
