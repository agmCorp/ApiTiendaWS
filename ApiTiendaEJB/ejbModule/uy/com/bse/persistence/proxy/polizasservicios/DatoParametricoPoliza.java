
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datoParametricoPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datoParametricoPoliza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codDato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTabla" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripDato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorDato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datoParametricoPoliza", propOrder = {
    "cantidad",
    "codDato",
    "codTabla",
    "descripDato",
    "valorDato"
})
public class DatoParametricoPoliza {

    protected Integer cantidad;
    protected String codDato;
    protected Integer codTabla;
    protected String descripDato;
    protected String valorDato;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidad(Integer value) {
        this.cantidad = value;
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
     *     {@link Integer }
     *     
     */
    public Integer getCodTabla() {
        return codTabla;
    }

    /**
     * Define el valor de la propiedad codTabla.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodTabla(Integer value) {
        this.codTabla = value;
    }

    /**
     * Obtiene el valor de la propiedad descripDato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripDato() {
        return descripDato;
    }

    /**
     * Define el valor de la propiedad descripDato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripDato(String value) {
        this.descripDato = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDato() {
        return valorDato;
    }

    /**
     * Define el valor de la propiedad valorDato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDato(String value) {
        this.valorDato = value;
    }

}
