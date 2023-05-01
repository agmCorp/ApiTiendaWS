
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDetalleTextoPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDetalleTextoPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="detalleTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerDetalleTextoPoliza", propOrder = {
    "detalleTexto"
})
public class ResultObtenerDetalleTextoPoliza
    extends ResultGenerico
{

    protected String detalleTexto;

    /**
     * Obtiene el valor de la propiedad detalleTexto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalleTexto() {
        return detalleTexto;
    }

    /**
     * Define el valor de la propiedad detalleTexto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalleTexto(String value) {
        this.detalleTexto = value;
    }

}
