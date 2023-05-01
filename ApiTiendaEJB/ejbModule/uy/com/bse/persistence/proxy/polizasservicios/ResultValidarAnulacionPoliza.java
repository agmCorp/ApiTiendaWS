
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultValidarAnulacionPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultValidarAnulacionPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="cotizacionAnulacion" type="{http://ws.polizas.bse.com.uy/}cotizacionAnulacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultValidarAnulacionPoliza", propOrder = {
    "cotizacionAnulacion"
})
public class ResultValidarAnulacionPoliza
    extends ResultGenerico
{

    protected CotizacionAnulacion cotizacionAnulacion;

    /**
     * Obtiene el valor de la propiedad cotizacionAnulacion.
     * 
     * @return
     *     possible object is
     *     {@link CotizacionAnulacion }
     *     
     */
    public CotizacionAnulacion getCotizacionAnulacion() {
        return cotizacionAnulacion;
    }

    /**
     * Define el valor de la propiedad cotizacionAnulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizacionAnulacion }
     *     
     */
    public void setCotizacionAnulacion(CotizacionAnulacion value) {
        this.cotizacionAnulacion = value;
    }

}
