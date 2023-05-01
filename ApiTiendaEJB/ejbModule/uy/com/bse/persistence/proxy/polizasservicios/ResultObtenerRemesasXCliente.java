
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerRemesasXCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerRemesasXCliente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="remesas" type="{http://ws.polizas.bse.com.uy/}remesa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerRemesasXCliente", propOrder = {
    "remesas"
})
public class ResultObtenerRemesasXCliente
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<Remesa> remesas;

    /**
     * Gets the value of the remesas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remesas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemesas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remesa }
     * 
     * 
     */
    public List<Remesa> getRemesas() {
        if (remesas == null) {
            remesas = new ArrayList<Remesa>();
        }
        return this.remesas;
    }

}
