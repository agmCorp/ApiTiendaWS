
package uy.com.bse.persistence.proxy.objpersonal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para clienteDeudaTiendaResp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clienteDeudaTiendaResp">
 *   &lt;complexContent>
 *     &lt;extension base="{http://opersonal.ws.servicios.bse.com/}errorTiendaResp">
 *       &lt;sequence>
 *         &lt;element name="clienteConDeuda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clienteDeudaTiendaResp", propOrder = {
    "clienteConDeuda"
})
public class ClienteDeudaTiendaResp
    extends ErrorTiendaResp
{

    protected String clienteConDeuda;

    /**
     * Obtiene el valor de la propiedad clienteConDeuda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteConDeuda() {
        return clienteConDeuda;
    }

    /**
     * Define el valor de la propiedad clienteConDeuda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteConDeuda(String value) {
        this.clienteConDeuda = value;
    }

}
