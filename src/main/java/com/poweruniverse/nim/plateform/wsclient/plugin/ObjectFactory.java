
package com.poweruniverse.nim.plateform.wsclient.plugin;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.poweruniverse.nim.plateform.wsclient.plugin package. 
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

    private final static QName _HtmlResponse_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "htmlResponse");
    private final static QName _Js_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "js");
    private final static QName _CssResponse_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "cssResponse");
    private final static QName _Html_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "html");
    private final static QName _JsResponse_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "jsResponse");
    private final static QName _Css_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "css");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.poweruniverse.nim.plateform.wsclient.plugin
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HtmlResponse }
     * 
     */
    public HtmlResponse createHtmlResponse() {
        return new HtmlResponse();
    }

    /**
     * Create an instance of {@link Js }
     * 
     */
    public Js createJs() {
        return new Js();
    }

    /**
     * Create an instance of {@link JsResponse }
     * 
     */
    public JsResponse createJsResponse() {
        return new JsResponse();
    }

    /**
     * Create an instance of {@link Html }
     * 
     */
    public Html createHtml() {
        return new Html();
    }

    /**
     * Create an instance of {@link CssResponse }
     * 
     */
    public CssResponse createCssResponse() {
        return new CssResponse();
    }

    /**
     * Create an instance of {@link Css }
     * 
     */
    public Css createCss() {
        return new Css();
    }

    /**
     * Create an instance of {@link JsonMessageResult }
     * 
     */
    public JsonMessageResult createJsonMessageResult() {
        return new JsonMessageResult();
    }

    /**
     * Create an instance of {@link StringResult }
     * 
     */
    public StringResult createStringResult() {
        return new StringResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HtmlResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "htmlResponse")
    public JAXBElement<HtmlResponse> createHtmlResponse(HtmlResponse value) {
        return new JAXBElement<HtmlResponse>(_HtmlResponse_QNAME, HtmlResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Js }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "js")
    public JAXBElement<Js> createJs(Js value) {
        return new JAXBElement<Js>(_Js_QNAME, Js.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CssResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "cssResponse")
    public JAXBElement<CssResponse> createCssResponse(CssResponse value) {
        return new JAXBElement<CssResponse>(_CssResponse_QNAME, CssResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Html }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "html")
    public JAXBElement<Html> createHtml(Html value) {
        return new JAXBElement<Html>(_Html_QNAME, Html.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "jsResponse")
    public JAXBElement<JsResponse> createJsResponse(JsResponse value) {
        return new JAXBElement<JsResponse>(_JsResponse_QNAME, JsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Css }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "css")
    public JAXBElement<Css> createCss(Css value) {
        return new JAXBElement<Css>(_Css_QNAME, Css.class, null, value);
    }

}
