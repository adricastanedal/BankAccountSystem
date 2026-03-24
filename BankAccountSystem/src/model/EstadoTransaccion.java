package model;

public enum EstadoTransaccion {
    EXITOSA(0),
    RECHAZADA(1),
    SIN_FONDOS(2);

    private final Integer valor;

    EstadoTransaccion(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }
}
