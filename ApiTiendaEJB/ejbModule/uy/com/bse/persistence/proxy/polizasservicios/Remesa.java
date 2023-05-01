
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para remesa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="remesa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codBroker" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCobrador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codCompania" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMedioPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrigenTipo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codProductor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descBroker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripCobrador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMedioPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoRemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montoConversionSaldo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoConversionTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoOriginal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoSaldo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="montoTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numIngreso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numRemesa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numSecuencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoRemesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remesa", propOrder = {
    "cliente",
    "codBroker",
    "codCliente",
    "codCobrador",
    "codCompania",
    "codEstado",
    "codMedioPago",
    "codMoneda",
    "codNacionalidad",
    "codOrigen",
    "codOrigenTipo",
    "codProductor",
    "codSucursal",
    "codUsuario",
    "descBroker",
    "descripCobrador",
    "descripEstado",
    "descripMedioPago",
    "descripMoneda",
    "descripOrigen",
    "descripSucursal",
    "descripTipoRemesa",
    "documentId",
    "fechaActualizacion",
    "fechaIngreso",
    "montoConversionSaldo",
    "montoConversionTotal",
    "montoOriginal",
    "montoSaldo",
    "montoTotal",
    "numEndoso",
    "numIngreso",
    "numRemesa",
    "numSecuencia",
    "origen",
    "productor",
    "tipoRemesa",
    "usuario"
})
public class Remesa {

    protected String cliente;
    protected Integer codBroker;
    protected String codCliente;
    protected Integer codCobrador;
    protected Integer codCompania;
    protected String codEstado;
    protected Integer codMedioPago;
    protected String codMoneda;
    protected String codNacionalidad;
    protected String codOrigen;
    protected Integer codOrigenTipo;
    protected Integer codProductor;
    protected Integer codSucursal;
    protected String codUsuario;
    protected String descBroker;
    protected String descripCobrador;
    protected String descripEstado;
    protected String descripMedioPago;
    protected String descripMoneda;
    protected String descripOrigen;
    protected String descripSucursal;
    protected String descripTipoRemesa;
    protected String documentId;
    protected String fechaActualizacion;
    protected String fechaIngreso;
    protected Double montoConversionSaldo;
    protected Double montoConversionTotal;
    protected Double montoOriginal;
    protected Double montoSaldo;
    protected Double montoTotal;
    protected Integer numEndoso;
    protected Integer numIngreso;
    protected Integer numRemesa;
    protected Integer numSecuencia;
    protected String origen;
    protected String productor;
    protected String tipoRemesa;
    protected String usuario;

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
     * Obtiene el valor de la propiedad codCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Define el valor de la propiedad codCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCliente(String value) {
        this.codCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codCobrador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodCobrador() {
        return codCobrador;
    }

    /**
     * Define el valor de la propiedad codCobrador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodCobrador(Integer value) {
        this.codCobrador = value;
    }

    /**
     * Obtiene el valor de la propiedad codCompania.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodCompania() {
        return codCompania;
    }

    /**
     * Define el valor de la propiedad codCompania.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodCompania(Integer value) {
        this.codCompania = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstado() {
        return codEstado;
    }

    /**
     * Define el valor de la propiedad codEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstado(String value) {
        this.codEstado = value;
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
     * Obtiene el valor de la propiedad codOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrigen() {
        return codOrigen;
    }

    /**
     * Define el valor de la propiedad codOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrigen(String value) {
        this.codOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrigenTipo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodOrigenTipo() {
        return codOrigenTipo;
    }

    /**
     * Define el valor de la propiedad codOrigenTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodOrigenTipo(Integer value) {
        this.codOrigenTipo = value;
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
     * Obtiene el valor de la propiedad descripCobrador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripCobrador() {
        return descripCobrador;
    }

    /**
     * Define el valor de la propiedad descripCobrador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripCobrador(String value) {
        this.descripCobrador = value;
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
     * Obtiene el valor de la propiedad descripMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripMedioPago() {
        return descripMedioPago;
    }

    /**
     * Define el valor de la propiedad descripMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripMedioPago(String value) {
        this.descripMedioPago = value;
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
     * Obtiene el valor de la propiedad descripOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripOrigen() {
        return descripOrigen;
    }

    /**
     * Define el valor de la propiedad descripOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripOrigen(String value) {
        this.descripOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad descripSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripSucursal() {
        return descripSucursal;
    }

    /**
     * Define el valor de la propiedad descripSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripSucursal(String value) {
        this.descripSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTipoRemesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTipoRemesa() {
        return descripTipoRemesa;
    }

    /**
     * Define el valor de la propiedad descripTipoRemesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTipoRemesa(String value) {
        this.descripTipoRemesa = value;
    }

    /**
     * Obtiene el valor de la propiedad documentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Define el valor de la propiedad documentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaActualizacion(String value) {
        this.fechaActualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Define el valor de la propiedad fechaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIngreso(String value) {
        this.fechaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad montoConversionSaldo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoConversionSaldo() {
        return montoConversionSaldo;
    }

    /**
     * Define el valor de la propiedad montoConversionSaldo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoConversionSaldo(Double value) {
        this.montoConversionSaldo = value;
    }

    /**
     * Obtiene el valor de la propiedad montoConversionTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoConversionTotal() {
        return montoConversionTotal;
    }

    /**
     * Define el valor de la propiedad montoConversionTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoConversionTotal(Double value) {
        this.montoConversionTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad montoOriginal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoOriginal() {
        return montoOriginal;
    }

    /**
     * Define el valor de la propiedad montoOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoOriginal(Double value) {
        this.montoOriginal = value;
    }

    /**
     * Obtiene el valor de la propiedad montoSaldo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontoSaldo() {
        return montoSaldo;
    }

    /**
     * Define el valor de la propiedad montoSaldo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontoSaldo(Double value) {
        this.montoSaldo = value;
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
     * Obtiene el valor de la propiedad numIngreso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumIngreso() {
        return numIngreso;
    }

    /**
     * Define el valor de la propiedad numIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumIngreso(Integer value) {
        this.numIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad numRemesa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRemesa() {
        return numRemesa;
    }

    /**
     * Define el valor de la propiedad numRemesa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRemesa(Integer value) {
        this.numRemesa = value;
    }

    /**
     * Obtiene el valor de la propiedad numSecuencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSecuencia() {
        return numSecuencia;
    }

    /**
     * Define el valor de la propiedad numSecuencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSecuencia(Integer value) {
        this.numSecuencia = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad productor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductor() {
        return productor;
    }

    /**
     * Define el valor de la propiedad productor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductor(String value) {
        this.productor = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRemesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRemesa() {
        return tipoRemesa;
    }

    /**
     * Define el valor de la propiedad tipoRemesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRemesa(String value) {
        this.tipoRemesa = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
