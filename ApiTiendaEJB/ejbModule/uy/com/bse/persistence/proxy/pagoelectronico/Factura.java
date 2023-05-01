
package uy.com.bse.persistence.proxy.pagoelectronico;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="factura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cb1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cb2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoAdhesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consumoFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuotas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datosBien" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionRamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="facturaCFE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaFactura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaVto1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaVto2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaVto3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="importeGravado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="importeGravadoOriginal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="importePagar" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="importePagarOriginal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroFactura" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pagable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagableObs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="poliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ramo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factura", propOrder = {
    "apellidos",
    "cb1",
    "cb2",
    "certificado",
    "codigoAdhesion",
    "consumoFinal",
    "cuotas",
    "datosBien",
    "descripcionProducto",
    "descripcionRamo",
    "documentId",
    "facturaCFE",
    "fechaFactura",
    "fechaVto1",
    "fechaVto2",
    "fechaVto3",
    "importeGravado",
    "importeGravadoOriginal",
    "importePagar",
    "importePagarOriginal",
    "moneda",
    "monedaOriginal",
    "nombres",
    "nroDocumento",
    "numeroFactura",
    "pagable",
    "pagableObs",
    "poliza",
    "producto",
    "ramo",
    "tipoDocumento"
})
public class Factura {

    protected String apellidos;
    protected String cb1;
    protected String cb2;
    protected Integer certificado;
    protected String codigoAdhesion;
    protected String consumoFinal;
    protected String cuotas;
    protected String datosBien;
    protected String descripcionProducto;
    protected String descripcionRamo;
    protected Long documentId;
    protected String facturaCFE;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFactura;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVto1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVto2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVto3;
    protected Double importeGravado;
    protected Double importeGravadoOriginal;
    protected Double importePagar;
    protected Double importePagarOriginal;
    protected String moneda;
    protected String monedaOriginal;
    protected String nombres;
    protected String nroDocumento;
    protected Long numeroFactura;
    protected String pagable;
    protected String pagableObs;
    protected Integer poliza;
    protected String producto;
    protected Integer ramo;
    protected String tipoDocumento;

    /**
     * Obtiene el valor de la propiedad apellidos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Define el valor de la propiedad apellidos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidos(String value) {
        this.apellidos = value;
    }

    /**
     * Obtiene el valor de la propiedad cb1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCb1() {
        return cb1;
    }

    /**
     * Define el valor de la propiedad cb1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCb1(String value) {
        this.cb1 = value;
    }

    /**
     * Obtiene el valor de la propiedad cb2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCb2() {
        return cb2;
    }

    /**
     * Define el valor de la propiedad cb2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCb2(String value) {
        this.cb2 = value;
    }

    /**
     * Obtiene el valor de la propiedad certificado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCertificado() {
        return certificado;
    }

    /**
     * Define el valor de la propiedad certificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCertificado(Integer value) {
        this.certificado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAdhesion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAdhesion() {
        return codigoAdhesion;
    }

    /**
     * Define el valor de la propiedad codigoAdhesion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAdhesion(String value) {
        this.codigoAdhesion = value;
    }

    /**
     * Obtiene el valor de la propiedad consumoFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumoFinal() {
        return consumoFinal;
    }

    /**
     * Define el valor de la propiedad consumoFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumoFinal(String value) {
        this.consumoFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotas() {
        return cuotas;
    }

    /**
     * Define el valor de la propiedad cuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotas(String value) {
        this.cuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad datosBien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosBien() {
        return datosBien;
    }

    /**
     * Define el valor de la propiedad datosBien.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosBien(String value) {
        this.datosBien = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * Define el valor de la propiedad descripcionProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionProducto(String value) {
        this.descripcionProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRamo() {
        return descripcionRamo;
    }

    /**
     * Define el valor de la propiedad descripcionRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRamo(String value) {
        this.descripcionRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad documentId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentId() {
        return documentId;
    }

    /**
     * Define el valor de la propiedad documentId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentId(Long value) {
        this.documentId = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaCFE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturaCFE() {
        return facturaCFE;
    }

    /**
     * Define el valor de la propiedad facturaCFE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturaCFE(String value) {
        this.facturaCFE = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFactura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFactura() {
        return fechaFactura;
    }

    /**
     * Define el valor de la propiedad fechaFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFactura(XMLGregorianCalendar value) {
        this.fechaFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVto1.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVto1() {
        return fechaVto1;
    }

    /**
     * Define el valor de la propiedad fechaVto1.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVto1(XMLGregorianCalendar value) {
        this.fechaVto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVto2.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVto2() {
        return fechaVto2;
    }

    /**
     * Define el valor de la propiedad fechaVto2.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVto2(XMLGregorianCalendar value) {
        this.fechaVto2 = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVto3.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVto3() {
        return fechaVto3;
    }

    /**
     * Define el valor de la propiedad fechaVto3.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVto3(XMLGregorianCalendar value) {
        this.fechaVto3 = value;
    }

    /**
     * Obtiene el valor de la propiedad importeGravado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteGravado() {
        return importeGravado;
    }

    /**
     * Define el valor de la propiedad importeGravado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteGravado(Double value) {
        this.importeGravado = value;
    }

    /**
     * Obtiene el valor de la propiedad importeGravadoOriginal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteGravadoOriginal() {
        return importeGravadoOriginal;
    }

    /**
     * Define el valor de la propiedad importeGravadoOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteGravadoOriginal(Double value) {
        this.importeGravadoOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad importePagar.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImportePagar() {
        return importePagar;
    }

    /**
     * Define el valor de la propiedad importePagar.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImportePagar(Double value) {
        this.importePagar = value;
    }

    /**
     * Obtiene el valor de la propiedad importePagarOriginal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImportePagarOriginal() {
        return importePagarOriginal;
    }

    /**
     * Define el valor de la propiedad importePagarOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImportePagarOriginal(Double value) {
        this.importePagarOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneda(String value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaOriginal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaOriginal() {
        return monedaOriginal;
    }

    /**
     * Define el valor de la propiedad monedaOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaOriginal(String value) {
        this.monedaOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad nroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocumento() {
        return nroDocumento;
    }

    /**
     * Define el valor de la propiedad nroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocumento(String value) {
        this.nroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroFactura.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Define el valor de la propiedad numeroFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroFactura(Long value) {
        this.numeroFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad pagable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagable() {
        return pagable;
    }

    /**
     * Define el valor de la propiedad pagable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagable(String value) {
        this.pagable = value;
    }

    /**
     * Obtiene el valor de la propiedad pagableObs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagableObs() {
        return pagableObs;
    }

    /**
     * Define el valor de la propiedad pagableObs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagableObs(String value) {
        this.pagableObs = value;
    }

    /**
     * Obtiene el valor de la propiedad poliza.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoliza() {
        return poliza;
    }

    /**
     * Define el valor de la propiedad poliza.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoliza(Integer value) {
        this.poliza = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProducto(String value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad ramo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRamo() {
        return ramo;
    }

    /**
     * Define el valor de la propiedad ramo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRamo(Integer value) {
        this.ramo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

}
