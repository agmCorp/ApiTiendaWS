
package uy.com.bse.persistence.proxy.mibse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramActualizarFacturacionPolizaTodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramActualizarFacturacionPolizaTodo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosFacturacions" type="{http://ws.mibse.bse.com.uy/}datosFacturacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramActualizarFacturacionPolizaTodo", propOrder = {
    "datosFacturacions"
})
public class ParamActualizarFacturacionPolizaTodo
    extends ParamGenerico
{

    @XmlElement(nillable = true)
    protected List<DatosFacturacion> datosFacturacions;

    /**
     * Gets the value of the datosFacturacions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosFacturacions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosFacturacions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosFacturacion }
     * 
     * 
     */
    public List<DatosFacturacion> getDatosFacturacions() {
        if (datosFacturacions == null) {
            datosFacturacions = new ArrayList<DatosFacturacion>();
        }
        return this.datosFacturacions;
    }

}
