
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultListaPlanesPagoRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultListaPlanesPagoRec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="planesPago" type="{http://ws.polizas.bse.com.uy/}planPago" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultListaPlanesPagoRec", propOrder = {
    "planesPago"
})
public class ResultListaPlanesPagoRec
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<PlanPago> planesPago;

    /**
     * Gets the value of the planesPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planesPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanesPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanPago }
     * 
     * 
     */
    public List<PlanPago> getPlanesPago() {
        if (planesPago == null) {
            planesPago = new ArrayList<PlanPago>();
        }
        return this.planesPago;
    }

}
