
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerSiniestrosConFiltro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerSiniestrosConFiltro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="siniestro" type="{http://ws.polizas.bse.com.uy/}datosBasicosSiniestro" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerSiniestrosConFiltro", propOrder = {
    "siniestro"
})
public class ResultObtenerSiniestrosConFiltro
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<DatosBasicosSiniestro> siniestro;

    /**
     * Gets the value of the siniestro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siniestro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiniestro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosBasicosSiniestro }
     * 
     * 
     */
    public List<DatosBasicosSiniestro> getSiniestro() {
        if (siniestro == null) {
            siniestro = new ArrayList<DatosBasicosSiniestro>();
        }
        return this.siniestro;
    }

}
