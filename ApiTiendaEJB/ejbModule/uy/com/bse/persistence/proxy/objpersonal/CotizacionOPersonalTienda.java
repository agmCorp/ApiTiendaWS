
package uy.com.bse.persistence.proxy.objpersonal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cotizacionOPersonalTienda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cotizacionOPersonalTienda">
 *   &lt;complexContent>
 *     &lt;extension base="{http://opersonal.ws.servicios.bse.com/}cotizacionTienda">
 *       &lt;sequence>
 *         &lt;element name="planesCuotas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="planCuota" type="{http://opersonal.ws.servicios.bse.com/}planCuotaTienda" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotizacionOPersonalTienda", propOrder = {
    "planesCuotas"
})
public class CotizacionOPersonalTienda
    extends CotizacionTienda
{

    protected CotizacionOPersonalTienda.PlanesCuotas planesCuotas;

    /**
     * Obtiene el valor de la propiedad planesCuotas.
     * 
     * @return
     *     possible object is
     *     {@link CotizacionOPersonalTienda.PlanesCuotas }
     *     
     */
    public CotizacionOPersonalTienda.PlanesCuotas getPlanesCuotas() {
        return planesCuotas;
    }

    /**
     * Define el valor de la propiedad planesCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link CotizacionOPersonalTienda.PlanesCuotas }
     *     
     */
    public void setPlanesCuotas(CotizacionOPersonalTienda.PlanesCuotas value) {
        this.planesCuotas = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="planCuota" type="{http://opersonal.ws.servicios.bse.com/}planCuotaTienda" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "planCuota"
    })
    public static class PlanesCuotas {

        protected List<PlanCuotaTienda> planCuota;

        /**
         * Gets the value of the planCuota property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the planCuota property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlanCuota().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlanCuotaTienda }
         * 
         * 
         */
        public List<PlanCuotaTienda> getPlanCuota() {
            if (planCuota == null) {
                planCuota = new ArrayList<PlanCuotaTienda>();
            }
            return this.planCuota;
        }

    }

}
