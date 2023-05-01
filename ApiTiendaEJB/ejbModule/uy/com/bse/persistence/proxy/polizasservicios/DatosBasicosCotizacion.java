
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosBasicosCotizacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosBasicosCotizacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codBroker" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descBroker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modoCalculoCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modoCalculoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="monedaCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="monedaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productorCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="productorDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promocionCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promocionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="renovacionCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="renovacionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosBasicosCotizacion", propOrder = {
    "codBroker",
    "descBroker",
    "fechaEmision",
    "modoCalculoCod",
    "modoCalculoDesc",
    "monedaCod",
    "monedaDesc",
    "productorCod",
    "productorDesc",
    "promocionCod",
    "promocionDesc",
    "renovacionCod",
    "renovacionDesc"
})
@XmlSeeAlso({
    DatosCotizacion.class
})
public class DatosBasicosCotizacion {

    protected Integer codBroker;
    protected String descBroker;
    protected String fechaEmision;
    protected String modoCalculoCod;
    protected String modoCalculoDesc;
    protected Integer monedaCod;
    protected String monedaDesc;
    protected Integer productorCod;
    protected String productorDesc;
    protected String promocionCod;
    protected String promocionDesc;
    protected String renovacionCod;
    protected String renovacionDesc;

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
     * Obtiene el valor de la propiedad modoCalculoCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModoCalculoCod() {
        return modoCalculoCod;
    }

    /**
     * Define el valor de la propiedad modoCalculoCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModoCalculoCod(String value) {
        this.modoCalculoCod = value;
    }

    /**
     * Obtiene el valor de la propiedad modoCalculoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModoCalculoDesc() {
        return modoCalculoDesc;
    }

    /**
     * Define el valor de la propiedad modoCalculoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModoCalculoDesc(String value) {
        this.modoCalculoDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonedaCod() {
        return monedaCod;
    }

    /**
     * Define el valor de la propiedad monedaCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonedaCod(Integer value) {
        this.monedaCod = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaDesc() {
        return monedaDesc;
    }

    /**
     * Define el valor de la propiedad monedaDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaDesc(String value) {
        this.monedaDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad productorCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductorCod() {
        return productorCod;
    }

    /**
     * Define el valor de la propiedad productorCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductorCod(Integer value) {
        this.productorCod = value;
    }

    /**
     * Obtiene el valor de la propiedad productorDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductorDesc() {
        return productorDesc;
    }

    /**
     * Define el valor de la propiedad productorDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductorDesc(String value) {
        this.productorDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad promocionCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromocionCod() {
        return promocionCod;
    }

    /**
     * Define el valor de la propiedad promocionCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromocionCod(String value) {
        this.promocionCod = value;
    }

    /**
     * Obtiene el valor de la propiedad promocionDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromocionDesc() {
        return promocionDesc;
    }

    /**
     * Define el valor de la propiedad promocionDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromocionDesc(String value) {
        this.promocionDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad renovacionCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenovacionCod() {
        return renovacionCod;
    }

    /**
     * Define el valor de la propiedad renovacionCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenovacionCod(String value) {
        this.renovacionCod = value;
    }

    /**
     * Obtiene el valor de la propiedad renovacionDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenovacionDesc() {
        return renovacionDesc;
    }

    /**
     * Define el valor de la propiedad renovacionDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenovacionDesc(String value) {
        this.renovacionDesc = value;
    }

}
