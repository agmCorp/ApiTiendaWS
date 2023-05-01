
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para siniestro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="siniestro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}datosBasicosSiniestro">
 *       &lt;sequence>
 *         &lt;element name="codCausaSiniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCodigoPostal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codSucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codSucursalDenuncia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codTipoSiniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comisaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripCausa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripLocalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripNotificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripPremioCero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripProvincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripRamo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripSiniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripSucursalDenuncia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoSiniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="facultativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaNotificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="financiera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horaOcurrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoSiniestro" type="{http://ws.polizas.bse.com.uy/}infoSiniestro" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="juzgado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lugarOcurrencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numActa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numDenuncia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numNotificacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serieDenuncia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siniestroGraciable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tecnica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siniestro", propOrder = {
    "codCausaSiniestro",
    "codCodigoPostal",
    "codSucursal",
    "codSucursalDenuncia",
    "codTipoSiniestro",
    "comisaria",
    "descripCausa",
    "descripCliente",
    "descripLocalidad",
    "descripNotificador",
    "descripPlan",
    "descripPremioCero",
    "descripProvincia",
    "descripRamo",
    "descripSiniestro",
    "descripSucursal",
    "descripSucursalDenuncia",
    "descripTipoSiniestro",
    "facultativo",
    "fechaNotificacion",
    "fechaRegistro",
    "financiera",
    "horaOcurrencia",
    "infoSiniestro",
    "juzgado",
    "lugarOcurrencia",
    "numActa",
    "numDenuncia",
    "numNotificacion",
    "serieDenuncia",
    "siniestroGraciable",
    "tecnica",
    "usuario"
})
public class Siniestro
    extends DatosBasicosSiniestro
{

    protected String codCausaSiniestro;
    protected Integer codCodigoPostal;
    protected Integer codSucursal;
    protected Integer codSucursalDenuncia;
    protected String codTipoSiniestro;
    protected String comisaria;
    protected String descripCausa;
    protected String descripCliente;
    protected String descripLocalidad;
    protected String descripNotificador;
    protected String descripPlan;
    protected String descripPremioCero;
    protected String descripProvincia;
    protected String descripRamo;
    protected String descripSiniestro;
    protected String descripSucursal;
    protected String descripSucursalDenuncia;
    protected String descripTipoSiniestro;
    protected String facultativo;
    protected String fechaNotificacion;
    protected String fechaRegistro;
    protected String financiera;
    protected String horaOcurrencia;
    @XmlElement(nillable = true)
    protected List<InfoSiniestro> infoSiniestro;
    protected String juzgado;
    protected String lugarOcurrencia;
    protected Integer numActa;
    protected Integer numDenuncia;
    protected Integer numNotificacion;
    protected String serieDenuncia;
    protected String siniestroGraciable;
    protected String tecnica;
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad codCausaSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCausaSiniestro() {
        return codCausaSiniestro;
    }

    /**
     * Define el valor de la propiedad codCausaSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCausaSiniestro(String value) {
        this.codCausaSiniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad codCodigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodCodigoPostal() {
        return codCodigoPostal;
    }

    /**
     * Define el valor de la propiedad codCodigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodCodigoPostal(Integer value) {
        this.codCodigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad codSucursal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodSucursal() {
        return codSucursal;
    }

    /**
     * Define el valor de la propiedad codSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodSucursal(Integer value) {
        this.codSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad codSucursalDenuncia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodSucursalDenuncia() {
        return codSucursalDenuncia;
    }

    /**
     * Define el valor de la propiedad codSucursalDenuncia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodSucursalDenuncia(Integer value) {
        this.codSucursalDenuncia = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoSiniestro() {
        return codTipoSiniestro;
    }

    /**
     * Define el valor de la propiedad codTipoSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoSiniestro(String value) {
        this.codTipoSiniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad comisaria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComisaria() {
        return comisaria;
    }

    /**
     * Define el valor de la propiedad comisaria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComisaria(String value) {
        this.comisaria = value;
    }

    /**
     * Obtiene el valor de la propiedad descripCausa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripCausa() {
        return descripCausa;
    }

    /**
     * Define el valor de la propiedad descripCausa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripCausa(String value) {
        this.descripCausa = value;
    }

    /**
     * Obtiene el valor de la propiedad descripCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripCliente() {
        return descripCliente;
    }

    /**
     * Define el valor de la propiedad descripCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripCliente(String value) {
        this.descripCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad descripLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripLocalidad() {
        return descripLocalidad;
    }

    /**
     * Define el valor de la propiedad descripLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripLocalidad(String value) {
        this.descripLocalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad descripNotificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripNotificador() {
        return descripNotificador;
    }

    /**
     * Define el valor de la propiedad descripNotificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripNotificador(String value) {
        this.descripNotificador = value;
    }

    /**
     * Obtiene el valor de la propiedad descripPlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripPlan() {
        return descripPlan;
    }

    /**
     * Define el valor de la propiedad descripPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripPlan(String value) {
        this.descripPlan = value;
    }

    /**
     * Obtiene el valor de la propiedad descripPremioCero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripPremioCero() {
        return descripPremioCero;
    }

    /**
     * Define el valor de la propiedad descripPremioCero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripPremioCero(String value) {
        this.descripPremioCero = value;
    }

    /**
     * Obtiene el valor de la propiedad descripProvincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripProvincia() {
        return descripProvincia;
    }

    /**
     * Define el valor de la propiedad descripProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripProvincia(String value) {
        this.descripProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad descripRamo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripRamo() {
        return descripRamo;
    }

    /**
     * Define el valor de la propiedad descripRamo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripRamo(String value) {
        this.descripRamo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripSiniestro() {
        return descripSiniestro;
    }

    /**
     * Define el valor de la propiedad descripSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripSiniestro(String value) {
        this.descripSiniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad descripSucursal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripSucursal() {
        return descripSucursal;
    }

    /**
     * Define el valor de la propiedad descripSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripSucursal(String value) {
        this.descripSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad descripSucursalDenuncia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripSucursalDenuncia() {
        return descripSucursalDenuncia;
    }

    /**
     * Define el valor de la propiedad descripSucursalDenuncia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripSucursalDenuncia(String value) {
        this.descripSucursalDenuncia = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTipoSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTipoSiniestro() {
        return descripTipoSiniestro;
    }

    /**
     * Define el valor de la propiedad descripTipoSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTipoSiniestro(String value) {
        this.descripTipoSiniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad facultativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacultativo() {
        return facultativo;
    }

    /**
     * Define el valor de la propiedad facultativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacultativo(String value) {
        this.facultativo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNotificacion() {
        return fechaNotificacion;
    }

    /**
     * Define el valor de la propiedad fechaNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNotificacion(String value) {
        this.fechaNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Define el valor de la propiedad fechaRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegistro(String value) {
        this.fechaRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad financiera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinanciera() {
        return financiera;
    }

    /**
     * Define el valor de la propiedad financiera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinanciera(String value) {
        this.financiera = value;
    }

    /**
     * Obtiene el valor de la propiedad horaOcurrencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraOcurrencia() {
        return horaOcurrencia;
    }

    /**
     * Define el valor de la propiedad horaOcurrencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraOcurrencia(String value) {
        this.horaOcurrencia = value;
    }

    /**
     * Gets the value of the infoSiniestro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoSiniestro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoSiniestro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoSiniestro }
     * 
     * 
     */
    public List<InfoSiniestro> getInfoSiniestro() {
        if (infoSiniestro == null) {
            infoSiniestro = new ArrayList<InfoSiniestro>();
        }
        return this.infoSiniestro;
    }

    /**
     * Obtiene el valor de la propiedad juzgado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJuzgado() {
        return juzgado;
    }

    /**
     * Define el valor de la propiedad juzgado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJuzgado(String value) {
        this.juzgado = value;
    }

    /**
     * Obtiene el valor de la propiedad lugarOcurrencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLugarOcurrencia() {
        return lugarOcurrencia;
    }

    /**
     * Define el valor de la propiedad lugarOcurrencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLugarOcurrencia(String value) {
        this.lugarOcurrencia = value;
    }

    /**
     * Obtiene el valor de la propiedad numActa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumActa() {
        return numActa;
    }

    /**
     * Define el valor de la propiedad numActa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumActa(Integer value) {
        this.numActa = value;
    }

    /**
     * Obtiene el valor de la propiedad numDenuncia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumDenuncia() {
        return numDenuncia;
    }

    /**
     * Define el valor de la propiedad numDenuncia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumDenuncia(Integer value) {
        this.numDenuncia = value;
    }

    /**
     * Obtiene el valor de la propiedad numNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumNotificacion() {
        return numNotificacion;
    }

    /**
     * Define el valor de la propiedad numNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumNotificacion(Integer value) {
        this.numNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad serieDenuncia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieDenuncia() {
        return serieDenuncia;
    }

    /**
     * Define el valor de la propiedad serieDenuncia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieDenuncia(String value) {
        this.serieDenuncia = value;
    }

    /**
     * Obtiene el valor de la propiedad siniestroGraciable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiniestroGraciable() {
        return siniestroGraciable;
    }

    /**
     * Define el valor de la propiedad siniestroGraciable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiniestroGraciable(String value) {
        this.siniestroGraciable = value;
    }

    /**
     * Obtiene el valor de la propiedad tecnica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTecnica() {
        return tecnica;
    }

    /**
     * Define el valor de la propiedad tecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTecnica(String value) {
        this.tecnica = value;
    }

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

}
