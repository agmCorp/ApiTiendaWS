
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosCalculoRenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosCalculoRenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codValor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="descripDato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosCalculoRenta", propOrder = {
    "codValor",
    "descripDato",
    "descripValor"
})
public class DatosCalculoRenta {

    protected Double codValor;
    protected String descripDato;
    protected String descripValor;

    /**
     * Obtiene el valor de la propiedad codValor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCodValor() {
        return codValor;
    }

    /**
     * Define el valor de la propiedad codValor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCodValor(Double value) {
        this.codValor = value;
    }

    /**
     * Obtiene el valor de la propiedad descripDato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripDato() {
        return descripDato;
    }

    /**
     * Define el valor de la propiedad descripDato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripDato(String value) {
        this.descripDato = value;
    }

    /**
     * Obtiene el valor de la propiedad descripValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripValor() {
        return descripValor;
    }

    /**
     * Define el valor de la propiedad descripValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripValor(String value) {
        this.descripValor = value;
    }

}
