
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultTipoAnulacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultTipoAnulacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="tiposAnulacion" type="{http://ws.polizas.bse.com.uy/}tipoAnulacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultTipoAnulacion", propOrder = {
    "tiposAnulacion"
})
public class ResultTipoAnulacion
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<TipoAnulacion> tiposAnulacion;

    /**
     * Gets the value of the tiposAnulacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tiposAnulacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposAnulacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoAnulacion }
     * 
     * 
     */
    public List<TipoAnulacion> getTiposAnulacion() {
        if (tiposAnulacion == null) {
            tiposAnulacion = new ArrayList<TipoAnulacion>();
        }
        return this.tiposAnulacion;
    }

}
