
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramEnviarFacturaDigitalEMail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramEnviarFacturaDigitalEMail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="comunicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consecutivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="enviarFacturaDigitalEMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramEnviarFacturaDigitalEMail", propOrder = {
    "codRamo",
    "comunicacion",
    "consecutivo",
    "enviarFacturaDigitalEMail",
    "numPoliza"
})
public class ParamEnviarFacturaDigitalEMail
    extends ParamGenerico
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer codRamo;
    protected String comunicacion;
    protected Integer consecutivo;
    @XmlElement(required = true, nillable = true)
    protected String enviarFacturaDigitalEMail;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numPoliza;

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
     * Obtiene el valor de la propiedad comunicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComunicacion() {
        return comunicacion;
    }

    /**
     * Define el valor de la propiedad comunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComunicacion(String value) {
        this.comunicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad consecutivo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsecutivo() {
        return consecutivo;
    }

    /**
     * Define el valor de la propiedad consecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsecutivo(Integer value) {
        this.consecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad enviarFacturaDigitalEMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnviarFacturaDigitalEMail() {
        return enviarFacturaDigitalEMail;
    }

    /**
     * Define el valor de la propiedad enviarFacturaDigitalEMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnviarFacturaDigitalEMail(String value) {
        this.enviarFacturaDigitalEMail = value;
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

}
