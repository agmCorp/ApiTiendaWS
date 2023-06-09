
package uy.com.bse.persistence.proxy.polizasservicios;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WsServiciosPolizas", targetNamespace = "http://ws.polizas.bse.com.uy/", wsdlLocation = "http://jboss-test.bse.com.uy:9080/ServiciosRectorWS/WsServiciosPolizas?wsdl")
public class WsServiciosPolizas
    extends Service
{

    private final static URL WSSERVICIOSPOLIZAS_WSDL_LOCATION;
    private final static WebServiceException WSSERVICIOSPOLIZAS_EXCEPTION;
    private final static QName WSSERVICIOSPOLIZAS_QNAME = new QName("http://ws.polizas.bse.com.uy/", "WsServiciosPolizas");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://jboss-test.bse.com.uy:9080/ServiciosRectorWS/WsServiciosPolizas?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSSERVICIOSPOLIZAS_WSDL_LOCATION = url;
        WSSERVICIOSPOLIZAS_EXCEPTION = e;
    }

    public WsServiciosPolizas() {
        super(__getWsdlLocation(), WSSERVICIOSPOLIZAS_QNAME);
    }

    public WsServiciosPolizas(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSSERVICIOSPOLIZAS_QNAME, features);
    }

    public WsServiciosPolizas(URL wsdlLocation) {
        super(wsdlLocation, WSSERVICIOSPOLIZAS_QNAME);
    }

    public WsServiciosPolizas(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSSERVICIOSPOLIZAS_QNAME, features);
    }

    public WsServiciosPolizas(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsServiciosPolizas(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IWsServiciosPolizas
     */
    @WebEndpoint(name = "WsServiciosPolizasPort")
    public IWsServiciosPolizas getWsServiciosPolizasPort() {
        return super.getPort(new QName("http://ws.polizas.bse.com.uy/", "WsServiciosPolizasPort"), IWsServiciosPolizas.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWsServiciosPolizas
     */
    @WebEndpoint(name = "WsServiciosPolizasPort")
    public IWsServiciosPolizas getWsServiciosPolizasPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.polizas.bse.com.uy/", "WsServiciosPolizasPort"), IWsServiciosPolizas.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSSERVICIOSPOLIZAS_EXCEPTION!= null) {
            throw WSSERVICIOSPOLIZAS_EXCEPTION;
        }
        return WSSERVICIOSPOLIZAS_WSDL_LOCATION;
    }

}
