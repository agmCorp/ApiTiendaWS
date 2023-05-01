
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cotizacionAnulacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cotizacionAnulacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anioSiniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="botonAnularVisible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="botonConsultaVisible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="botonImprimirVisible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="botonNotasVisible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="botonSiniestroVisible" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codBroker" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codCausaAnulacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codModoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codProductor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRamoSiniestro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descBroker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripCausaAnulacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripModoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripProductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaAnulacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaImpago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoAnular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoCausa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoModoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoSiniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensajeAviso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoPremioAnulacion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoPremioPoliza" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numCotizacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numSiniestro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotizacionAnulacion", propOrder = {
    "anioSiniestro",
    "botonAnularVisible",
    "botonConsultaVisible",
    "botonImprimirVisible",
    "botonNotasVisible",
    "botonSiniestroVisible",
    "cliente",
    "codBroker",
    "codCausaAnulacion",
    "codModoCalculo",
    "codProductor",
    "codRamoSiniestro",
    "descBroker",
    "descripCausaAnulacion",
    "descripModoCalculo",
    "descripProductor",
    "enlace",
    "fechaAnulacion",
    "fechaDesde",
    "fechaHasta",
    "fechaImpago",
    "habilitoAnular",
    "habilitoCausa",
    "habilitoModoCalculo",
    "habilitoSiniestro",
    "mensajeAviso",
    "montoPremioAnulacion",
    "montoPremioPoliza",
    "numCotizacion",
    "numSiniestro"
})
public class CotizacionAnulacion {

    protected String anioSiniestro;
    protected String botonAnularVisible;
    protected String botonConsultaVisible;
    protected String botonImprimirVisible;
    protected String botonNotasVisible;
    protected String botonSiniestroVisible;
    protected String cliente;
    protected Integer codBroker;
    protected Integer codCausaAnulacion;
    protected String codModoCalculo;
    protected Integer codProductor;
    protected Integer codRamoSiniestro;
    protected String descBroker;
    protected String descripCausaAnulacion;
    protected String descripModoCalculo;
    protected String descripProductor;
    protected String enlace;
    protected String fechaAnulacion;
    protected String fechaDesde;
    protected String fechaHasta;
    protected String fechaImpago;
    protected String habilitoAnular;
    protected String habilitoCausa;
    protected String habilitoModoCalculo;
    protected String habilitoSiniestro;
    protected String mensajeAviso;
    protected Double montoPremioAnulacion;
    protected Double montoPremioPoliza;
    protected Integer numCotizacion;
    protected Integer numSiniestro;

