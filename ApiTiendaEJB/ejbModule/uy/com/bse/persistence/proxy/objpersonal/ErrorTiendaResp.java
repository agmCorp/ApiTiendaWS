
package uy.com.bse.persistence.proxy.objpersonal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para errorTiendaResp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="errorTiendaResp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorTiendaResp", propOrder = {
    "errorCodigo",
    "errorDescripcion"
})
@XmlSeeAlso({
    TiposMovilidadTiendaResp.class,
    CotizacionOPersonalTiendaResp.class,
    PlanesCoberturaTiendaResp.class,
    EmisionOPersonalTiendaResp.class,
    TiposObjetosTiendaResp.class,
    ClienteDeudaTiendaResp.class
})
public class ErrorTiendaResp {

    protected String errorCodigo;
    protected String errorDescripcion;

    /**
     * Obtiene el valor de la propiedad errorCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCodigo() {
        return errorCodigo;
    }

    /**
     * Define el valor de la propiedad errorCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCodigo(String value) {
        this.errorCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad errorDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDescripcion() {
        return errorDescripcion;
    }

    /**
     * Define el valor de la propiedad errorDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDescripcion(String value) {
        this.errorDescripcion = value;
    }

}
