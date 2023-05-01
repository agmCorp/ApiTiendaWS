
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerBienesAseguradosPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerBienesAseguradosPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="bienesAsegurados" type="{http://ws.polizas.bse.com.uy/}bienAsegurado" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "resultObtenerBienesAseguradosPoliza", propOrder = {
    "bienesAsegurados",
    "encabezadoDetallePoliza"
})
public class ResultObtenerBienesAseguradosPoliza
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<BienAsegurado> bienesAsegurados;
    protected EncabezadoDetallePoliza encabezadoDetallePoliza;

    /**
     * Gets the value of the bienesAsegurados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bienesAsegurados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBienesAsegurados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BienAsegurado }
     * 
     * 
     */
    public List<BienAsegurado> getBienesAsegurados() {
        if (bienesAsegurados == null) {
            bienesAsegurados = new ArrayList<BienAsegurado>();
        }
        return this.bienesAsegurados;
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
