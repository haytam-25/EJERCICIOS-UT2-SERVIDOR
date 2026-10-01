public class E11 {

    public static void main(String[] args) {
        E11interfaz email = new E11email();
        E11servicio servicio = new E11servicio(email);

        servicio.enviarAviso("Holaa por email");

        E11interfaz sms = new E11sms();
        E11servicio servicio2 = new E11servicio(sms);

        servicio2.enviarAviso("Hola por sms");

    }

}
