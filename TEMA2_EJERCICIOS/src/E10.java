 enum E10 {
    OK(200, "OKEY"),
    REDIRECCION(300, "REDIRECCION"),
    ERROR_CLIENTE(400, "NO ENCONTRADO"),
    ERROR_SERVIDOR(500, "ERROR DE SERVIDOR");

    private final int codigo;
    private final String mensaje;

    E10(int codigo, String mensaje) {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }
    int codigo(){
        return this.codigo;
    }

    public boolean esError() {
        return codigo >= 400;
    }
}


