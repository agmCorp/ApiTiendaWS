
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para asesor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="asesor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codAsesor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descAsesor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mails" type="{http://ws.polizas.bse.com.uy/}mail" minOccurs="0"/>
 *         &lt;element name="telefonos" type="{http://ws.polizas.bse.com.uy/}telefono" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asesor", propOrder = {
    "codAsesor",
    "descAsesor",
    "mails",
    "telefonos"
})
public class Asesor {

    protected Integer codAsesor;
    protected String descAsesor;
    protected Mail mails;
    protected Telefono telefonos;

    /**
     * Obtiene el valor de la propiedad codAsesor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAsesor() {
        return codAsesor;
    }

    /**
     * Define el valor de la propiedad codAsesor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAsesor(Integer value) {
        this.codAsesor = value;
    }

    /**
     * Obtiene el valor de la propiedad descAsesor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAsesor() {
        return descAsesor;
    }

    /**
     * Define el valor de la propiedad descAsesor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAsesor(String value) {
        this.descAsesor = value;
    }

    /**
     * Obtiene el valor de la propiedad mails.
     * 
     * @return
     *     possible object is
     *     {@link Mail }
     *     
     */
    public Mail getMails() {
        return mails;
    }

    /**
     * Define el valor de la propiedad mails.
     * 
     * @param value
     *     allowed object is
     *     {@link Mail }
     *     
     */
    public void setMails(Mail value) {
        this.mails = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonos.
     * 
     * @return
     *     possible object is
     *     {@link Telefono }
     *     
     */
    public Telefono getTelefonos() {
        return telefonos;
    }

    /**
     * Define el valor de la propiedad telefonos.
     * 
     * @param value
     *     allowed object is
     *     {@link Telefono }
     *     
     */
    public void setTelefonos(Telefono value) {
        this.telefonos = value;
    }

}
