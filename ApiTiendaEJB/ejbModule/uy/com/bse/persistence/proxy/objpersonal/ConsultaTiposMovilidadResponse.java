
package uy.com.bse.persistence.proxy.objpersonal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaTiposMovilidadResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaTiposMovilidadResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://opersonal.ws.servicios.bse.com/}tiposMovilidadTiendaResp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaTiposMovilidadResponse", propOrder = {
    "_return"
})
public class ConsultaTiposMovilidadResponse {

    @XmlElement(name = "return")
    protected TiposMovilidadTiendaResp _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link TiposMovilidadTiendaResp }
     *     
     */
    public TiposMovilidadTiendaResp getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link TiposMovilidadTiendaResp }
     *     
     */
    public void setReturn(TiposMovilidadTiendaResp value) {
        this._return = value;
    }

}
