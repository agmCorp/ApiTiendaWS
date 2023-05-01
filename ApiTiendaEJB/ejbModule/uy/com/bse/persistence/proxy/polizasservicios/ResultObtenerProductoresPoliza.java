
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerProductoresPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerProductoresPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosProductor" type="{http://ws.polizas.bse.com.uy/}datosProductor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="encabezado" type="{http://ws.polizas.bse.com.uy/}encabezadoPoliza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerProductoresPoliza", propOrder = {
    "datosProductor",
    "encabezado"
})
public class ResultObtenerProductoresPoliza
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<DatosProductor> datosProductor;
    protected EncabezadoPoliza encabezado;

    /**
     * Gets the value of the datosProductor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosProductor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosProductor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosProductor }
     * 
     * 
     */
    public List<DatosProductor> getDatosProductor() {
        if (datosProductor == null) {
            datosProductor = new ArrayList<DatosProductor>();
        }
        return this.datosProductor;
    }

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

}
