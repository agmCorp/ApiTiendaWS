
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerAhorrosPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerAhorrosPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="ahorros" type="{http://ws.polizas.bse.com.uy/}ahorro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="datosCalculoRenta" type="{http://ws.polizas.bse.com.uy/}datosCalculoRenta" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="encabezadoDetallePoliza" type="{http://ws.polizas.bse.com.uy/}encabezadoDetallePoliza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerAhorrosPoliza", propOrder = {
    "ahorros",
    "datosCalculoRenta",
    "encabezadoDetallePoliza"
})
public class ResultObtenerAhorrosPoliza
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<Ahorro> ahorros;
    @XmlElement(nillable = true)
    protected List<DatosCalculoRenta> datosCalculoRenta;
    protected EncabezadoDetallePoliza encabezadoDetallePoliza;

    /**
     * Gets the value of the ahorros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ahorros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAhorros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ahorro }
     * 
     * 
     */
    public List<Ahorro> getAhorros() {
        if (ahorros == null) {
            ahorros = new ArrayList<Ahorro>();
        }
        return this.ahorros;
    }

    /**
     * Gets the value of the datosCalculoRenta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosCalculoRenta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosCalculoRenta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosCalculoRenta }
     * 
     * 
     */
    public List<DatosCalculoRenta> getDatosCalculoRenta() {
        if (datosCalculoRenta == null) {
            datosCalculoRenta = new ArrayList<DatosCalculoRenta>();
        }
        return this.datosCalculoRenta;
    }

    /**
     * Obtiene el valor de la propiedad encabezadoDetallePoliza.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoDetallePoliza }
     *     
     */
    public EncabezadoDetallePoliza getEncabezadoDetallePoliza() {
        return encabezadoDetallePoliza;
    }

    /**
     * Define el valor de la propiedad encabezadoDetallePoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoDetallePoliza }
     *     
     */
    public void setEncabezadoDetallePoliza(EncabezadoDetallePoliza value) {
        this.encabezadoDetallePoliza = value;
    }

}
