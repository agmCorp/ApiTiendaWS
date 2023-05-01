
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerAseguradoCertifPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerAseguradoCertifPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosAsegurado" type="{http://ws.polizas.bse.com.uy/}contratanteAsegurado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerAseguradoCertifPoliza", propOrder = {
    "datosAsegurado"
})
public class ResultObtenerAseguradoCertifPoliza
    extends ResultGenerico
{

    protected ContratanteAsegurado datosAsegurado;

    /**
     * Obtiene el valor de la propiedad datosAsegurado.
     * 
     * @return
     *     possible object is
     *     {@link ContratanteAsegurado }
     *     
     */
    public ContratanteAsegurado getDatosAsegurado() {
        return datosAsegurado;
    }

    /**
     * Define el valor de la propiedad datosAsegurado.
     * 
     * @param value
     *     allowed object is
     *     {@link ContratanteAsegurado }
     *     
     */
    public void setDatosAsegurado(ContratanteAsegurado value) {
        this.datosAsegurado = value;
    }

}
