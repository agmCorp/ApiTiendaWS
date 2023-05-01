
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramObtenerPolizasFacturasPagasCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramObtenerPolizasFacturasPagasCliente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="diasVencimientoPoliza" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramObtenerPolizasFacturasPagasCliente", propOrder = {
    "diasVencimientoPoliza"
})
public class ParamObtenerPolizasFacturasPagasCliente
    extends ParamGenerico
{

    protected Integer diasVencimientoPoliza;

    /**
     * Obtiene el valor de la propiedad diasVencimientoPoliza.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiasVencimientoPoliza() {
        return diasVencimientoPoliza;
    }

    /**
     * Define el valor de la propiedad diasVencimientoPoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiasVencimientoPoliza(Integer value) {
        this.diasVencimientoPoliza = value;
    }

}
