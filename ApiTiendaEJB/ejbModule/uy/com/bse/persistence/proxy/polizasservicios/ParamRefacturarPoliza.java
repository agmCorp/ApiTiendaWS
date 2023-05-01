
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramRefacturarPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramRefacturarPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listaDatosParametricos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soloCotiza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramRefacturarPoliza", propOrder = {
    "codRamo",
    "listaDatosParametricos",
    "numPoliza",
    "soloCotiza"
})
public class ParamRefacturarPoliza
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String codRamo;
    protected String listaDatosParametricos;
    @XmlElement(required = true, nillable = true)
    protected String numPoliza;
    protected String soloCotiza;

    /**
     * Obtiene el valor de la propiedad codRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRamo() {
        return codRamo;
    }

    /**
     * Define el valor de la propiedad codRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRamo(String value) {
        this.codRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad listaDatosParametricos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaDatosParametricos() {
        return listaDatosParametricos;
    }

    /**
     * Define el valor de la propiedad listaDatosParametricos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaDatosParametricos(String value) {
        this.listaDatosParametricos = value;
    }

    /**
     * Obtiene el valor de la propiedad numPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPoliza() {
        return numPoliza;
    }

    /**
     * Define el valor de la propiedad numPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPoliza(String value) {
        this.numPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad soloCotiza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoloCotiza() {
        return soloCotiza;
    }

    /**
     * Define el valor de la propiedad soloCotiza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoloCotiza(String value) {
        this.soloCotiza = value;
    }

}
