
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerUbicacionBienPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerUbicacionBienPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="encabezadoDetallePoliza" type="{http://ws.polizas.bse.com.uy/}encabezadoDetallePoliza" minOccurs="0"/>
 *         &lt;element name="ubicacion" type="{http://ws.polizas.bse.com.uy/}ubicacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerUbicacionBienPoliza", propOrder = {
    "encabezadoDetallePoliza",
    "ubicacion"
})
public class ResultObtenerUbicacionBienPoliza
    extends ResultGenerico
{

    protected EncabezadoDetallePoliza encabezadoDetallePoliza;
    protected Ubicacion ubicacion;

    /**
     * Obtiene el valor de la propiedad encabezadoDetallePoliza.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoDetallePoliza }
     *     
     */
    public EncabezadoDetallePoliza getEncabezadoDetallePoliza() {
        return encabezadoDetallePoliza;
    }

    /**
     * Define el valor de la propiedad encabezadoDetallePoliza.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoDetallePoliza }
     *     
     */
    public void setEncabezadoDetallePoliza(EncabezadoDetallePoliza value) {
        this.encabezadoDetallePoliza = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link Ubicacion }
     *     
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Ubicacion }
     *     
     */
    public void setUbicacion(Ubicacion value) {
        this.ubicacion = value;
    }

}
