
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramValidarCodigoAdhesion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramValidarCodigoAdhesion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codAdhesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramValidarCodigoAdhesion", propOrder = {
    "codAdhesion"
})
public class ParamValidarCodigoAdhesion
    extends ParamGenerico
{

    protected String codAdhesion;

    /**
     * Obtiene el valor de la propiedad codAdhesion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAdhesion() {
        return codAdhesion;
    }

    /**
     * Define el valor de la propiedad codAdhesion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAdhesion(String value) {
        this.codAdhesion = value;
    }

}
