
package com.poweruniverse.nim.data.wsclient.task;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.poweruniverse.nim.data.wsclient.task package. 
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

    private final static QName _GetStatusResponse_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "getStatusResponse");
    private final static QName _DoTask_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "doTask");
    private final static QName _GetStatus_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "getStatus");
    private final static QName _DoTaskResponse_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "doTaskResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.poweruniverse.nim.data.wsclient.task
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link DoTask }
     * 
     */
    public DoTask createDoTask() {
        return new DoTask();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link DoTaskResponse }
     * 
     */
    public DoTaskResponse createDoTaskResponse() {
        return new DoTaskResponse();
    }

    /**
     * Create an instance of {@link JsonMessageResult }
     * 
     */
    public JsonMessageResult createJsonMessageResult() {
        return new JsonMessageResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "getStatusResponse")
    public JAXBElement<GetStatusResponse> createGetStatusResponse(GetStatusResponse value) {
        return new JAXBElement<GetStatusResponse>(_GetStatusResponse_QNAME, GetStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoTask }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "doTask")
    public JAXBElement<DoTask> createDoTask(DoTask value) {
        return new JAXBElement<DoTask>(_DoTask_QNAME, DoTask.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "getStatus")
    public JAXBElement<GetStatus> createGetStatus(GetStatus value) {
        return new JAXBElement<GetStatus>(_GetStatus_QNAME, GetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoTaskResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "doTaskResponse")
    public JAXBElement<DoTaskResponse> createDoTaskResponse(DoTaskResponse value) {
        return new JAXBElement<DoTaskResponse>(_DoTaskResponse_QNAME, DoTaskResponse.class, null, value);
    }

}
