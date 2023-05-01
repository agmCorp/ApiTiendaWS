
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramGuardarImprimirReporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramGuardarImprimirReporte">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conPremio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imprimirCertificadosAnulados" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="items" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "paramGuardarImprimirReporte", propOrder = {
    "codRamo",
    "conPremio",
    "imprimirCertificadosAnulados",
    "items",
    "numEndoso",
    "numPoliza"
})
public class ParamGuardarImprimirReporte
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String codRamo;
    protected String conPremio;
    @XmlElement(required = true, nillable = true)
    protected String imprimirCertificadosAnulados;
    @XmlElement(required = true, nillable = true)
    protected String items;
    @XmlElement(required = true, nillable = true)
    protected String numEndoso;
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
     * Obtiene el valor de la propiedad conPremio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConPremio() {
        return conPremio;
    }

    /**
     * Define el valor de la propiedad conPremio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConPremio(String value) {
        this.conPremio = value;
    }

    /**
     * Obtiene el valor de la propiedad imprimirCertificadosAnulados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImprimirCertificadosAnulados() {
        return imprimirCertificadosAnulados;
    }

    /**
     * Define el valor de la propiedad imprimirCertificadosAnulados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImprimirCertificadosAnulados(String value) {
        this.imprimirCertificadosAnulados = value;
    }

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItems() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItems(String value) {
        this.items = value;
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

}
