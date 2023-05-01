
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cotizacionPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cotizacionPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}datosCotizacion">
 *       &lt;sequence>
 *         &lt;element name="codConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripConvenio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMotivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaCotizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreAsegurado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="porcentajePremioInformado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotizacionPoliza", propOrder = {
    "codConvenio",
    "codSucursal",
    "descripConvenio",
    "descripMotivo",
    "descripProducto",
    "fechaCotizacion",
    "nombreAsegurado",
    "numEndoso",
    "porcentajePremioInformado",
    "tarjeta"
})
public class CotizacionPoliza
    extends DatosCotizacion
{

    protected String codConvenio;
    protected Integer codSucursal;
    protected String descripConvenio;
    protected String descripMotivo;
    protected String descripProducto;
    protected String fechaCotizacion;
    protected String nombreAsegurado;
    protected Integer numEndoso;
    protected Integer porcentajePremioInformado;
    protected String tarjeta;

    /**
     * Obtiene el valor de la propiedad codConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConvenio() {
        return codConvenio;
    }

    /**
     * Define el valor de la propiedad codConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConvenio(String value) {
        this.codConvenio = value;
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
     * Obtiene el valor de la propiedad descripConvenio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripConvenio() {
        return descripConvenio;
    }

    /**
     * Define el valor de la propiedad descripConvenio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripConvenio(String value) {
        this.descripConvenio = value;
    }

    /**
     * Obtiene el valor de la propiedad descripMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripMotivo() {
        return descripMotivo;
    }

    /**
     * Define el valor de la propiedad descripMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripMotivo(String value) {
        this.descripMotivo = value;
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
     * Obtiene el valor de la propiedad fechaCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCotizacion() {
        return fechaCotizacion;
    }

    /**
     * Define el valor de la propiedad fechaCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCotizacion(String value) {
        this.fechaCotizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAsegurado() {
        return nombreAsegurado;
    }

    /**
     * Define el valor de la propiedad nombreAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAsegurado(String value) {
        this.nombreAsegurado = value;
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
     * Obtiene el valor de la propiedad porcentajePremioInformado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPorcentajePremioInformado() {
        return porcentajePremioInformado;
    }

    /**
     * Define el valor de la propiedad porcentajePremioInformado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPorcentajePremioInformado(Integer value) {
        this.porcentajePremioInformado = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjeta() {
        return tarjeta;
    }

    /**
     * Define el valor de la propiedad tarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjeta(String value) {
        this.tarjeta = value;
    }

}
