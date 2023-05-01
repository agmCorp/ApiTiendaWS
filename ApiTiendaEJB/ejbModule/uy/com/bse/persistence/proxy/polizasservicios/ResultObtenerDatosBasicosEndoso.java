
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDatosBasicosEndoso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDatosBasicosEndoso">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="certificados" type="{http://ws.polizas.bse.com.uy/}certificado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cliente" type="{http://ws.polizas.bse.com.uy/}cliente" minOccurs="0"/>
 *         &lt;element name="datos" type="{http://ws.polizas.bse.com.uy/}datosCotizacion" minOccurs="0"/>
 *         &lt;element name="direccionesCliente" type="{http://ws.polizas.bse.com.uy/}direccionEC" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mails" type="{http://ws.polizas.bse.com.uy/}mailEC" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerDatosBasicosEndoso", propOrder = {
    "certificados",
    "cliente",
    "datos",
    "direccionesCliente",
    "mails"
})
public class ResultObtenerDatosBasicosEndoso
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<Certificado> certificados;
    protected Cliente cliente;
    protected DatosCotizacion datos;
    @XmlElement(nillable = true)
    protected List<DireccionEC> direccionesCliente;
    @XmlElement(nillable = true)
    protected List<MailEC> mails;

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
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link DatosCotizacion }
     *     
     */
    public DatosCotizacion getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCotizacion }
     *     
     */
    public void setDatos(DatosCotizacion value) {
        this.datos = value;
    }

    /**
     * Gets the value of the direccionesCliente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direccionesCliente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDireccionesCliente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DireccionEC }
     * 
     * 
     */
    public List<DireccionEC> getDireccionesCliente() {
        if (direccionesCliente == null) {
            direccionesCliente = new ArrayList<DireccionEC>();
        }
        return this.direccionesCliente;
    }

    /**
     * Gets the value of the mails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MailEC }
     * 
     * 
     */
    public List<MailEC> getMails() {
        if (mails == null) {
            mails = new ArrayList<MailEC>();
        }
        return this.mails;
    }

}
