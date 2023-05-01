
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultCausaAnulacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultCausaAnulacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="causasAnulacion" type="{http://ws.polizas.bse.com.uy/}causaAnulacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCausaAnulacion", propOrder = {
    "causasAnulacion"
})
public class ResultCausaAnulacion
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<CausaAnulacion> causasAnulacion;

    /**
     * Gets the value of the causasAnulacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the causasAnulacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCausasAnulacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CausaAnulacion }
     * 
     * 
     */
    public List<CausaAnulacion> getCausasAnulacion() {
        if (causasAnulacion == null) {
            causasAnulacion = new ArrayList<CausaAnulacion>();
        }
        return this.causasAnulacion;
    }

}
