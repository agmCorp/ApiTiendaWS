
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerNotasSiniestro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerNotasSiniestro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="notasSiniestro" type="{http://ws.polizas.bse.com.uy/}nota" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerNotasSiniestro", propOrder = {
    "notasSiniestro"
})
public class ResultObtenerNotasSiniestro
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<Nota> notasSiniestro;

    /**
     * Gets the value of the notasSiniestro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notasSiniestro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotasSiniestro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Nota }
     * 
     * 
     */
    public List<Nota> getNotasSiniestro() {
        if (notasSiniestro == null) {
            notasSiniestro = new ArrayList<Nota>();
        }
        return this.notasSiniestro;
    }

}
