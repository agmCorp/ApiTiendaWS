
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultCalcularRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultCalcularRec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="detalleRecuotificacion" type="{http://ws.polizas.bse.com.uy/}detalleRecuotificacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCalcularRec", propOrder = {
    "detalleRecuotificacion"
})
public class ResultCalcularRec
    extends ResultGenerico
{

    protected DetalleRecuotificacion detalleRecuotificacion;

    /**
     * Obtiene el valor de la propiedad detalleRecuotificacion.
     * 
     * @return
     *     possible object is
     *     {@link DetalleRecuotificacion }
     *     
     */
    public DetalleRecuotificacion getDetalleRecuotificacion() {
        return detalleRecuotificacion;
    }

    /**
     * Define el valor de la propiedad detalleRecuotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DetalleRecuotificacion }
     *     
     */
    public void setDetalleRecuotificacion(DetalleRecuotificacion value) {
        this.detalleRecuotificacion = value;
    }

}
