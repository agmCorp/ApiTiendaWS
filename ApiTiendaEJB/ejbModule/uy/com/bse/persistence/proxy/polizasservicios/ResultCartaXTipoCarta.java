
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultCartaXTipoCarta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultCartaXTipoCarta">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="cartas" type="{http://ws.polizas.bse.com.uy/}cartaXTipoCarta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCartaXTipoCarta", propOrder = {
    "cartas"
})
public class ResultCartaXTipoCarta
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<CartaXTipoCarta> cartas;

    /**
     * Gets the value of the cartas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartaXTipoCarta }
     * 
     * 
     */
    public List<CartaXTipoCarta> getCartas() {
        if (cartas == null) {
            cartas = new ArrayList<CartaXTipoCarta>();
        }
        return this.cartas;
    }

}
