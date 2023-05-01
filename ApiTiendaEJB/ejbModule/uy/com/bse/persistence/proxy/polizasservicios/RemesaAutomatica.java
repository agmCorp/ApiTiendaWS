
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para remesaAutomatica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="remesaAutomatica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripDatos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numValor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remesaAutomatica", propOrder = {
    "descripDatos",
    "numOrigen",
    "numValor"
})
public class RemesaAutomatica {

    protected String descripDatos;
    protected String numOrigen;
    protected Integer numValor;

    /**
     * Obtiene el valor de la propiedad descripDatos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripDatos() {
        return descripDatos;
    }

    /**
     * Define el valor de la propiedad descripDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripDatos(String value) {
        this.descripDatos = value;
    }

    /**
     * Obtiene el valor de la propiedad numOrigen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOrigen() {
        return numOrigen;
    }

    /**
     * Define el valor de la propiedad numOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOrigen(String value) {
        this.numOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad numValor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumValor() {
        return numValor;
    }

    /**
     * Define el valor de la propiedad numValor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumValor(Integer value) {
        this.numValor = value;
    }

}
