
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerNumeroCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerNumeroCliente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="numCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerNumeroCliente", propOrder = {
    "numCliente"
})
public class ResultObtenerNumeroCliente
    extends ResultGenerico
{

    protected String numCliente;

    /**
     * Obtiene el valor de la propiedad numCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCliente() {
        return numCliente;
    }

    /**
     * Define el valor de la propiedad numCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCliente(String value) {
        this.numCliente = value;
    }

}
