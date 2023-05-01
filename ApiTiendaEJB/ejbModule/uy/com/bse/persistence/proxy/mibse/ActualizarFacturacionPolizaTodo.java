
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarFacturacionPolizaTodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarFacturacionPolizaTodo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ws.mibse.bse.com.uy/}paramActualizarFacturacionPolizaTodo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarFacturacionPolizaTodo", propOrder = {
    "arg0"
})
public class ActualizarFacturacionPolizaTodo {

    protected ParamActualizarFacturacionPolizaTodo arg0;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     * @return
     *     possible object is
     *     {@link ParamActualizarFacturacionPolizaTodo }
     *     
     */
    public ParamActualizarFacturacionPolizaTodo getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamActualizarFacturacionPolizaTodo }
     *     
     */
    public void setArg0(ParamActualizarFacturacionPolizaTodo value) {
        this.arg0 = value;
    }

}
