
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consolidado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consolidado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imputaciones" type="{http://ws.polizas.bse.com.uy/}imputacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="montoComisiones" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoSaldo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoTotalImputaciones" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoTotalRecibos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="nombreCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recibos" type="{http://ws.polizas.bse.com.uy/}recibo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consolidado", propOrder = {
    "codMoneda",
    "codRamo",
    "descripMoneda",
    "imputaciones",
    "montoComisiones",
    "montoSaldo",
    "montoTotalImputaciones",
    "montoTotalRecibos",
    "nombreCliente",
    "numCertificado",
    "numPoliza",
    "recibos"
})
public class Consolidado {

    protected Integer codMoneda;
    protected Integer codRamo;
    protected String descripMoneda;
    @XmlElement(nillable = true)
    protected List<Imputacion> imputaciones;
    protected Double montoComisiones;
    protected Double montoSaldo;
    protected Double montoTotalImputaciones;
    protected Double montoTotalRecibos;
    protected String nombreCliente;
    protected Integer numCertificado;
    protected Integer numPoliza;
    @XmlElement(nillable = true)
    protected List<Recibo> recibos;

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
     * Gets the value of the imputaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imputaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImputaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Imputacion }
     * 
     * 
     */
    public List<Imputacion> getImputaciones() {
        if (imputaciones == null) {
            imputaciones = new ArrayList<Imputacion>();
        }
        return this.imputaciones;
    }

    /**
     * Obtiene el valor de la propiedad montoComisiones.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoComisiones() {
        return montoComisiones;
    }

    /**
     * Define el valor de la propiedad montoComisiones.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoComisiones(Double value) {
        this.montoComisiones = value;
    }

    /**
     * Obtiene el valor de la propiedad montoSaldo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoSaldo() {
        return montoSaldo;
    }

    /**
     * Define el valor de la propiedad montoSaldo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoSaldo(Double value) {
        this.montoSaldo = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalImputaciones.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoTotalImputaciones() {
        return montoTotalImputaciones;
    }

    /**
     * Define el valor de la propiedad montoTotalImputaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoTotalImputaciones(Double value) {
        this.montoTotalImputaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTotalRecibos.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoTotalRecibos() {
        return montoTotalRecibos;
    }

    /**
     * Define el valor de la propiedad montoTotalRecibos.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoTotalRecibos(Double value) {
        this.montoTotalRecibos = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Define el valor de la propiedad nombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCliente(String value) {
        this.nombreCliente = value;
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

    /**
     * Gets the value of the recibos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recibos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecibos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recibo }
     * 
     * 
     */
    public List<Recibo> getRecibos() {
        if (recibos == null) {
            recibos = new ArrayList<Recibo>();
        }
        return this.recibos;
    }

}
