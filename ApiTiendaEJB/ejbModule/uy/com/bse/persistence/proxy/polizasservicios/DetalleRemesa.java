
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleRemesa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleRemesa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codBanco" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTipoMovimiento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoCheque" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numBoleta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numCheque" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="posdatado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleRemesa", propOrder = {
    "codBanco",
    "codMoneda",
    "codTipoMovimiento",
    "descripBanco",
    "descripMoneda",
    "descripTipoMovimiento",
    "fecha",
    "montoCheque",
    "numBoleta",
    "numCheque",
    "posdatado"
})
public class DetalleRemesa {

    protected Integer codBanco;
    protected String codMoneda;
    protected Integer codTipoMovimiento;
    protected String descripBanco;
    protected String descripMoneda;
    protected String descripTipoMovimiento;
    protected String fecha;
    protected Double montoCheque;
    protected Integer numBoleta;
    protected Integer numCheque;
    protected String posdatado;

    /**
     * Obtiene el valor de la propiedad codBanco.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodBanco() {
        return codBanco;
    }

    /**
     * Define el valor de la propiedad codBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodBanco(Integer value) {
        this.codBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad codMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMoneda() {
        return codMoneda;
    }

    /**
     * Define el valor de la propiedad codMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMoneda(String value) {
        this.codMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoMovimiento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodTipoMovimiento() {
        return codTipoMovimiento;
    }

    /**
     * Define el valor de la propiedad codTipoMovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodTipoMovimiento(Integer value) {
        this.codTipoMovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad descripBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripBanco() {
        return descripBanco;
    }

    /**
     * Define el valor de la propiedad descripBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripBanco(String value) {
        this.descripBanco = value;
    }

    /**
     * Obtiene el valor de la propiedad descripMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripMoneda() {
        return descripMoneda;
    }

    /**
     * Define el valor de la propiedad descripMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripMoneda(String value) {
        this.descripMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTipoMovimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTipoMovimiento() {
        return descripTipoMovimiento;
    }

    /**
     * Define el valor de la propiedad descripTipoMovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTipoMovimiento(String value) {
        this.descripTipoMovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad montoCheque.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoCheque() {
        return montoCheque;
    }

    /**
     * Define el valor de la propiedad montoCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoCheque(Double value) {
        this.montoCheque = value;
    }

    /**
     * Obtiene el valor de la propiedad numBoleta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumBoleta() {
        return numBoleta;
    }

    /**
     * Define el valor de la propiedad numBoleta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumBoleta(Integer value) {
        this.numBoleta = value;
    }

    /**
     * Obtiene el valor de la propiedad numCheque.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCheque() {
        return numCheque;
    }

    /**
     * Define el valor de la propiedad numCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCheque(Integer value) {
        this.numCheque = value;
    }

    /**
     * Obtiene el valor de la propiedad posdatado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosdatado() {
        return posdatado;
    }

    /**
     * Define el valor de la propiedad posdatado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosdatado(String value) {
        this.posdatado = value;
    }

}
