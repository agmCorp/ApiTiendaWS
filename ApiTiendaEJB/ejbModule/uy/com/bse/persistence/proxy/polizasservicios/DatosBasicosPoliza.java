
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosBasicosPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosBasicosPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}encabezadoPoliza">
 *       &lt;sequence>
 *         &lt;element name="anulacionCorrida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codAreaComercial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codBroker" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codCompromiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMailDoc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codMailFact" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codProductor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codPromocion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRenovacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTipoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descAreaComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descBroker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMailDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMailFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descProductor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripPromocion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripRenovacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoFacturacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripVigencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enviarFacturaEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesdeVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHastaVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPolizaAnterior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPolizaSiguiente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numRefactEfectiva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosBasicosPoliza", propOrder = {
    "anulacionCorrida",
    "asegurado",
    "codAreaComercial",
    "codBroker",
    "codCompromiso",
    "codMailDoc",
    "codMailFact",
    "codMoneda",
    "codProducto",
    "codProductor",
    "codPromocion",
    "codRenovacion",
    "codTipoFacturacion",
    "codUsuario",
    "codVigencia",
    "codVigenciaTecnica",
    "descAreaComercial",
    "descBroker",
    "descMailDoc",
    "descMailFact",
    "descProductor",
    "descripMoneda",
    "descripProducto",
    "descripPromocion",
    "descripRenovacion",
    "descripTipoFacturacion",
    "descripUsuario",
    "descripVigencia",
    "descripVigenciaTecnica",
    "enviarFacturaEMail",
    "fechaDesde",
    "fechaDesdeVigenciaTecnica",
    "fechaHasta",
    "fechaHastaVigenciaTecnica",
    "numPolizaAnterior",
    "numPolizaSiguiente",
    "numRefactEfectiva"
})
@XmlSeeAlso({
    DatosPoliza.class
})
public class DatosBasicosPoliza
    extends EncabezadoPoliza
{

    protected String anulacionCorrida;
    protected String asegurado;
    protected Integer codAreaComercial;
    protected Integer codBroker;
    protected String codCompromiso;
    protected Integer codMailDoc;
    protected Integer codMailFact;
    protected String codMoneda;
    protected String codProducto;
    protected Integer codProductor;
    protected String codPromocion;
    protected String codRenovacion;
    protected String codTipoFacturacion;
    protected String codUsuario;
    protected String codVigencia;
    protected String codVigenciaTecnica;
    protected String descAreaComercial;
    protected String descBroker;
    protected String descMailDoc;
    protected String descMailFact;
    protected String descProductor;
    protected String descripMoneda;
    protected String descripProducto;
    protected String descripPromocion;
    protected String descripRenovacion;
    protected String descripTipoFacturacion;
    protected String descripUsuario;
    protected String descripVigencia;
    protected String descripVigenciaTecnica;
    protected String enviarFacturaEMail;
    protected String fechaDesde;
    protected String fechaDesdeVigenciaTecnica;
    protected String fechaHasta;
    protected String fechaHastaVigenciaTecnica;
    protected Integer numPolizaAnterior;
    protected Integer numPolizaSiguiente;
    protected Integer numRefactEfectiva;

    /**
     * Obtiene el valor de la propiedad anulacionCorrida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnulacionCorrida() {
        return anulacionCorrida;
    }

    /**
     * Define el valor de la propiedad anulacionCorrida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnulacionCorrida(String value) {
        this.anulacionCorrida = value;
    }

    /**
     * Obtiene el valor de la propiedad asegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsegurado() {
        return asegurado;
    }

    /**
     * Define el valor de la propiedad asegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsegurado(String value) {
        this.asegurado = value;
    }

    /**
     * Obtiene el valor de la propiedad codAreaComercial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAreaComercial() {
        return codAreaComercial;
    }

    /**
     * Define el valor de la propiedad codAreaComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAreaComercial(Integer value) {
        this.codAreaComercial = value;
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
     * Obtiene el valor de la propiedad codCompromiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCompromiso() {
        return codCompromiso;
    }

    /**
     * Define el valor de la propiedad codCompromiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCompromiso(String value) {
        this.codCompromiso = value;
    }

    /**
     * Obtiene el valor de la propiedad codMailDoc.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMailDoc() {
        return codMailDoc;
    }

    /**
     * Define el valor de la propiedad codMailDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMailDoc(Integer value) {
        this.codMailDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad codMailFact.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMailFact() {
        return codMailFact;
    }

    /**
     * Define el valor de la propiedad codMailFact.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMailFact(Integer value) {
        this.codMailFact = value;
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
     * Obtiene el valor de la propiedad codProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodProducto() {
        return codProducto;
    }

    /**
     * Define el valor de la propiedad codProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodProducto(String value) {
        this.codProducto = value;
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
     * Obtiene el valor de la propiedad codPromocion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPromocion() {
        return codPromocion;
    }

    /**
     * Define el valor de la propiedad codPromocion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPromocion(String value) {
        this.codPromocion = value;
    }

    /**
     * Obtiene el valor de la propiedad codRenovacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRenovacion() {
        return codRenovacion;
    }

    /**
     * Define el valor de la propiedad codRenovacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRenovacion(String value) {
        this.codRenovacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoFacturacion() {
        return codTipoFacturacion;
    }

    /**
     * Define el valor de la propiedad codTipoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoFacturacion(String value) {
        this.codTipoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUsuario() {
        return codUsuario;
    }

    /**
     * Define el valor de la propiedad codUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUsuario(String value) {
        this.codUsuario = value;
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
     * Obtiene el valor de la propiedad descAreaComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAreaComercial() {
        return descAreaComercial;
    }

    /**
     * Define el valor de la propiedad descAreaComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAreaComercial(String value) {
        this.descAreaComercial = value;
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
     * Obtiene el valor de la propiedad descMailDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMailDoc() {
        return descMailDoc;
    }

    /**
     * Define el valor de la propiedad descMailDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMailDoc(String value) {
        this.descMailDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad descMailFact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMailFact() {
        return descMailFact;
    }

    /**
     * Define el valor de la propiedad descMailFact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMailFact(String value) {
        this.descMailFact = value;
    }

    /**
     * Obtiene el valor de la propiedad descProductor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescProductor() {
        return descProductor;
    }

    /**
     * Define el valor de la propiedad descProductor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescProductor(String value) {
        this.descProductor = value;
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
     * Obtiene el valor de la propiedad descripProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripProducto() {
        return descripProducto;
    }

    /**
     * Define el valor de la propiedad descripProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripProducto(String value) {
        this.descripProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad descripPromocion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripPromocion() {
        return descripPromocion;
    }

    /**
     * Define el valor de la propiedad descripPromocion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripPromocion(String value) {
        this.descripPromocion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripRenovacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripRenovacion() {
        return descripRenovacion;
    }

    /**
     * Define el valor de la propiedad descripRenovacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripRenovacion(String value) {
        this.descripRenovacion = value;
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
     * Obtiene el valor de la propiedad descripUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripUsuario() {
        return descripUsuario;
    }

    /**
     * Define el valor de la propiedad descripUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripUsuario(String value) {
        this.descripUsuario = value;
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
     * Obtiene el valor de la propiedad enviarFacturaEMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnviarFacturaEMail() {
        return enviarFacturaEMail;
    }

    /**
     * Define el valor de la propiedad enviarFacturaEMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnviarFacturaEMail(String value) {
        this.enviarFacturaEMail = value;
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

    /**
     * Obtiene el valor de la propiedad numPolizaSiguiente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPolizaSiguiente() {
        return numPolizaSiguiente;
    }

    /**
     * Define el valor de la propiedad numPolizaSiguiente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPolizaSiguiente(Integer value) {
        this.numPolizaSiguiente = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefactEfectiva.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRefactEfectiva() {
        return numRefactEfectiva;
    }

    /**
     * Define el valor de la propiedad numRefactEfectiva.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRefactEfectiva(Integer value) {
        this.numRefactEfectiva = value;
    }

}
