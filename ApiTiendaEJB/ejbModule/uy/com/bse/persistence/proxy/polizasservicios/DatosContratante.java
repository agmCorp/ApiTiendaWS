
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosContratante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosContratante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aclaracionDic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anulacionCorrida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clienteCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clienteDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCalle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="departamentoCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="departamentoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripDpto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaVencimiento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="direccionDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="direccionPiso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionUnidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localidadCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="localidadDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nacionalidadCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noTieneDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numPersona" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPostal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paisCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paisDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="radioCod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="radioDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stCapital" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textoFraude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tieneDeuda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tieneFraude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validaComunicaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosContratante", propOrder = {
    "aclaracionDic",
    "anulacionCorrida",
    "clienteCod",
    "clienteDesc",
    "codCalle",
    "departamentoCod",
    "departamentoDesc",
    "descripDpto",
    "diaVencimiento",
    "direccionDesc",
    "direccionNum",
    "direccionPiso",
    "direccionUnidad",
    "localidadCod",
    "localidadDesc",
    "nacionalidadCod",
    "noTieneDocumento",
    "numPersona",
    "numPostal",
    "paisCod",
    "paisDesc",
    "radioCod",
    "radioDesc",
    "stCapital",
    "telefono",
    "textoFraude",
    "tieneDeuda",
    "tieneFraude",
    "validaComunicaciones"
})
public class DatosContratante {

    protected String aclaracionDic;
    protected String anulacionCorrida;
    protected Integer clienteCod;
    protected String clienteDesc;
    protected Integer codCalle;
    protected Integer departamentoCod;
    protected String departamentoDesc;
    protected String descripDpto;
    protected Integer diaVencimiento;
    protected String direccionDesc;
    protected Integer direccionNum;
    protected String direccionPiso;
    protected String direccionUnidad;
    protected Integer localidadCod;
    protected String localidadDesc;
    protected String nacionalidadCod;
    protected String noTieneDocumento;
    protected Integer numPersona;
    protected Integer numPostal;
    protected Integer paisCod;
    protected String paisDesc;
    protected Integer radioCod;
    protected String radioDesc;
    protected Integer stCapital;
    protected String telefono;
    protected String textoFraude;
    protected String tieneDeuda;
    protected String tieneFraude;
    protected String validaComunicaciones;

