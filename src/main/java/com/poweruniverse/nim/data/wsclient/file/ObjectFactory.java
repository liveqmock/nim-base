
package com.poweruniverse.nim.data.wsclient.file;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.poweruniverse.nim.data.wsclient.file package. 
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

    private final static QName _Exception_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "Exception");
    private final static QName _Upload_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "upload");
    private final static QName _ReUpload_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "reUpload");
    private final static QName _ReUploadResponse_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "reUploadResponse");
    private final static QName _Download_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "download");
    private final static QName _DownloadResponse_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "downloadResponse");
    private final static QName _UploadResponse_QNAME = new QName("http://webservice.data.nim.poweruniverse.com/", "uploadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.poweruniverse.nim.data.wsclient.file
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link DownloadResponse }
     * 
     */
    public DownloadResponse createDownloadResponse() {
        return new DownloadResponse();
    }

    /**
     * Create an instance of {@link ReUploadResponse }
     * 
     */
    public ReUploadResponse createReUploadResponse() {
        return new ReUploadResponse();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link ReUpload }
     * 
     */
    public ReUpload createReUpload() {
        return new ReUpload();
    }

    /**
     * Create an instance of {@link JsonMessageResult }
     * 
     */
    public JsonMessageResult createJsonMessageResult() {
        return new JsonMessageResult();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "upload")
    public JAXBElement<Upload> createUpload(Upload value) {
        return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReUpload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "reUpload")
    public JAXBElement<ReUpload> createReUpload(ReUpload value) {
        return new JAXBElement<ReUpload>(_ReUpload_QNAME, ReUpload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReUploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "reUploadResponse")
    public JAXBElement<ReUploadResponse> createReUploadResponse(ReUploadResponse value) {
        return new JAXBElement<ReUploadResponse>(_ReUploadResponse_QNAME, ReUploadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Download }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "download")
    public JAXBElement<Download> createDownload(Download value) {
        return new JAXBElement<Download>(_Download_QNAME, Download.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "downloadResponse")
    public JAXBElement<DownloadResponse> createDownloadResponse(DownloadResponse value) {
        return new JAXBElement<DownloadResponse>(_DownloadResponse_QNAME, DownloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.data.nim.poweruniverse.com/", name = "uploadResponse")
    public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
        return new JAXBElement<UploadResponse>(_UploadResponse_QNAME, UploadResponse.class, null, value);
    }

}
