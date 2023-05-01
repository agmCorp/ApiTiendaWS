
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cancelacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cancelacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codCancelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoCancelado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numCancelacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numLiquidacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelacion", propOrder = {
    "codCancelacion",
    "codUsuario",
    "descripMoneda",
    "fechaActualizacion",
    "montoCancelado",
    "numCancelacion",
    "numLiquidacion"
})
public class Cancelacion {

    protected String codCancelacion;
    protected String codUsuario;
    protected String descripMoneda;
    protected String fechaActualizacion;
    protected Double montoCancelado;
    protected Integer numCancelacion;
    protected Integer numLiquidacion;

    /**
     * Obtiene el valor de la propiedad codCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCancelacion() {
        return codCancelacion;
    }

    /**
     * Define el valor de la propiedad codCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCancelacion(String value) {
        this.codCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsuario() {
        return codUsuario;
    }

    /**
     * Define el valor de la propiedad codUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsuario(String value) {
        this.codUsuario = value;
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
     * Obtiene el valor de la propiedad montoCancelado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoCancelado() {
        return montoCancelado;
    }

    /**
     * Define el valor de la propiedad montoCancelado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoCancelado(Double value) {
        this.montoCancelado = value;
    }

    /**
     * Obtiene el valor de la propiedad numCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCancelacion() {
        return numCancelacion;
    }

    /**
     * Define el valor de la propiedad numCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCancelacion(Integer value) {
        this.numCancelacion = value;
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

}