    /**
     * Obtiene el valor de la propiedad aclaracionDic.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAclaracionDic() {
        return aclaracionDic;
    }

    /**
     * Define el valor de la propiedad aclaracionDic.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAclaracionDic(String value) {
        this.aclaracionDic = value;
    }

    /**
     * Obtiene el valor de la propiedad anulacionCorrida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnulacionCorrida() {
        return anulacionCorrida;
    }

    /**
     * Define el valor de la propiedad anulacionCorrida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnulacionCorrida(String value) {
        this.anulacionCorrida = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClienteCod() {
        return clienteCod;
    }

    /**
     * Define el valor de la propiedad clienteCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClienteCod(Integer value) {
        this.clienteCod = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteDesc() {
        return clienteDesc;
    }

    /**
     * Define el valor de la propiedad clienteDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteDesc(String value) {
        this.clienteDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad codCalle.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodCalle() {
        return codCalle;
    }

    /**
     * Define el valor de la propiedad codCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodCalle(Integer value) {
        this.codCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad departamentoCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepartamentoCod() {
        return departamentoCod;
    }

    /**
     * Define el valor de la propiedad departamentoCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepartamentoCod(Integer value) {
        this.departamentoCod = value;
    }

    /**
     * Obtiene el valor de la propiedad departamentoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoDesc() {
        return departamentoDesc;
    }

    /**
     * Define el valor de la propiedad departamentoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoDesc(String value) {
        this.departamentoDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad descripDpto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripDpto() {
        return descripDpto;
    }

    /**
     * Define el valor de la propiedad descripDpto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripDpto(String value) {
        this.descripDpto = value;
    }

    /**
     * Obtiene el valor de la propiedad diaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiaVencimiento() {
        return diaVencimiento;
    }

    /**
     * Define el valor de la propiedad diaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiaVencimiento(Integer value) {
        this.diaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionDesc() {
        return direccionDesc;
    }

    /**
     * Define el valor de la propiedad direccionDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionDesc(String value) {
        this.direccionDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDireccionNum() {
        return direccionNum;
    }

    /**
     * Define el valor de la propiedad direccionNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDireccionNum(Integer value) {
        this.direccionNum = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionPiso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionPiso() {
        return direccionPiso;
    }

    /**
     * Define el valor de la propiedad direccionPiso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionPiso(String value) {
        this.direccionPiso = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionUnidad() {
        return direccionUnidad;
    }

    /**
     * Define el valor de la propiedad direccionUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionUnidad(String value) {
        this.direccionUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad localidadCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLocalidadCod() {
        return localidadCod;
    }

    /**
     * Define el valor de la propiedad localidadCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLocalidadCod(Integer value) {
        this.localidadCod = value;
    }

    /**
     * Obtiene el valor de la propiedad localidadDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidadDesc() {
        return localidadDesc;
    }

    /**
     * Define el valor de la propiedad localidadDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidadDesc(String value) {
        this.localidadDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadCod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadCod() {
        return nacionalidadCod;
    }

    /**
     * Define el valor de la propiedad nacionalidadCod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadCod(String value) {
        this.nacionalidadCod = value;
    }

    /**
     * Obtiene el valor de la propiedad noTieneDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoTieneDocumento() {
        return noTieneDocumento;
    }

    /**
     * Define el valor de la propiedad noTieneDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoTieneDocumento(String value) {
        this.noTieneDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numPersona.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPersona() {
        return numPersona;
    }

    /**
     * Define el valor de la propiedad numPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPersona(Integer value) {
        this.numPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad numPostal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumPostal() {
        return numPostal;
    }

    /**
     * Define el valor de la propiedad numPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumPostal(Integer value) {
        this.numPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad paisCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaisCod() {
        return paisCod;
    }

    /**
     * Define el valor de la propiedad paisCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaisCod(Integer value) {
        this.paisCod = value;
    }

    /**
     * Obtiene el valor de la propiedad paisDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisDesc() {
        return paisDesc;
    }

    /**
     * Define el valor de la propiedad paisDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisDesc(String value) {
        this.paisDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad radioCod.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRadioCod() {
        return radioCod;
    }

    /**
     * Define el valor de la propiedad radioCod.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRadioCod(Integer value) {
        this.radioCod = value;
    }

    /**
     * Obtiene el valor de la propiedad radioDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioDesc() {
        return radioDesc;
    }

    /**
     * Define el valor de la propiedad radioDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioDesc(String value) {
        this.radioDesc = value;
    }

    /**
     * Obtiene el valor de la propiedad stCapital.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStCapital() {
        return stCapital;
    }

    /**
     * Define el valor de la propiedad stCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStCapital(Integer value) {
        this.stCapital = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad textoFraude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoFraude() {
        return textoFraude;
    }

    /**
     * Define el valor de la propiedad textoFraude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoFraude(String value) {
        this.textoFraude = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneDeuda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneDeuda() {
        return tieneDeuda;
    }

    /**
     * Define el valor de la propiedad tieneDeuda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneDeuda(String value) {
        this.tieneDeuda = value;
    }

    /**
     * Obtiene el valor de la propiedad tieneFraude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTieneFraude() {
        return tieneFraude;
    }

    /**
     * Define el valor de la propiedad tieneFraude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTieneFraude(String value) {
        this.tieneFraude = value;
    }

    /**
     * Obtiene el valor de la propiedad validaComunicaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidaComunicaciones() {
        return validaComunicaciones;
    }

    /**
     * Define el valor de la propiedad validaComunicaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidaComunicaciones(String value) {
        this.validaComunicaciones = value;
    }

}
