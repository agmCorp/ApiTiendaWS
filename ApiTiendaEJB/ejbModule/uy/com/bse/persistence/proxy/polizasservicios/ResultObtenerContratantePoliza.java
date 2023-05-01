
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerContratantePoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerContratantePoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosContratante" type="{http://ws.polizas.bse.com.uy/}contratanteAsegurado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerContratantePoliza", propOrder = {
    "datosContratante"
})
public class ResultObtenerContratantePoliza
    extends ResultGenerico
{

    protected ContratanteAsegurado datosContratante;

    /**
     * Obtiene el valor de la propiedad datosContratante.
     * 
     * @return
     *     possible object is
     *     {@link ContratanteAsegurado }
     *     
     */
    public ContratanteAsegurado getDatosContratante() {
        return datosContratante;
    }

    /**
     * Define el valor de la propiedad datosContratante.
     * 
     * @param value
     *     allowed object is
     *     {@link ContratanteAsegurado }
     *     
     */
    public void setDatosContratante(ContratanteAsegurado value) {
        this.datosContratante = value;
    }

}
