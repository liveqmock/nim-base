
package com.poweruniverse.nim.data.wsclient.analyse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.poweruniverse.nim.data.wsclient.analyse package. 
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

    private final static QName _Analyse_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "analyse");
    private final static QName _AnalyseResponse_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "analyseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.poweruniverse.nim.data.wsclient.analyse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnalyseResponse }
     * 
     */
    public AnalyseResponse createAnalyseResponse() {
        return new AnalyseResponse();
    }

    /**
     * Create an instance of {@link Analyse }
     * 
     */
    public Analyse createAnalyse() {
        return new Analyse();
    }

    /**
     * Create an instance of {@link StringResult }
     * 
     */
    public StringResult createStringResult() {
        return new StringResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Analyse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "analyse")
    public JAXBElement<Analyse> createAnalyse(Analyse value) {
        return new JAXBElement<Analyse>(_Analyse_QNAME, Analyse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "analyseResponse")
    public JAXBElement<AnalyseResponse> createAnalyseResponse(AnalyseResponse value) {
        return new JAXBElement<AnalyseResponse>(_AnalyseResponse_QNAME, AnalyseResponse.class, null, value);
    }

}
