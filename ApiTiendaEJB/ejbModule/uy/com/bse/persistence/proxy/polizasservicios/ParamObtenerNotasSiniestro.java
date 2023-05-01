
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramObtenerNotasSiniestro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramObtenerNotasSiniestro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="enlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramObtenerNotasSiniestro", propOrder = {
    "enlace"
})
public class ParamObtenerNotasSiniestro
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String enlace;

    /**
     * Obtiene el valor de la propiedad enlace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Define el valor de la propiedad enlace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnlace(String value) {
        this.enlace = value;
    }

}
