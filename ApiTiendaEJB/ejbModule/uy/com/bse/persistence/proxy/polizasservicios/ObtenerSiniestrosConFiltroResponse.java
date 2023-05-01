
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerSiniestrosConFiltroResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerSiniestrosConFiltroResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.polizas.bse.com.uy/}resultObtenerSiniestrosConFiltro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerSiniestrosConFiltroResponse", propOrder = {
    "_return"
})
public class ObtenerSiniestrosConFiltroResponse {

    @XmlElement(name = "return")
    protected ResultObtenerSiniestrosConFiltro _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerSiniestrosConFiltro }
     *     
     */
    public ResultObtenerSiniestrosConFiltro getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerSiniestrosConFiltro }
     *     
     */
    public void setReturn(ResultObtenerSiniestrosConFiltro value) {
        this._return = value;
    }

}
