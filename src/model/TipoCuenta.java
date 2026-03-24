package model;

public enum TipoCuenta {
    AHORROS(0),
    CORRIENTE(1);

    private final Integer valor;

    TipoCuenta(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }
}
