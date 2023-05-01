
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramActualizarDatosParticulares complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramActualizarDatosParticulares">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codBien" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codDato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramActualizarDatosParticulares", propOrder = {
    "codBien",
    "codDato",
    "codValor",
    "numCertificado",
    "numEndoso",
    "numPoliza",
    "numRamo"
})
public class ParamActualizarDatosParticulares
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String codBien;
    @XmlElement(required = true, nillable = true)
    protected String codDato;
    protected String codValor;
    @XmlElement(required = true, nillable = true)
    protected String numCertificado;
    @XmlElement(required = true, nillable = true)
    protected String numEndoso;
    protected String numPoliza;
    @XmlElement(required = true, nillable = true)
    protected String numRamo;

    /**
     * Obtiene el valor de la propiedad codBien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBien() {
        return codBien;
    }

    /**
     * Define el valor de la propiedad codBien.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBien(String value) {
        this.codBien = value;
    }

    /**
     * Obtiene el valor de la propiedad codDato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDato() {
        return codDato;
    }

    /**
     * Define el valor de la propiedad codDato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDato(String value) {
        this.codDato = value;
    }

    /**
     * Obtiene el valor de la propiedad codValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodValor() {
        return codValor;
    }

    /**
     * Define el valor de la propiedad codValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodValor(String value) {
        this.codValor = value;
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
     * Obtiene el valor de la propiedad numRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRamo() {
        return numRamo;
    }

    /**
     * Define el valor de la propiedad numRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRamo(String value) {
        this.numRamo = value;
    }

}
