
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerMapaMsgSiniestro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerMapaMsgSiniestro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}resultGenerico">
 *       &lt;sequence>
 *         &lt;element name="carril" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="descripcionMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="etapa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="futuroMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idMsg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tiempoPromedio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tituloMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titulofuturoMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerMapaMsgSiniestro", propOrder = {
    "carril",
    "descripcionMsg",
    "estadoMsg",
    "etapa",
    "finalMsg",
    "futuroMsg",
    "idMsg",
    "tiempoPromedio",
    "tituloMsg",
    "titulofuturoMsg"
})
public class ResultObtenerMapaMsgSiniestro
    extends ResultGenerico
{

    protected int carril;
    protected String descripcionMsg;
    protected String estadoMsg;
    protected String etapa;
    protected String finalMsg;
    protected String futuroMsg;
    protected int idMsg;
    protected String tiempoPromedio;
    protected String tituloMsg;
    protected String titulofuturoMsg;

    /**
     * Obtiene el valor de la propiedad carril.
     * 
     */
    public int getCarril() {
        return carril;
    }

    /**
     * Define el valor de la propiedad carril.
     * 
     */
    public void setCarril(int value) {
        this.carril = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMsg() {
        return descripcionMsg;
    }

    /**
     * Define el valor de la propiedad descripcionMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMsg(String value) {
        this.descripcionMsg = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoMsg() {
        return estadoMsg;
    }

    /**
     * Define el valor de la propiedad estadoMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoMsg(String value) {
        this.estadoMsg = value;
    }

    /**
     * Obtiene el valor de la propiedad etapa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtapa() {
        return etapa;
    }

    /**
     * Define el valor de la propiedad etapa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtapa(String value) {
        this.etapa = value;
    }

    /**
     * Obtiene el valor de la propiedad finalMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalMsg() {
        return finalMsg;
    }

    /**
     * Define el valor de la propiedad finalMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalMsg(String value) {
        this.finalMsg = value;
    }

    /**
     * Obtiene el valor de la propiedad futuroMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuturoMsg() {
        return futuroMsg;
    }

    /**
     * Define el valor de la propiedad futuroMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuturoMsg(String value) {
        this.futuroMsg = value;
    }

    /**
     * Obtiene el valor de la propiedad idMsg.
     * 
     */
    public int getIdMsg() {
        return idMsg;
    }

    /**
     * Define el valor de la propiedad idMsg.
     * 
     */
    public void setIdMsg(int value) {
        this.idMsg = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoPromedio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiempoPromedio() {
        return tiempoPromedio;
    }

    /**
     * Define el valor de la propiedad tiempoPromedio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiempoPromedio(String value) {
        this.tiempoPromedio = value;
    }

    /**
     * Obtiene el valor de la propiedad tituloMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloMsg() {
        return tituloMsg;
    }

    /**
     * Define el valor de la propiedad tituloMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloMsg(String value) {
        this.tituloMsg = value;
    }

    /**
     * Obtiene el valor de la propiedad titulofuturoMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulofuturoMsg() {
        return titulofuturoMsg;
    }

    /**
     * Define el valor de la propiedad titulofuturoMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulofuturoMsg(String value) {
        this.titulofuturoMsg = value;
    }

}