    /**
     * Obtiene el valor de la propiedad anioSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnioSiniestro() {
        return anioSiniestro;
    }

    /**
     * Define el valor de la propiedad anioSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnioSiniestro(String value) {
        this.anioSiniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad botonAnularVisible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotonAnularVisible() {
        return botonAnularVisible;
    }

    /**
     * Define el valor de la propiedad botonAnularVisible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotonAnularVisible(String value) {
        this.botonAnularVisible = value;
    }

    /**
     * Obtiene el valor de la propiedad botonConsultaVisible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotonConsultaVisible() {
        return botonConsultaVisible;
    }

    /**
     * Define el valor de la propiedad botonConsultaVisible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotonConsultaVisible(String value) {
        this.botonConsultaVisible = value;
    }

    /**
     * Obtiene el valor de la propiedad botonImprimirVisible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotonImprimirVisible() {
        return botonImprimirVisible;
    }

    /**
     * Define el valor de la propiedad botonImprimirVisible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotonImprimirVisible(String value) {
        this.botonImprimirVisible = value;
    }

    /**
     * Obtiene el valor de la propiedad botonNotasVisible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotonNotasVisible() {
        return botonNotasVisible;
    }

    /**
     * Define el valor de la propiedad botonNotasVisible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotonNotasVisible(String value) {
        this.botonNotasVisible = value;
    }

    /**
     * Obtiene el valor de la propiedad botonSiniestroVisible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBotonSiniestroVisible() {
        return botonSiniestroVisible;
    }

    /**
     * Define el valor de la propiedad botonSiniestroVisible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBotonSiniestroVisible(String value) {
        this.botonSiniestroVisible = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codBroker.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodBroker() {
        return codBroker;
    }

    /**
     * Define el valor de la propiedad codBroker.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodBroker(Integer value) {
        this.codBroker = value;
    }

    /**
     * Obtiene el valor de la propiedad codCausaAnulacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodCausaAnulacion() {
        return codCausaAnulacion;
    }

    /**
     * Define el valor de la propiedad codCausaAnulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodCausaAnulacion(Integer value) {
        this.codCausaAnulacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codModoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodModoCalculo() {
        return codModoCalculo;
    }

    /**
     * Define el valor de la propiedad codModoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodModoCalculo(String value) {
        this.codModoCalculo = value;
    }

    /**
     * Obtiene el valor de la propiedad codProductor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodProductor() {
        return codProductor;
    }

    /**
     * Define el valor de la propiedad codProductor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodProductor(Integer value) {
        this.codProductor = value;
    }

    /**
     * Obtiene el valor de la propiedad codRamoSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodRamoSiniestro() {
        return codRamoSiniestro;
    }

    /**
     * Define el valor de la propiedad codRamoSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodRamoSiniestro(Integer value) {
        this.codRamoSiniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad descBroker.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescBroker() {
        return descBroker;
    }

    /**
     * Define el valor de la propiedad descBroker.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescBroker(String value) {
        this.descBroker = value;
    }

    /**
     * Obtiene el valor de la propiedad descripCausaAnulacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripCausaAnulacion() {
        return descripCausaAnulacion;
    }

    /**
     * Define el valor de la propiedad descripCausaAnulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripCausaAnulacion(String value) {
        this.descripCausaAnulacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripModoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripModoCalculo() {
        return descripModoCalculo;
    }

    /**
     * Define el valor de la propiedad descripModoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripModoCalculo(String value) {
        this.descripModoCalculo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripProductor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripProductor() {
        return descripProductor;
    }

    /**
     * Define el valor de la propiedad descripProductor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripProductor(String value) {
        this.descripProductor = value;
    }

    /**
     * Obtiene el valor de la propiedad enlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Define el valor de la propiedad enlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnlace(String value) {
        this.enlace = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAnulacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAnulacion() {
        return fechaAnulacion;
    }

    /**
     * Define el valor de la propiedad fechaAnulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAnulacion(String value) {
        this.fechaAnulacion = value;
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
     * Obtiene el valor de la propiedad fechaImpago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaImpago() {
        return fechaImpago;
    }

    /**
     * Define el valor de la propiedad fechaImpago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaImpago(String value) {
        this.fechaImpago = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoAnular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoAnular() {
        return habilitoAnular;
    }

    /**
     * Define el valor de la propiedad habilitoAnular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoAnular(String value) {
        this.habilitoAnular = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoCausa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoCausa() {
        return habilitoCausa;
    }

    /**
     * Define el valor de la propiedad habilitoCausa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoCausa(String value) {
        this.habilitoCausa = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoModoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoModoCalculo() {
        return habilitoModoCalculo;
    }

    /**
     * Define el valor de la propiedad habilitoModoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoModoCalculo(String value) {
        this.habilitoModoCalculo = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoSiniestro() {
        return habilitoSiniestro;
    }

    /**
     * Define el valor de la propiedad habilitoSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoSiniestro(String value) {
        this.habilitoSiniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeAviso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeAviso() {
        return mensajeAviso;
    }

    /**
     * Define el valor de la propiedad mensajeAviso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeAviso(String value) {
        this.mensajeAviso = value;
    }

    /**
     * Obtiene el valor de la propiedad montoPremioAnulacion.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoPremioAnulacion() {
        return montoPremioAnulacion;
    }

    /**
     * Define el valor de la propiedad montoPremioAnulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoPremioAnulacion(Double value) {
        this.montoPremioAnulacion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoPremioPoliza.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoPremioPoliza() {
        return montoPremioPoliza;
    }

    /**
     * Define el valor de la propiedad montoPremioPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoPremioPoliza(Double value) {
        this.montoPremioPoliza = value;
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
     * Obtiene el valor de la propiedad numSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSiniestro() {
        return numSiniestro;
    }

    /**
     * Define el valor de la propiedad numSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSiniestro(Integer value) {
        this.numSiniestro = value;
    }

}
