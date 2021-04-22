package com.Lourdes.Entity;

import java.math.BigDecimal;
import java.util.Date;

public class InventarioEntity {

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


}
