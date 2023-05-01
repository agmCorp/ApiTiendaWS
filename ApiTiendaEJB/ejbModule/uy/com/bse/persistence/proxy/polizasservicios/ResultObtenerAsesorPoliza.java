
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerAsesorPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerAsesorPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="asesor" type="{http://ws.polizas.bse.com.uy/}asesor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerAsesorPoliza", propOrder = {
    "asesor"
})
public class ResultObtenerAsesorPoliza
    extends ResultGenerico
{

    protected Asesor asesor;

    /**
     * Obtiene el valor de la propiedad asesor.
     * 
     * @return
     *     possible object is
     *     {@link Asesor }
     *     
     */
    public Asesor getAsesor() {
        return asesor;
    }

    /**
     * Define el valor de la propiedad asesor.
     * 
     * @param value
     *     allowed object is
     *     {@link Asesor }
     *     
     */
    public void setAsesor(Asesor value) {
        this.asesor = value;
    }

}
