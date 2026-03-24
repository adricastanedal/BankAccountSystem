package model;

import java.util.List;

public class Banco {
    private String nombre;
    private String direccion;

    // Relaciones
    private List<Cliente> listaClientes;
    private List<Cuenta> listaCuentas;

    //Constructores
    public Banco(String nombre, String direccion, List<Cliente> listaClientes, List<Cuenta> listaCuentas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaClientes = listaClientes;
        this.listaCuentas = listaCuentas;
    }

    public Banco() {
    }

    // Setters and Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listaClientes=" + listaClientes +
                ", listaCuentas=" + listaCuentas +
                '}';
    }
}
