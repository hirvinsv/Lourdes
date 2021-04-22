package com.Lourdes.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="InventoryUnit")
public class UnidadInvEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator="native")
    @GenericGenerator(name="native",strategy="native")
    @Column(name = "InventoryUnitId")
    private Integer idUnidadInv;
    @Column(name = "InventoryUnit")
    private String nombreUnidad;
    @Column(name = "Abbrev")
    private String abreviatura;
    @Column(name = "disable")
    private boolean activo;

    public UnidadInvEntity() {
    }

    public UnidadInvEntity(String nombreUnidad, String abreviatura, boolean activo) {
        this.nombreUnidad = nombreUnidad;
        this.abreviatura = abreviatura;
        this.activo = activo;
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
        return "UnidadInvEntity{" +
                "idUnidadInv=" + idUnidadInv +
                ", nombreUnidad='" + nombreUnidad + '\'' +
                ", abreviatura='" + abreviatura + '\'' +
                ", activo=" + activo +
                '}';
    }
}
