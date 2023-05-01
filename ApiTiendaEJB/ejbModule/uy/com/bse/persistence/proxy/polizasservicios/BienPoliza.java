
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bienPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bienPoliza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codBien" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripBien" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaCesionario" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaDatosParametrico" type="{http://ws.polizas.bse.com.uy/}datoParametricoPoliza" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bienPoliza", propOrder = {
    "codBien",
    "descripBien",
    "listaCesionario",
    "listaDatosParametrico"
})
public class BienPoliza {

    protected Integer codBien;
    protected String descripBien;
    @XmlElement(nillable = true)
    protected List<String> listaCesionario;
    @XmlElement(nillable = true)
    protected List<DatoParametricoPoliza> listaDatosParametrico;

    /**
     * Obtiene el valor de la propiedad codBien.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodBien() {
        return codBien;
    }

    /**
     * Define el valor de la propiedad codBien.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodBien(Integer value) {
        this.codBien = value;
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
     * Gets the value of the listaCesionario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCesionario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCesionario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaCesionario() {
        if (listaCesionario == null) {
            listaCesionario = new ArrayList<String>();
        }
        return this.listaCesionario;
    }

    /**
     * Gets the value of the listaDatosParametrico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaDatosParametrico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaDatosParametrico().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatoParametricoPoliza }
     * 
     * 
     */
    public List<DatoParametricoPoliza> getListaDatosParametrico() {
        if (listaDatosParametrico == null) {
            listaDatosParametrico = new ArrayList<DatoParametricoPoliza>();
        }
        return this.listaDatosParametrico;
    }

}
