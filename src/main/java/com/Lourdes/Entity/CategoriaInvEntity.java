package com.Lourdes.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="InventoryCategories")
public class CategoriaInvEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator="native")
    @GenericGenerator(name="native",strategy="native")
    @Column(name = "InventoryCategoryId")
    private Integer idCategoria;
    @Column(name = "InventoryCategory")
    private String nombreCategoria;
    @Column(name ="Disable")
    private boolean activo;

    public CategoriaInvEntity(String nombreCategoria, boolean activo) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.activo = activo;
    }

    public CategoriaInvEntity() {
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
        return "CategoriaInvEntity{" +
                "idCategoria=" + idCategoria +
                ", nombreCategoria='" + nombreCategoria + '\'' +
                ", activo=" + activo +
                '}';
    }
}
