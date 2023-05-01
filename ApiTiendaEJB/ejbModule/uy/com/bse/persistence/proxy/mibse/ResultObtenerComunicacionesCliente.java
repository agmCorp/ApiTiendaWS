
package uy.com.bse.persistence.proxy.mibse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerComunicacionesCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerComunicacionesCliente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="comunicaciones" type="{http://ws.mibse.bse.com.uy/}datosComunicacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerComunicacionesCliente", propOrder = {
    "comunicaciones"
})
public class ResultObtenerComunicacionesCliente
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<DatosComunicacion> comunicaciones;

    /**
     * Gets the value of the comunicaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comunicaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComunicaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosComunicacion }
     * 
     * 
     */
    public List<DatosComunicacion> getComunicaciones() {
        if (comunicaciones == null) {
            comunicaciones = new ArrayList<DatosComunicacion>();
        }
        return this.comunicaciones;
    }

}
