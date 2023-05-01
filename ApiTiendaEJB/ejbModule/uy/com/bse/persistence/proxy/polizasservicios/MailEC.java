
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mailEC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mailEC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codEmailPersona" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codTipoComunicacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descEmailPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mailEC", propOrder = {
    "codEmailPersona",
    "codTipoComunicacion",
    "descEmailPersona"
})
public class MailEC {

    protected Integer codEmailPersona;
    protected Integer codTipoComunicacion;
    protected String descEmailPersona;

    /**
     * Obtiene el valor de la propiedad codEmailPersona.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodEmailPersona() {
        return codEmailPersona;
    }

    /**
     * Define el valor de la propiedad codEmailPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodEmailPersona(Integer value) {
        this.codEmailPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoComunicacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodTipoComunicacion() {
        return codTipoComunicacion;
    }

    /**
     * Define el valor de la propiedad codTipoComunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodTipoComunicacion(Integer value) {
        this.codTipoComunicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descEmailPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEmailPersona() {
        return descEmailPersona;
    }

    /**
     * Define el valor de la propiedad descEmailPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEmailPersona(String value) {
        this.descEmailPersona = value;
    }

}
