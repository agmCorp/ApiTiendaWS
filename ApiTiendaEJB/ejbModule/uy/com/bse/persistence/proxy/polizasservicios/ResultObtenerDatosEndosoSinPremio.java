
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDatosEndosoSinPremio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDatosEndosoSinPremio">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosParticulares" type="{http://ws.polizas.bse.com.uy/}datosParticularesEndoso" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerDatosEndosoSinPremio", propOrder = {
    "datosParticulares"
})
public class ResultObtenerDatosEndosoSinPremio
    extends ResultGenerico
{

    protected DatosParticularesEndoso datosParticulares;

    /**
     * Obtiene el valor de la propiedad datosParticulares.
     * 
     * @return
     *     possible object is
     *     {@link DatosParticularesEndoso }
     *     
     */
    public DatosParticularesEndoso getDatosParticulares() {
        return datosParticulares;
    }

    /**
     * Define el valor de la propiedad datosParticulares.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosParticularesEndoso }
     *     
     */
    public void setDatosParticulares(DatosParticularesEndoso value) {
        this.datosParticulares = value;
    }

}
