
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramValidarPolizaRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramValidarPolizaRec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramValidarPolizaRec", propOrder = {
    "codRamo",
    "numCertificado",
    "numPoliza"
})
public class ParamValidarPolizaRec
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String codRamo;
    protected String numCertificado;
    @XmlElement(required = true, nillable = true)
    protected String numPoliza;

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
     * Obtiene el valor de la propiedad numCertificado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCertificado() {
        return numCertificado;
    }

    /**
     * Define el valor de la propiedad numCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCertificado(String value) {
        this.numCertificado = value;
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

}
