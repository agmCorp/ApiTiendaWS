
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para medioPagoOrigenes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="medioPagoOrigenes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="medioPago" type="{http://ws.polizas.bse.com.uy/}medioPago" minOccurs="0"/>
 *         &lt;element name="origenesPago" type="{http://ws.polizas.bse.com.uy/}origenPagoEndoso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medioPagoOrigenes", propOrder = {
    "medioPago",
    "origenesPago"
})
public class MedioPagoOrigenes {

    protected MedioPago medioPago;
    @XmlElement(nillable = true)
    protected List<OrigenPagoEndoso> origenesPago;

    /**
     * Obtiene el valor de la propiedad medioPago.
     * 
     * @return
     *     possible object is
     *     {@link MedioPago }
     *     
     */
    public MedioPago getMedioPago() {
        return medioPago;
    }

    /**
     * Define el valor de la propiedad medioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link MedioPago }
     *     
     */
    public void setMedioPago(MedioPago value) {
        this.medioPago = value;
    }

    /**
     * Gets the value of the origenesPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origenesPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigenesPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrigenPagoEndoso }
     * 
     * 
     */
    public List<OrigenPagoEndoso> getOrigenesPago() {
        if (origenesPago == null) {
            origenesPago = new ArrayList<OrigenPagoEndoso>();
        }
        return this.origenesPago;
    }

}
