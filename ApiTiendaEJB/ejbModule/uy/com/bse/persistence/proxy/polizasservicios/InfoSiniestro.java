
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para infoSiniestro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="infoSiniestro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codHechoGen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codTipoReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripBien" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoSiniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoCosto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoReserva" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numAsegurado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numTercero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoSiniestro", propOrder = {
    "codCobertura",
    "codHechoGen",
    "codRamo",
    "codTipoReserva",
    "descripBien",
    "descripEstado",
    "descripMoneda",
    "estadoSiniestro",
    "montoCosto",
    "montoReserva",
    "numAsegurado",
    "numTercero"
})
public class InfoSiniestro {

    protected String codCobertura;
    protected Integer codHechoGen;
    protected Integer codRamo;
    protected String codTipoReserva;
    protected String descripBien;
    protected String descripEstado;
    protected String descripMoneda;
    protected String estadoSiniestro;
    protected Double montoCosto;
    protected Double montoReserva;
    protected Integer numAsegurado;
    protected Integer numTercero;

    /**
     * Obtiene el valor de la propiedad codCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCobertura() {
        return codCobertura;
    }

    /**
     * Define el valor de la propiedad codCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCobertura(String value) {
        this.codCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad codHechoGen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodHechoGen() {
        return codHechoGen;
    }

    /**
     * Define el valor de la propiedad codHechoGen.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodHechoGen(Integer value) {
        this.codHechoGen = value;
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
     * Obtiene el valor de la propiedad codTipoReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoReserva() {
        return codTipoReserva;
    }

    /**
     * Define el valor de la propiedad codTipoReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoReserva(String value) {
        this.codTipoReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad descripBien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripBien() {
        return descripBien;
    }

    /**
     * Define el valor de la propiedad descripBien.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripBien(String value) {
        this.descripBien = value;
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
     * Obtiene el valor de la propiedad estadoSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoSiniestro() {
        return estadoSiniestro;
    }

    /**
     * Define el valor de la propiedad estadoSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoSiniestro(String value) {
        this.estadoSiniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad montoCosto.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoCosto() {
        return montoCosto;
    }

    /**
     * Define el valor de la propiedad montoCosto.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoCosto(Double value) {
        this.montoCosto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoReserva.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoReserva() {
        return montoReserva;
    }

    /**
     * Define el valor de la propiedad montoReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoReserva(Double value) {
        this.montoReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad numAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumAsegurado() {
        return numAsegurado;
    }

    /**
     * Define el valor de la propiedad numAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumAsegurado(Integer value) {
        this.numAsegurado = value;
    }

    /**
     * Obtiene el valor de la propiedad numTercero.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumTercero() {
        return numTercero;
    }

    /**
     * Define el valor de la propiedad numTercero.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumTercero(Integer value) {
        this.numTercero = value;
    }

}
