
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultDatosParametricoPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultDatosParametricoPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosParametricos" type="{http://ws.polizas.bse.com.uy/}datoParametricoEndoso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultDatosParametricoPoliza", propOrder = {
    "datosParametricos"
})
public class ResultDatosParametricoPoliza
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<DatoParametricoEndoso> datosParametricos;

    /**
     * Gets the value of the datosParametricos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosParametricos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosParametricos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatoParametricoEndoso }
     * 
     * 
     */
    public List<DatoParametricoEndoso> getDatosParametricos() {
        if (datosParametricos == null) {
            datosParametricos = new ArrayList<DatoParametricoEndoso>();
        }
        return this.datosParametricos;
    }

}
