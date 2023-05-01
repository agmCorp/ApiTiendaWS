
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramObtenerOrigenRemesaAuto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramObtenerOrigenRemesaAuto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="numRemesa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramObtenerOrigenRemesaAuto", propOrder = {
    "numRemesa"
})
public class ParamObtenerOrigenRemesaAuto
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String numRemesa;

    /**
     * Obtiene el valor de la propiedad numRemesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRemesa() {
        return numRemesa;
    }

    /**
     * Define el valor de la propiedad numRemesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRemesa(String value) {
        this.numRemesa = value;
    }

}
