
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramDatosXDatosParametricosPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramDatosXDatosParametricosPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codDato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="valorDato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramDatosXDatosParametricosPoliza", propOrder = {
    "codDato",
    "codRamo",
    "numPoliza",
    "valorDato"
})
public class ParamDatosXDatosParametricosPoliza
    extends ParamGenerico
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer codDato;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer codRamo;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numPoliza;
    protected String valorDato;

    /**
     * Obtiene el valor de la propiedad codDato.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDato() {
        return codDato;
    }

    /**
     * Define el valor de la propiedad codDato.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDato(Integer value) {
        this.codDato = value;
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
     * Obtiene el valor de la propiedad valorDato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDato() {
        return valorDato;
    }

    /**
     * Define el valor de la propiedad valorDato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDato(String value) {
        this.valorDato = value;
    }

}
