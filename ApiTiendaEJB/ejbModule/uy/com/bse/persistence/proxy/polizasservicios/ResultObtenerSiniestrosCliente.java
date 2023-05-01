
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerSiniestrosCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerSiniestrosCliente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosCliente" type="{http://ws.polizas.bse.com.uy/}cliente" minOccurs="0"/>
 *         &lt;element name="siniestros" type="{http://ws.polizas.bse.com.uy/}siniestro" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerSiniestrosCliente", propOrder = {
    "datosCliente",
    "siniestros"
})
public class ResultObtenerSiniestrosCliente
    extends ResultGenerico
{

    protected Cliente datosCliente;
    @XmlElement(nillable = true)
    protected List<Siniestro> siniestros;

    /**
     * Obtiene el valor de la propiedad datosCliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getDatosCliente() {
        return datosCliente;
    }

    /**
     * Define el valor de la propiedad datosCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setDatosCliente(Cliente value) {
        this.datosCliente = value;
    }

    /**
     * Gets the value of the siniestros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siniestros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiniestros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Siniestro }
     * 
     * 
     */
    public List<Siniestro> getSiniestros() {
        if (siniestros == null) {
            siniestros = new ArrayList<Siniestro>();
        }
        return this.siniestros;
    }

}
