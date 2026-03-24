package model;

import java.util.List;

public class Cuenta {
    private double saldo;
    private String numero;

    // Relaciones
    private Cliente cliente;
    private List<Transaccion> listaTransacciones;
    private TipoCuenta tipoCuenta;

    // Constructores


    public Cuenta(double saldo, String numero, Cliente cliente, List<Transaccion> listaTransacciones, TipoCuenta tipoCuenta) {
        this.saldo = saldo;
        this.numero = numero;
        this.cliente = cliente;
        this.listaTransacciones = listaTransacciones;
        this.tipoCuenta = tipoCuenta;
    }

    public Cuenta() {
    }

    //Getters and setters

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(List<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", numero='" + numero + '\'' +
                ", cliente=" + cliente +
                ", listaTransacciones=" + listaTransacciones +
                ", tipoCuenta=" + tipoCuenta +
                '}';
    }
}
