
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cuotaRecuotificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cuotaRecuotificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cuotaPura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoIva" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoOtros" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoPrima" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoRecargo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cuotaRecuotificacion", propOrder = {
    "cuotaPura",
    "montoIva",
    "montoOtros",
    "montoPrima",
    "montoRecargo",
    "total",
    "vencimiento"
})
public class CuotaRecuotificacion {

    protected Double cuotaPura;
    protected Double montoIva;
    protected Double montoOtros;
    protected Double montoPrima;
    protected Double montoRecargo;
    protected Double total;
    protected String vencimiento;

    /**
     * Obtiene el valor de la propiedad cuotaPura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCuotaPura() {
        return cuotaPura;
    }

    /**
     * Define el valor de la propiedad cuotaPura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCuotaPura(Double value) {
        this.cuotaPura = value;
    }

    /**
     * Obtiene el valor de la propiedad montoIva.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoIva() {
        return montoIva;
    }

    /**
     * Define el valor de la propiedad montoIva.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoIva(Double value) {
        this.montoIva = value;
    }

    /**
     * Obtiene el valor de la propiedad montoOtros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoOtros() {
        return montoOtros;
    }

    /**
     * Define el valor de la propiedad montoOtros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoOtros(Double value) {
        this.montoOtros = value;
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
     * Obtiene el valor de la propiedad montoRecargo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoRecargo() {
        return montoRecargo;
    }

    /**
     * Define el valor de la propiedad montoRecargo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoRecargo(Double value) {
        this.montoRecargo = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotal(Double value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad vencimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimiento() {
        return vencimiento;
    }

    /**
     * Define el valor de la propiedad vencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimiento(String value) {
        this.vencimiento = value;
    }

}
