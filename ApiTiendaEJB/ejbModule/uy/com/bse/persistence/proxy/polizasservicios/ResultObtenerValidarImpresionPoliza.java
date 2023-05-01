
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerValidarImpresionPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerValidarImpresionPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="impresionPoliza" type="{http://ws.polizas.bse.com.uy/}impresionPoliza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerValidarImpresionPoliza", propOrder = {
    "impresionPoliza"
})
public class ResultObtenerValidarImpresionPoliza
    extends ResultGenerico
{

    protected ImpresionPoliza impresionPoliza;

    /**
     * Obtiene el valor de la propiedad impresionPoliza.
     * 
     * @return
     *     possible object is
     *     {@link ImpresionPoliza }
     *     
     */
    public ImpresionPoliza getImpresionPoliza() {
        return impresionPoliza;
    }

    /**
     * Define el valor de la propiedad impresionPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpresionPoliza }
     *     
     */
    public void setImpresionPoliza(ImpresionPoliza value) {
        this.impresionPoliza = value;
    }

}
