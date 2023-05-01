
package uy.com.bse.persistence.proxy.objpersonal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para emisionOPersonalTiendaResp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="emisionOPersonalTiendaResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://opersonal.ws.servicios.bse.com/}errorTiendaResp">
 *       &lt;sequence>
 *         &lt;element name="poliza" type="{http://opersonal.ws.servicios.bse.com/}polizaOPersonalTienda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emisionOPersonalTiendaResp", propOrder = {
    "poliza"
})
public class EmisionOPersonalTiendaResp
    extends ErrorTiendaResp
{

    protected PolizaOPersonalTienda poliza;

    /**
     * Obtiene el valor de la propiedad poliza.
     * 
     * @return
     *     possible object is
     *     {@link PolizaOPersonalTienda }
     *     
     */
    public PolizaOPersonalTienda getPoliza() {
        return poliza;
    }

    /**
     * Define el valor de la propiedad poliza.
     * 
     * @param value
     *     allowed object is
     *     {@link PolizaOPersonalTienda }
     *     
     */
    public void setPoliza(PolizaOPersonalTienda value) {
        this.poliza = value;
    }

}
