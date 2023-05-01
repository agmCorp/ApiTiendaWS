
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para franquicia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="franquicia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bienDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bienNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="coberturaCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="coberturaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codFranquicia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deducibleMonto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="deduciblePorc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="descripcionFranquicia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="franquiciaMonto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="franquiciaPorc" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ramoCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "franquicia", propOrder = {
    "bienDesc",
    "bienNum",
    "coberturaCod",
    "coberturaDesc",
    "codFranquicia",
    "deducibleMonto",
    "deduciblePorc",
    "descripcionFranquicia",
    "franquiciaMonto",
    "franquiciaPorc",
    "ramoCod"
})
public class Franquicia {

    protected String bienDesc;
    protected Integer bienNum;
    protected Integer coberturaCod;
    protected String coberturaDesc;
    protected Integer codFranquicia;
    protected Double deducibleMonto;
    protected Double deduciblePorc;
    protected String descripcionFranquicia;
    protected Double franquiciaMonto;
    protected Double franquiciaPorc;
    protected Integer ramoCod;

    /**
     * Obtiene el valor de la propiedad bienDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBienDesc() {
        return bienDesc;
    }

    /**
     * Define el valor de la propiedad bienDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBienDesc(String value) {
        this.bienDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad bienNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBienNum() {
        return bienNum;
    }

    /**
     * Define el valor de la propiedad bienNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBienNum(Integer value) {
        this.bienNum = value;
    }

    /**
     * Obtiene el valor de la propiedad coberturaCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoberturaCod() {
        return coberturaCod;
    }

    /**
     * Define el valor de la propiedad coberturaCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoberturaCod(Integer value) {
        this.coberturaCod = value;
    }

    /**
     * Obtiene el valor de la propiedad coberturaDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoberturaDesc() {
        return coberturaDesc;
    }

    /**
     * Define el valor de la propiedad coberturaDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoberturaDesc(String value) {
        this.coberturaDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad codFranquicia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodFranquicia() {
        return codFranquicia;
    }

    /**
     * Define el valor de la propiedad codFranquicia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodFranquicia(Integer value) {
        this.codFranquicia = value;
    }

    /**
     * Obtiene el valor de la propiedad deducibleMonto.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeducibleMonto() {
        return deducibleMonto;
    }

    /**
     * Define el valor de la propiedad deducibleMonto.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeducibleMonto(Double value) {
        this.deducibleMonto = value;
    }

    /**
     * Obtiene el valor de la propiedad deduciblePorc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeduciblePorc() {
        return deduciblePorc;
    }

    /**
     * Define el valor de la propiedad deduciblePorc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeduciblePorc(Double value) {
        this.deduciblePorc = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionFranquicia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionFranquicia() {
        return descripcionFranquicia;
    }

    /**
     * Define el valor de la propiedad descripcionFranquicia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionFranquicia(String value) {
        this.descripcionFranquicia = value;
    }

    /**
     * Obtiene el valor de la propiedad franquiciaMonto.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFranquiciaMonto() {
        return franquiciaMonto;
    }

    /**
     * Define el valor de la propiedad franquiciaMonto.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFranquiciaMonto(Double value) {
        this.franquiciaMonto = value;
    }

    /**
     * Obtiene el valor de la propiedad franquiciaPorc.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFranquiciaPorc() {
        return franquiciaPorc;
    }

    /**
     * Define el valor de la propiedad franquiciaPorc.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFranquiciaPorc(Double value) {
        this.franquiciaPorc = value;
    }

    /**
     * Obtiene el valor de la propiedad ramoCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRamoCod() {
        return ramoCod;
    }

    /**
     * Define el valor de la propiedad ramoCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRamoCod(Integer value) {
        this.ramoCod = value;
    }

}
