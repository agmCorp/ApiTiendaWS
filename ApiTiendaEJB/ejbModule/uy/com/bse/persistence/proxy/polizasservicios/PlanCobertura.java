
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para planCobertura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="planCobertura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorPlanCob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excluido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoDeducible" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoPremio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoPrima" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="planesPago" type="{http://ws.polizas.bse.com.uy/}planPago" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="premioFacturacion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planCobertura", propOrder = {
    "codigo",
    "descripcion",
    "errorPlanCob",
    "excluido",
    "montoDeducible",
    "montoPremio",
    "montoPrima",
    "planesPago",
    "premioFacturacion"
})
@XmlSeeAlso({
    PlanCoberturaPoliza.class
})
public class PlanCobertura {

    protected String codigo;
    protected String descripcion;
    protected String errorPlanCob;
    protected String excluido;
    protected Double montoDeducible;
    protected Double montoPremio;
    protected Double montoPrima;
    @XmlElement(nillable = true)
    protected List<PlanPago> planesPago;
    protected Double premioFacturacion;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad errorPlanCob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorPlanCob() {
        return errorPlanCob;
    }

    /**
     * Define el valor de la propiedad errorPlanCob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorPlanCob(String value) {
        this.errorPlanCob = value;
    }

    /**
     * Obtiene el valor de la propiedad excluido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcluido() {
        return excluido;
    }

    /**
     * Define el valor de la propiedad excluido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcluido(String value) {
        this.excluido = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDeducible.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoDeducible() {
        return montoDeducible;
    }

    /**
     * Define el valor de la propiedad montoDeducible.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoDeducible(Double value) {
        this.montoDeducible = value;
    }

    /**
     * Obtiene el valor de la propiedad montoPremio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoPremio() {
        return montoPremio;
    }

    /**
     * Define el valor de la propiedad montoPremio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoPremio(Double value) {
        this.montoPremio = value;
    }

    /**
     * Obtiene el valor de la propiedad montoPrima.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoPrima() {
        return montoPrima;
    }

    /**
     * Define el valor de la propiedad montoPrima.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoPrima(Double value) {
        this.montoPrima = value;
    }

    /**
     * Gets the value of the planesPago property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planesPago property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanesPago().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanPago }
     * 
     * 
     */
    public List<PlanPago> getPlanesPago() {
        if (planesPago == null) {
            planesPago = new ArrayList<PlanPago>();
        }
        return this.planesPago;
    }

    /**
     * Obtiene el valor de la propiedad premioFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPremioFacturacion() {
        return premioFacturacion;
    }

    /**
     * Define el valor de la propiedad premioFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPremioFacturacion(Double value) {
        this.premioFacturacion = value;
    }

}
