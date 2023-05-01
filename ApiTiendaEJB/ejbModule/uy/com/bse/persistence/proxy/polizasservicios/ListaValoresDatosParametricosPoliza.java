
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaValoresDatosParametricosPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaValoresDatosParametricosPoliza">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ws.polizas.bse.com.uy/}paramValoresDatosParametricosPoliza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaValoresDatosParametricosPoliza", propOrder = {
    "arg0"
})
public class ListaValoresDatosParametricosPoliza {

    protected ParamValoresDatosParametricosPoliza arg0;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     * @return
     *     possible object is
     *     {@link ParamValoresDatosParametricosPoliza }
     *     
     */
    public ParamValoresDatosParametricosPoliza getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamValoresDatosParametricosPoliza }
     *     
     */
    public void setArg0(ParamValoresDatosParametricosPoliza value) {
        this.arg0 = value;
    }

}
