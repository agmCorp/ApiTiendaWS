
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultGenerarEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultGenerarEndoso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="msgAviso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultGenerarEndoso", propOrder = {
    "msgAviso"
})
public class ResultGenerarEndoso
    extends ResultGenerico
{

    protected String msgAviso;

    /**
     * Obtiene el valor de la propiedad msgAviso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgAviso() {
        return msgAviso;
    }

    /**
     * Define el valor de la propiedad msgAviso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgAviso(String value) {
        this.msgAviso = value;
    }

}
