
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="factura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aplicada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantOtros" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="descripEstadoFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmisionFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaSegundoVto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaVto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numFactura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numFacturaElectronica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="permiteImprimir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="punitario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="recargoFinanciero" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalFactura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalImporte" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factura", propOrder = {
    "aplicada",
    "cantOtros",
    "descripEstadoFactura",
    "documentId",
    "fechaEmisionFactura",
    "fechaPago",
    "fechaSegundoVto",
    "fechaVto",
    "importe",
    "iva",
    "numFactura",
    "numFacturaElectronica",
    "permiteImprimir",
    "punitario",
    "recargoFinanciero",
    "totalFactura",
    "totalImporte"
})
public class Factura {

    protected String aplicada;
    protected Double cantOtros;
    protected String descripEstadoFactura;
    protected String documentId;
    protected String fechaEmisionFactura;
    protected String fechaPago;
    protected String fechaSegundoVto;
    protected String fechaVto;
    protected Double importe;
    protected Double iva;
    protected Integer numFactura;
    protected String numFacturaElectronica;
    protected String permiteImprimir;
    protected Double punitario;
    protected Double recargoFinanciero;
    protected Double totalFactura;
    protected Double totalImporte;

    /**
     * Obtiene el valor de la propiedad aplicada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplicada() {
        return aplicada;
    }

    /**
     * Define el valor de la propiedad aplicada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAplicada(String value) {
        this.aplicada = value;
    }

    /**
     * Obtiene el valor de la propiedad cantOtros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantOtros() {
        return cantOtros;
    }

    /**
     * Define el valor de la propiedad cantOtros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantOtros(Double value) {
        this.cantOtros = value;
    }

    /**
     * Obtiene el valor de la propiedad descripEstadoFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripEstadoFactura() {
        return descripEstadoFactura;
    }

    /**
     * Define el valor de la propiedad descripEstadoFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripEstadoFactura(String value) {
        this.descripEstadoFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad documentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Define el valor de la propiedad documentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmisionFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmisionFactura() {
        return fechaEmisionFactura;
    }

    /**
     * Define el valor de la propiedad fechaEmisionFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmisionFactura(String value) {
        this.fechaEmisionFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSegundoVto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaSegundoVto() {
        return fechaSegundoVto;
    }

    /**
     * Define el valor de la propiedad fechaSegundoVto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaSegundoVto(String value) {
        this.fechaSegundoVto = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaVto() {
        return fechaVto;
    }

    /**
     * Define el valor de la propiedad fechaVto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaVto(String value) {
        this.fechaVto = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporte(Double value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIva() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIva(Double value) {
        this.iva = value;
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
     * Obtiene el valor de la propiedad numFacturaElectronica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumFacturaElectronica() {
        return numFacturaElectronica;
    }

    /**
     * Define el valor de la propiedad numFacturaElectronica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumFacturaElectronica(String value) {
        this.numFacturaElectronica = value;
    }

    /**
     * Obtiene el valor de la propiedad permiteImprimir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermiteImprimir() {
        return permiteImprimir;
    }

    /**
     * Define el valor de la propiedad permiteImprimir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermiteImprimir(String value) {
        this.permiteImprimir = value;
    }

    /**
     * Obtiene el valor de la propiedad punitario.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPunitario() {
        return punitario;
    }

    /**
     * Define el valor de la propiedad punitario.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPunitario(Double value) {
        this.punitario = value;
    }

    /**
     * Obtiene el valor de la propiedad recargoFinanciero.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecargoFinanciero() {
        return recargoFinanciero;
    }

    /**
     * Define el valor de la propiedad recargoFinanciero.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecargoFinanciero(Double value) {
        this.recargoFinanciero = value;
    }

    /**
     * Obtiene el valor de la propiedad totalFactura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFactura() {
        return totalFactura;
    }

    /**
     * Define el valor de la propiedad totalFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFactura(Double value) {
        this.totalFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad totalImporte.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalImporte() {
        return totalImporte;
    }

    /**
     * Define el valor de la propiedad totalImporte.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalImporte(Double value) {
        this.totalImporte = value;
    }

}
