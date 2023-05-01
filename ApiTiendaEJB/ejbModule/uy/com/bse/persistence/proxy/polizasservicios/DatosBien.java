
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosBien complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosBien">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantDecimales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codDato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTabla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorNotificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longitudDato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requerido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "datosBien", propOrder = {
    "cantDecimales",
    "codDato",
    "codTabla",
    "colorNotificacion",
    "datoDesc",
    "datoTipo",
    "longitudDato",
    "requerido",
    "valorCod",
    "valorDesc",
    "visibilidad"
})
public class DatosBien {

    protected String cantDecimales;
    protected String codDato;
    protected String codTabla;
    protected String colorNotificacion;
    protected String datoDesc;
    protected String datoTipo;
    protected String longitudDato;
    protected String requerido;
    protected String valorCod;
    protected String valorDesc;
    protected String visibilidad;

    /**
     * Obtiene el valor de la propiedad cantDecimales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantDecimales() {
        return cantDecimales;
    }

    /**
     * Define el valor de la propiedad cantDecimales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantDecimales(String value) {
        this.cantDecimales = value;
    }

    /**
     * Obtiene el valor de la propiedad codDato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDato() {
        return codDato;
    }

    /**
     * Define el valor de la propiedad codDato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDato(String value) {
        this.codDato = value;
    }

    /**
     * Obtiene el valor de la propiedad codTabla.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTabla() {
        return codTabla;
    }

    /**
     * Define el valor de la propiedad codTabla.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTabla(String value) {
        this.codTabla = value;
    }

    /**
     * Obtiene el valor de la propiedad colorNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorNotificacion() {
        return colorNotificacion;
    }

    /**
     * Define el valor de la propiedad colorNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorNotificacion(String value) {
        this.colorNotificacion = value;
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
     * Obtiene el valor de la propiedad longitudDato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudDato() {
        return longitudDato;
    }

    /**
     * Define el valor de la propiedad longitudDato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudDato(String value) {
        this.longitudDato = value;
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
