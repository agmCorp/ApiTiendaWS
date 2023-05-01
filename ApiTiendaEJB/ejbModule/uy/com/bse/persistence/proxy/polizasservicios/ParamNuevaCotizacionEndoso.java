
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramNuevaCotizacionEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramNuevaCotizacionEndoso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codDireccionCobro" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codDireccionEnvio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codOrigenEndoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaDesdeVigencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramNuevaCotizacionEndoso", propOrder = {
    "codDireccionCobro",
    "codDireccionEnvio",
    "codOrigenEndoso",
    "codProducto",
    "codRamo",
    "fechaDesdeVigencia",
    "numCertificado",
    "numPoliza"
})
public class ParamNuevaCotizacionEndoso
    extends ParamGenerico
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer codDireccionCobro;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer codDireccionEnvio;
    @XmlElement(required = true, nillable = true)
    protected String codOrigenEndoso;
    @XmlElement(required = true, nillable = true)
    protected String codProducto;
    @XmlElement(required = true, nillable = true)
    protected String codRamo;
    @XmlElement(required = true, nillable = true)
    protected String fechaDesdeVigencia;
    protected Integer numCertificado;
    protected String numPoliza;

    /**
     * Obtiene el valor de la propiedad codDireccionCobro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDireccionCobro() {
        return codDireccionCobro;
    }

    /**
     * Define el valor de la propiedad codDireccionCobro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDireccionCobro(Integer value) {
        this.codDireccionCobro = value;
    }

    /**
     * Obtiene el valor de la propiedad codDireccionEnvio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDireccionEnvio() {
        return codDireccionEnvio;
    }

    /**
     * Define el valor de la propiedad codDireccionEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDireccionEnvio(Integer value) {
        this.codDireccionEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrigenEndoso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodOrigenEndoso() {
        return codOrigenEndoso;
    }

    /**
     * Define el valor de la propiedad codOrigenEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodOrigenEndoso(String value) {
        this.codOrigenEndoso = value;
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

}
