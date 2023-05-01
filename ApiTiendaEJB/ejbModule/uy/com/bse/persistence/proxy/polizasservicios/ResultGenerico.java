
package uy.com.bse.persistence.proxy.polizasservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultGenerico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultGenerico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="error" type="{http://ws.polizas.bse.com.uy/}serviciosError" minOccurs="0"/>
 *         &lt;element name="hayError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultGenerico", propOrder = {
    "error",
    "hayError"
})
@XmlSeeAlso({
    ResultValidarRefacturacion.class,
    ResultTipoCarta.class,
    ResultMotivoAbandono.class,
    ResultRecuotificarPoliza.class,
    ResultGuardarImprimirOrdenCarta.class,
    ResultCodiguera.class,
    ResultCondicion.class,
    ResultObtenerConsolidado.class,
    ResultObtenerPreliqPendientesPoliza.class,
    ResultObtenerPolizasCabezal.class,
    ResultObtenerAseguradoCertifPoliza.class,
    ResultOrigenEndoso.class,
    ResultObtenerDetalleRemesa.class,
    ResultObtenerTextosPoliza.class,
    ResultModoCalculo.class,
    ResultObtenerEndososPoliza.class,
    ResultObtenerBonifNoSiniestroPoliza.class,
    ResultObtenerBeneficiariosPoliza.class,
    ResultEndosoSPFactura.class,
    ResultMotivoEndoso.class,
    ResultRefacturacionPoliza.class,
    ResultObtenerCotizacionPoliza.class,
    ResultObtenerSiniestrosConFiltro.class,
    ResultAnularCertificadoEndoso.class,
    ResultObtenerRemesasPoliza.class,
    ResultObtenerValidarImpresionPoliza.class,
    ResultValidarAnulacionPoliza.class,
    ResultEndosoSPDocumentacion.class,
    ResultObtenerTotalesCuotasPoliza.class,
    ResultObtenerSiniestros.class,
    ResultObtenerFranquiciasPoliza.class,
    ResultGuardarImprimirReporte.class,
    ResultObtenerCuotasPoliza.class,
    ResultListaPlanesPagoRec.class,
    ResultObtenerDatosPoliza.class,
    ResultObtenerDatosEndosoSinPremio.class,
    ResultGenerarEndoso.class,
    ResultObtenerRemesasXCliente.class,
    ResultObtenerImputacionesPoliza.class,
    ResultObtenerPolizas.class,
    ResultObtenerProductoresPoliza.class,
    ResultObtenerSiniestrosCliente.class,
    ResultValidarDetectarEndoso.class,
    ResultNuevaCotizacionEndoso.class,
    ResultCartaXTipoCarta.class,
    ResultObtenerListaBienesPoliza.class,
    ResultObtenerCancelacionesRemesa.class,
    ResultObtenerUbicacionBienPoliza.class,
    ResultObtenerAsesorPoliza.class,
    ResultObtenerCertificadosPoliza.class,
    ResultDatosXDatosParametricosEndoso.class,
    ResultObtenerPolizaCabezalDetalle.class,
    ResultObtenerAhorrosPoliza.class,
    ResultValidarPolizaRec.class,
    ResultValoresDatosParametricosPoliza.class,
    ResultObtenerBienesAseguradosPoliza.class,
    ResultObtenerDatosFacturaDigital.class,
    ResultAnularPoliza.class,
    ResultDatosParametricoPoliza.class,
    ResultObtenerDatosBasicosEndoso.class,
    ResultObtenerDeclaracionSiniestro.class,
    ResultModificacionSinPremio.class,
    ResultObtenerOrigenRemesaAuto.class,
    Cliente.class,
    ResultObtenerDatosSiniestro.class,
    ResultNuevaFacturacionInteractiva.class,
    ResultObtenerDatosParametricos.class,
    ResultDatosParametricosEndoso.class,
    ResultObtenerNotasSiniestro.class,
    ResultGenerarMarcaNoRenovar.class,
    ResultObtenerDetalleTextoPoliza.class,
    ResultObtenerDatosCertificadoPoliza.class,
    ResultObtenerDatosEndosoPoliza.class,
    ResultValoresDatosParametricosEndoso.class,
    ResultObtenerFacturasPoliza.class,
    ResultEnviarFacturaDigitalEMail.class,
    ResultCausaAnulacion.class,
    ResultObtenerAcreedoresPoliza.class,
    ResultAcreedorObjetos.class,
    ResultDatosXDatosParametricosPoliza.class,
    ResultCotizacionPendiente.class,
    ResultCalcularRec.class,
    ResultAgregarCertificadoEndoso.class,
    ResultValidarPoliza.class,
    ResultObtenerDebitosAutomaticosPoliza.class,
    ResultObtenerAnexosPoliza.class,
    ResultObtenerDetallePoliza.class,
    ResultObtenerDatosRemesa.class,
    ResultActualizarDatosParticulares.class,
    ResultTipoAnulacion.class,
    ResultObtenerContratantePoliza.class
})
public class ResultGenerico {

    protected ServiciosError error;
    protected Boolean hayError;

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link ServiciosError }
     *     
     */
    public ServiciosError getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiciosError }
     *     
     */
    public void setError(ServiciosError value) {
        this.error = value;
    }

    /**
     * Obtiene el valor de la propiedad hayError.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHayError() {
        return hayError;
    }

    /**
     * Define el valor de la propiedad hayError.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHayError(Boolean value) {
        this.hayError = value;
    }

}
