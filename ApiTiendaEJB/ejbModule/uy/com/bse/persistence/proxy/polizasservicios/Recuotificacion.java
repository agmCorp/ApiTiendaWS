
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para recuotificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="recuotificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diaVencimiento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fechaDesdeVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesdeVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHastaVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHastaVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoDiaVto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importeFacturado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoPremio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoPrima" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numCotizacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numCuotasFacturadas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saldoFacturar" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recuotificacion", propOrder = {
    "diaVencimiento",
    "fechaDesdeVigencia",
    "fechaDesdeVigenciaTecnica",
    "fechaEmision",
    "fechaHastaVigencia",
    "fechaHastaVigenciaTecnica",
    "habilitoDiaVto",
    "importeFacturado",
    "montoPremio",
    "montoPrima",
    "numCotizacion",
    "numCuotasFacturadas",
    "numEndoso",
    "saldoFacturar"
})
public class Recuotificacion {

    protected Integer diaVencimiento;
    protected String fechaDesdeVigencia;
    protected String fechaDesdeVigenciaTecnica;
    protected String fechaEmision;
    protected String fechaHastaVigencia;
    protected String fechaHastaVigenciaTecnica;
    protected String habilitoDiaVto;
    protected Double importeFacturado;
    protected Double montoPremio;
    protected Double montoPrima;
    protected Integer numCotizacion;
    protected Integer numCuotasFacturadas;
    protected Integer numEndoso;
    protected Double saldoFacturar;

    /**
     * Obtiene el valor de la propiedad diaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiaVencimiento() {
        return diaVencimiento;
    }

    /**
     * Define el valor de la propiedad diaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiaVencimiento(Integer value) {
        this.diaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesdeVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesdeVigencia() {
        return fechaDesdeVigencia;
    }

    /**
     * Define el valor de la propiedad fechaDesdeVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesdeVigencia(String value) {
        this.fechaDesdeVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesdeVigenciaTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesdeVigenciaTecnica() {
        return fechaDesdeVigenciaTecnica;
    }

    /**
     * Define el valor de la propiedad fechaDesdeVigenciaTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesdeVigenciaTecnica(String value) {
        this.fechaDesdeVigenciaTecnica = value;
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
     * Obtiene el valor de la propiedad fechaHastaVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHastaVigencia() {
        return fechaHastaVigencia;
    }

    /**
     * Define el valor de la propiedad fechaHastaVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHastaVigencia(String value) {
        this.fechaHastaVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHastaVigenciaTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaHastaVigenciaTecnica() {
        return fechaHastaVigenciaTecnica;
    }

    /**
     * Define el valor de la propiedad fechaHastaVigenciaTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaHastaVigenciaTecnica(String value) {
        this.fechaHastaVigenciaTecnica = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoDiaVto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoDiaVto() {
        return habilitoDiaVto;
    }

    /**
     * Define el valor de la propiedad habilitoDiaVto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoDiaVto(String value) {
        this.habilitoDiaVto = value;
    }

    /**
     * Obtiene el valor de la propiedad importeFacturado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteFacturado() {
        return importeFacturado;
    }

    /**
     * Define el valor de la propiedad importeFacturado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteFacturado(Double value) {
        this.importeFacturado = value;
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
     * Obtiene el valor de la propiedad numCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * Define el valor de la propiedad numCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCotizacion(Integer value) {
        this.numCotizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numCuotasFacturadas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCuotasFacturadas() {
        return numCuotasFacturadas;
    }

    /**
     * Define el valor de la propiedad numCuotasFacturadas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCuotasFacturadas(Integer value) {
        this.numCuotasFacturadas = value;
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
     * Obtiene el valor de la propiedad saldoFacturar.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoFacturar() {
        return saldoFacturar;
    }

    /**
     * Define el valor de la propiedad saldoFacturar.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoFacturar(Double value) {
        this.saldoFacturar = value;
    }

}
