
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosBienCert complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosBienCert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadFiltros" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cotizar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datoCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datoPosicion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decimales" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="obligatorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requerido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tabla" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tieneReglas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visibilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosBienCert", propOrder = {
    "cantidadFiltros",
    "cotizar",
    "datoCod",
    "datoDesc",
    "datoPosicion",
    "datoTipo",
    "decimales",
    "longitud",
    "obligatorio",
    "requerido",
    "tabla",
    "tieneReglas",
    "valorCod",
    "valorDesc",
    "visibilidad"
})
public class DatosBienCert {

    protected Integer cantidadFiltros;
    protected String cotizar;
    protected Integer datoCod;
    protected String datoDesc;
    protected Integer datoPosicion;
    protected String datoTipo;
    protected Integer decimales;
    protected Integer longitud;
    protected String obligatorio;
    protected String requerido;
    protected Integer tabla;
    protected String tieneReglas;
    protected String valorCod;
    protected String valorDesc;
    protected String visibilidad;

    /**
     * Obtiene el valor de la propiedad cantidadFiltros.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadFiltros() {
        return cantidadFiltros;
    }

    /**
     * Define el valor de la propiedad cantidadFiltros.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadFiltros(Integer value) {
        this.cantidadFiltros = value;
    }

    /**
     * Obtiene el valor de la propiedad cotizar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCotizar() {
        return cotizar;
    }

    /**
     * Define el valor de la propiedad cotizar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCotizar(String value) {
        this.cotizar = value;
    }

    /**
     * Obtiene el valor de la propiedad datoCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatoCod() {
        return datoCod;
    }

    /**
     * Define el valor de la propiedad datoCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatoCod(Integer value) {
        this.datoCod = value;
    }

    /**
     * Obtiene el valor de la propiedad datoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoDesc() {
        return datoDesc;
    }

    /**
     * Define el valor de la propiedad datoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoDesc(String value) {
        this.datoDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad datoPosicion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatoPosicion() {
        return datoPosicion;
    }

    /**
     * Define el valor de la propiedad datoPosicion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatoPosicion(Integer value) {
        this.datoPosicion = value;
    }

    /**
     * Obtiene el valor de la propiedad datoTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoTipo() {
        return datoTipo;
    }

    /**
     * Define el valor de la propiedad datoTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoTipo(String value) {
        this.datoTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad decimales.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDecimales() {
        return decimales;
    }

    /**
     * Define el valor de la propiedad decimales.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDecimales(Integer value) {
        this.decimales = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongitud(Integer value) {
        this.longitud = value;
    }

    /**
     * Obtiene el valor de la propiedad obligatorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObligatorio() {
        return obligatorio;
    }

    /**
     * Define el valor de la propiedad obligatorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObligatorio(String value) {
        this.obligatorio = value;
    }

    /**
     * Obtiene el valor de la propiedad requerido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequerido() {
        return requerido;
    }

    /**
     * Define el valor de la propiedad requerido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequerido(String value) {
        this.requerido = value;
    }

    /**
     * Obtiene el valor de la propiedad tabla.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTabla() {
        return tabla;
    }

    /**
     * Define el valor de la propiedad tabla.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTabla(Integer value) {
        this.tabla = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneReglas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneReglas() {
        return tieneReglas;
    }

    /**
     * Define el valor de la propiedad tieneReglas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneReglas(String value) {
        this.tieneReglas = value;
    }

    /**
     * Obtiene el valor de la propiedad valorCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorCod() {
        return valorCod;
    }

    /**
     * Define el valor de la propiedad valorCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorCod(String value) {
        this.valorCod = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDesc() {
        return valorDesc;
    }

    /**
     * Define el valor de la propiedad valorDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDesc(String value) {
        this.valorDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad visibilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibilidad() {
        return visibilidad;
    }

    /**
     * Define el valor de la propiedad visibilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibilidad(String value) {
        this.visibilidad = value;
    }

}
