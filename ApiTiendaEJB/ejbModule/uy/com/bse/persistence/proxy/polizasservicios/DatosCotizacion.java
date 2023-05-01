
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosCotizacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosCotizacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}datosBasicosCotizacion">
 *       &lt;sequence>
 *         &lt;element name="codAreaComercial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codBanco" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codMailDoc" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codMailFact" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codMotivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTipoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descAreaComercial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMailDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descMailFact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descRamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descTipoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enviarFacturaEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esUnipersonal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facturaConRut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facturacionCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facturacionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frecTecnicaCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frecTecnicaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoVigenciaTecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medioPagoCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="medioPagoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nivelCodBroker" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nivelDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelDescBroker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nuDomBancario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numCotizacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numDireCobro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numDireEnvio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origenCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origenDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origenEndoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origenEndosoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planPagoCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planPagoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premioInformado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="usuarioCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vigenciaCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vigenciaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vigenciaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vigenciaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vigenciaTecnicaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vigenciaTecnicaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosCotizacion", propOrder = {
    "codAreaComercial",
    "codBanco",
    "codMailDoc",
    "codMailFact",
    "codMotivo",
    "codProducto",
    "codRamo",
    "codTipo",
    "codTipoCalculo",
    "descAreaComercial",
    "descBanco",
    "descMailDoc",
    "descMailFact",
    "descProducto",
    "descRamo",
    "descTipo",
    "descTipoCalculo",
    "enviarFacturaEmail",
    "esUnipersonal",
    "estado",
    "facturaConRut",
    "facturacionCod",
    "facturacionDesc",
    "frecTecnicaCod",
    "frecTecnicaDesc",
    "habilitoVigenciaTecnica",
    "medioPagoCod",
    "medioPagoDesc",
    "nivelCod",
    "nivelCodBroker",
    "nivelDesc",
    "nivelDescBroker",
    "nuDomBancario",
    "numCertificado",
    "numCotizacion",
    "numDireCobro",
    "numDireEnvio",
    "numPoliza",
    "numTarjeta",
    "origenCod",
    "origenDesc",
    "origenEndoso",
    "origenEndosoDesc",
    "planPagoCod",
    "planPagoDesc",
    "premioInformado",
    "sucursal",
    "usuarioCod",
    "usuarioDesc",
    "vigenciaCod",
    "vigenciaDesc",
    "vigenciaDesde",
    "vigenciaHasta",
    "vigenciaTecnicaDesde",
    "vigenciaTecnicaHasta"
})
@XmlSeeAlso({
    CotizacionPoliza.class
})
public class DatosCotizacion
    extends DatosBasicosCotizacion
{

    protected Integer codAreaComercial;
    protected Integer codBanco;
    protected Integer codMailDoc;
    protected Integer codMailFact;
    protected Integer codMotivo;
    protected String codProducto;
    protected Integer codRamo;
    protected String codTipo;
    protected String codTipoCalculo;
    protected String descAreaComercial;
    protected String descBanco;
    protected String descMailDoc;
    protected String descMailFact;
    protected String descProducto;
    protected String descRamo;
    protected String descTipo;
    protected String descTipoCalculo;
    protected String enviarFacturaEmail;
    protected String esUnipersonal;
    protected String estado;
    protected String facturaConRut;
    protected String facturacionCod;
    protected String facturacionDesc;
    protected String frecTecnicaCod;
    protected String frecTecnicaDesc;
    protected String habilitoVigenciaTecnica;
    protected Integer medioPagoCod;
    protected String medioPagoDesc;
    protected Integer nivelCod;
    protected Integer nivelCodBroker;
    protected String nivelDesc;
    protected String nivelDescBroker;
    protected Integer nuDomBancario;
    protected Integer numCertificado;
    protected Integer numCotizacion;
    protected Integer numDireCobro;
    protected Integer numDireEnvio;
    protected Integer numPoliza;
    protected String numTarjeta;
    protected String origenCod;
    protected String origenDesc;
    protected String origenEndoso;
    protected String origenEndosoDesc;
    protected String planPagoCod;
    protected String planPagoDesc;
    protected Double premioInformado;
    protected Integer sucursal;
    protected String usuarioCod;
    protected String usuarioDesc;
    protected String vigenciaCod;
    protected String vigenciaDesc;
    protected String vigenciaDesde;
    protected String vigenciaHasta;
    protected String vigenciaTecnicaDesde;
    protected String vigenciaTecnicaHasta;

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
     * Obtiene el valor de la propiedad codMotivo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMotivo() {
        return codMotivo;
    }

    /**
     * Define el valor de la propiedad codMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMotivo(Integer value) {
        this.codMotivo = value;
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
     * Obtiene el valor de la propiedad codTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipo() {
        return codTipo;
    }

    /**
     * Define el valor de la propiedad codTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipo(String value) {
        this.codTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoCalculo() {
        return codTipoCalculo;
    }

    /**
     * Define el valor de la propiedad codTipoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoCalculo(String value) {
        this.codTipoCalculo = value;
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
     * Obtiene el valor de la propiedad descBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescBanco() {
        return descBanco;
    }

    /**
     * Define el valor de la propiedad descBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescBanco(String value) {
        this.descBanco = value;
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
     * Obtiene el valor de la propiedad descProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescProducto() {
        return descProducto;
    }

    /**
     * Define el valor de la propiedad descProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescProducto(String value) {
        this.descProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad descRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRamo() {
        return descRamo;
    }

    /**
     * Define el valor de la propiedad descRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRamo(String value) {
        this.descRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipo() {
        return descTipo;
    }

    /**
     * Define el valor de la propiedad descTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipo(String value) {
        this.descTipo = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoCalculo() {
        return descTipoCalculo;
    }

    /**
     * Define el valor de la propiedad descTipoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoCalculo(String value) {
        this.descTipoCalculo = value;
    }

    /**
     * Obtiene el valor de la propiedad enviarFacturaEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnviarFacturaEmail() {
        return enviarFacturaEmail;
    }

    /**
     * Define el valor de la propiedad enviarFacturaEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnviarFacturaEmail(String value) {
        this.enviarFacturaEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad esUnipersonal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsUnipersonal() {
        return esUnipersonal;
    }

    /**
     * Define el valor de la propiedad esUnipersonal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsUnipersonal(String value) {
        this.esUnipersonal = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaConRut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturaConRut() {
        return facturaConRut;
    }

    /**
     * Define el valor de la propiedad facturaConRut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturaConRut(String value) {
        this.facturaConRut = value;
    }

    /**
     * Obtiene el valor de la propiedad facturacionCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturacionCod() {
        return facturacionCod;
    }

    /**
     * Define el valor de la propiedad facturacionCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturacionCod(String value) {
        this.facturacionCod = value;
    }

    /**
     * Obtiene el valor de la propiedad facturacionDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturacionDesc() {
        return facturacionDesc;
    }

    /**
     * Define el valor de la propiedad facturacionDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturacionDesc(String value) {
        this.facturacionDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad frecTecnicaCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrecTecnicaCod() {
        return frecTecnicaCod;
    }

    /**
     * Define el valor de la propiedad frecTecnicaCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrecTecnicaCod(String value) {
        this.frecTecnicaCod = value;
    }

    /**
     * Obtiene el valor de la propiedad frecTecnicaDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrecTecnicaDesc() {
        return frecTecnicaDesc;
    }

    /**
     * Define el valor de la propiedad frecTecnicaDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrecTecnicaDesc(String value) {
        this.frecTecnicaDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoVigenciaTecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoVigenciaTecnica() {
        return habilitoVigenciaTecnica;
    }

    /**
     * Define el valor de la propiedad habilitoVigenciaTecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoVigenciaTecnica(String value) {
        this.habilitoVigenciaTecnica = value;
    }

    /**
     * Obtiene el valor de la propiedad medioPagoCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMedioPagoCod() {
        return medioPagoCod;
    }

    /**
     * Define el valor de la propiedad medioPagoCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMedioPagoCod(Integer value) {
        this.medioPagoCod = value;
    }

    /**
     * Obtiene el valor de la propiedad medioPagoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedioPagoDesc() {
        return medioPagoDesc;
    }

    /**
     * Define el valor de la propiedad medioPagoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedioPagoDesc(String value) {
        this.medioPagoDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelCod() {
        return nivelCod;
    }

    /**
     * Define el valor de la propiedad nivelCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelCod(Integer value) {
        this.nivelCod = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelCodBroker.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelCodBroker() {
        return nivelCodBroker;
    }

    /**
     * Define el valor de la propiedad nivelCodBroker.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelCodBroker(Integer value) {
        this.nivelCodBroker = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelDesc() {
        return nivelDesc;
    }

    /**
     * Define el valor de la propiedad nivelDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelDesc(String value) {
        this.nivelDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelDescBroker.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelDescBroker() {
        return nivelDescBroker;
    }

    /**
     * Define el valor de la propiedad nivelDescBroker.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelDescBroker(String value) {
        this.nivelDescBroker = value;
    }

    /**
     * Obtiene el valor de la propiedad nuDomBancario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNuDomBancario() {
        return nuDomBancario;
    }

    /**
     * Define el valor de la propiedad nuDomBancario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNuDomBancario(Integer value) {
        this.nuDomBancario = value;
    }

    /**
     * Obtiene el valor de la propiedad numCertificado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCertificado() {
        return numCertificado;
    }

    /**
     * Define el valor de la propiedad numCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCertificado(Integer value) {
        this.numCertificado = value;
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
     * Obtiene el valor de la propiedad numDireCobro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDireCobro() {
        return numDireCobro;
    }

    /**
     * Define el valor de la propiedad numDireCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDireCobro(Integer value) {
        this.numDireCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad numDireEnvio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDireEnvio() {
        return numDireEnvio;
    }

    /**
     * Define el valor de la propiedad numDireEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDireEnvio(Integer value) {
        this.numDireEnvio = value;
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
     * Obtiene el valor de la propiedad numTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Define el valor de la propiedad numTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTarjeta(String value) {
        this.numTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad origenCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenCod() {
        return origenCod;
    }

    /**
     * Define el valor de la propiedad origenCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenCod(String value) {
        this.origenCod = value;
    }

    /**
     * Obtiene el valor de la propiedad origenDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenDesc() {
        return origenDesc;
    }

    /**
     * Define el valor de la propiedad origenDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenDesc(String value) {
        this.origenDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad origenEndoso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenEndoso() {
        return origenEndoso;
    }

    /**
     * Define el valor de la propiedad origenEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenEndoso(String value) {
        this.origenEndoso = value;
    }

    /**
     * Obtiene el valor de la propiedad origenEndosoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigenEndosoDesc() {
        return origenEndosoDesc;
    }

    /**
     * Define el valor de la propiedad origenEndosoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigenEndosoDesc(String value) {
        this.origenEndosoDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad planPagoCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanPagoCod() {
        return planPagoCod;
    }

    /**
     * Define el valor de la propiedad planPagoCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanPagoCod(String value) {
        this.planPagoCod = value;
    }

    /**
     * Obtiene el valor de la propiedad planPagoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanPagoDesc() {
        return planPagoDesc;
    }

    /**
     * Define el valor de la propiedad planPagoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanPagoDesc(String value) {
        this.planPagoDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad premioInformado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPremioInformado() {
        return premioInformado;
    }

    /**
     * Define el valor de la propiedad premioInformado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPremioInformado(Double value) {
        this.premioInformado = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSucursal(Integer value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioCod() {
        return usuarioCod;
    }

    /**
     * Define el valor de la propiedad usuarioCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioCod(String value) {
        this.usuarioCod = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioDesc() {
        return usuarioDesc;
    }

    /**
     * Define el valor de la propiedad usuarioDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioDesc(String value) {
        this.usuarioDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaCod() {
        return vigenciaCod;
    }

    /**
     * Define el valor de la propiedad vigenciaCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaCod(String value) {
        this.vigenciaCod = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaDesc() {
        return vigenciaDesc;
    }

    /**
     * Define el valor de la propiedad vigenciaDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaDesc(String value) {
        this.vigenciaDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaDesde() {
        return vigenciaDesde;
    }

    /**
     * Define el valor de la propiedad vigenciaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaDesde(String value) {
        this.vigenciaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaHasta() {
        return vigenciaHasta;
    }

    /**
     * Define el valor de la propiedad vigenciaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaHasta(String value) {
        this.vigenciaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaTecnicaDesde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaTecnicaDesde() {
        return vigenciaTecnicaDesde;
    }

    /**
     * Define el valor de la propiedad vigenciaTecnicaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaTecnicaDesde(String value) {
        this.vigenciaTecnicaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad vigenciaTecnicaHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaTecnicaHasta() {
        return vigenciaTecnicaHasta;
    }

    /**
     * Define el valor de la propiedad vigenciaTecnicaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaTecnicaHasta(String value) {
        this.vigenciaTecnicaHasta = value;
    }

}
