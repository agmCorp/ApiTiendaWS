
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codEstadoNota" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codSubTipoNota" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descSubTipoNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripEstadoNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numComprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numNota" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parametrosNotas" type="{http://ws.polizas.bse.com.uy/}parametroNotaPoliza" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nota", propOrder = {
    "codEstadoNota",
    "codSubTipoNota",
    "descSubTipoNota",
    "descripEstadoNota",
    "descripNota",
    "descripSector",
    "enlace",
    "fechaActualizacion",
    "numComprobante",
    "numNota",
    "observacion",
    "parametrosNotas",
    "tipoNota",
    "usuario"
})
public class Nota {

    protected Integer codEstadoNota;
    protected Integer codSubTipoNota;
    protected String descSubTipoNota;
    protected String descripEstadoNota;
    protected String descripNota;
    protected String descripSector;
    protected String enlace;
    protected String fechaActualizacion;
    protected String numComprobante;
    protected Integer numNota;
    protected String observacion;
    @XmlElement(nillable = true)
    protected List<ParametroNotaPoliza> parametrosNotas;
    protected String tipoNota;
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad codEstadoNota.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodEstadoNota() {
        return codEstadoNota;
    }

    /**
     * Define el valor de la propiedad codEstadoNota.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodEstadoNota(Integer value) {
        this.codEstadoNota = value;
    }

    /**
     * Obtiene el valor de la propiedad codSubTipoNota.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodSubTipoNota() {
        return codSubTipoNota;
    }

    /**
     * Define el valor de la propiedad codSubTipoNota.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodSubTipoNota(Integer value) {
        this.codSubTipoNota = value;
    }

    /**
     * Obtiene el valor de la propiedad descSubTipoNota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSubTipoNota() {
        return descSubTipoNota;
    }

    /**
     * Define el valor de la propiedad descSubTipoNota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSubTipoNota(String value) {
        this.descSubTipoNota = value;
    }

    /**
     * Obtiene el valor de la propiedad descripEstadoNota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripEstadoNota() {
        return descripEstadoNota;
    }

    /**
     * Define el valor de la propiedad descripEstadoNota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripEstadoNota(String value) {
        this.descripEstadoNota = value;
    }

    /**
     * Obtiene el valor de la propiedad descripNota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripNota() {
        return descripNota;
    }

    /**
     * Define el valor de la propiedad descripNota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripNota(String value) {
        this.descripNota = value;
    }

    /**
     * Obtiene el valor de la propiedad descripSector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripSector() {
        return descripSector;
    }

    /**
     * Define el valor de la propiedad descripSector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripSector(String value) {
        this.descripSector = value;
    }

    /**
     * Obtiene el valor de la propiedad enlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Define el valor de la propiedad enlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnlace(String value) {
        this.enlace = value;
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
     * Obtiene el valor de la propiedad numComprobante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumComprobante() {
        return numComprobante;
    }

    /**
     * Define el valor de la propiedad numComprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumComprobante(String value) {
        this.numComprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad numNota.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumNota() {
        return numNota;
    }

    /**
     * Define el valor de la propiedad numNota.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumNota(Integer value) {
        this.numNota = value;
    }

    /**
     * Obtiene el valor de la propiedad observacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Define el valor de la propiedad observacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Gets the value of the parametrosNotas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametrosNotas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametrosNotas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroNotaPoliza }
     * 
     * 
     */
    public List<ParametroNotaPoliza> getParametrosNotas() {
        if (parametrosNotas == null) {
            parametrosNotas = new ArrayList<ParametroNotaPoliza>();
        }
        return this.parametrosNotas;
    }

    /**
     * Obtiene el valor de la propiedad tipoNota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoNota() {
        return tipoNota;
    }

    /**
     * Define el valor de la propiedad tipoNota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoNota(String value) {
        this.tipoNota = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
