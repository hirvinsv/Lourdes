package com.Lourdes.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "InventoryType")
public class TipoInvEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator="native")
    @GenericGenerator(name="native",strategy="native")
    @Column(name="InventoryTypeId")
    private Integer idTipoInv;
    @Column(name = "InventoryType")
    private String nombreTipoInv;
    @Column(name = "Disable")
    private Boolean activo;

    public TipoInvEntity() {
    }

    public TipoInvEntity(String nombreTipoInv, Boolean activo) {
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
        return "TipoInvEntity{" +
                "idTipoInv=" + idTipoInv +
                ", nombreTipoInv='" + nombreTipoInv + '\'' +
                ", activo=" + activo +
                '}';
    }
}
