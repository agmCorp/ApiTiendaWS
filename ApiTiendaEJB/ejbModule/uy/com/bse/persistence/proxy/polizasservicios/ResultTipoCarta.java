
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultTipoCarta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultTipoCarta">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="tipos" type="{http://ws.polizas.bse.com.uy/}tipoCarta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultTipoCarta", propOrder = {
    "tipos"
})
public class ResultTipoCarta
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<TipoCarta> tipos;

    /**
     * Gets the value of the tipos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoCarta }
     * 
     * 
     */
    public List<TipoCarta> getTipos() {
        if (tipos == null) {
            tipos = new ArrayList<TipoCarta>();
        }
        return this.tipos;
    }

}
