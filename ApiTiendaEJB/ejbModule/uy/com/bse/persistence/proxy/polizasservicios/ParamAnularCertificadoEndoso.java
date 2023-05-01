
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramAnularCertificadoEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramAnularCertificadoEndoso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numCotizacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramAnularCertificadoEndoso", propOrder = {
    "numCertificado",
    "numCotizacion"
})
public class ParamAnularCertificadoEndoso
    extends ParamGenerico
{

    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numCertificado;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer numCotizacion;

    /**
     * Obtiene el valor de la propiedad numCertificado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCertificado() {
        return numCertificado;
    }

    /**
     * Define el valor de la propiedad numCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCertificado(Integer value) {
        this.numCertificado = value;
    }

    /**
     * Obtiene el valor de la propiedad numCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * Define el valor de la propiedad numCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCotizacion(Integer value) {
        this.numCotizacion = value;
    }

}
