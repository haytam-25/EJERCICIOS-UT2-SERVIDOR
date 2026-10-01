public class E11servicio {

    private E11interfaz notificador;

    public E11servicio(E11interfaz notificador) {
        this.notificador = notificador;
    }

    public void enviarAviso(String mensaje) {
        notificador.notificar(mensaje);
    }

}
