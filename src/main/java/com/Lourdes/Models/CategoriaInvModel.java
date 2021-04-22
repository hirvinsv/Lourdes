package com.Lourdes.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CategoriaInvModel {

    private Integer idCategoria;
    private String nombreCategoria;
    private boolean activo;

    public CategoriaInvModel() {
    }

    public CategoriaInvModel(String nombreCategoria, boolean activo) {
        this.nombreCategoria = nombreCategoria;
        this.activo = activo;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "CategoriaInvModel{" +
                "idCategoria=" + idCategoria +
                ", nombreCategoria='" + nombreCategoria + '\'' +
                ", activo=" + activo +
                '}';
    }
}
