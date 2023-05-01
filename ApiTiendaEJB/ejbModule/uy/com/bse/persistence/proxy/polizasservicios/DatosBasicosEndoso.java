
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosBasicosEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosBasicosEndoso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codMotivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMotivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCotizacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numEndoso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numRefacturacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosBasicosEndoso", propOrder = {
    "codMotivo",
    "codPlanCobertura",
    "descripMotivo",
    "descripPlanCobertura",
    "numCotizacion",
    "numEndoso",
    "numRefacturacion"
})
@XmlSeeAlso({
    Endoso.class
})
public class DatosBasicosEndoso {

    protected Integer codMotivo;
    protected String codPlanCobertura;
    protected String descripMotivo;
    protected String descripPlanCobertura;
    protected Integer numCotizacion;
    protected Integer numEndoso;
    protected Integer numRefacturacion;

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
     * Obtiene el valor de la propiedad codPlanCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPlanCobertura() {
        return codPlanCobertura;
    }

    /**
     * Define el valor de la propiedad codPlanCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPlanCobertura(String value) {
        this.codPlanCobertura = value;
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
     * Obtiene el valor de la propiedad descripPlanCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripPlanCobertura() {
        return descripPlanCobertura;
    }

    /**
     * Define el valor de la propiedad descripPlanCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripPlanCobertura(String value) {
        this.descripPlanCobertura = value;
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
     * Obtiene el valor de la propiedad numRefacturacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRefacturacion() {
        return numRefacturacion;
    }

    /**
     * Define el valor de la propiedad numRefacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRefacturacion(Integer value) {
        this.numRefacturacion = value;
    }

}
