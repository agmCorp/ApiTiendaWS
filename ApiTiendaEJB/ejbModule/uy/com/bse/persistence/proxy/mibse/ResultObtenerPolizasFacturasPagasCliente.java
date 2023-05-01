
package uy.com.bse.persistence.proxy.mibse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerPolizasFacturasPagasCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerPolizasFacturasPagasCliente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosFacturacion" type="{http://ws.mibse.bse.com.uy/}datosFacturacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerPolizasFacturasPagasCliente", propOrder = {
    "datosFacturacion"
})
public class ResultObtenerPolizasFacturasPagasCliente
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<DatosFacturacion> datosFacturacion;

    /**
     * Gets the value of the datosFacturacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosFacturacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosFacturacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosFacturacion }
     * 
     * 
     */
    public List<DatosFacturacion> getDatosFacturacion() {
        if (datosFacturacion == null) {
            datosFacturacion = new ArrayList<DatosFacturacion>();
        }
        return this.datosFacturacion;
    }

}
