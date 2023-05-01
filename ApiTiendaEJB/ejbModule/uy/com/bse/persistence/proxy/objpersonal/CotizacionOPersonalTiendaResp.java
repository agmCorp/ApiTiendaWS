
package uy.com.bse.persistence.proxy.objpersonal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cotizacionOPersonalTiendaResp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cotizacionOPersonalTiendaResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://opersonal.ws.servicios.bse.com/}errorTiendaResp">
 *       &lt;sequence>
 *         &lt;element name="cotizacion" type="{http://opersonal.ws.servicios.bse.com/}cotizacionOPersonalTienda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotizacionOPersonalTiendaResp", propOrder = {
    "cotizacion"
})
public class CotizacionOPersonalTiendaResp
    extends ErrorTiendaResp
{

    protected CotizacionOPersonalTienda cotizacion;

    /**
     * Obtiene el valor de la propiedad cotizacion.
     * 
     * @return
     *     possible object is
     *     {@link CotizacionOPersonalTienda }
     *     
     */
    public CotizacionOPersonalTienda getCotizacion() {
        return cotizacion;
    }

    /**
     * Define el valor de la propiedad cotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizacionOPersonalTienda }
     *     
     */
    public void setCotizacion(CotizacionOPersonalTienda value) {
        this.cotizacion = value;
    }

}
