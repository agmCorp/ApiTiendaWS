
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para certificadoPolizaBasico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="certificadoPolizaBasico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMedioPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripPlanPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesdeVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificadoPolizaBasico", propOrder = {
    "asegurado",
    "descripMedioPago",
    "descripOrigen",
    "descripPlanPago",
    "estadoPoliza",
    "fechaDesdeVigencia",
    "numCertificado"
})
@XmlSeeAlso({
    CertificadoPoliza.class,
    DetalleRefacturacionPoliza.class
})
public class CertificadoPolizaBasico {

    protected String asegurado;
    protected String descripMedioPago;
    protected String descripOrigen;
    protected String descripPlanPago;
    protected String estadoPoliza;
    protected String fechaDesdeVigencia;
    protected Integer numCertificado;

    /**
     * Obtiene el valor de la propiedad asegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsegurado() {
        return asegurado;
    }

    /**
     * Define el valor de la propiedad asegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsegurado(String value) {
        this.asegurado = value;
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
     * Obtiene el valor de la propiedad descripOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripOrigen() {
        return descripOrigen;
    }

    /**
     * Define el valor de la propiedad descripOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripOrigen(String value) {
        this.descripOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad descripPlanPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripPlanPago() {
        return descripPlanPago;
    }

    /**
     * Define el valor de la propiedad descripPlanPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripPlanPago(String value) {
        this.descripPlanPago = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoPoliza() {
        return estadoPoliza;
    }

    /**
     * Define el valor de la propiedad estadoPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoPoliza(String value) {
        this.estadoPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesdeVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesdeVigencia() {
        return fechaDesdeVigencia;
    }

    /**
     * Define el valor de la propiedad fechaDesdeVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesdeVigencia(String value) {
        this.fechaDesdeVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad numCertificado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCertificado() {
        return numCertificado;
    }

    /**
     * Define el valor de la propiedad numCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCertificado(Integer value) {
        this.numCertificado = value;
    }

}
