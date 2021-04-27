package com.Lourdes.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    private boolean Desabilitado;
    @OneToMany(mappedBy = "Categoria")
    private List<InventarioEntity> listInventario;



    public CategoriaInvEntity(String nombreCategoria, boolean activo) {
         this.nombreCategoria = nombreCategoria;
        this.Desabilitado = activo;
    }

    public  CategoriaInvEntity(Integer Id){

    }
    public CategoriaInvEntity() {
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

    public boolean isDesabilitado() {
        return Desabilitado;
    }

    public void setDesabilitado(boolean activo) {
        this.Desabilitado = activo;
    }

    public List<InventarioEntity> getListInventario() {
        return listInventario;
    }

    public void setListInventario(List<InventarioEntity> listInventario) {
        this.listInventario = listInventario;
    }

    @Override
    public String toString() {
        return "CategoriaInvEntity{" +
                "idCategoria=" + idCategoria +
                ", nombreCategoria='" + nombreCategoria + '\'' +
                ", activo=" + Desabilitado +
                '}';
    }
}
