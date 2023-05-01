
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramAltaMailCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramAltaMailCliente">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="comunicacion" type="{http://ws.mibse.bse.com.uy/}datosComunicacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramAltaMailCliente", propOrder = {
    "comunicacion"
})
public class ParamAltaMailCliente
    extends ParamGenerico
{

    protected DatosComunicacion comunicacion;

    /**
     * Obtiene el valor de la propiedad comunicacion.
     * 
     * @return
     *     possible object is
     *     {@link DatosComunicacion }
     *     
     */
    public DatosComunicacion getComunicacion() {
        return comunicacion;
    }

    /**
     * Define el valor de la propiedad comunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosComunicacion }
     *     
     */
    public void setComunicacion(DatosComunicacion value) {
        this.comunicacion = value;
    }

}
