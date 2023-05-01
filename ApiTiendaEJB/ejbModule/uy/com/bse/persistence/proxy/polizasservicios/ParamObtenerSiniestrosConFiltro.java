
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramObtenerSiniestrosConFiltro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramObtenerSiniestrosConFiltro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="anio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codAsegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codEjecutivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codProductor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripEjecutivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEntrada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaOcurrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fueraPauta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numSiniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramObtenerSiniestrosConFiltro", propOrder = {
    "anio",
    "asegurado",
    "codAsegurado",
    "codEjecutivo",
    "codProductor",
    "codRamo",
    "descripEjecutivo",
    "fechaEntrada",
    "fechaOcurrencia",
    "fueraPauta",
    "numCertificado",
    "numPoliza",
    "numSiniestro"
})
public class ParamObtenerSiniestrosConFiltro
    extends ParamGenerico
{

    protected String anio;
    protected String asegurado;
    protected String codAsegurado;
    protected String codEjecutivo;
    protected Integer codProductor;
    protected String codRamo;
    protected String descripEjecutivo;
    protected String fechaEntrada;
    protected String fechaOcurrencia;
    protected String fueraPauta;
    protected String numCertificado;
    protected String numPoliza;
    protected String numSiniestro;

    /**
     * Obtiene el valor de la propiedad anio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnio() {
        return anio;
    }

    /**
     * Define el valor de la propiedad anio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnio(String value) {
        this.anio = value;
    }

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
     * Obtiene el valor de la propiedad codAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAsegurado() {
        return codAsegurado;
    }

    /**
     * Define el valor de la propiedad codAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAsegurado(String value) {
        this.codAsegurado = value;
    }

    /**
     * Obtiene el valor de la propiedad codEjecutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEjecutivo() {
        return codEjecutivo;
    }

    /**
     * Define el valor de la propiedad codEjecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEjecutivo(String value) {
        this.codEjecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad codProductor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodProductor() {
        return codProductor;
    }

    /**
     * Define el valor de la propiedad codProductor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodProductor(Integer value) {
        this.codProductor = value;
    }

    /**
     * Obtiene el valor de la propiedad codRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRamo() {
        return codRamo;
    }

    /**
     * Define el valor de la propiedad codRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRamo(String value) {
        this.codRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripEjecutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripEjecutivo() {
        return descripEjecutivo;
    }

    /**
     * Define el valor de la propiedad descripEjecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripEjecutivo(String value) {
        this.descripEjecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * Define el valor de la propiedad fechaEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEntrada(String value) {
        this.fechaEntrada = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOcurrencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOcurrencia() {
        return fechaOcurrencia;
    }

    /**
     * Define el valor de la propiedad fechaOcurrencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOcurrencia(String value) {
        this.fechaOcurrencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fueraPauta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFueraPauta() {
        return fueraPauta;
    }

    /**
     * Define el valor de la propiedad fueraPauta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFueraPauta(String value) {
        this.fueraPauta = value;
    }

    /**
     * Obtiene el valor de la propiedad numCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCertificado() {
        return numCertificado;
    }

    /**
     * Define el valor de la propiedad numCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCertificado(String value) {
        this.numCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad numPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPoliza() {
        return numPoliza;
    }

    /**
     * Define el valor de la propiedad numPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPoliza(String value) {
        this.numPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad numSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSiniestro() {
        return numSiniestro;
    }

    /**
     * Define el valor de la propiedad numSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSiniestro(String value) {
        this.numSiniestro = value;
    }

}
