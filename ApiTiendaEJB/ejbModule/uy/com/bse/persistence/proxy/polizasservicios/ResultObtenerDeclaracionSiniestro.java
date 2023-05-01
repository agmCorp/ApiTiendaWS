
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDeclaracionSiniestro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDeclaracionSiniestro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="siniestro" type="{http://ws.polizas.bse.com.uy/}siniestro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerDeclaracionSiniestro", propOrder = {
    "siniestro"
})
public class ResultObtenerDeclaracionSiniestro
    extends ResultGenerico
{

    protected Siniestro siniestro;

    /**
     * Obtiene el valor de la propiedad siniestro.
     * 
     * @return
     *     possible object is
     *     {@link Siniestro }
     *     
     */
    public Siniestro getSiniestro() {
        return siniestro;
    }

    /**
     * Define el valor de la propiedad siniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link Siniestro }
     *     
     */
    public void setSiniestro(Siniestro value) {
        this.siniestro = value;
    }

}
