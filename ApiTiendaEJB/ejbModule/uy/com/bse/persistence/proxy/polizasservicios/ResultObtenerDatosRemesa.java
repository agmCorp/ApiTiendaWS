
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDatosRemesa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDatosRemesa">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosRemesa" type="{http://ws.polizas.bse.com.uy/}remesa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerDatosRemesa", propOrder = {
    "datosRemesa"
})
public class ResultObtenerDatosRemesa
    extends ResultGenerico
{

    protected Remesa datosRemesa;

    /**
     * Obtiene el valor de la propiedad datosRemesa.
     * 
     * @return
     *     possible object is
     *     {@link Remesa }
     *     
     */
    public Remesa getDatosRemesa() {
        return datosRemesa;
    }

    /**
     * Define el valor de la propiedad datosRemesa.
     * 
     * @param value
     *     allowed object is
     *     {@link Remesa }
     *     
     */
    public void setDatosRemesa(Remesa value) {
        this.datosRemesa = value;
    }

}
