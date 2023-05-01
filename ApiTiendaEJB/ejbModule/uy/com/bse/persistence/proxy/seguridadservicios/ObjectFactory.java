
package uy.com.bse.persistence.proxy.seguridadservicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uy.com.bse.persistence.proxy.seguridadservicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Logout_QNAME = new QName("http://ws.seguridad.bse.com.uy/", "logout");
    private final static QName _LoginResponse_QNAME = new QName("http://ws.seguridad.bse.com.uy/", "loginResponse");
    private final static QName _LogoutResponse_QNAME = new QName("http://ws.seguridad.bse.com.uy/", "logoutResponse");
    private final static QName _LoginGroup_QNAME = new QName("http://ws.seguridad.bse.com.uy/", "loginGroup");
    private final static QName _Validar_QNAME = new QName("http://ws.seguridad.bse.com.uy/", "validar");
    private final static QName _ValidarResponse_QNAME = new QName("http://ws.seguridad.bse.com.uy/", "validarResponse");
    private final static QName _LoginGroupResponse_QNAME = new QName("http://ws.seguridad.bse.com.uy/", "loginGroupResponse");
    private final static QName _Login_QNAME = new QName("http://ws.seguridad.bse.com.uy/", "login");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uy.com.bse.persistence.proxy.seguridadservicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link LoginGroup }
     * 
     */
    public LoginGroup createLoginGroup() {
        return new LoginGroup();
    }

    /**
     * Create an instance of {@link Validar }
     * 
     */
    public Validar createValidar() {
        return new Validar();
    }

    /**
     * Create an instance of {@link ValidarResponse }
     * 
     */
    public ValidarResponse createValidarResponse() {
        return new ValidarResponse();
    }

    /**
     * Create an instance of {@link LoginGroupResponse }
     * 
     */
    public LoginGroupResponse createLoginGroupResponse() {
        return new LoginGroupResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ResultLogin }
     * 
     */
    public ResultLogin createResultLogin() {
        return new ResultLogin();
    }

    /**
     * Create an instance of {@link ResultLoginGroup }
     * 
     */
    public ResultLoginGroup createResultLoginGroup() {
        return new ResultLoginGroup();
    }

    /**
     * Create an instance of {@link ParamValidar }
     * 
     */
    public ParamValidar createParamValidar() {
        return new ParamValidar();
    }

    /**
     * Create an instance of {@link ParamLogout }
     * 
     */
    public ParamLogout createParamLogout() {
        return new ParamLogout();
    }

    /**
     * Create an instance of {@link ParamLoginGroup }
     * 
     */
    public ParamLoginGroup createParamLoginGroup() {
        return new ParamLoginGroup();
    }

    /**
     * Create an instance of {@link ParamLogin }
     * 
     */
    public ParamLogin createParamLogin() {
        return new ParamLogin();
    }

    /**
     * Create an instance of {@link ResultLogout }
     * 
     */
    public ResultLogout createResultLogout() {
        return new ResultLogout();
    }

    /**
     * Create an instance of {@link ResultValidar }
     * 
     */
    public ResultValidar createResultValidar() {
        return new ResultValidar();
    }

    /**
     * Create an instance of {@link ParamGenerico }
     * 
     */
    public ParamGenerico createParamGenerico() {
        return new ParamGenerico();
    }

    /**
     * Create an instance of {@link ServiciosError }
     * 
     */
    public ServiciosError createServiciosError() {
        return new ServiciosError();
    }

    /**
     * Create an instance of {@link ResultGenerico }
     * 
     */
    public ResultGenerico createResultGenerico() {
        return new ResultGenerico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seguridad.bse.com.uy/", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seguridad.bse.com.uy/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seguridad.bse.com.uy/", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seguridad.bse.com.uy/", name = "loginGroup")
    public JAXBElement<LoginGroup> createLoginGroup(LoginGroup value) {
        return new JAXBElement<LoginGroup>(_LoginGroup_QNAME, LoginGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Validar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seguridad.bse.com.uy/", name = "validar")
    public JAXBElement<Validar> createValidar(Validar value) {
        return new JAXBElement<Validar>(_Validar_QNAME, Validar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seguridad.bse.com.uy/", name = "validarResponse")
    public JAXBElement<ValidarResponse> createValidarResponse(ValidarResponse value) {
        return new JAXBElement<ValidarResponse>(_ValidarResponse_QNAME, ValidarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seguridad.bse.com.uy/", name = "loginGroupResponse")
    public JAXBElement<LoginGroupResponse> createLoginGroupResponse(LoginGroupResponse value) {
        return new JAXBElement<LoginGroupResponse>(_LoginGroupResponse_QNAME, LoginGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.seguridad.bse.com.uy/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

}
