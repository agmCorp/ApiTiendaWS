
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerEndososPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerEndososPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="encabezado" type="{http://ws.polizas.bse.com.uy/}encabezadoPoliza" minOccurs="0"/>
 *         &lt;element name="endosos" type="{http://ws.polizas.bse.com.uy/}datosBasicosEndoso" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerEndososPoliza", propOrder = {
    "encabezado",
    "endosos"
})
public class ResultObtenerEndososPoliza
    extends ResultGenerico
{

    protected EncabezadoPoliza encabezado;
    @XmlElement(nillable = true)
    protected List<DatosBasicosEndoso> endosos;

    /**
     * Obtiene el valor de la propiedad encabezado.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoPoliza }
     *     
     */
    public EncabezadoPoliza getEncabezado() {
        return encabezado;
    }

    /**
     * Define el valor de la propiedad encabezado.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoPoliza }
     *     
     */
    public void setEncabezado(EncabezadoPoliza value) {
        this.encabezado = value;
    }

    /**
     * Gets the value of the endosos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endosos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndosos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosBasicosEndoso }
     * 
     * 
     */
    public List<DatosBasicosEndoso> getEndosos() {
        if (endosos == null) {
            endosos = new ArrayList<DatosBasicosEndoso>();
        }
        return this.endosos;
    }

}
