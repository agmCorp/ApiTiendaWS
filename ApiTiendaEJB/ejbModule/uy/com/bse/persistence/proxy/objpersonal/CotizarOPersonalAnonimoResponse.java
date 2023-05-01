
package uy.com.bse.persistence.proxy.objpersonal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cotizarOPersonalAnonimoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cotizarOPersonalAnonimoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://opersonal.ws.servicios.bse.com/}cotizacionOPersonalTiendaResp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotizarOPersonalAnonimoResponse", propOrder = {
    "_return"
})
public class CotizarOPersonalAnonimoResponse {

    @XmlElement(name = "return")
    protected CotizacionOPersonalTiendaResp _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link CotizacionOPersonalTiendaResp }
     *     
     */
    public CotizacionOPersonalTiendaResp getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizacionOPersonalTiendaResp }
     *     
     */
    public void setReturn(CotizacionOPersonalTiendaResp value) {
        this._return = value;
    }

}
