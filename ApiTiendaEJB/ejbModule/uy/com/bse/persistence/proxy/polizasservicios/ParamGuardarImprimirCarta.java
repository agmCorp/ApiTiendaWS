
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramGuardarImprimirCarta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramGuardarImprimirCarta">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codReporte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCarta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numReporte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramGuardarImprimirCarta", propOrder = {
    "codRamo",
    "codReporte",
    "numCarta",
    "numCertificado",
    "numEndoso",
    "numPoliza",
    "numReporte"
})
public class ParamGuardarImprimirCarta
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String codRamo;
    @XmlElement(required = true, nillable = true)
    protected String codReporte;
    @XmlElement(required = true, nillable = true)
    protected String numCarta;
    @XmlElement(required = true, nillable = true)
    protected String numCertificado;
    protected String numEndoso;
    @XmlElement(required = true, nillable = true)
    protected String numPoliza;
    @XmlElement(required = true, nillable = true)
    protected String numReporte;

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
     * Obtiene el valor de la propiedad codReporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodReporte() {
        return codReporte;
    }

    /**
     * Define el valor de la propiedad codReporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodReporte(String value) {
        this.codReporte = value;
    }

    /**
     * Obtiene el valor de la propiedad numCarta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCarta() {
        return numCarta;
    }

    /**
     * Define el valor de la propiedad numCarta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCarta(String value) {
        this.numCarta = value;
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
     * Obtiene el valor de la propiedad numEndoso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEndoso() {
        return numEndoso;
    }

    /**
     * Define el valor de la propiedad numEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumEndoso(String value) {
        this.numEndoso = value;
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
     * Obtiene el valor de la propiedad numReporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumReporte() {
        return numReporte;
    }

    /**
     * Define el valor de la propiedad numReporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumReporte(String value) {
        this.numReporte = value;
    }

}
