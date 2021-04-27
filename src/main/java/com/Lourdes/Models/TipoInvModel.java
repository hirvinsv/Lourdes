package com.Lourdes.Models;

public class TipoInvModel {

    private Integer idTipoInv;
    private String nombreTipoInv;
    private Boolean Inactivo;

    public TipoInvModel() {
    }

    public TipoInvModel(String nombreTipoInv, Boolean Inactivo) {
        this.nombreTipoInv = nombreTipoInv;
        this.Inactivo = Inactivo;
    }

    public Integer getIdTipoInv() {
        return idTipoInv;
    }

    public void setIdTipoInv(Integer idTipoInv) {
        this.idTipoInv = idTipoInv;
    }

    public String getNombreTipoInv() {
        return nombreTipoInv;
    }

    public void setNombreTipoInv(String nombreTipoInv) {
        this.nombreTipoInv = nombreTipoInv;
    }

    public Boolean getInactivo() {
        return Inactivo;
    }

    public void setInactivo(Boolean inactivo) {
        this.Inactivo = inactivo;
    }

    @Override
    public String toString() {
        return "TipoInvModel{" +
                "idTipoInv=" + idTipoInv +
                ", nombreTipoInv='" + nombreTipoInv + '\'' +
                ", activo=" + Inactivo +
                '}';
    }
}
