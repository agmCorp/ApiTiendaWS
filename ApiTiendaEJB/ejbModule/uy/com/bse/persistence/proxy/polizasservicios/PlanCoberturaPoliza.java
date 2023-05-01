
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para planCoberturaPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="planCoberturaPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}planCobertura">
 *       &lt;sequence>
 *         &lt;element name="seleccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planCoberturaPoliza", propOrder = {
    "seleccionado"
})
public class PlanCoberturaPoliza
    extends PlanCobertura
{

    protected String seleccionado;

    /**
     * Obtiene el valor de la propiedad seleccionado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeleccionado() {
        return seleccionado;
    }

    /**
     * Define el valor de la propiedad seleccionado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeleccionado(String value) {
        this.seleccionado = value;
    }

}
