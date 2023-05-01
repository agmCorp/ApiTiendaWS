
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosComunicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosComunicacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codComunicacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPersona" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoComunicacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="validada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorComunicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosComunicacion", propOrder = {
    "codComunicacion",
    "fechaActualizacion",
    "numPersona",
    "tipoComunicacion",
    "validada",
    "valorComunicacion"
})
public class DatosComunicacion {

    protected Integer codComunicacion;
    protected String fechaActualizacion;
    protected Integer numPersona;
    protected Integer tipoComunicacion;
    protected String validada;
    protected String valorComunicacion;

    /**
     * Obtiene el valor de la propiedad codComunicacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodComunicacion() {
        return codComunicacion;
    }

    /**
     * Define el valor de la propiedad codComunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodComunicacion(Integer value) {
        this.codComunicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaActualizacion(String value) {
        this.fechaActualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numPersona.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPersona() {
        return numPersona;
    }

    /**
     * Define el valor de la propiedad numPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPersona(Integer value) {
        this.numPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComunicacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoComunicacion() {
        return tipoComunicacion;
    }

    /**
     * Define el valor de la propiedad tipoComunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoComunicacion(Integer value) {
        this.tipoComunicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad validada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidada() {
        return validada;
    }

    /**
     * Define el valor de la propiedad validada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidada(String value) {
        this.validada = value;
    }

    /**
     * Obtiene el valor de la propiedad valorComunicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorComunicacion() {
        return valorComunicacion;
    }

    /**
     * Define el valor de la propiedad valorComunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorComunicacion(String value) {
        this.valorComunicacion = value;
    }

}
