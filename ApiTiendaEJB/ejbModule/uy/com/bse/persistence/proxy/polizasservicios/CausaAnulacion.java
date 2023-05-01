
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para causaAnulacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="causaAnulacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codModoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMotivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="descripModoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMotivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "causaAnulacion", propOrder = {
    "codModoCalculo",
    "codMotivo",
    "descripModoCalculo",
    "descripMotivo"
})
public class CausaAnulacion {

    protected String codModoCalculo;
    protected Integer codMotivo;
    protected String descripModoCalculo;
    protected String descripMotivo;

    /**
     * Obtiene el valor de la propiedad codModoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodModoCalculo() {
        return codModoCalculo;
    }

    /**
     * Define el valor de la propiedad codModoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodModoCalculo(String value) {
        this.codModoCalculo = value;
    }

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
     * Obtiene el valor de la propiedad descripModoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripModoCalculo() {
        return descripModoCalculo;
    }

    /**
     * Define el valor de la propiedad descripModoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripModoCalculo(String value) {
        this.descripModoCalculo = value;
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

}
