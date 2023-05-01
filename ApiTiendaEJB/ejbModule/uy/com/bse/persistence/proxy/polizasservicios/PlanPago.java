
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para planPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="planPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codNivelComision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descNivelComision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaVto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorGenerado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="formaPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoCuota" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoPremio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoPrima" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numCuotas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="seleccionado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="simboloMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planPago", propOrder = {
    "codNivelComision",
    "codigo",
    "descMoneda",
    "descNivelComision",
    "descripcion",
    "diaVto",
    "error",
    "errorGenerado",
    "formaPago",
    "montoCuota",
    "montoPremio",
    "montoPrima",
    "montoTotal",
    "numCuotas",
    "seleccionado",
    "simboloMoneda"
})
public class PlanPago {

    protected Integer codNivelComision;
    protected String codigo;
    protected String descMoneda;
    protected String descNivelComision;
    protected String descripcion;
    protected Integer diaVto;
    protected String error;
    protected Boolean errorGenerado;
    protected String formaPago;
    protected Double montoCuota;
    protected Double montoPremio;
    protected Double montoPrima;
    protected Double montoTotal;
    protected Integer numCuotas;
    protected Boolean seleccionado;
    protected String simboloMoneda;

    /**
     * Obtiene el valor de la propiedad codNivelComision.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodNivelComision() {
        return codNivelComision;
    }

    /**
     * Define el valor de la propiedad codNivelComision.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodNivelComision(Integer value) {
        this.codNivelComision = value;
    }

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
     * Obtiene el valor de la propiedad descMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMoneda() {
        return descMoneda;
    }

    /**
     * Define el valor de la propiedad descMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMoneda(String value) {
        this.descMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad descNivelComision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescNivelComision() {
        return descNivelComision;
    }

    /**
     * Define el valor de la propiedad descNivelComision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescNivelComision(String value) {
        this.descNivelComision = value;
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
     * Obtiene el valor de la propiedad diaVto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiaVto() {
        return diaVto;
    }

    /**
     * Define el valor de la propiedad diaVto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiaVto(Integer value) {
        this.diaVto = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad errorGenerado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorGenerado() {
        return errorGenerado;
    }

    /**
     * Define el valor de la propiedad errorGenerado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorGenerado(Boolean value) {
        this.errorGenerado = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad montoCuota.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoCuota() {
        return montoCuota;
    }

    /**
     * Define el valor de la propiedad montoCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoCuota(Double value) {
        this.montoCuota = value;
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
     * Obtiene el valor de la propiedad montoTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoTotal() {
        return montoTotal;
    }

    /**
     * Define el valor de la propiedad montoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoTotal(Double value) {
        this.montoTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad numCuotas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCuotas() {
        return numCuotas;
    }

    /**
     * Define el valor de la propiedad numCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCuotas(Integer value) {
        this.numCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad seleccionado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeleccionado() {
        return seleccionado;
    }

    /**
     * Define el valor de la propiedad seleccionado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeleccionado(Boolean value) {
        this.seleccionado = value;
    }

    /**
     * Obtiene el valor de la propiedad simboloMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimboloMoneda() {
        return simboloMoneda;
    }

    /**
     * Define el valor de la propiedad simboloMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimboloMoneda(String value) {
        this.simboloMoneda = value;
    }

}
