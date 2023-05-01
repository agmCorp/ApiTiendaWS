
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDebitosAutomaticosPolizaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDebitosAutomaticosPolizaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.polizas.bse.com.uy/}resultObtenerDebitosAutomaticosPoliza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDebitosAutomaticosPolizaResponse", propOrder = {
    "_return"
})
public class ObtenerDebitosAutomaticosPolizaResponse {

    @XmlElement(name = "return")
    protected ResultObtenerDebitosAutomaticosPoliza _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerDebitosAutomaticosPoliza }
     *     
     */
    public ResultObtenerDebitosAutomaticosPoliza getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerDebitosAutomaticosPoliza }
     *     
     */
    public void setReturn(ResultObtenerDebitosAutomaticosPoliza value) {
        this._return = value;
    }

}
