
package uy.com.bse.persistence.proxy.objpersonal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para planCuotaTienda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="planCuotaTienda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantCuotas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cuotas" type="{http://opersonal.ws.servicios.bse.com/}cuotaPagoTienda" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="importeTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="planPago" type="{http://opersonal.ws.servicios.bse.com/}planPagoTienda" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planCuotaTienda", propOrder = {
    "cantCuotas",
    "cuotas",
    "importeTotal",
    "planPago"
})
public class PlanCuotaTienda {

    protected int cantCuotas;
    @XmlElement(nillable = true)
    protected List<CuotaPagoTienda> cuotas;
    protected double importeTotal;
    protected PlanPagoTienda planPago;

    /**
     * Obtiene el valor de la propiedad cantCuotas.
     * 
     */
    public int getCantCuotas() {
        return cantCuotas;
    }

    /**
     * Define el valor de la propiedad cantCuotas.
     * 
     */
    public void setCantCuotas(int value) {
        this.cantCuotas = value;
    }

    /**
     * Gets the value of the cuotas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuotas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuotas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CuotaPagoTienda }
     * 
     * 
     */
    public List<CuotaPagoTienda> getCuotas() {
        if (cuotas == null) {
            cuotas = new ArrayList<CuotaPagoTienda>();
        }
        return this.cuotas;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     */
    public double getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     */
    public void setImporteTotal(double value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad planPago.
     * 
     * @return
     *     possible object is
     *     {@link PlanPagoTienda }
     *     
     */
    public PlanPagoTienda getPlanPago() {
        return planPago;
    }

    /**
     * Define el valor de la propiedad planPago.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanPagoTienda }
     *     
     */
    public void setPlanPago(PlanPagoTienda value) {
        this.planPago = value;
    }

}
