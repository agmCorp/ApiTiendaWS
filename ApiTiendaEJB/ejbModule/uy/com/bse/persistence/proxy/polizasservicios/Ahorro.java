
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ahorro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ahorro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codPlanPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionPlanPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoAporte" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoPagar" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ahorro", propOrder = {
    "codPlanPago",
    "codProceso",
    "descripcionPlanPago",
    "descripcionProceso",
    "fechaDesde",
    "fechaHasta",
    "montoAporte",
    "montoPagar"
})
public class Ahorro {

    protected Integer codPlanPago;
    protected String codProceso;
    protected String descripcionPlanPago;
    protected String descripcionProceso;
    protected String fechaDesde;
    protected String fechaHasta;
    protected Double montoAporte;
    protected Double montoPagar;

    /**
     * Obtiene el valor de la propiedad codPlanPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodPlanPago() {
        return codPlanPago;
    }

    /**
     * Define el valor de la propiedad codPlanPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodPlanPago(Integer value) {
        this.codPlanPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProceso() {
        return codProceso;
    }

    /**
     * Define el valor de la propiedad codProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProceso(String value) {
        this.codProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionPlanPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionPlanPago() {
        return descripcionPlanPago;
    }

    /**
     * Define el valor de la propiedad descripcionPlanPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionPlanPago(String value) {
        this.descripcionPlanPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionProceso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionProceso() {
        return descripcionProceso;
    }

    /**
     * Define el valor de la propiedad descripcionProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionProceso(String value) {
        this.descripcionProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesde(String value) {
        this.fechaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHasta(String value) {
        this.fechaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad montoAporte.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoAporte() {
        return montoAporte;
    }

    /**
     * Define el valor de la propiedad montoAporte.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoAporte(Double value) {
        this.montoAporte = value;
    }

    /**
     * Obtiene el valor de la propiedad montoPagar.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoPagar() {
        return montoPagar;
    }

    /**
     * Define el valor de la propiedad montoPagar.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoPagar(Double value) {
        this.montoPagar = value;
    }

}
