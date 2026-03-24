package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaccion {
    private double valor;
    private LocalTime hora;
    private LocalDate fecha;

    //Relaciones

    private EstadoTransaccion estado;
    private TipoTransaccion tipoTransaccion;

    //Constructores

    public Transaccion(double valor, LocalTime hora, LocalDate fecha, EstadoTransaccion estado, TipoTransaccion tipoTransaccion) {
        this.valor = valor;
        this.hora = hora;
        this.fecha = fecha;
        this.estado = estado;
        this.tipoTransaccion = tipoTransaccion;
    }

    public Transaccion() {
    }

    //Getters and setters

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public EstadoTransaccion getEstado() {
        return estado;
    }

    public void setEstado(EstadoTransaccion estado) {
        this.estado = estado;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "valor=" + valor +
                ", hora=" + hora +
                ", fecha=" + fecha +
                ", estado=" + estado +
                ", tipoTransaccion=" + tipoTransaccion +
                '}';
    }
}
