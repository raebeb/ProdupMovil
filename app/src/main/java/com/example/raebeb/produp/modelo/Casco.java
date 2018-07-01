package com.example.raebeb.produp.modelo;

public class Casco {
    private String bateria;
    private String conexion;
    private String estado;
    private String proximidad;

    public Casco(){}

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria){
        this.bateria=bateria;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getProximidad() {
        return proximidad;
    }

    public void setProximidad(String proximidad) {
        this.proximidad = proximidad;
    }

    @Override
    public String toString() {
        return "Casco: \n" +
                "  Bateria=" + bateria + "\n" +
                "  Conexion=" + conexion + "\n" +
                "  Estado=" + estado + "\n" +
                "  proximidad=" + proximidad + "\n";
    }
}
