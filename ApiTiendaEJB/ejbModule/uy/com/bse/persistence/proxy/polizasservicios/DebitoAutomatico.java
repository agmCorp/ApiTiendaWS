
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para debitoAutomatico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="debitoAutomatico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMedioPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codOrigenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMedioPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripOrigenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripRamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVtoLiquidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoDebitar" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numFactura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numLiquidacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="procesado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "debitoAutomatico", propOrder = {
    "codError",
    "codEstado",
    "codMedioPago",
    "codOrigenPago",
    "codRamo",
    "descripError",
    "descripEstado",
    "descripMedioPago",
    "descripOrigenPago",
    "descripRamo",
    "fechaVtoLiquidacion",
    "montoDebitar",
    "numCuenta",
    "numFactura",
    "numLiquidacion",
    "numPoliza",
    "procesado"
})
public class DebitoAutomatico {

    protected Integer codError;
    protected String codEstado;
    protected Integer codMedioPago;
    protected String codOrigenPago;
    protected Integer codRamo;
    protected String descripError;
    protected String descripEstado;
    protected String descripMedioPago;
    protected String descripOrigenPago;
    protected String descripRamo;
    protected String fechaVtoLiquidacion;
    protected Double montoDebitar;
    protected String numCuenta;
    protected Integer numFactura;
    protected Integer numLiquidacion;
    protected Integer numPoliza;
    protected String procesado;

    /**
     * Obtiene el valor de la propiedad codError.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodError() {
        return codError;
    }

    /**
     * Define el valor de la propiedad codError.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodError(Integer value) {
        this.codError = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstado() {
        return codEstado;
    }

    /**
     * Define el valor de la propiedad codEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstado(String value) {
        this.codEstado = value;
    }

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
     * Obtiene el valor de la propiedad codRamo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodRamo() {
        return codRamo;
    }

    /**
     * Define el valor de la propiedad codRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodRamo(Integer value) {
        this.codRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripError() {
        return descripError;
    }

    /**
     * Define el valor de la propiedad descripError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripError(String value) {
        this.descripError = value;
    }

    /**
     * Obtiene el valor de la propiedad descripEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripEstado() {
        return descripEstado;
    }

    /**
     * Define el valor de la propiedad descripEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripEstado(String value) {
        this.descripEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripMedioPago() {
        return descripMedioPago;
    }

    /**
     * Define el valor de la propiedad descripMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripMedioPago(String value) {
        this.descripMedioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripOrigenPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripOrigenPago() {
        return descripOrigenPago;
    }

    /**
     * Define el valor de la propiedad descripOrigenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripOrigenPago(String value) {
        this.descripOrigenPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripRamo() {
        return descripRamo;
    }

    /**
     * Define el valor de la propiedad descripRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripRamo(String value) {
        this.descripRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVtoLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVtoLiquidacion() {
        return fechaVtoLiquidacion;
    }

    /**
     * Define el valor de la propiedad fechaVtoLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVtoLiquidacion(String value) {
        this.fechaVtoLiquidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDebitar.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoDebitar() {
        return montoDebitar;
    }

    /**
     * Define el valor de la propiedad montoDebitar.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoDebitar(Double value) {
        this.montoDebitar = value;
    }

    /**
     * Obtiene el valor de la propiedad numCuenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * Define el valor de la propiedad numCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCuenta(String value) {
        this.numCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numFactura.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumFactura() {
        return numFactura;
    }

    /**
     * Define el valor de la propiedad numFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumFactura(Integer value) {
        this.numFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad numLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumLiquidacion() {
        return numLiquidacion;
    }

    /**
     * Define el valor de la propiedad numLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumLiquidacion(Integer value) {
        this.numLiquidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numPoliza.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPoliza() {
        return numPoliza;
    }

    /**
     * Define el valor de la propiedad numPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPoliza(Integer value) {
        this.numPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad procesado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcesado() {
        return procesado;
    }

    /**
     * Define el valor de la propiedad procesado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcesado(String value) {
        this.procesado = value;
    }

}
