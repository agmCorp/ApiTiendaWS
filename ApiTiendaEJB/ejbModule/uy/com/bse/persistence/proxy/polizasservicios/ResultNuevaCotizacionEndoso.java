
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultNuevaCotizacionEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultNuevaCotizacionEndoso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="certificados" type="{http://ws.polizas.bse.com.uy/}certificado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="confirmacion" type="{http://ws.polizas.bse.com.uy/}validacionGenerica" minOccurs="0"/>
 *         &lt;element name="datosContratante" type="{http://ws.polizas.bse.com.uy/}datosContratante" minOccurs="0"/>
 *         &lt;element name="datosCotizacion" type="{http://ws.polizas.bse.com.uy/}datosCotizacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultNuevaCotizacionEndoso", propOrder = {
    "certificados",
    "confirmacion",
    "datosContratante",
    "datosCotizacion"
})
public class ResultNuevaCotizacionEndoso
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<Certificado> certificados;
    protected ValidacionGenerica confirmacion;
    protected DatosContratante datosContratante;
    protected DatosCotizacion datosCotizacion;

    /**
     * Gets the value of the certificados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Certificado }
     * 
     * 
     */
    public List<Certificado> getCertificados() {
        if (certificados == null) {
            certificados = new ArrayList<Certificado>();
        }
        return this.certificados;
    }

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
     * Obtiene el valor de la propiedad datosContratante.
     * 
     * @return
     *     possible object is
     *     {@link DatosContratante }
     *     
     */
    public DatosContratante getDatosContratante() {
        return datosContratante;
    }

    /**
     * Define el valor de la propiedad datosContratante.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosContratante }
     *     
     */
    public void setDatosContratante(DatosContratante value) {
        this.datosContratante = value;
    }

    /**
     * Obtiene el valor de la propiedad datosCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link DatosCotizacion }
     *     
     */
    public DatosCotizacion getDatosCotizacion() {
        return datosCotizacion;
    }

    /**
     * Define el valor de la propiedad datosCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCotizacion }
     *     
     */
    public void setDatosCotizacion(DatosCotizacion value) {
        this.datosCotizacion = value;
    }

}
