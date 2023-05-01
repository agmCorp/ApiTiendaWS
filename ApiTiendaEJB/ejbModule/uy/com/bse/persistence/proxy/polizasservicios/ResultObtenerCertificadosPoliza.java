
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerCertificadosPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerCertificadosPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosBasicosCertificado" type="{http://ws.polizas.bse.com.uy/}certificadoPolizaBasico" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "resultObtenerCertificadosPoliza", propOrder = {
    "datosBasicosCertificado",
    "encabezado"
})
public class ResultObtenerCertificadosPoliza
    extends ResultGenerico
{

    @XmlElement(nillable = true)
    protected List<CertificadoPolizaBasico> datosBasicosCertificado;
    protected EncabezadoPoliza encabezado;

    /**
     * Gets the value of the datosBasicosCertificado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosBasicosCertificado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosBasicosCertificado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificadoPolizaBasico }
     * 
     * 
     */
    public List<CertificadoPolizaBasico> getDatosBasicosCertificado() {
        if (datosBasicosCertificado == null) {
            datosBasicosCertificado = new ArrayList<CertificadoPolizaBasico>();
        }
        return this.datosBasicosCertificado;
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
