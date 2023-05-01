
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDetallePoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDetallePoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="detallePoliza" type="{http://ws.polizas.bse.com.uy/}datosPoliza" minOccurs="0"/>
 *         &lt;element name="endoso" type="{http://ws.polizas.bse.com.uy/}endoso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerDetallePoliza", propOrder = {
    "detallePoliza",
    "endoso"
})
public class ResultObtenerDetallePoliza
    extends ResultGenerico
{

    protected DatosPoliza detallePoliza;
    @XmlElement(nillable = true)
    protected List<Endoso> endoso;

    /**
     * Obtiene el valor de la propiedad detallePoliza.
     * 
     * @return
     *     possible object is
     *     {@link DatosPoliza }
     *     
     */
    public DatosPoliza getDetallePoliza() {
        return detallePoliza;
    }

    /**
     * Define el valor de la propiedad detallePoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPoliza }
     *     
     */
    public void setDetallePoliza(DatosPoliza value) {
        this.detallePoliza = value;
    }

    /**
     * Gets the value of the endoso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endoso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndoso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Endoso }
     * 
     * 
     */
    public List<Endoso> getEndoso() {
        if (endoso == null) {
            endoso = new ArrayList<Endoso>();
        }
        return this.endoso;
    }

}
