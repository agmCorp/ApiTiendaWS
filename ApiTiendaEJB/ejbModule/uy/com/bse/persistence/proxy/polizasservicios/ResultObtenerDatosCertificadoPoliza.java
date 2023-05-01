
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerDatosCertificadoPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerDatosCertificadoPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="datosCertificado" type="{http://ws.polizas.bse.com.uy/}certificadoPoliza" minOccurs="0"/>
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
@XmlType(name = "resultObtenerDatosCertificadoPoliza", propOrder = {
    "datosCertificado",
    "encabezado"
})
public class ResultObtenerDatosCertificadoPoliza
    extends ResultGenerico
{

    protected CertificadoPoliza datosCertificado;
    protected EncabezadoPoliza encabezado;

    /**
     * Obtiene el valor de la propiedad datosCertificado.
     * 
     * @return
     *     possible object is
     *     {@link CertificadoPoliza }
     *     
     */
    public CertificadoPoliza getDatosCertificado() {
        return datosCertificado;
    }

    /**
     * Define el valor de la propiedad datosCertificado.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificadoPoliza }
     *     
     */
    public void setDatosCertificado(CertificadoPoliza value) {
        this.datosCertificado = value;
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
