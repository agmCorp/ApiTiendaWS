
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para encabezadoPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="encabezadoPoliza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clausula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripRamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "encabezadoPoliza", propOrder = {
    "clausula",
    "codRamo",
    "codSucursal",
    "descripRamo",
    "descripSucursal",
    "numPoliza"
})
@XmlSeeAlso({
    DatosBasicosPoliza.class
})
public class EncabezadoPoliza {

    protected String clausula;
    protected Integer codRamo;
    protected Integer codSucursal;
    protected String descripRamo;
    protected String descripSucursal;
    protected Integer numPoliza;

    /**
     * Obtiene el valor de la propiedad clausula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClausula() {
        return clausula;
    }

    /**
     * Define el valor de la propiedad clausula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClausula(String value) {
        this.clausula = value;
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
     * Obtiene el valor de la propiedad codSucursal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodSucursal() {
        return codSucursal;
    }

    /**
     * Define el valor de la propiedad codSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodSucursal(Integer value) {
        this.codSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad descripRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripRamo() {
        return descripRamo;
    }

    /**
     * Define el valor de la propiedad descripRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripRamo(String value) {
        this.descripRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripSucursal() {
        return descripSucursal;
    }

    /**
     * Define el valor de la propiedad descripSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripSucursal(String value) {
        this.descripSucursal = value;
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
