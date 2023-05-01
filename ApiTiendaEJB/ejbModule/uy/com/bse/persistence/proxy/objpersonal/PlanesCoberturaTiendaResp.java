
package uy.com.bse.persistence.proxy.objpersonal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para planesCoberturaTiendaResp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="planesCoberturaTiendaResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://opersonal.ws.servicios.bse.com/}errorTiendaResp">
 *       &lt;sequence>
 *         &lt;element name="planesCoberturaList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="planCobertura" type="{http://opersonal.ws.servicios.bse.com/}planCoberturaTienda" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "planesCoberturaTiendaResp", propOrder = {
    "planesCoberturaList"
})
public class PlanesCoberturaTiendaResp
    extends ErrorTiendaResp
{

    protected PlanesCoberturaTiendaResp.PlanesCoberturaList planesCoberturaList;

    /**
     * Obtiene el valor de la propiedad planesCoberturaList.
     * 
     * @return
     *     possible object is
     *     {@link PlanesCoberturaTiendaResp.PlanesCoberturaList }
     *     
     */
    public PlanesCoberturaTiendaResp.PlanesCoberturaList getPlanesCoberturaList() {
        return planesCoberturaList;
    }

    /**
     * Define el valor de la propiedad planesCoberturaList.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanesCoberturaTiendaResp.PlanesCoberturaList }
     *     
     */
    public void setPlanesCoberturaList(PlanesCoberturaTiendaResp.PlanesCoberturaList value) {
        this.planesCoberturaList = value;
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
     *         &lt;element name="planCobertura" type="{http://opersonal.ws.servicios.bse.com/}planCoberturaTienda" maxOccurs="unbounded" minOccurs="0"/>
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
        "planCobertura"
    })
    public static class PlanesCoberturaList {

        protected List<PlanCoberturaTienda> planCobertura;

        /**
         * Gets the value of the planCobertura property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the planCobertura property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlanCobertura().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PlanCoberturaTienda }
         * 
         * 
         */
        public List<PlanCoberturaTienda> getPlanCobertura() {
            if (planCobertura == null) {
                planCobertura = new ArrayList<PlanCoberturaTienda>();
            }
            return this.planCobertura;
        }

    }

}
