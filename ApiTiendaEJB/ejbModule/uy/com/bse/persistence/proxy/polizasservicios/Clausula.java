
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clausula complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clausula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codClausula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codClausulaPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripcionClausula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="impresion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clausula", propOrder = {
    "codClausula",
    "codClausulaPoliza",
    "codRamo",
    "descripcionClausula",
    "impresion",
    "modifica"
})
public class Clausula {

    protected String codClausula;
    protected String codClausulaPoliza;
    protected Integer codRamo;
    protected String descripcionClausula;
    protected String impresion;
    protected String modifica;

    /**
     * Obtiene el valor de la propiedad codClausula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodClausula() {
        return codClausula;
    }

    /**
     * Define el valor de la propiedad codClausula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodClausula(String value) {
        this.codClausula = value;
    }

    /**
     * Obtiene el valor de la propiedad codClausulaPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodClausulaPoliza() {
        return codClausulaPoliza;
    }

    /**
     * Define el valor de la propiedad codClausulaPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodClausulaPoliza(String value) {
        this.codClausulaPoliza = value;
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
     * Obtiene el valor de la propiedad descripcionClausula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionClausula() {
        return descripcionClausula;
    }

    /**
     * Define el valor de la propiedad descripcionClausula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionClausula(String value) {
        this.descripcionClausula = value;
    }

    /**
     * Obtiene el valor de la propiedad impresion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpresion() {
        return impresion;
    }

    /**
     * Define el valor de la propiedad impresion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpresion(String value) {
        this.impresion = value;
    }

    /**
     * Obtiene el valor de la propiedad modifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifica() {
        return modifica;
    }

    /**
     * Define el valor de la propiedad modifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifica(String value) {
        this.modifica = value;
    }

}
