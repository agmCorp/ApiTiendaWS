
package uy.com.bse.persistence.proxy.mibse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramObtenerMapaMsgSiniestro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramObtenerMapaMsgSiniestro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.mibse.bse.com.uy/}paramGenerico">
 *       &lt;sequence>
 *         &lt;element name="estadoReclamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notasAnteriores" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nroNota" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nroSubNota" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ramo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ruta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tieneDenuncia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tieneNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tieneReclamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tieneSiniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tieneSubNota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramObtenerMapaMsgSiniestro", propOrder = {
    "estadoReclamo",
    "notasAnteriores",
    "nroNota",
    "nroSubNota",
    "ramo",
    "ruta",
    "tieneDenuncia",
    "tieneNota",
    "tieneReclamo",
    "tieneSiniestro",
    "tieneSubNota"
})
public class ParamObtenerMapaMsgSiniestro
    extends ParamGenerico
{

    protected String estadoReclamo;
    protected String notasAnteriores;
    protected int nroNota;
    protected int nroSubNota;
    protected Integer ramo;
    protected String ruta;
    protected String tieneDenuncia;
    protected String tieneNota;
    protected String tieneReclamo;
    protected String tieneSiniestro;
    protected String tieneSubNota;

    /**
     * Obtiene el valor de la propiedad estadoReclamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoReclamo() {
        return estadoReclamo;
    }

    /**
     * Define el valor de la propiedad estadoReclamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoReclamo(String value) {
        this.estadoReclamo = value;
    }

    /**
     * Obtiene el valor de la propiedad notasAnteriores.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotasAnteriores() {
        return notasAnteriores;
    }

    /**
     * Define el valor de la propiedad notasAnteriores.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotasAnteriores(String value) {
        this.notasAnteriores = value;
    }

    /**
     * Obtiene el valor de la propiedad nroNota.
     * 
     */
    public int getNroNota() {
        return nroNota;
    }

    /**
     * Define el valor de la propiedad nroNota.
     * 
     */
    public void setNroNota(int value) {
        this.nroNota = value;
    }

    /**
     * Obtiene el valor de la propiedad nroSubNota.
     * 
     */
    public int getNroSubNota() {
        return nroSubNota;
    }

    /**
     * Define el valor de la propiedad nroSubNota.
     * 
     */
    public void setNroSubNota(int value) {
        this.nroSubNota = value;
    }

    /**
     * Obtiene el valor de la propiedad ramo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRamo() {
        return ramo;
    }

    /**
     * Define el valor de la propiedad ramo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRamo(Integer value) {
        this.ramo = value;
    }

    /**
     * Obtiene el valor de la propiedad ruta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Define el valor de la propiedad ruta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuta(String value) {
        this.ruta = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneDenuncia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneDenuncia() {
        return tieneDenuncia;
    }

    /**
     * Define el valor de la propiedad tieneDenuncia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneDenuncia(String value) {
        this.tieneDenuncia = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneNota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneNota() {
        return tieneNota;
    }

    /**
     * Define el valor de la propiedad tieneNota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneNota(String value) {
        this.tieneNota = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneReclamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneReclamo() {
        return tieneReclamo;
    }

    /**
     * Define el valor de la propiedad tieneReclamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneReclamo(String value) {
        this.tieneReclamo = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneSiniestro() {
        return tieneSiniestro;
    }

    /**
     * Define el valor de la propiedad tieneSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneSiniestro(String value) {
        this.tieneSiniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneSubNota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneSubNota() {
        return tieneSubNota;
    }

    /**
     * Define el valor de la propiedad tieneSubNota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneSubNota(String value) {
        this.tieneSubNota = value;
    }

}
