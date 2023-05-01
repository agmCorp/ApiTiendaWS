
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerConsolidado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerConsolidado">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosConsolidado" type="{http://ws.polizas.bse.com.uy/}consolidado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerConsolidado", propOrder = {
    "datosConsolidado"
})
public class ResultObtenerConsolidado
    extends ResultGenerico
{

    protected Consolidado datosConsolidado;

    /**
     * Obtiene el valor de la propiedad datosConsolidado.
     * 
     * @return
     *     possible object is
     *     {@link Consolidado }
     *     
     */
    public Consolidado getDatosConsolidado() {
        return datosConsolidado;
    }

    /**
     * Define el valor de la propiedad datosConsolidado.
     * 
     * @param value
     *     allowed object is
     *     {@link Consolidado }
     *     
     */
    public void setDatosConsolidado(Consolidado value) {
        this.datosConsolidado = value;
    }

}
