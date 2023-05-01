
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para encabezadoDetallePoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="encabezadoDetallePoliza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anexos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codAgencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codBienAsegurado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEstado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripBienAsegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAsegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "encabezadoDetallePoliza", propOrder = {
    "anexos",
    "codAgencia",
    "codBienAsegurado",
    "codCliente",
    "codEstado",
    "codNacionalidad",
    "codPlanCobertura",
    "codProducto",
    "codRamo",
    "descripAgencia",
    "descripBienAsegurado",
    "descripEstado",
    "descripPlanCobertura",
    "nombreAsegurado",
    "numCertificado",
    "numEndoso",
    "numPoliza"
})
public class EncabezadoDetallePoliza {

    protected String anexos;
    protected Integer codAgencia;
    protected Integer codBienAsegurado;
    protected String codCliente;
    protected Integer codEstado;
    protected String codNacionalidad;
    protected String codPlanCobertura;
    protected String codProducto;
    protected Integer codRamo;
    protected String descripAgencia;
    protected String descripBienAsegurado;
    protected String descripEstado;
    protected String descripPlanCobertura;
    protected String nombreAsegurado;
    protected Integer numCertificado;
    protected Integer numEndoso;
    protected Integer numPoliza;

    /**
     * Obtiene el valor de la propiedad anexos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnexos() {
        return anexos;
    }

    /**
     * Define el valor de la propiedad anexos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnexos(String value) {
        this.anexos = value;
    }

    /**
     * Obtiene el valor de la propiedad codAgencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAgencia() {
        return codAgencia;
    }

    /**
     * Define el valor de la propiedad codAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAgencia(Integer value) {
        this.codAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codBienAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodBienAsegurado() {
        return codBienAsegurado;
    }

    /**
     * Define el valor de la propiedad codBienAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodBienAsegurado(Integer value) {
        this.codBienAsegurado = value;
    }

    /**
     * Obtiene el valor de la propiedad codCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Define el valor de la propiedad codCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCliente(String value) {
        this.codCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodEstado() {
        return codEstado;
    }

    /**
     * Define el valor de la propiedad codEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodEstado(Integer value) {
        this.codEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad codNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNacionalidad() {
        return codNacionalidad;
    }

    /**
     * Define el valor de la propiedad codNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNacionalidad(String value) {
        this.codNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codPlanCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPlanCobertura() {
        return codPlanCobertura;
    }

    /**
     * Define el valor de la propiedad codPlanCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPlanCobertura(String value) {
        this.codPlanCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad codProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProducto() {
        return codProducto;
    }

    /**
     * Define el valor de la propiedad codProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProducto(String value) {
        this.codProducto = value;
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
     * Obtiene el valor de la propiedad descripAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripAgencia() {
        return descripAgencia;
    }

    /**
     * Define el valor de la propiedad descripAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripAgencia(String value) {
        this.descripAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad descripBienAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripBienAsegurado() {
        return descripBienAsegurado;
    }

    /**
     * Define el valor de la propiedad descripBienAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripBienAsegurado(String value) {
        this.descripBienAsegurado = value;
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
     * Obtiene el valor de la propiedad descripPlanCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripPlanCobertura() {
        return descripPlanCobertura;
    }

    /**
     * Define el valor de la propiedad descripPlanCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripPlanCobertura(String value) {
        this.descripPlanCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAsegurado() {
        return nombreAsegurado;
    }

    /**
     * Define el valor de la propiedad nombreAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAsegurado(String value) {
        this.nombreAsegurado = value;
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

    /**
     * Obtiene el valor de la propiedad numEndoso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumEndoso() {
        return numEndoso;
    }

    /**
     * Define el valor de la propiedad numEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumEndoso(Integer value) {
        this.numEndoso = value;
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

}
