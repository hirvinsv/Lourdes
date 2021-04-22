package com.Lourdes.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TipoInvModel {

    private Integer idTipoInv;
    private String nombreTipoInv;
    private Boolean activo;

    public TipoInvModel() {
    }

    public TipoInvModel(String nombreTipoInv, Boolean activo) {
        this.nombreTipoInv = nombreTipoInv;
        this.activo = activo;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "TipoInvModel{" +
                "idTipoInv=" + idTipoInv +
                ", nombreTipoInv='" + nombreTipoInv + '\'' +
                ", activo=" + activo +
                '}';
    }
}
