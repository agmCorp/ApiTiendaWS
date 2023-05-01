
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosTotalesCuotas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosTotalesCuotas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comisionLiberada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="preliqPendiente" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="premioEmitido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="premioFacturado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saldoPremio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saldoPremioVencido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saldoTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saldoTotalVencido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalCobrado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalComision" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalComisionLiberada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalFacturado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosTotalesCuotas", propOrder = {
    "comisionLiberada",
    "preliqPendiente",
    "premioEmitido",
    "premioFacturado",
    "saldoPremio",
    "saldoPremioVencido",
    "saldoTotal",
    "saldoTotalVencido",
    "totalCobrado",
    "totalComision",
    "totalComisionLiberada",
    "totalFacturado"
})
public class DatosTotalesCuotas {

    protected Double comisionLiberada;
    protected Double preliqPendiente;
    protected Double premioEmitido;
    protected Double premioFacturado;
    protected Double saldoPremio;
    protected Double saldoPremioVencido;
    protected Double saldoTotal;
    protected Double saldoTotalVencido;
    protected Double totalCobrado;
    protected Double totalComision;
    protected Double totalComisionLiberada;
    protected Double totalFacturado;

    /**
     * Obtiene el valor de la propiedad comisionLiberada.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getComisionLiberada() {
        return comisionLiberada;
    }

    /**
     * Define el valor de la propiedad comisionLiberada.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setComisionLiberada(Double value) {
        this.comisionLiberada = value;
    }

    /**
     * Obtiene el valor de la propiedad preliqPendiente.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPreliqPendiente() {
        return preliqPendiente;
    }

    /**
     * Define el valor de la propiedad preliqPendiente.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPreliqPendiente(Double value) {
        this.preliqPendiente = value;
    }

    /**
     * Obtiene el valor de la propiedad premioEmitido.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPremioEmitido() {
        return premioEmitido;
    }

    /**
     * Define el valor de la propiedad premioEmitido.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPremioEmitido(Double value) {
        this.premioEmitido = value;
    }

    /**
     * Obtiene el valor de la propiedad premioFacturado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPremioFacturado() {
        return premioFacturado;
    }

    /**
     * Define el valor de la propiedad premioFacturado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPremioFacturado(Double value) {
        this.premioFacturado = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoPremio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoPremio() {
        return saldoPremio;
    }

    /**
     * Define el valor de la propiedad saldoPremio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoPremio(Double value) {
        this.saldoPremio = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoPremioVencido.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoPremioVencido() {
        return saldoPremioVencido;
    }

    /**
     * Define el valor de la propiedad saldoPremioVencido.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoPremioVencido(Double value) {
        this.saldoPremioVencido = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoTotal() {
        return saldoTotal;
    }

    /**
     * Define el valor de la propiedad saldoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoTotal(Double value) {
        this.saldoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoTotalVencido.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoTotalVencido() {
        return saldoTotalVencido;
    }

    /**
     * Define el valor de la propiedad saldoTotalVencido.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoTotalVencido(Double value) {
        this.saldoTotalVencido = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCobrado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCobrado() {
        return totalCobrado;
    }

    /**
     * Define el valor de la propiedad totalCobrado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCobrado(Double value) {
        this.totalCobrado = value;
    }

    /**
     * Obtiene el valor de la propiedad totalComision.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalComision() {
        return totalComision;
    }

    /**
     * Define el valor de la propiedad totalComision.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalComision(Double value) {
        this.totalComision = value;
    }

    /**
     * Obtiene el valor de la propiedad totalComisionLiberada.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalComisionLiberada() {
        return totalComisionLiberada;
    }

    /**
     * Define el valor de la propiedad totalComisionLiberada.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalComisionLiberada(Double value) {
        this.totalComisionLiberada = value;
    }

    /**
     * Obtiene el valor de la propiedad totalFacturado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFacturado() {
        return totalFacturado;
    }

    /**
     * Define el valor de la propiedad totalFacturado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFacturado(Double value) {
        this.totalFacturado = value;
    }

}
