
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramObtenerPolizasCabezal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramObtenerPolizasCabezal">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="asegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codDatoParametrico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codProductor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmisionHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tieneNotaCambioProductor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ultimoEndoso" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="valorDatoParametrico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vigentes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramObtenerPolizasCabezal", propOrder = {
    "asegurado",
    "cliente",
    "codCliente",
    "codDatoParametrico",
    "codProducto",
    "codProductor",
    "codRamo",
    "fechaDesde",
    "fechaEmision",
    "fechaEmisionHasta",
    "fechaHasta",
    "numPoliza",
    "orden",
    "tieneNotaCambioProductor",
    "ultimoEndoso",
    "valorDatoParametrico",
    "vigentes"
})
public class ParamObtenerPolizasCabezal
    extends ParamGenerico
{

    protected String asegurado;
    protected String cliente;
    protected String codCliente;
    protected Integer codDatoParametrico;
    protected String codProducto;
    protected Integer codProductor;
    protected String codRamo;
    protected String fechaDesde;
    protected String fechaEmision;
    protected String fechaEmisionHasta;
    protected String fechaHasta;
    protected String numPoliza;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer orden;
    protected Boolean tieneNotaCambioProductor;
    protected Boolean ultimoEndoso;
    protected String valorDatoParametrico;
    protected String vigentes;

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
     * Obtiene el valor de la propiedad codDatoParametrico.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDatoParametrico() {
        return codDatoParametrico;
    }

    /**
     * Define el valor de la propiedad codDatoParametrico.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDatoParametrico(Integer value) {
        this.codDatoParametrico = value;
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
     * Obtiene el valor de la propiedad codRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRamo() {
        return codRamo;
    }

    /**
     * Define el valor de la propiedad codRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRamo(String value) {
        this.codRamo = value;
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
     * Obtiene el valor de la propiedad fechaEmisionHasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmisionHasta() {
        return fechaEmisionHasta;
    }

    /**
     * Define el valor de la propiedad fechaEmisionHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmisionHasta(String value) {
        this.fechaEmisionHasta = value;
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
     * Obtiene el valor de la propiedad numPoliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPoliza() {
        return numPoliza;
    }

    /**
     * Define el valor de la propiedad numPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPoliza(String value) {
        this.numPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrden(Integer value) {
        this.orden = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneNotaCambioProductor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTieneNotaCambioProductor() {
        return tieneNotaCambioProductor;
    }

    /**
     * Define el valor de la propiedad tieneNotaCambioProductor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTieneNotaCambioProductor(Boolean value) {
        this.tieneNotaCambioProductor = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimoEndoso.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUltimoEndoso() {
        return ultimoEndoso;
    }

    /**
     * Define el valor de la propiedad ultimoEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUltimoEndoso(Boolean value) {
        this.ultimoEndoso = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDatoParametrico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDatoParametrico() {
        return valorDatoParametrico;
    }

    /**
     * Define el valor de la propiedad valorDatoParametrico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDatoParametrico(String value) {
        this.valorDatoParametrico = value;
    }

    /**
     * Obtiene el valor de la propiedad vigentes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigentes() {
        return vigentes;
    }

    /**
     * Define el valor de la propiedad vigentes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigentes(String value) {
        this.vigentes = value;
    }

}
