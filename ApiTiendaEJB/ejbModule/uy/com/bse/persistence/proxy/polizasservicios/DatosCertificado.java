
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosCertificado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosCertificado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaEndoso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCentificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosCertificado", propOrder = {
    "fechaEndoso",
    "numCentificado"
})
public class DatosCertificado {

    protected String fechaEndoso;
    protected Integer numCentificado;

    /**
     * Obtiene el valor de la propiedad fechaEndoso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEndoso() {
        return fechaEndoso;
    }

    /**
     * Define el valor de la propiedad fechaEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEndoso(String value) {
        this.fechaEndoso = value;
    }

    /**
     * Obtiene el valor de la propiedad numCentificado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCentificado() {
        return numCentificado;
    }

    /**
     * Define el valor de la propiedad numCentificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCentificado(Integer value) {
        this.numCentificado = value;
    }

}
