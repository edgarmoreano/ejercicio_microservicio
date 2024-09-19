package com.ejercicio.springboot.jpa.springboot_jpa.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimientos")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmovimiento;
    private Date fecha;
    @Column(name = "tipo_movimiento")
    private String tipoMovimiento;
    private Long valor;
    private Long saldo;
    @ManyToOne
    @JoinColumn(name = "cuenta_idcuenta")
    private Cuenta cuenta;
    public Long getIdmovimiento() {
        return idmovimiento;
    }
    public void setIdmovimiento(Long idmovimiento) {
        this.idmovimiento = idmovimiento;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getTipoMovimiento() {
        return tipoMovimiento;
    }
    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    public Long getValor() {
        return valor;
    }
    public void setValor(Long valor) {
        this.valor = valor;
    }
    public Long getSaldo() {
        return saldo;
    }
    public void setSaldo(Long saldo) {
        this.saldo = saldo;
    }
    public Cuenta getCuenta() {
        return cuenta;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
