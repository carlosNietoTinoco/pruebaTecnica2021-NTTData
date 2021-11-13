package com.NTTData.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="COB_GESTOR",  schema = "GCCOBRANZAS")
public class Gestor {

    @Id
    private String USUARIO_ID;
    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;
    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Column(name = "SEGUNDO_APELLIDO")
    private String sengundoApellido;
    private String TARJETA_PROFESIONAL;
    private String DIRECCION;
    private String TELEFONO;
    private String CELULAR;
    private String CORREO_ELECTRONICO;
    private String APROBADOR_ID;
    private String DIRECTOR_ID;
    private String ACTIVO;
    private String USUARIO_CREACION;
    private String FECHA_CREACION;
    private String USUARIO_ULTIMA_MODIFICACION;
    private String FECHA_ULTIMA_MODIFICACION;
    private String ROL_CAT;
    private String NIVEL_JERARQUIA_CAT;
    private Integer LUGAR_EXPEDICION_ID;
    private String TIPO_IDENTIFICACION;
    private String NUMERO_IDENTIFICACION;
    private Integer CIUDAD_ID;
    private Integer DEPARTAMENTO_ID;


    public String getNombres() {
        return primerNombre + " " + segundoNombre;
    }

    public String getUSUARIO_ID() {
        return USUARIO_ID;
    }

    public void setUSUARIO_ID(String USUARIO_ID) {
        this.USUARIO_ID = USUARIO_ID;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSengundoApellido() {
        return sengundoApellido;
    }

    public void setSengundoApellido(String sengundoApellido) {
        this.sengundoApellido = sengundoApellido;
    }

    public String getTARJETA_PROFESIONAL() {
        return TARJETA_PROFESIONAL;
    }

    public void setTARJETA_PROFESIONAL(String TARJETA_PROFESIONAL) {
        this.TARJETA_PROFESIONAL = TARJETA_PROFESIONAL;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getCELULAR() {
        return CELULAR;
    }

    public void setCELULAR(String CELULAR) {
        this.CELULAR = CELULAR;
    }

    public String getCORREO_ELECTRONICO() {
        return CORREO_ELECTRONICO;
    }

    public void setCORREO_ELECTRONICO(String CORREO_ELECTRONICO) {
        this.CORREO_ELECTRONICO = CORREO_ELECTRONICO;
    }

    public String getAPROBADOR_ID() {
        return APROBADOR_ID;
    }

    public void setAPROBADOR_ID(String APROBADOR_ID) {
        this.APROBADOR_ID = APROBADOR_ID;
    }

    public String getDIRECTOR_ID() {
        return DIRECTOR_ID;
    }

    public void setDIRECTOR_ID(String DIRECTOR_ID) {
        this.DIRECTOR_ID = DIRECTOR_ID;
    }

    public String getACTIVO() {
        return ACTIVO;
    }

    public void setACTIVO(String ACTIVO) {
        this.ACTIVO = ACTIVO;
    }

    public String getUSUARIO_CREACION() {
        return USUARIO_CREACION;
    }

    public void setUSUARIO_CREACION(String USUARIO_CREACION) {
        this.USUARIO_CREACION = USUARIO_CREACION;
    }

    public String getFECHA_CREACION() {
        return FECHA_CREACION;
    }

    public void setFECHA_CREACION(String FECHA_CREACION) {
        this.FECHA_CREACION = FECHA_CREACION;
    }

    public String getUSUARIO_ULTIMA_MODIFICACION() {
        return USUARIO_ULTIMA_MODIFICACION;
    }

    public void setUSUARIO_ULTIMA_MODIFICACION(String USUARIO_ULTIMA_MODIFICACION) {
        this.USUARIO_ULTIMA_MODIFICACION = USUARIO_ULTIMA_MODIFICACION;
    }

    public String getFECHA_ULTIMA_MODIFICACION() {
        return FECHA_ULTIMA_MODIFICACION;
    }

    public void setFECHA_ULTIMA_MODIFICACION(String FECHA_ULTIMA_MODIFICACION) {
        this.FECHA_ULTIMA_MODIFICACION = FECHA_ULTIMA_MODIFICACION;
    }

    public String getROL_CAT() {
        return ROL_CAT;
    }

    public void setROL_CAT(String ROL_CAT) {
        this.ROL_CAT = ROL_CAT;
    }

    public String getNIVEL_JERARQUIA_CAT() {
        return NIVEL_JERARQUIA_CAT;
    }

    public void setNIVEL_JERARQUIA_CAT(String NIVEL_JERARQUIA_CAT) {
        this.NIVEL_JERARQUIA_CAT = NIVEL_JERARQUIA_CAT;
    }

    public Integer getLUGAR_EXPEDICION_ID() {
        return LUGAR_EXPEDICION_ID;
    }

    public void setLUGAR_EXPEDICION_ID(Integer LUGAR_EXPEDICION_ID) {
        this.LUGAR_EXPEDICION_ID = LUGAR_EXPEDICION_ID;
    }

    public String getTIPO_IDENTIFICACION() {
        return TIPO_IDENTIFICACION;
    }

    public void setTIPO_IDENTIFICACION(String TIPO_IDENTIFICACION) {
        this.TIPO_IDENTIFICACION = TIPO_IDENTIFICACION;
    }

    public String getNUMERO_IDENTIFICACION() {
        return NUMERO_IDENTIFICACION;
    }

    public void setNUMERO_IDENTIFICACION(String NUMERO_IDENTIFICACION) {
        this.NUMERO_IDENTIFICACION = NUMERO_IDENTIFICACION;
    }

    public Integer getCIUDAD_ID() {
        return CIUDAD_ID;
    }

    public void setCIUDAD_ID(Integer CIUDAD_ID) {
        this.CIUDAD_ID = CIUDAD_ID;
    }

    public Integer getDEPARTAMENTO_ID() {
        return DEPARTAMENTO_ID;
    }

    public void setDEPARTAMENTO_ID(Integer DEPARTAMENTO_ID) {
        this.DEPARTAMENTO_ID = DEPARTAMENTO_ID;
    }
}
