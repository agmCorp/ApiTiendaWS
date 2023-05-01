
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para refacturarPolizaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="refacturarPolizaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.polizas.bse.com.uy/}resultRefacturacionPoliza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refacturarPolizaResponse", propOrder = {
    "_return"
})
public class RefacturarPolizaResponse {

    @XmlElement(name = "return")
    protected ResultRefacturacionPoliza _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link ResultRefacturacionPoliza }
     *     
     */
    public ResultRefacturacionPoliza getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultRefacturacionPoliza }
     *     
     */
    public void setReturn(ResultRefacturacionPoliza value) {
        this._return = value;
    }

}
