
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerCotizacionPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerCotizacionPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosCotizacionPoliza" type="{http://ws.polizas.bse.com.uy/}cotizacionPoliza" minOccurs="0"/>
 *         &lt;element name="planesCoberturaPoliza" type="{http://ws.polizas.bse.com.uy/}planCoberturaPoliza" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerCotizacionPoliza", propOrder = {
    "datosCotizacionPoliza",
    "planesCoberturaPoliza"
})
public class ResultObtenerCotizacionPoliza
    extends ResultGenerico
{

    protected CotizacionPoliza datosCotizacionPoliza;
    @XmlElement(nillable = true)
    protected List<PlanCoberturaPoliza> planesCoberturaPoliza;

    /**
     * Obtiene el valor de la propiedad datosCotizacionPoliza.
     * 
     * @return
     *     possible object is
     *     {@link CotizacionPoliza }
     *     
     */
    public CotizacionPoliza getDatosCotizacionPoliza() {
        return datosCotizacionPoliza;
    }

    /**
     * Define el valor de la propiedad datosCotizacionPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizacionPoliza }
     *     
     */
    public void setDatosCotizacionPoliza(CotizacionPoliza value) {
        this.datosCotizacionPoliza = value;
    }

    /**
     * Gets the value of the planesCoberturaPoliza property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planesCoberturaPoliza property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanesCoberturaPoliza().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanCoberturaPoliza }
     * 
     * 
     */
    public List<PlanCoberturaPoliza> getPlanesCoberturaPoliza() {
        if (planesCoberturaPoliza == null) {
            planesCoberturaPoliza = new ArrayList<PlanCoberturaPoliza>();
        }
        return this.planesCoberturaPoliza;
    }

}
