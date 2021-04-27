package com.Lourdes.Models;

public class UnidadInvModel {

    private Integer idUnidadInv;
    private String nombreUnidad;
    private String abreviatura;
    private boolean Inactivo;

    public UnidadInvModel(String nombreUnidad, String abreviatura, boolean activo) {
        this.nombreUnidad = nombreUnidad;
        this.abreviatura = abreviatura;
        this.Inactivo = activo;
    }

    public UnidadInvModel() {
    }

    public Integer getIdUnidadInv() {
        return idUnidadInv;
    }

    public void setIdUnidadInv(Integer idUnidadInv) {
        this.idUnidadInv = idUnidadInv;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public boolean isInactivo() {
        return Inactivo;
    }

    public void setInactivo(boolean inactivo) {
        this.Inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "UnidadInvModel{" +
                "idUnidadInv=" + idUnidadInv +
                ", nombreUnidad='" + nombreUnidad + '\'' +
                ", abreviatura='" + abreviatura + '\'' +
                ", activo=" + Inactivo +
                '}';
    }
}
