
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleRefacturacionPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleRefacturacionPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}certificadoPolizaBasico">
 *       &lt;sequence>
 *         &lt;element name="codDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMedioPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codTpCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descTipoNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descTpCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaVencimiento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="feAmortizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesdeVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHastaVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHastaVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuRefactEfect" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nuRefactPerm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPolizaAnterior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleRefacturacionPoliza", propOrder = {
    "codDocumento",
    "codMedioPago",
    "codNacionalidad",
    "codRamo",
    "codSucursal",
    "codTpCalculo",
    "codVigencia",
    "codVigenciaTecnica",
    "descCliente",
    "descEstado",
    "descTipoNegocio",
    "descTpCalculo",
    "descripMoneda",
    "descripTipoFacturacion",
    "descripVigencia",
    "descripVigenciaTecnica",
    "diaVencimiento",
    "feAmortizacion",
    "fechaDesde",
    "fechaDesdeVigenciaTecnica",
    "fechaHasta",
    "fechaHastaVigencia",
    "fechaHastaVigenciaTecnica",
    "nuRefactEfect",
    "nuRefactPerm",
    "numPoliza",
    "numPolizaAnterior"
})
public class DetalleRefacturacionPoliza
    extends CertificadoPolizaBasico
{

    protected String codDocumento;
    protected Integer codMedioPago;
    protected String codNacionalidad;
    protected Integer codRamo;
    protected Integer codSucursal;
    protected String codTpCalculo;
    protected String codVigencia;
    protected String codVigenciaTecnica;
    protected String descCliente;
    protected String descEstado;
    protected String descTipoNegocio;
    protected String descTpCalculo;
    protected String descripMoneda;
    protected String descripTipoFacturacion;
    protected String descripVigencia;
    protected String descripVigenciaTecnica;
    protected Integer diaVencimiento;
    protected String feAmortizacion;
    protected String fechaDesde;
    protected String fechaDesdeVigenciaTecnica;
    protected String fechaHasta;
    protected String fechaHastaVigencia;
    protected String fechaHastaVigenciaTecnica;
    protected Integer nuRefactEfect;
    protected Integer nuRefactPerm;
    protected Integer numPoliza;
    protected Integer numPolizaAnterior;

    /**
     * Obtiene el valor de la propiedad codDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodDocumento() {
        return codDocumento;
    }

    /**
     * Define el valor de la propiedad codDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodDocumento(String value) {
        this.codDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad codMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMedioPago() {
        return codMedioPago;
    }

    /**
     * Define el valor de la propiedad codMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMedioPago(Integer value) {
        this.codMedioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNacionalidad() {
        return codNacionalidad;
    }

    /**
     * Define el valor de la propiedad codNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNacionalidad(String value) {
        this.codNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codRamo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodRamo() {
        return codRamo;
    }

    /**
     * Define el valor de la propiedad codRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodRamo(Integer value) {
        this.codRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad codSucursal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodSucursal() {
        return codSucursal;
    }

    /**
     * Define el valor de la propiedad codSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodSucursal(Integer value) {
        this.codSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad codTpCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTpCalculo() {
        return codTpCalculo;
    }

    /**
     * Define el valor de la propiedad codTpCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTpCalculo(String value) {
        this.codTpCalculo = value;
    }

    /**
     * Obtiene el valor de la propiedad codVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVigencia() {
        return codVigencia;
    }

    /**
     * Define el valor de la propiedad codVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVigencia(String value) {
        this.codVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codVigenciaTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVigenciaTecnica() {
        return codVigenciaTecnica;
    }

    /**
     * Define el valor de la propiedad codVigenciaTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVigenciaTecnica(String value) {
        this.codVigenciaTecnica = value;
    }

    /**
     * Obtiene el valor de la propiedad descCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCliente() {
        return descCliente;
    }

    /**
     * Define el valor de la propiedad descCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCliente(String value) {
        this.descCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad descEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEstado() {
        return descEstado;
    }

    /**
     * Define el valor de la propiedad descEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEstado(String value) {
        this.descEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipoNegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoNegocio() {
        return descTipoNegocio;
    }

    /**
     * Define el valor de la propiedad descTipoNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoNegocio(String value) {
        this.descTipoNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad descTpCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTpCalculo() {
        return descTpCalculo;
    }

    /**
     * Define el valor de la propiedad descTpCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTpCalculo(String value) {
        this.descTpCalculo = value;
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
     * Obtiene el valor de la propiedad descripTipoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTipoFacturacion() {
        return descripTipoFacturacion;
    }

    /**
     * Define el valor de la propiedad descripTipoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTipoFacturacion(String value) {
        this.descripTipoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripVigencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripVigencia() {
        return descripVigencia;
    }

    /**
     * Define el valor de la propiedad descripVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripVigencia(String value) {
        this.descripVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad descripVigenciaTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripVigenciaTecnica() {
        return descripVigenciaTecnica;
    }

    /**
     * Define el valor de la propiedad descripVigenciaTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripVigenciaTecnica(String value) {
        this.descripVigenciaTecnica = value;
    }

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
     * Obtiene el valor de la propiedad feAmortizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeAmortizacion() {
        return feAmortizacion;
    }

    /**
     * Define el valor de la propiedad feAmortizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeAmortizacion(String value) {
        this.feAmortizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDesde(String value) {
        this.fechaDesde = value;
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
     * Obtiene el valor de la propiedad nuRefactEfect.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNuRefactEfect() {
        return nuRefactEfect;
    }

    /**
     * Define el valor de la propiedad nuRefactEfect.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNuRefactEfect(Integer value) {
        this.nuRefactEfect = value;
    }

    /**
     * Obtiene el valor de la propiedad nuRefactPerm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNuRefactPerm() {
        return nuRefactPerm;
    }

    /**
     * Define el valor de la propiedad nuRefactPerm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNuRefactPerm(Integer value) {
        this.nuRefactPerm = value;
    }

    /**
     * Obtiene el valor de la propiedad numPoliza.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPoliza() {
        return numPoliza;
    }

    /**
     * Define el valor de la propiedad numPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPoliza(Integer value) {
        this.numPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad numPolizaAnterior.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPolizaAnterior() {
        return numPolizaAnterior;
    }

    /**
     * Define el valor de la propiedad numPolizaAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPolizaAnterior(Integer value) {
        this.numPolizaAnterior = value;
    }

}
