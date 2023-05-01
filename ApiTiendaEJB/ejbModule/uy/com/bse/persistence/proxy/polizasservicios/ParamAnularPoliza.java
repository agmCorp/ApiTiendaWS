
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramAnularPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramAnularPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="aclaracion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codMotivoAbandono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCotizacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "paramAnularPoliza", propOrder = {
    "aclaracion",
    "codMotivoAbandono",
    "codRamo",
    "numCertificado",
    "numCotizacion",
    "numPoliza"
})
public class ParamAnularPoliza
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String aclaracion;
    @XmlElement(required = true, nillable = true)
    protected String codMotivoAbandono;
    @XmlElement(required = true, nillable = true)
    protected String codRamo;
    @XmlElement(required = true, nillable = true)
    protected String numCertificado;
    @XmlElement(required = true, nillable = true)
    protected String numCotizacion;
    @XmlElement(required = true, nillable = true)
    protected String numPoliza;

    /**
     * Obtiene el valor de la propiedad aclaracion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAclaracion() {
        return aclaracion;
    }

    /**
     * Define el valor de la propiedad aclaracion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAclaracion(String value) {
        this.aclaracion = value;
    }

    /**
     * Obtiene el valor de la propiedad codMotivoAbandono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMotivoAbandono() {
        return codMotivoAbandono;
    }

    /**
     * Define el valor de la propiedad codMotivoAbandono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMotivoAbandono(String value) {
        this.codMotivoAbandono = value;
    }

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
     * Obtiene el valor de la propiedad numCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * Define el valor de la propiedad numCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCotizacion(String value) {
        this.numCotizacion = value;
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
