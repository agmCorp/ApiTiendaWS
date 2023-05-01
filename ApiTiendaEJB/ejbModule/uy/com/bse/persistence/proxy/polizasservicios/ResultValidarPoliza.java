
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultValidarPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultValidarPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="confirmacion" type="{http://ws.polizas.bse.com.uy/}validacionGenerica" minOccurs="0"/>
 *         &lt;element name="datosRelevantes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCertificado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tieneFacultativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultValidarPoliza", propOrder = {
    "confirmacion",
    "datosRelevantes",
    "numCertificado",
    "tieneFacultativo"
})
public class ResultValidarPoliza
    extends ResultGenerico
{

    protected ValidacionGenerica confirmacion;
    protected String datosRelevantes;
    protected Integer numCertificado;
    protected String tieneFacultativo;

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
     * Obtiene el valor de la propiedad datosRelevantes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosRelevantes() {
        return datosRelevantes;
    }

    /**
     * Define el valor de la propiedad datosRelevantes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosRelevantes(String value) {
        this.datosRelevantes = value;
    }

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
     * Obtiene el valor de la propiedad tieneFacultativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneFacultativo() {
        return tieneFacultativo;
    }

    /**
     * Define el valor de la propiedad tieneFacultativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneFacultativo(String value) {
        this.tieneFacultativo = value;
    }

}
