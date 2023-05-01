
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramValidarDetectarEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramValidarDetectarEndoso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numPoliza" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numRamo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoEndoso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramValidarDetectarEndoso", propOrder = {
    "fechaDesde",
    "numCertificado",
    "numPoliza",
    "numRamo",
    "tipoEndoso"
})
public class ParamValidarDetectarEndoso
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String fechaDesde;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numCertificado;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numPoliza;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numRamo;
    @XmlElement(required = true, nillable = true)
    protected String tipoEndoso;

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
     * Obtiene el valor de la propiedad numRamo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRamo() {
        return numRamo;
    }

    /**
     * Define el valor de la propiedad numRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRamo(Integer value) {
        this.numRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEndoso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEndoso() {
        return tipoEndoso;
    }

    /**
     * Define el valor de la propiedad tipoEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEndoso(String value) {
        this.tipoEndoso = value;
    }

}
