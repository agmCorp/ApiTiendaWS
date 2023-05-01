
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para direccionEC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="direccionEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aclaraciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ampliacionDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codDepto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codDireccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codLocalidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codPais" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripDepto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripLocalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripRadio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoDirecion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinoDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPostal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numRadio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroPuerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="padron" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="piso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoDireccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "direccionEC", propOrder = {
    "aclaraciones",
    "ampliacionDireccion",
    "apto",
    "codDepto",
    "codDireccion",
    "codLocalidad",
    "codPais",
    "descripDepto",
    "descripLocalidad",
    "descripPais",
    "descripRadio",
    "descripTipoDirecion",
    "destinoDireccion",
    "direccion",
    "numPostal",
    "numRadio",
    "numeroPuerta",
    "padron",
    "piso",
    "tipoDireccion",
    "unidad"
})
public class DireccionEC {

    protected String aclaraciones;
    protected String ampliacionDireccion;
    protected String apto;
    protected Integer codDepto;
    protected Integer codDireccion;
    protected Integer codLocalidad;
    protected Integer codPais;
    protected String descripDepto;
    protected String descripLocalidad;
    protected String descripPais;
    protected String descripRadio;
    protected String descripTipoDirecion;
    protected String destinoDireccion;
    protected String direccion;
    protected Integer numPostal;
    protected Integer numRadio;
    protected String numeroPuerta;
    protected String padron;
    protected String piso;
    protected Integer tipoDireccion;
    protected String unidad;

    /**
     * Obtiene el valor de la propiedad aclaraciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAclaraciones() {
        return aclaraciones;
    }

    /**
     * Define el valor de la propiedad aclaraciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAclaraciones(String value) {
        this.aclaraciones = value;
    }

    /**
     * Obtiene el valor de la propiedad ampliacionDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmpliacionDireccion() {
        return ampliacionDireccion;
    }

    /**
     * Define el valor de la propiedad ampliacionDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmpliacionDireccion(String value) {
        this.ampliacionDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad apto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApto() {
        return apto;
    }

    /**
     * Define el valor de la propiedad apto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApto(String value) {
        this.apto = value;
    }

    /**
     * Obtiene el valor de la propiedad codDepto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDepto() {
        return codDepto;
    }

    /**
     * Define el valor de la propiedad codDepto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDepto(Integer value) {
        this.codDepto = value;
    }

    /**
     * Obtiene el valor de la propiedad codDireccion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDireccion() {
        return codDireccion;
    }

    /**
     * Define el valor de la propiedad codDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDireccion(Integer value) {
        this.codDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodLocalidad() {
        return codLocalidad;
    }

    /**
     * Define el valor de la propiedad codLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodLocalidad(Integer value) {
        this.codLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codPais.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodPais() {
        return codPais;
    }

    /**
     * Define el valor de la propiedad codPais.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodPais(Integer value) {
        this.codPais = value;
    }

    /**
     * Obtiene el valor de la propiedad descripDepto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripDepto() {
        return descripDepto;
    }

    /**
     * Define el valor de la propiedad descripDepto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripDepto(String value) {
        this.descripDepto = value;
    }

    /**
     * Obtiene el valor de la propiedad descripLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripLocalidad() {
        return descripLocalidad;
    }

    /**
     * Define el valor de la propiedad descripLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripLocalidad(String value) {
        this.descripLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripPais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripPais() {
        return descripPais;
    }

    /**
     * Define el valor de la propiedad descripPais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripPais(String value) {
        this.descripPais = value;
    }

    /**
     * Obtiene el valor de la propiedad descripRadio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripRadio() {
        return descripRadio;
    }

    /**
     * Define el valor de la propiedad descripRadio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripRadio(String value) {
        this.descripRadio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTipoDirecion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTipoDirecion() {
        return descripTipoDirecion;
    }

    /**
     * Define el valor de la propiedad descripTipoDirecion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTipoDirecion(String value) {
        this.descripTipoDirecion = value;
    }

    /**
     * Obtiene el valor de la propiedad destinoDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoDireccion() {
        return destinoDireccion;
    }

    /**
     * Define el valor de la propiedad destinoDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoDireccion(String value) {
        this.destinoDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numPostal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPostal() {
        return numPostal;
    }

    /**
     * Define el valor de la propiedad numPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPostal(Integer value) {
        this.numPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad numRadio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRadio() {
        return numRadio;
    }

    /**
     * Define el valor de la propiedad numRadio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRadio(Integer value) {
        this.numRadio = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPuerta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPuerta() {
        return numeroPuerta;
    }

    /**
     * Define el valor de la propiedad numeroPuerta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPuerta(String value) {
        this.numeroPuerta = value;
    }

    /**
     * Obtiene el valor de la propiedad padron.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadron() {
        return padron;
    }

    /**
     * Define el valor de la propiedad padron.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadron(String value) {
        this.padron = value;
    }

    /**
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiso() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiso(String value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDireccion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoDireccion() {
        return tipoDireccion;
    }

    /**
     * Define el valor de la propiedad tipoDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoDireccion(Integer value) {
        this.tipoDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

}
