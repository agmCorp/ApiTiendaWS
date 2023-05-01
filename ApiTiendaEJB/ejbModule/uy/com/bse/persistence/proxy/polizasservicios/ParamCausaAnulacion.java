
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramCausaAnulacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramCausaAnulacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="codRamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codTipoAnulacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramCausaAnulacion", propOrder = {
    "codRamo",
    "codTipoAnulacion"
})
public class ParamCausaAnulacion
    extends ParamGenerico
{

    @XmlElement(required = true, nillable = true)
    protected String codRamo;
    @XmlElement(required = true, nillable = true)
    protected String codTipoAnulacion;

    /**
     * Obtiene el valor de la propiedad codRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRamo() {
        return codRamo;
    }

    /**
     * Define el valor de la propiedad codRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRamo(String value) {
        this.codRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoAnulacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoAnulacion() {
        return codTipoAnulacion;
    }

    /**
     * Define el valor de la propiedad codTipoAnulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoAnulacion(String value) {
        this.codTipoAnulacion = value;
    }

}
