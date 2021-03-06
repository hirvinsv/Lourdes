package com.Lourdes.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name ="Inventory")
public class InventarioEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY , generator="native")
    @GenericGenerator(name="native",strategy="native")
    @Column(name="InventoryId")
    private Integer idInventario;
    @Column(name= "Disable")
    private Boolean Inactivo;
    @Column(name="ItemName")
    private String nombreItem;
    @Column(name="ItemCost")
    private BigDecimal costoItem;
    @Column(name = "ItemsPerPack")
    private int itemPorPaquetes;
    @Column(name = "PacksPerCase")
    private int paquetesPorCaja;
    @Column(name = "UnitSKU")
    private String UnidadSku;
    @Column(name = "PackSKu")
    private String PaqueteSku;
    @Column(name = "CaseSKU")
    private String CajaSku;
    @Column (name = "ReorderLevel")
    private float Reorden;
    @Column(name = "MaximumQuantity")
    private float CantidadMaxima;
    @Column(name = "TimeDateStamp")
    private Date FechaAuditoria;
    @JoinColumn(name = "InventoryCategoryId", insertable = false, updatable = false)
    @ManyToOne()
    private CategoriaInvEntity Categoria;
    @JoinColumn(name = "InventoryTypeId", insertable = false, updatable = false)
    @ManyToOne
    private TipoInvEntity tipoInvEntity;
    @JoinColumn(name = "InventoryUnitId", insertable = false, updatable = false)
    @ManyToOne
    private UnidadInvEntity unidadInvEntity;

    public InventarioEntity() {
    }

    public InventarioEntity(Boolean Inactivo, String nombreItem, BigDecimal costoItem, int itemPorPaquetes, int paquetesPorCaja, String unidadSku, String paqueteSku, String cajaSku, float reorden, float cantidadMaxima, Date fechaAuditoria, CategoriaInvEntity categoria, TipoInvEntity tipoInvEntity, UnidadInvEntity unidadInvEntity) {
        this.Inactivo = Inactivo;
        this.nombreItem = nombreItem;
        this.costoItem = costoItem;
        this.itemPorPaquetes = itemPorPaquetes;
        this.paquetesPorCaja = paquetesPorCaja;
        UnidadSku = unidadSku;
        PaqueteSku = paqueteSku;
        CajaSku = cajaSku;
        Reorden = reorden;
        CantidadMaxima = cantidadMaxima;
        FechaAuditoria = fechaAuditoria;
        Categoria = categoria;
        this.tipoInvEntity = tipoInvEntity;
        this.unidadInvEntity = unidadInvEntity;
    }

    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Boolean getInactivo() {
        return Inactivo;
    }

    public void setInactivo(Boolean activo) {
        this.Inactivo = activo;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public BigDecimal getCostoItem() {
        return costoItem;
    }

    public void setCostoItem(BigDecimal costoItem) {
        this.costoItem = costoItem;
    }

    public int getItemPorPaquetes() {
        return itemPorPaquetes;
    }

    public void setItemPorPaquetes(int itemPorPaquetes) {
        this.itemPorPaquetes = itemPorPaquetes;
    }

    public int getPaquetesPorCaja() {
        return paquetesPorCaja;
    }

    public void setPaquetesPorCaja(int paquetesPorCaja) {
        this.paquetesPorCaja = paquetesPorCaja;
    }

    public String getUnidadSku() {
        return UnidadSku;
    }

    public void setUnidadSku(String unidadSku) {
        UnidadSku = unidadSku;
    }

    public String getPaqueteSku() {
        return PaqueteSku;
    }

    public void setPaqueteSku(String paqueteSku) {
        PaqueteSku = paqueteSku;
    }

    public String getCajaSku() {
        return CajaSku;
    }

    public void setCajaSku(String cajaSku) {
        CajaSku = cajaSku;
    }

    public float getReorden() {
        return Reorden;
    }

    public void setReorden(float reorden) {
        Reorden = reorden;
    }

    public float getCantidadMaxima() {
        return CantidadMaxima;
    }

    public void setCantidadMaxima(float cantidadMaxima) {
        CantidadMaxima = cantidadMaxima;
    }

    public Date getFechaAuditoria() {
        return FechaAuditoria;
    }

    public void setFechaAuditoria(Date fechaAuditoria) {
        FechaAuditoria = fechaAuditoria;
    }

    public CategoriaInvEntity getCategoria() {
        return Categoria;
    }

    public void setCategoria(CategoriaInvEntity categoria) {
        Categoria = categoria;
    }

    public TipoInvEntity getTipoInvEntity() {
        return tipoInvEntity;
    }

    public void setTipoInvEntity(TipoInvEntity tipoInvEntity) {
        this.tipoInvEntity = tipoInvEntity;
    }

    public UnidadInvEntity getUnidadInvEntity() {
        return unidadInvEntity;
    }

    public void setUnidadInvEntity(UnidadInvEntity unidadInvEntity) {
        this.unidadInvEntity = unidadInvEntity;
    }

    @Override
    public String toString() {
        return "InventarioEntity{" +
                "idInventario=" + idInventario +
                ", activo=" + Inactivo +
                ", nombreItem='" + nombreItem + '\'' +
                ", costoItem=" + costoItem +
                ", itemPorPaquetes=" + itemPorPaquetes +
                ", paquetesPorCaja=" + paquetesPorCaja +
                ", UnidadSku='" + UnidadSku + '\'' +
                ", PaqueteSku='" + PaqueteSku + '\'' +
                ", CajaSku='" + CajaSku + '\'' +
                ", Reorden=" + Reorden +
                ", CantidadMaxima=" + CantidadMaxima +
                ", FechaAuditoria=" + FechaAuditoria +
                ", Categoria=" + Categoria +
                ", tipoInvEntity=" + tipoInvEntity +
                ", unidadInvEntity=" + unidadInvEntity +
                '}';
    }
}
