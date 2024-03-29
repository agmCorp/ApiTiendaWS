
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultCorrespondeCartaPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultCorrespondeCartaPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="correspondeCartaPoliza" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCorrespondeCartaPoliza", propOrder = {
    "correspondeCartaPoliza",
    "mensaje"
})
public class ResultCorrespondeCartaPoliza
    extends ResultGenerico
{

    protected Boolean correspondeCartaPoliza;
    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad correspondeCartaPoliza.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCorrespondeCartaPoliza() {
        return correspondeCartaPoliza;
    }

    /**
     * Define el valor de la propiedad correspondeCartaPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCorrespondeCartaPoliza(Boolean value) {
        this.correspondeCartaPoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
