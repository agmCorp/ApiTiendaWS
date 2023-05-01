
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerMaximoEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerMaximoEndoso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="maximoEndoso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerMaximoEndoso", propOrder = {
    "maximoEndoso"
})
public class ResultObtenerMaximoEndoso
    extends ResultGenerico
{

    protected Integer maximoEndoso;

    /**
     * Obtiene el valor de la propiedad maximoEndoso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximoEndoso() {
        return maximoEndoso;
    }

    /**
     * Define el valor de la propiedad maximoEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximoEndoso(Integer value) {
        this.maximoEndoso = value;
    }

}
