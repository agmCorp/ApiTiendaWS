
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validarCertificadoLibreDeudaADTResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validarCertificadoLibreDeudaADTResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.mibse.bse.com.uy/}resultValidarCertificadoLibreDeudaADT" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarCertificadoLibreDeudaADTResponse", propOrder = {
    "_return"
})
public class ValidarCertificadoLibreDeudaADTResponse {

    @XmlElement(name = "return")
    protected ResultValidarCertificadoLibreDeudaADT _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link ResultValidarCertificadoLibreDeudaADT }
     *     
     */
    public ResultValidarCertificadoLibreDeudaADT getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultValidarCertificadoLibreDeudaADT }
     *     
     */
    public void setReturn(ResultValidarCertificadoLibreDeudaADT value) {
        this._return = value;
    }

}
