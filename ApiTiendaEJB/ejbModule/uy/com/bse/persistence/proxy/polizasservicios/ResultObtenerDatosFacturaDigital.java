
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDatosFacturaDigital complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDatosFacturaDigital">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="codComunicacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="comValidada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comunicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consecutivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="envioFacturaEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerDatosFacturaDigital", propOrder = {
    "codComunicacion",
    "comValidada",
    "comunicacion",
    "consecutivo",
    "envioFacturaEMail"
})
public class ResultObtenerDatosFacturaDigital
    extends ResultGenerico
{

    protected Integer codComunicacion;
    protected String comValidada;
    protected String comunicacion;
    protected Integer consecutivo;
    protected String envioFacturaEMail;

    /**
     * Obtiene el valor de la propiedad codComunicacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodComunicacion() {
        return codComunicacion;
    }

    /**
     * Define el valor de la propiedad codComunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodComunicacion(Integer value) {
        this.codComunicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad comValidada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComValidada() {
        return comValidada;
    }

    /**
     * Define el valor de la propiedad comValidada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComValidada(String value) {
        this.comValidada = value;
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
     * Obtiene el valor de la propiedad envioFacturaEMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvioFacturaEMail() {
        return envioFacturaEMail;
    }

    /**
     * Define el valor de la propiedad envioFacturaEMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvioFacturaEMail(String value) {
        this.envioFacturaEMail = value;
    }

}
