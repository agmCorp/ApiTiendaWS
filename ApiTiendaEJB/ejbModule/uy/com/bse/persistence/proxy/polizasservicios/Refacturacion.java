
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para refacturacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="refacturacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advertencia" type="{http://ws.polizas.bse.com.uy/}advertencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="advertencias" type="{http://ws.polizas.bse.com.uy/}advertencia" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codPlan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descRamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoEmitir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoModificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoRefacturar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroCotizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premioFact" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refacturacion", propOrder = {
    "advertencia",
    "advertencias",
    "codMoneda",
    "codPlan",
    "codProducto",
    "descMensaje",
    "descRamo",
    "habilitoEmitir",
    "habilitoFacturacion",
    "habilitoModificar",
    "habilitoRefacturar",
    "nroCotizacion",
    "premioFact"
})
public class Refacturacion {

    @XmlElement(nillable = true)
    protected List<Advertencia> advertencia;
    @XmlElement(nillable = true)
    protected List<Advertencia> advertencias;
    protected Integer codMoneda;
    protected Integer codPlan;
    protected String codProducto;
    protected String descMensaje;
    protected String descRamo;
    protected String habilitoEmitir;
    protected String habilitoFacturacion;
    protected String habilitoModificar;
    protected String habilitoRefacturar;
    protected String nroCotizacion;
    protected Double premioFact;

    /**
     * Gets the value of the advertencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advertencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvertencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Advertencia }
     * 
     * 
     */
    public List<Advertencia> getAdvertencia() {
        if (advertencia == null) {
            advertencia = new ArrayList<Advertencia>();
        }
        return this.advertencia;
    }

    /**
     * Gets the value of the advertencias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advertencias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvertencias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Advertencia }
     * 
     * 
     */
    public List<Advertencia> getAdvertencias() {
        if (advertencias == null) {
            advertencias = new ArrayList<Advertencia>();
        }
        return this.advertencias;
    }

    /**
     * Obtiene el valor de la propiedad codMoneda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMoneda() {
        return codMoneda;
    }

    /**
     * Define el valor de la propiedad codMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMoneda(Integer value) {
        this.codMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad codPlan.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodPlan() {
        return codPlan;
    }

    /**
     * Define el valor de la propiedad codPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodPlan(Integer value) {
        this.codPlan = value;
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
     * Obtiene el valor de la propiedad descMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMensaje() {
        return descMensaje;
    }

    /**
     * Define el valor de la propiedad descMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMensaje(String value) {
        this.descMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad descRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRamo() {
        return descRamo;
    }

    /**
     * Define el valor de la propiedad descRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRamo(String value) {
        this.descRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoEmitir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoEmitir() {
        return habilitoEmitir;
    }

    /**
     * Define el valor de la propiedad habilitoEmitir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoEmitir(String value) {
        this.habilitoEmitir = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoFacturacion() {
        return habilitoFacturacion;
    }

    /**
     * Define el valor de la propiedad habilitoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoFacturacion(String value) {
        this.habilitoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoModificar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoModificar() {
        return habilitoModificar;
    }

    /**
     * Define el valor de la propiedad habilitoModificar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoModificar(String value) {
        this.habilitoModificar = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoRefacturar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoRefacturar() {
        return habilitoRefacturar;
    }

    /**
     * Define el valor de la propiedad habilitoRefacturar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoRefacturar(String value) {
        this.habilitoRefacturar = value;
    }

    /**
     * Obtiene el valor de la propiedad nroCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroCotizacion() {
        return nroCotizacion;
    }

    /**
     * Define el valor de la propiedad nroCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroCotizacion(String value) {
        this.nroCotizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad premioFact.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPremioFact() {
        return premioFact;
    }

    /**
     * Define el valor de la propiedad premioFact.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPremioFact(Double value) {
        this.premioFact = value;
    }

}
