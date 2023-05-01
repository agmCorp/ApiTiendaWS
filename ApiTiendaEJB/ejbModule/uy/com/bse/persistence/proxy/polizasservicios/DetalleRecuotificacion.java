
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleRecuotificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleRecuotificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cuotas" type="{http://ws.polizas.bse.com.uy/}cuotaRecuotificacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalCuotaPura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalCuotas" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalIVA" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalOtros" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalRecargos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleRecuotificacion", propOrder = {
    "cuotas",
    "totalCuotaPura",
    "totalCuotas",
    "totalIVA",
    "totalOtros",
    "totalRecargos"
})
public class DetalleRecuotificacion {

    @XmlElement(nillable = true)
    protected List<CuotaRecuotificacion> cuotas;
    protected Double totalCuotaPura;
    protected Double totalCuotas;
    protected Double totalIVA;
    protected Double totalOtros;
    protected Double totalRecargos;

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
     * {@link CuotaRecuotificacion }
     * 
     * 
     */
    public List<CuotaRecuotificacion> getCuotas() {
        if (cuotas == null) {
            cuotas = new ArrayList<CuotaRecuotificacion>();
        }
        return this.cuotas;
    }

    /**
     * Obtiene el valor de la propiedad totalCuotaPura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCuotaPura() {
        return totalCuotaPura;
    }

    /**
     * Define el valor de la propiedad totalCuotaPura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCuotaPura(Double value) {
        this.totalCuotaPura = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCuotas.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCuotas() {
        return totalCuotas;
    }

    /**
     * Define el valor de la propiedad totalCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCuotas(Double value) {
        this.totalCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad totalIVA.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalIVA() {
        return totalIVA;
    }

    /**
     * Define el valor de la propiedad totalIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalIVA(Double value) {
        this.totalIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad totalOtros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalOtros() {
        return totalOtros;
    }

    /**
     * Define el valor de la propiedad totalOtros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalOtros(Double value) {
        this.totalOtros = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRecargos.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalRecargos() {
        return totalRecargos;
    }

    /**
     * Define el valor de la propiedad totalRecargos.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalRecargos(Double value) {
        this.totalRecargos = value;
    }

}
