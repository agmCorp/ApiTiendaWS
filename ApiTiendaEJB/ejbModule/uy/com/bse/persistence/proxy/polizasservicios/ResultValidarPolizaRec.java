
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultValidarPolizaRec complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultValidarPolizaRec">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="confirmacion" type="{http://ws.polizas.bse.com.uy/}validacionGenerica" minOccurs="0"/>
 *         &lt;element name="datosRecuotificacion" type="{http://ws.polizas.bse.com.uy/}recuotificacion" minOccurs="0"/>
 *         &lt;element name="numCotizacionPendiente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultValidarPolizaRec", propOrder = {
    "confirmacion",
    "datosRecuotificacion",
    "numCotizacionPendiente"
})
public class ResultValidarPolizaRec
    extends ResultGenerico
{

    protected ValidacionGenerica confirmacion;
    protected Recuotificacion datosRecuotificacion;
    protected Integer numCotizacionPendiente;

    /**
     * Obtiene el valor de la propiedad confirmacion.
     * 
     * @return
     *     possible object is
     *     {@link ValidacionGenerica }
     *     
     */
    public ValidacionGenerica getConfirmacion() {
        return confirmacion;
    }

    /**
     * Define el valor de la propiedad confirmacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidacionGenerica }
     *     
     */
    public void setConfirmacion(ValidacionGenerica value) {
        this.confirmacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datosRecuotificacion.
     * 
     * @return
     *     possible object is
     *     {@link Recuotificacion }
     *     
     */
    public Recuotificacion getDatosRecuotificacion() {
        return datosRecuotificacion;
    }

    /**
     * Define el valor de la propiedad datosRecuotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Recuotificacion }
     *     
     */
    public void setDatosRecuotificacion(Recuotificacion value) {
        this.datosRecuotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numCotizacionPendiente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCotizacionPendiente() {
        return numCotizacionPendiente;
    }

    /**
     * Define el valor de la propiedad numCotizacionPendiente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCotizacionPendiente(Integer value) {
        this.numCotizacionPendiente = value;
    }

}
