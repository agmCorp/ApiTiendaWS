
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDatosSiniestro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDatosSiniestro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosSiniestro" type="{http://ws.polizas.bse.com.uy/}datosSiniestro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerDatosSiniestro", propOrder = {
    "datosSiniestro"
})
public class ResultObtenerDatosSiniestro
    extends ResultGenerico
{

    protected DatosSiniestro datosSiniestro;

    /**
     * Obtiene el valor de la propiedad datosSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link DatosSiniestro }
     *     
     */
    public DatosSiniestro getDatosSiniestro() {
        return datosSiniestro;
    }

    /**
     * Define el valor de la propiedad datosSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosSiniestro }
     *     
     */
    public void setDatosSiniestro(DatosSiniestro value) {
        this.datosSiniestro = value;
    }

}
