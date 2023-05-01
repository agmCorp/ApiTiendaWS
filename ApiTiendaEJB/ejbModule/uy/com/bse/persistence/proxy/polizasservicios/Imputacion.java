
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para imputacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="imputacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codMedioPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrigenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debitoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMedioPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descOrigenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPreliquidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numPreliquidacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imputacion", propOrder = {
    "codMedioPago",
    "codMoneda",
    "codOrigenPago",
    "debitoCredito",
    "descMedioPago",
    "descOrigenPago",
    "descripMoneda",
    "fechaPreliquidacion",
    "monto",
    "numPreliquidacion"
})
public class Imputacion {

    protected Integer codMedioPago;
    protected String codMoneda;
    protected String codOrigenPago;
    protected String debitoCredito;
    protected String descMedioPago;
    protected String descOrigenPago;
    protected String descripMoneda;
    protected String fechaPreliquidacion;
    protected Double monto;
    protected Integer numPreliquidacion;

    /**
     * Obtiene el valor de la propiedad codMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMedioPago() {
        return codMedioPago;
    }

    /**
     * Define el valor de la propiedad codMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMedioPago(Integer value) {
        this.codMedioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMoneda() {
        return codMoneda;
    }

    /**
     * Define el valor de la propiedad codMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMoneda(String value) {
        this.codMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrigenPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrigenPago() {
        return codOrigenPago;
    }

    /**
     * Define el valor de la propiedad codOrigenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrigenPago(String value) {
        this.codOrigenPago = value;
    }

    /**
     * Obtiene el valor de la propiedad debitoCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitoCredito() {
        return debitoCredito;
    }

    /**
     * Define el valor de la propiedad debitoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitoCredito(String value) {
        this.debitoCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad descMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMedioPago() {
        return descMedioPago;
    }

    /**
     * Define el valor de la propiedad descMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMedioPago(String value) {
        this.descMedioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descOrigenPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescOrigenPago() {
        return descOrigenPago;
    }

    /**
     * Define el valor de la propiedad descOrigenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescOrigenPago(String value) {
        this.descOrigenPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripMoneda() {
        return descripMoneda;
    }

    /**
     * Define el valor de la propiedad descripMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripMoneda(String value) {
        this.descripMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPreliquidacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPreliquidacion() {
        return fechaPreliquidacion;
    }

    /**
     * Define el valor de la propiedad fechaPreliquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPreliquidacion(String value) {
        this.fechaPreliquidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMonto(Double value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad numPreliquidacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPreliquidacion() {
        return numPreliquidacion;
    }

    /**
     * Define el valor de la propiedad numPreliquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPreliquidacion(Integer value) {
        this.numPreliquidacion = value;
    }

}
