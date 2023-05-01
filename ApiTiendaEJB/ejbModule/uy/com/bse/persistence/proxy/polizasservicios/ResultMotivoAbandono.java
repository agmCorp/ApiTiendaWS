
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultMotivoAbandono complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultMotivoAbandono">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="motivoAbandono" type="{http://ws.polizas.bse.com.uy/}motivoAbandono" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultMotivoAbandono", propOrder = {
    "motivoAbandono"
})
public class ResultMotivoAbandono
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<MotivoAbandono> motivoAbandono;

    /**
     * Gets the value of the motivoAbandono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the motivoAbandono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMotivoAbandono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MotivoAbandono }
     * 
     * 
     */
    public List<MotivoAbandono> getMotivoAbandono() {
        if (motivoAbandono == null) {
            motivoAbandono = new ArrayList<MotivoAbandono>();
        }
        return this.motivoAbandono;
    }

}
