
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beneficiario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codParentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionParentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esNuevo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaExclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaInclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indice" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nombreBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="porcentajeParticipacion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beneficiario", propOrder = {
    "codParentesco",
    "descripcionParentesco",
    "esNuevo",
    "fechaExclusion",
    "fechaInclusion",
    "fechaNacimiento",
    "indice",
    "nombreBeneficiario",
    "numDocumento",
    "observaciones",
    "porcentajeParticipacion",
    "tipoDocumento"
})
public class Beneficiario {

    protected String codParentesco;
    protected String descripcionParentesco;
    protected String esNuevo;
    protected String fechaExclusion;
    protected String fechaInclusion;
    protected String fechaNacimiento;
    protected Integer indice;
    protected String nombreBeneficiario;
    protected String numDocumento;
    protected String observaciones;
    protected Double porcentajeParticipacion;
    protected String tipoDocumento;

    /**
     * Obtiene el valor de la propiedad codParentesco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodParentesco() {
        return codParentesco;
    }

    /**
     * Define el valor de la propiedad codParentesco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodParentesco(String value) {
        this.codParentesco = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionParentesco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionParentesco() {
        return descripcionParentesco;
    }

    /**
     * Define el valor de la propiedad descripcionParentesco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionParentesco(String value) {
        this.descripcionParentesco = value;
    }

    /**
     * Obtiene el valor de la propiedad esNuevo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsNuevo() {
        return esNuevo;
    }

    /**
     * Define el valor de la propiedad esNuevo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsNuevo(String value) {
        this.esNuevo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExclusion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExclusion() {
        return fechaExclusion;
    }

    /**
     * Define el valor de la propiedad fechaExclusion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExclusion(String value) {
        this.fechaExclusion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInclusion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInclusion() {
        return fechaInclusion;
    }

    /**
     * Define el valor de la propiedad fechaInclusion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInclusion(String value) {
        this.fechaInclusion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad indice.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndice() {
        return indice;
    }

    /**
     * Define el valor de la propiedad indice.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndice(Integer value) {
        this.indice = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    /**
     * Define el valor de la propiedad nombreBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreBeneficiario(String value) {
        this.nombreBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad numDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDocumento() {
        return numDocumento;
    }

    /**
     * Define el valor de la propiedad numDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDocumento(String value) {
        this.numDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeParticipacion.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    /**
     * Define el valor de la propiedad porcentajeParticipacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPorcentajeParticipacion(Double value) {
        this.porcentajeParticipacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

}
