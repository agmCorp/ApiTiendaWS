
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDatosEndosoPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDatosEndosoPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosEndoso" type="{http://ws.polizas.bse.com.uy/}endoso" minOccurs="0"/>
 *         &lt;element name="encabezado" type="{http://ws.polizas.bse.com.uy/}encabezadoPoliza" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerDatosEndosoPoliza", propOrder = {
    "datosEndoso",
    "encabezado"
})
public class ResultObtenerDatosEndosoPoliza
    extends ResultGenerico
{

    protected Endoso datosEndoso;
    protected EncabezadoPoliza encabezado;

    /**
     * Obtiene el valor de la propiedad datosEndoso.
     * 
     * @return
     *     possible object is
     *     {@link Endoso }
     *     
     */
    public Endoso getDatosEndoso() {
        return datosEndoso;
    }

    /**
     * Define el valor de la propiedad datosEndoso.
     * 
     * @param value
     *     allowed object is
     *     {@link Endoso }
     *     
     */
    public void setDatosEndoso(Endoso value) {
        this.datosEndoso = value;
    }

    /**
     * Obtiene el valor de la propiedad encabezado.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoPoliza }
     *     
     */
    public EncabezadoPoliza getEncabezado() {
        return encabezado;
    }

    /**
     * Define el valor de la propiedad encabezado.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoPoliza }
     *     
     */
    public void setEncabezado(EncabezadoPoliza value) {
        this.encabezado = value;
    }

}
