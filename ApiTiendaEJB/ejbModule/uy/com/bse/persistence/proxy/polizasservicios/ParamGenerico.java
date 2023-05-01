
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramGenerico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramGenerico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramGenerico", propOrder = {
    "clave",
    "usuario"
})
@XmlSeeAlso({
    ParamObtenerBienesAseguradosPoliza.class,
    ParamValidarRefacturacion.class,
    ParamCotizacionPendienteSinPremio.class,
    ParamNuevaCotizacionEndoso.class,
    ParamCausaAnulacion.class,
    ParamCartaXTipoCarta.class,
    ParamEnviarFacturaDigitalEMail.class,
    ParamObtenerAseguradoCertifPoliza.class,
    ParamValidarPolizaRec.class,
    ParamAnularCertificadoEndoso.class,
    ParamEndosoSPDocumentacion.class,
    ParamObtenerCancelacionesRemesa.class,
    ParamObtenerDatosFacturaDigital.class,
    ParamObtenerDatosParametricos.class,
    ParamObtenerUbicacionBienPoliza.class,
    ParamDatosXDatosParametricosEndoso.class,
    ParamObtenerValidarImpresionPoliza.class,
    ParamObtenerDetallePoliza.class,
    ParamObtenerAsesorPoliza.class,
    ParamRecuotificarPoliza.class,
    ParamObtenerDatosEndosoPoliza.class,
    ParamObtenerTotalesCuotasPoliza.class,
    ParamCalcularRec.class,
    ParamModificacionSinPremio.class,
    ParamDatosXDatosParametricosPoliza.class,
    ParamObtenerRemesasXCliente.class,
    ParamObtenerOrigenRemesaAuto.class,
    ParamObtenerDatosCertificadoPoliza.class,
    ParamObjetosAcreedor.class,
    ParamDatosParametricoPoliza.class,
    ParamDatosParametricosEndoso.class,
    ParamValoresDatosParametricosEndoso.class,
    ParamObtenerImputacionesPoliza.class,
    ParamObtenerDetalleRemesa.class,
    ParamCotizacionPendiente.class,
    ParamObtenerConsolidado.class,
    ParamObtenerPolizasCabezal.class,
    ParamMotivoEndoso.class,
    ParamObtenerBeneficiariosPoliza.class,
    ParamObtenerFacturasPoliza.class,
    ParamGenerarMarcaNoRenovar.class,
    ParamObtenerTextosPoliza.class,
    ParamObtenerSiniestros.class,
    ParamNuevaFacturacionInteractiva.class,
    ParamAgregarCertificadoEndoso.class,
    ParamModoCalculo.class,
    ParamGenerarEndoso.class,
    ParamRefacturarPoliza.class,
    ParamObtenerFranquiciasPoliza.class,
    ParamObtenerPolizaCabezalDetalle.class,
    ParamObtenerDetalleTextoPoliza.class,
    ParamObtenerContratantePoliza.class,
    ParamObtenerDatosSiniestro.class,
    ParamObtenerPreliqPendientesPoliza.class,
    ParamObtenerDatosEndosoSinPremio.class,
    ParamObtenerDatosPoliza.class,
    ParamObtenerCuotasPoliza.class,
    ParamObtenerAcreedoresPoliza.class,
    ParamObtenerNotasSiniestro.class,
    ParamObtenerCertificadosPoliza.class,
    ParamValidarAnulacionPoliza.class,
    ParamListaPlanesPagoRec.class,
    ParamValidarDetectarEndoso.class,
    ParamObtenerAhorrosPoliza.class,
    ParamObtenerDatosBasicosEndoso.class,
    ParamObtenerAnexosPoliza.class,
    ParamGuardarImprimirReporte.class,
    ParamObtenerDatosRemesa.class,
    ParamObtenerSiniestrosConFiltro.class,
    ParamEndosoSPFactura.class,
    ParamObtenerListaBienesPoliza.class,
    ParamActualizarDatosParticulares.class,
    ParamListaCertificadosEndosar.class,
    ParamGuardarImprimirCarta.class,
    ParamObtenerCotizacionPoliza.class,
    ParamObtenerDeclaracionSiniestro.class,
    ParamObtenerPolizas.class,
    ParamObtenerProductoresPoliza.class,
    ParamMotivoAbandono.class,
    ParamObtenerDebitosAutomaticosPoliza.class,
    ParamObtenerSiniestrosCliente.class,
    ParamAnularPoliza.class,
    ParamTienePermisoProducto.class,
    ParamObtenerRemesasPoliza.class,
    ParamTipoAnulacion.class,
    ParamObtenerEndososPoliza.class,
    ParamTipoCarta.class,
    ParamValidarPoliza.class,
    ParamObtenerValoresXDatoParametrico.class,
    ParamOrigenEndoso.class,
    ParamObtenerBonifNoSiniestroPoliza.class,
    ParamValoresDatosParametricosPoliza.class
})
public class ParamGenerico {

    @XmlElement(required = true, nillable = true)
    protected String clave;
    @XmlElement(required = true, nillable = true)
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
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
