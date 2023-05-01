
package uy.com.bse.persistence.proxy.polizasservicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosPoliza complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosPoliza">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.polizas.bse.com.uy/}datosBasicosPoliza">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codAdhesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codMedioPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codOrigenPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codTipoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datos" type="{http://ws.polizas.bse.com.uy/}datosBien" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deducible" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="descMedioPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descOrigenPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descPlanCobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descTipoCalculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripMedioPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripTipoNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaAmortizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoAdhesionFactDigital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoAnular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoBonifNoSiniestro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoClonar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoCuotas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoEndosar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoFactInteractiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoImprimir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoIntNominas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoModificarSinPremio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoNoRenovar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoNotas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoRecuotificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoRefacturar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoRenovacionManual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="habilitoVer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numCotizacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRefactPermitida" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosPoliza", propOrder = {
    "cliente",
    "codAdhesion",
    "codCliente",
    "codMedioPago",
    "codNacionalidad",
    "codOrigenPago",
    "codPlanCobertura",
    "codTipoCalculo",
    "datos",
    "deducible",
    "descMedioPago",
    "descOrigenPago",
    "descPlanCobertura",
    "descTipoCalculo",
    "descripEstado",
    "descripMedioPago",
    "descripTipoNegocio",
    "fechaAmortizacion",
    "fechaEmision",
    "habilitoAdhesionFactDigital",
    "habilitoAnular",
    "habilitoBonifNoSiniestro",
    "habilitoClonar",
    "habilitoCuotas",
    "habilitoEndosar",
    "habilitoFactInteractiva",
    "habilitoImprimir",
    "habilitoIntNominas",
    "habilitoModificarSinPremio",
    "habilitoNoRenovar",
    "habilitoNotas",
    "habilitoRecuotificar",
    "habilitoRefacturar",
    "habilitoRenovacionManual",
    "habilitoVer",
    "numCotizacion",
    "numPersona",
    "numRefactPermitida",
    "numTarjeta"
})
public class DatosPoliza
    extends DatosBasicosPoliza
{

    protected String cliente;
    protected String codAdhesion;
    protected String codCliente;
    protected Integer codMedioPago;
    protected String codNacionalidad;
    protected Integer codOrigenPago;
    protected String codPlanCobertura;
    protected String codTipoCalculo;
    @XmlElement(nillable = true)
    protected List<DatosBien> datos;
    protected Double deducible;
    protected String descMedioPago;
    protected String descOrigenPago;
    protected String descPlanCobertura;
    protected String descTipoCalculo;
    protected String descripEstado;
    protected String descripMedioPago;
    protected String descripTipoNegocio;
    protected String fechaAmortizacion;
    protected String fechaEmision;
    protected String habilitoAdhesionFactDigital;
    protected String habilitoAnular;
    protected String habilitoBonifNoSiniestro;
    protected String habilitoClonar;
    protected String habilitoCuotas;
    protected String habilitoEndosar;
    protected String habilitoFactInteractiva;
    protected String habilitoImprimir;
    protected String habilitoIntNominas;
    protected String habilitoModificarSinPremio;
    protected String habilitoNoRenovar;
    protected String habilitoNotas;
    protected String habilitoRecuotificar;
    protected String habilitoRefacturar;
    protected String habilitoRenovacionManual;
    protected String habilitoVer;
    protected Integer numCotizacion;
    protected String numPersona;
    protected Integer numRefactPermitida;
    protected String numTarjeta;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codAdhesion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAdhesion() {
        return codAdhesion;
    }

    /**
     * Define el valor de la propiedad codAdhesion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAdhesion(String value) {
        this.codAdhesion = value;
    }

    /**
     * Obtiene el valor de la propiedad codCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Define el valor de la propiedad codCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCliente(String value) {
        this.codCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodMedioPago() {
        return codMedioPago;
    }

    /**
     * Define el valor de la propiedad codMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodMedioPago(Integer value) {
        this.codMedioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNacionalidad() {
        return codNacionalidad;
    }

    /**
     * Define el valor de la propiedad codNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNacionalidad(String value) {
        this.codNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad codOrigenPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodOrigenPago() {
        return codOrigenPago;
    }

    /**
     * Define el valor de la propiedad codOrigenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodOrigenPago(Integer value) {
        this.codOrigenPago = value;
    }

    /**
     * Obtiene el valor de la propiedad codPlanCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPlanCobertura() {
        return codPlanCobertura;
    }

    /**
     * Define el valor de la propiedad codPlanCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPlanCobertura(String value) {
        this.codPlanCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad codTipoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoCalculo() {
        return codTipoCalculo;
    }

    /**
     * Define el valor de la propiedad codTipoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoCalculo(String value) {
        this.codTipoCalculo = value;
    }

    /**
     * Gets the value of the datos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosBien }
     * 
     * 
     */
    public List<DatosBien> getDatos() {
        if (datos == null) {
            datos = new ArrayList<DatosBien>();
        }
        return this.datos;
    }

    /**
     * Obtiene el valor de la propiedad deducible.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDeducible() {
        return deducible;
    }

    /**
     * Define el valor de la propiedad deducible.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDeducible(Double value) {
        this.deducible = value;
    }

    /**
     * Obtiene el valor de la propiedad descMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescMedioPago() {
        return descMedioPago;
    }

    /**
     * Define el valor de la propiedad descMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescMedioPago(String value) {
        this.descMedioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descOrigenPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescOrigenPago() {
        return descOrigenPago;
    }

    /**
     * Define el valor de la propiedad descOrigenPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescOrigenPago(String value) {
        this.descOrigenPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descPlanCobertura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPlanCobertura() {
        return descPlanCobertura;
    }

    /**
     * Define el valor de la propiedad descPlanCobertura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPlanCobertura(String value) {
        this.descPlanCobertura = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipoCalculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoCalculo() {
        return descTipoCalculo;
    }

    /**
     * Define el valor de la propiedad descTipoCalculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoCalculo(String value) {
        this.descTipoCalculo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripEstado() {
        return descripEstado;
    }

    /**
     * Define el valor de la propiedad descripEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripEstado(String value) {
        this.descripEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripMedioPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripMedioPago() {
        return descripMedioPago;
    }

    /**
     * Define el valor de la propiedad descripMedioPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripMedioPago(String value) {
        this.descripMedioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad descripTipoNegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripTipoNegocio() {
        return descripTipoNegocio;
    }

    /**
     * Define el valor de la propiedad descripTipoNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripTipoNegocio(String value) {
        this.descripTipoNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAmortizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaAmortizacion() {
        return fechaAmortizacion;
    }

    /**
     * Define el valor de la propiedad fechaAmortizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAmortizacion(String value) {
        this.fechaAmortizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaEmision(String value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoAdhesionFactDigital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoAdhesionFactDigital() {
        return habilitoAdhesionFactDigital;
    }

    /**
     * Define el valor de la propiedad habilitoAdhesionFactDigital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoAdhesionFactDigital(String value) {
        this.habilitoAdhesionFactDigital = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoAnular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoAnular() {
        return habilitoAnular;
    }

    /**
     * Define el valor de la propiedad habilitoAnular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoAnular(String value) {
        this.habilitoAnular = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoBonifNoSiniestro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoBonifNoSiniestro() {
        return habilitoBonifNoSiniestro;
    }

    /**
     * Define el valor de la propiedad habilitoBonifNoSiniestro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoBonifNoSiniestro(String value) {
        this.habilitoBonifNoSiniestro = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoClonar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoClonar() {
        return habilitoClonar;
    }

    /**
     * Define el valor de la propiedad habilitoClonar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoClonar(String value) {
        this.habilitoClonar = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoCuotas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoCuotas() {
        return habilitoCuotas;
    }

    /**
     * Define el valor de la propiedad habilitoCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoCuotas(String value) {
        this.habilitoCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoEndosar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoEndosar() {
        return habilitoEndosar;
    }

    /**
     * Define el valor de la propiedad habilitoEndosar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoEndosar(String value) {
        this.habilitoEndosar = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoFactInteractiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoFactInteractiva() {
        return habilitoFactInteractiva;
    }

    /**
     * Define el valor de la propiedad habilitoFactInteractiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoFactInteractiva(String value) {
        this.habilitoFactInteractiva = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoImprimir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoImprimir() {
        return habilitoImprimir;
    }

    /**
     * Define el valor de la propiedad habilitoImprimir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoImprimir(String value) {
        this.habilitoImprimir = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoIntNominas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoIntNominas() {
        return habilitoIntNominas;
    }

    /**
     * Define el valor de la propiedad habilitoIntNominas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoIntNominas(String value) {
        this.habilitoIntNominas = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoModificarSinPremio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoModificarSinPremio() {
        return habilitoModificarSinPremio;
    }

    /**
     * Define el valor de la propiedad habilitoModificarSinPremio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoModificarSinPremio(String value) {
        this.habilitoModificarSinPremio = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoNoRenovar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoNoRenovar() {
        return habilitoNoRenovar;
    }

    /**
     * Define el valor de la propiedad habilitoNoRenovar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoNoRenovar(String value) {
        this.habilitoNoRenovar = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoNotas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoNotas() {
        return habilitoNotas;
    }

    /**
     * Define el valor de la propiedad habilitoNotas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoNotas(String value) {
        this.habilitoNotas = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoRecuotificar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoRecuotificar() {
        return habilitoRecuotificar;
    }

    /**
     * Define el valor de la propiedad habilitoRecuotificar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoRecuotificar(String value) {
        this.habilitoRecuotificar = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoRefacturar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoRefacturar() {
        return habilitoRefacturar;
    }

    /**
     * Define el valor de la propiedad habilitoRefacturar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoRefacturar(String value) {
        this.habilitoRefacturar = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoRenovacionManual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoRenovacionManual() {
        return habilitoRenovacionManual;
    }

    /**
     * Define el valor de la propiedad habilitoRenovacionManual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoRenovacionManual(String value) {
        this.habilitoRenovacionManual = value;
    }

    /**
     * Obtiene el valor de la propiedad habilitoVer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHabilitoVer() {
        return habilitoVer;
    }

    /**
     * Define el valor de la propiedad habilitoVer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHabilitoVer(String value) {
        this.habilitoVer = value;
    }

    /**
     * Obtiene el valor de la propiedad numCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * Define el valor de la propiedad numCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumCotizacion(Integer value) {
        this.numCotizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad numPersona.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPersona() {
        return numPersona;
    }

    /**
     * Define el valor de la propiedad numPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPersona(String value) {
        this.numPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad numRefactPermitida.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRefactPermitida() {
        return numRefactPermitida;
    }

    /**
     * Define el valor de la propiedad numRefactPermitida.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRefactPermitida(Integer value) {
        this.numRefactPermitida = value;
    }

    /**
     * Obtiene el valor de la propiedad numTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Define el valor de la propiedad numTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTarjeta(String value) {
        this.numTarjeta = value;
    }

}
