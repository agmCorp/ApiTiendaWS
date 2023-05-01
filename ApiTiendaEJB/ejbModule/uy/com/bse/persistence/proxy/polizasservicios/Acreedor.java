
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para acreedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="acreedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAcreedor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codObjeto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codTipoAcreedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripAcreedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoAcreedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaExclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="porcentajeParticipacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acreedor", propOrder = {
    "codAcreedor",
    "codObjeto",
    "codTipoAcreedor",
    "descripAcreedor",
    "descripObjeto",
    "descripTipoAcreedor",
    "fechaExclusion",
    "porcentajeParticipacion"
})
public class Acreedor {

    protected Integer codAcreedor;
    protected Integer codObjeto;
    protected String codTipoAcreedor;
    protected String descripAcreedor;
    protected String descripObjeto;
    protected String descripTipoAcreedor;
    protected String fechaExclusion;
    protected Integer porcentajeParticipacion;

    /**
     * Obtiene el valor de la propiedad codAcreedor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAcreedor() {
        return codAcreedor;
    }

    /**
     * Define el valor de la propiedad codAcreedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAcreedor(Integer value) {
        this.codAcreedor = value;
    }

    /**
     * Obtiene el valor de la propiedad codObjeto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodObjeto() {
        return codObjeto;
    }

    /**
     * Define el valor de la propiedad codObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodObjeto(Integer value) {
        this.codObjeto = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoAcreedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoAcreedor() {
        return codTipoAcreedor;
    }

    /**
     * Define el valor de la propiedad codTipoAcreedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoAcreedor(String value) {
        this.codTipoAcreedor = value;
    }

    /**
     * Obtiene el valor de la propiedad descripAcreedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripAcreedor() {
        return descripAcreedor;
    }

    /**
     * Define el valor de la propiedad descripAcreedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripAcreedor(String value) {
        this.descripAcreedor = value;
    }

    /**
     * Obtiene el valor de la propiedad descripObjeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripObjeto() {
        return descripObjeto;
    }

    /**
     * Define el valor de la propiedad descripObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripObjeto(String value) {
        this.descripObjeto = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTipoAcreedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTipoAcreedor() {
        return descripTipoAcreedor;
    }

    /**
     * Define el valor de la propiedad descripTipoAcreedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTipoAcreedor(String value) {
        this.descripTipoAcreedor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExclusion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExclusion() {
        return fechaExclusion;
    }

    /**
     * Define el valor de la propiedad fechaExclusion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExclusion(String value) {
        this.fechaExclusion = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeParticipacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    /**
     * Define el valor de la propiedad porcentajeParticipacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPorcentajeParticipacion(Integer value) {
        this.porcentajeParticipacion = value;
    }

}
