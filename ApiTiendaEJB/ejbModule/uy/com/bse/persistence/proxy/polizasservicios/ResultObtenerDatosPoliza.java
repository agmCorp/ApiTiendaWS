
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDatosPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDatosPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosPoliza" type="{http://ws.polizas.bse.com.uy/}datosBasicosPoliza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerDatosPoliza", propOrder = {
    "datosPoliza"
})
public class ResultObtenerDatosPoliza
    extends ResultGenerico
{

    protected DatosBasicosPoliza datosPoliza;

    /**
     * Obtiene el valor de la propiedad datosPoliza.
     * 
     * @return
     *     possible object is
     *     {@link DatosBasicosPoliza }
     *     
     */
    public DatosBasicosPoliza getDatosPoliza() {
        return datosPoliza;
    }

    /**
     * Define el valor de la propiedad datosPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosBasicosPoliza }
     *     
     */
    public void setDatosPoliza(DatosBasicosPoliza value) {
        this.datosPoliza = value;
    }

}
