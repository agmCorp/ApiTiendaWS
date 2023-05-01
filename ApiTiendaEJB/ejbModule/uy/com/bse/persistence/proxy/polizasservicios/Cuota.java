
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cuota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cuota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anulada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cantFacturar" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cantPrima" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cantPrimaPura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="descripEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="factura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="premio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cuota", propOrder = {
    "anulada",
    "cantFacturar",
    "cantPrima",
    "cantPrimaPura",
    "descripEstado",
    "descripTipoTransaccion",
    "factura",
    "fechaEmision",
    "fechaHasta",
    "motivo",
    "numCuota",
    "numEndoso",
    "premio"
})
public class Cuota {

    protected String anulada;
    protected Double cantFacturar;
    protected Double cantPrima;
    protected Double cantPrimaPura;
    protected String descripEstado;
    protected String descripTipoTransaccion;
    protected Integer factura;
    protected String fechaEmision;
    protected String fechaHasta;
    protected String motivo;
    protected String numCuota;
    protected Integer numEndoso;
    protected Double premio;

    /**
     * Obtiene el valor de la propiedad anulada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnulada() {
        return anulada;
    }

    /**
     * Define el valor de la propiedad anulada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnulada(String value) {
        this.anulada = value;
    }

    /**
     * Obtiene el valor de la propiedad cantFacturar.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantFacturar() {
        return cantFacturar;
    }

    /**
     * Define el valor de la propiedad cantFacturar.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantFacturar(Double value) {
        this.cantFacturar = value;
    }

    /**
     * Obtiene el valor de la propiedad cantPrima.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantPrima() {
        return cantPrima;
    }

    /**
     * Define el valor de la propiedad cantPrima.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantPrima(Double value) {
        this.cantPrima = value;
    }

    /**
     * Obtiene el valor de la propiedad cantPrimaPura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantPrimaPura() {
        return cantPrimaPura;
    }

    /**
     * Define el valor de la propiedad cantPrimaPura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantPrimaPura(Double value) {
        this.cantPrimaPura = value;
    }

    /**
     * Obtiene el valor de la propiedad descripEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripEstado() {
        return descripEstado;
    }

    /**
     * Define el valor de la propiedad descripEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripEstado(String value) {
        this.descripEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTipoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTipoTransaccion() {
        return descripTipoTransaccion;
    }

    /**
     * Define el valor de la propiedad descripTipoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTipoTransaccion(String value) {
        this.descripTipoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad factura.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFactura() {
        return factura;
    }

    /**
     * Define el valor de la propiedad factura.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFactura(Integer value) {
        this.factura = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmision(String value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHasta(String value) {
        this.fechaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad motivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Define el valor de la propiedad motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo(String value) {
        this.motivo = value;
    }

    /**
     * Obtiene el valor de la propiedad numCuota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCuota() {
        return numCuota;
    }

    /**
     * Define el valor de la propiedad numCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCuota(String value) {
        this.numCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad numEndoso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumEndoso() {
        return numEndoso;
    }

    /**
     * Define el valor de la propiedad numEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumEndoso(Integer value) {
        this.numEndoso = value;
    }

    /**
     * Obtiene el valor de la propiedad premio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPremio() {
        return premio;
    }

    /**
     * Define el valor de la propiedad premio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPremio(Double value) {
        this.premio = value;
    }

}
