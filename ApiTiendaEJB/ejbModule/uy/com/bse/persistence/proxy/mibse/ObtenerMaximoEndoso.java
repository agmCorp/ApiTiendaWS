
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerMaximoEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerMaximoEndoso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ws.mibse.bse.com.uy/}paramObtenerMaximoEndoso" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerMaximoEndoso", propOrder = {
    "arg0"
})
public class ObtenerMaximoEndoso {

    protected ParamObtenerMaximoEndoso arg0;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerMaximoEndoso }
     *     
     */
    public ParamObtenerMaximoEndoso getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerMaximoEndoso }
     *     
     */
    public void setArg0(ParamObtenerMaximoEndoso value) {
        this.arg0 = value;
    }

}
