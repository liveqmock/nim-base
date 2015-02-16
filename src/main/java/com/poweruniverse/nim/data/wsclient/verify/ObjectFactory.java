
package com.poweruniverse.nim.data.wsclient.verify;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.poweruniverse.nim.data.wsclient.verify package. 
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

    private final static QName _HasGNCZAuth_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "hasGNCZAuth");
    private final static QName _CheckLogin_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "checkLogin");
    private final static QName _HasAuthResponse_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "hasAuthResponse");
    private final static QName _CheckLoginResponse_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "checkLoginResponse");
    private final static QName _HasGNCZAuthResponse_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "hasGNCZAuthResponse");
    private final static QName _HasAuth_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "hasAuth");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.poweruniverse.nim.data.wsclient.verify
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckLoginResponse }
     * 
     */
    public CheckLoginResponse createCheckLoginResponse() {
        return new CheckLoginResponse();
    }

    /**
     * Create an instance of {@link HasAuthResponse }
     * 
     */
    public HasAuthResponse createHasAuthResponse() {
        return new HasAuthResponse();
    }

    /**
     * Create an instance of {@link CheckLogin }
     * 
     */
    public CheckLogin createCheckLogin() {
        return new CheckLogin();
    }

    /**
     * Create an instance of {@link HasGNCZAuth }
     * 
     */
    public HasGNCZAuth createHasGNCZAuth() {
        return new HasGNCZAuth();
    }

    /**
     * Create an instance of {@link HasAuth }
     * 
     */
    public HasAuth createHasAuth() {
        return new HasAuth();
    }

    /**
     * Create an instance of {@link HasGNCZAuthResponse }
     * 
     */
    public HasGNCZAuthResponse createHasGNCZAuthResponse() {
        return new HasGNCZAuthResponse();
    }

    /**
     * Create an instance of {@link JsonMessageResult }
     * 
     */
    public JsonMessageResult createJsonMessageResult() {
        return new JsonMessageResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasGNCZAuth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "hasGNCZAuth")
    public JAXBElement<HasGNCZAuth> createHasGNCZAuth(HasGNCZAuth value) {
        return new JAXBElement<HasGNCZAuth>(_HasGNCZAuth_QNAME, HasGNCZAuth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "checkLogin")
    public JAXBElement<CheckLogin> createCheckLogin(CheckLogin value) {
        return new JAXBElement<CheckLogin>(_CheckLogin_QNAME, CheckLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasAuthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "hasAuthResponse")
    public JAXBElement<HasAuthResponse> createHasAuthResponse(HasAuthResponse value) {
        return new JAXBElement<HasAuthResponse>(_HasAuthResponse_QNAME, HasAuthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "checkLoginResponse")
    public JAXBElement<CheckLoginResponse> createCheckLoginResponse(CheckLoginResponse value) {
        return new JAXBElement<CheckLoginResponse>(_CheckLoginResponse_QNAME, CheckLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasGNCZAuthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "hasGNCZAuthResponse")
    public JAXBElement<HasGNCZAuthResponse> createHasGNCZAuthResponse(HasGNCZAuthResponse value) {
        return new JAXBElement<HasGNCZAuthResponse>(_HasGNCZAuthResponse_QNAME, HasGNCZAuthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasAuth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "hasAuth")
    public JAXBElement<HasAuth> createHasAuth(HasAuth value) {
        return new JAXBElement<HasAuth>(_HasAuth_QNAME, HasAuth.class, null, value);
    }

}
