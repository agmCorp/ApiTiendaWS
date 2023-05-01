
package uy.com.bse.persistence.proxy.objpersonal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cotizarOPersonalAnonimo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cotizarOPersonalAnonimo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contrasena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="planCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoObjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorObjeto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="movilidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cotizarOPersonalAnonimo", propOrder = {
    "usuario",
    "contrasena",
    "planCobertura",
    "tipoObjeto",
    "valorObjeto",
    "movilidad"
})
public class CotizarOPersonalAnonimo {

    protected String usuario;
    protected String contrasena;
    protected String planCobertura;
    protected String tipoObjeto;
    protected Double valorObjeto;
    protected String movilidad;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad contrasena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * Define el valor de la propiedad contrasena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrasena(String value) {
        this.contrasena = value;
    }

    /**
     * Obtiene el valor de la propiedad planCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanCobertura() {
        return planCobertura;
    }

    /**
     * Define el valor de la propiedad planCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanCobertura(String value) {
        this.planCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoObjeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoObjeto() {
        return tipoObjeto;
    }

    /**
     * Define el valor de la propiedad tipoObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoObjeto(String value) {
        this.tipoObjeto = value;
    }

    /**
     * Obtiene el valor de la propiedad valorObjeto.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorObjeto() {
        return valorObjeto;
    }

    /**
     * Define el valor de la propiedad valorObjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorObjeto(Double value) {
        this.valorObjeto = value;
    }

    /**
     * Obtiene el valor de la propiedad movilidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovilidad() {
        return movilidad;
    }

    /**
     * Define el valor de la propiedad movilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovilidad(String value) {
        this.movilidad = value;
    }

}
