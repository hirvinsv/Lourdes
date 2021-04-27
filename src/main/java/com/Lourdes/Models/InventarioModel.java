package com.Lourdes.Models;

import com.Lourdes.Entity.CategoriaInvEntity;
import com.Lourdes.Entity.TipoInvEntity;
import com.Lourdes.Entity.UnidadInvEntity;

import java.math.BigDecimal;
import java.util.Date;

public class InventarioModel {

    private Integer idInventario;
    private Boolean activo;
    private String nombreItem;
    private BigDecimal costoItem;
    private int itemPorPaquetes;
    private int paquetesPorCaja;
    private String UnidadSku;
    private String PaqueteSku;
    private String CajaSku;
    private float Reorden;
    private float CantidadMaxima;
    private Date FechaAuditoria;
    private Integer Categoria;
    private Integer tipoInvEntity;
    private Integer unidadInvEntity;

    public InventarioModel() {

    }


    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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

    public Integer getCategoria() {
        return Categoria;
    }

    public void setCategoria(Integer categoria) {
        Categoria = categoria;
    }

    public Integer getTipoInvEntity() {
        return tipoInvEntity;
    }

    public void setTipoInvEntity(Integer tipoInvEntity) {
        this.tipoInvEntity = tipoInvEntity;
    }

    public Integer getUnidadInvEntity() {
        return unidadInvEntity;
    }

    public void setUnidadInvEntity(Integer unidadInvEntity) {
        this.unidadInvEntity = unidadInvEntity;
    }

    @Override
    public String toString() {
        return "InventarioModel{" +
                "idInventario=" + idInventario +
                ", activo=" + activo +
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
