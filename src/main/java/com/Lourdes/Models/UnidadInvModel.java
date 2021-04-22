package com.Lourdes.Models;

public class UnidadInvModel {

    private Integer idUnidadInv;
    private String nombreUnidad;
    private String abreviatura;
    private boolean activo;

    public UnidadInvModel(Integer idUnidadInv, String nombreUnidad, String abreviatura, boolean activo) {
        this.idUnidadInv = idUnidadInv;
        this.nombreUnidad = nombreUnidad;
        this.abreviatura = abreviatura;
        this.activo = activo;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "UnidadInvModel{" +
                "idUnidadInv=" + idUnidadInv +
                ", nombreUnidad='" + nombreUnidad + '\'' +
                ", abreviatura='" + abreviatura + '\'' +
                ", activo=" + activo +
                '}';
    }
}
