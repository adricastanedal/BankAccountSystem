package model;

public enum TipoTransaccion {
    RETIRAR(0),
    DEPOSITAR(1),
    CONSULTAR_SALDO(2);

    private final Integer valor;

    TipoTransaccion(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }
}
