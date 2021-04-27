package com.Lourdes.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    private boolean Inactivo;
    @OneToMany(mappedBy = "unidadInvEntity")
    List<InventarioEntity> listInventario;

    public UnidadInvEntity() {
    }

    public UnidadInvEntity(String nombreUnidad, String abreviatura, boolean Inactivo) {
        this.nombreUnidad = nombreUnidad;
        this.abreviatura = abreviatura;
        this.Inactivo = Inactivo;
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

    public void setInactivo(boolean activo) {
        this.Inactivo = activo;
    }

    public List<InventarioEntity> getListInventario() {
        return listInventario;
    }

    public void setListInventario(List<InventarioEntity> listInventario) {
        this.listInventario = listInventario;
    }

    @Override
    public String toString() {
        return "UnidadInvEntity{" +
                "idUnidadInv=" + idUnidadInv +
                ", nombreUnidad='" + nombreUnidad + '\'' +
                ", abreviatura='" + abreviatura + '\'' +
                ", activo=" + Inactivo +
                '}';
    }
}
