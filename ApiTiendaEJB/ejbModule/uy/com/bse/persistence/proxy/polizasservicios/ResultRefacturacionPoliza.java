
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultRefacturacionPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultRefacturacionPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="detalleRefacturacion" type="{http://ws.polizas.bse.com.uy/}refacturacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultRefacturacionPoliza", propOrder = {
    "detalleRefacturacion"
})
public class ResultRefacturacionPoliza
    extends ResultGenerico
{

    protected Refacturacion detalleRefacturacion;

    /**
     * Obtiene el valor de la propiedad detalleRefacturacion.
     * 
     * @return
     *     possible object is
     *     {@link Refacturacion }
     *     
     */
    public Refacturacion getDetalleRefacturacion() {
        return detalleRefacturacion;
    }

    /**
     * Define el valor de la propiedad detalleRefacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Refacturacion }
     *     
     */
    public void setDetalleRefacturacion(Refacturacion value) {
        this.detalleRefacturacion = value;
    }

}
