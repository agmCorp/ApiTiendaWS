
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultGuardarImprimirReporte complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultGuardarImprimirReporte">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="numSecuencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultGuardarImprimirReporte", propOrder = {
    "numSecuencia"
})
public class ResultGuardarImprimirReporte
    extends ResultGenerico
{

    protected String numSecuencia;

    /**
     * Obtiene el valor de la propiedad numSecuencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSecuencia() {
        return numSecuencia;
    }

    /**
     * Define el valor de la propiedad numSecuencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSecuencia(String value) {
        this.numSecuencia = value;
    }

}
