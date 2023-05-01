
package uy.com.bse.persistence.proxy.mibse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosFacturacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosFacturacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datosADT" type="{http://ws.mibse.bse.com.uy/}datosPolizaADT" minOccurs="0"/>
 *         &lt;element name="descProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descRamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esFactElectronica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fechaEndosoMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculas" type="{http://ws.mibse.bse.com.uy/}datosMatricula" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nroPoliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosFacturacion", propOrder = {
    "codProducto",
    "codRamo",
    "datosADT",
    "descProducto",
    "descRamo",
    "esFactElectronica",
    "fechaEndosoMail",
    "matriculas",
    "nroPoliza",
    "numCliente"
})
public class DatosFacturacion {

    protected String codProducto;
    protected Integer codRamo;
    protected DatosPolizaADT datosADT;
    protected String descProducto;
    protected String descRamo;
    protected Boolean esFactElectronica;
    protected String fechaEndosoMail;
    @XmlElement(nillable = true)
    protected List<DatosMatricula> matriculas;
    protected Integer nroPoliza;
    protected Integer numCliente;

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
     * Obtiene el valor de la propiedad datosADT.
     * 
     * @return
     *     possible object is
     *     {@link DatosPolizaADT }
     *     
     */
    public DatosPolizaADT getDatosADT() {
        return datosADT;
    }

    /**
     * Define el valor de la propiedad datosADT.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPolizaADT }
     *     
     */
    public void setDatosADT(DatosPolizaADT value) {
        this.datosADT = value;
    }

    /**
     * Obtiene el valor de la propiedad descProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescProducto() {
        return descProducto;
    }

    /**
     * Define el valor de la propiedad descProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescProducto(String value) {
        this.descProducto = value;
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
     * Obtiene el valor de la propiedad esFactElectronica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsFactElectronica() {
        return esFactElectronica;
    }

    /**
     * Define el valor de la propiedad esFactElectronica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsFactElectronica(Boolean value) {
        this.esFactElectronica = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEndosoMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEndosoMail() {
        return fechaEndosoMail;
    }

    /**
     * Define el valor de la propiedad fechaEndosoMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEndosoMail(String value) {
        this.fechaEndosoMail = value;
    }

    /**
     * Gets the value of the matriculas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matriculas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatriculas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosMatricula }
     * 
     * 
     */
    public List<DatosMatricula> getMatriculas() {
        if (matriculas == null) {
            matriculas = new ArrayList<DatosMatricula>();
        }
        return this.matriculas;
    }

    /**
     * Obtiene el valor de la propiedad nroPoliza.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroPoliza() {
        return nroPoliza;
    }

    /**
     * Define el valor de la propiedad nroPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroPoliza(Integer value) {
        this.nroPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad numCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCliente() {
        return numCliente;
    }

    /**
     * Define el valor de la propiedad numCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCliente(Integer value) {
        this.numCliente = value;
    }

}
