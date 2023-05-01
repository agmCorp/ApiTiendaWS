
package uy.com.bse.persistence.proxy.objpersonal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para cotizacionTienda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cotizacionTienda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cuotas" type="{http://opersonal.ws.servicios.bse.com/}cuotaPagoTienda" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://opersonal.ws.servicios.bse.com/}monedaTienda" minOccurs="0"/>
 *         &lt;element name="nroCotizacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planCobertura" type="{http://opersonal.ws.servicios.bse.com/}planCoberturaTienda" minOccurs="0"/>
 *         &lt;element name="planPago" type="{http://opersonal.ws.servicios.bse.com/}planPagoTienda" minOccurs="0"/>
 *         &lt;element name="premio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="premioFacturar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="producto" type="{http://opersonal.ws.servicios.bse.com/}productoTienda" minOccurs="0"/>
 *         &lt;element name="productor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ramo" type="{http://opersonal.ws.servicios.bse.com/}ramoTienda" minOccurs="0"/>
 *         &lt;element name="sucursal" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "cotizacionTienda", propOrder = {
    "cuotas",
    "fechaDesde",
    "fechaHasta",
    "moneda",
    "nroCotizacion",
    "nroDocumento",
    "planCobertura",
    "planPago",
    "premio",
    "premioFacturar",
    "producto",
    "productor",
    "ramo",
    "sucursal",
    "tipoDocumento"
})
@XmlSeeAlso({
    CotizacionOPersonalTienda.class
})
public class CotizacionTienda {

    @XmlElement(nillable = true)
    protected List<CuotaPagoTienda> cuotas;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDesde;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHasta;
    protected MonedaTienda moneda;
    protected int nroCotizacion;
    protected String nroDocumento;
    protected PlanCoberturaTienda planCobertura;
    protected PlanPagoTienda planPago;
    protected double premio;
    protected double premioFacturar;
    protected ProductoTienda producto;
    protected int productor;
    protected RamoTienda ramo;
    protected int sucursal;
    protected String tipoDocumento;

    /**
     * Gets the value of the cuotas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuotas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuotas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CuotaPagoTienda }
     * 
     * 
     */
    public List<CuotaPagoTienda> getCuotas() {
        if (cuotas == null) {
            cuotas = new ArrayList<CuotaPagoTienda>();
        }
        return this.cuotas;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDesde(XMLGregorianCalendar value) {
        this.fechaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHasta(XMLGregorianCalendar value) {
        this.fechaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link MonedaTienda }
     *     
     */
    public MonedaTienda getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link MonedaTienda }
     *     
     */
    public void setMoneda(MonedaTienda value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad nroCotizacion.
     * 
     */
    public int getNroCotizacion() {
        return nroCotizacion;
    }

    /**
     * Define el valor de la propiedad nroCotizacion.
     * 
     */
    public void setNroCotizacion(int value) {
        this.nroCotizacion = value;
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
     * Obtiene el valor de la propiedad planCobertura.
     * 
     * @return
     *     possible object is
     *     {@link PlanCoberturaTienda }
     *     
     */
    public PlanCoberturaTienda getPlanCobertura() {
        return planCobertura;
    }

    /**
     * Define el valor de la propiedad planCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanCoberturaTienda }
     *     
     */
    public void setPlanCobertura(PlanCoberturaTienda value) {
        this.planCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad planPago.
     * 
     * @return
     *     possible object is
     *     {@link PlanPagoTienda }
     *     
     */
    public PlanPagoTienda getPlanPago() {
        return planPago;
    }

    /**
     * Define el valor de la propiedad planPago.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanPagoTienda }
     *     
     */
    public void setPlanPago(PlanPagoTienda value) {
        this.planPago = value;
    }

    /**
     * Obtiene el valor de la propiedad premio.
     * 
     */
    public double getPremio() {
        return premio;
    }

    /**
     * Define el valor de la propiedad premio.
     * 
     */
    public void setPremio(double value) {
        this.premio = value;
    }

    /**
     * Obtiene el valor de la propiedad premioFacturar.
     * 
     */
    public double getPremioFacturar() {
        return premioFacturar;
    }

    /**
     * Define el valor de la propiedad premioFacturar.
     * 
     */
    public void setPremioFacturar(double value) {
        this.premioFacturar = value;
    }

    /**
     * Obtiene el valor de la propiedad producto.
     * 
     * @return
     *     possible object is
     *     {@link ProductoTienda }
     *     
     */
    public ProductoTienda getProducto() {
        return producto;
    }

    /**
     * Define el valor de la propiedad producto.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoTienda }
     *     
     */
    public void setProducto(ProductoTienda value) {
        this.producto = value;
    }

    /**
     * Obtiene el valor de la propiedad productor.
     * 
     */
    public int getProductor() {
        return productor;
    }

    /**
     * Define el valor de la propiedad productor.
     * 
     */
    public void setProductor(int value) {
        this.productor = value;
    }

    /**
     * Obtiene el valor de la propiedad ramo.
     * 
     * @return
     *     possible object is
     *     {@link RamoTienda }
     *     
     */
    public RamoTienda getRamo() {
        return ramo;
    }

    /**
     * Define el valor de la propiedad ramo.
     * 
     * @param value
     *     allowed object is
     *     {@link RamoTienda }
     *     
     */
    public void setRamo(RamoTienda value) {
        this.ramo = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     */
    public int getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     */
    public void setSucursal(int value) {
        this.sucursal = value;
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
