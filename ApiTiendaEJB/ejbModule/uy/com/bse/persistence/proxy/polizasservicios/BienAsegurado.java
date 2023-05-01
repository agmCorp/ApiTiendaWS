
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para bienAsegurado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="bienAsegurado">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}bienCert">
 *       &lt;sequence>
 *         &lt;element name="habilitarAcreedores" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitarBeneficiarios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitarBotonAnexos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitarBotonTextos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitarListaBienes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitarUbicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bienAsegurado", propOrder = {
    "habilitarAcreedores",
    "habilitarBeneficiarios",
    "habilitarBotonAnexos",
    "habilitarBotonTextos",
    "habilitarListaBienes",
    "habilitarUbicacion"
})
public class BienAsegurado
    extends BienCert
{

    protected String habilitarAcreedores;
    protected String habilitarBeneficiarios;
    protected String habilitarBotonAnexos;
    protected String habilitarBotonTextos;
    protected String habilitarListaBienes;
    protected String habilitarUbicacion;

    /**
     * Obtiene el valor de la propiedad habilitarAcreedores.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitarAcreedores() {
        return habilitarAcreedores;
    }

    /**
     * Define el valor de la propiedad habilitarAcreedores.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitarAcreedores(String value) {
        this.habilitarAcreedores = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitarBeneficiarios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitarBeneficiarios() {
        return habilitarBeneficiarios;
    }

    /**
     * Define el valor de la propiedad habilitarBeneficiarios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitarBeneficiarios(String value) {
        this.habilitarBeneficiarios = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitarBotonAnexos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitarBotonAnexos() {
        return habilitarBotonAnexos;
    }

    /**
     * Define el valor de la propiedad habilitarBotonAnexos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitarBotonAnexos(String value) {
        this.habilitarBotonAnexos = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitarBotonTextos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitarBotonTextos() {
        return habilitarBotonTextos;
    }

    /**
     * Define el valor de la propiedad habilitarBotonTextos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitarBotonTextos(String value) {
        this.habilitarBotonTextos = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitarListaBienes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitarListaBienes() {
        return habilitarListaBienes;
    }

    /**
     * Define el valor de la propiedad habilitarListaBienes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitarListaBienes(String value) {
        this.habilitarListaBienes = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitarUbicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitarUbicacion() {
        return habilitarUbicacion;
    }

    /**
     * Define el valor de la propiedad habilitarUbicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitarUbicacion(String value) {
        this.habilitarUbicacion = value;
    }

}
