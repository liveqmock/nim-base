
package com.poweruniverse.nim.plateform.wsclient.designer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.poweruniverse.nim.plateform.wsclient.designer package. 
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

    private final static QName _SaveFile_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "saveFile");
    private final static QName _ReadCmpDef_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "readCmpDef");
    private final static QName _ReadFileResponse_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "readFileResponse");
    private final static QName _ReadPageDef_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "readPageDef");
    private final static QName _SavePageDefResponse_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "savePageDefResponse");
    private final static QName _ReadCmpDefResponse_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "readCmpDefResponse");
    private final static QName _SavePageDef_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "savePageDef");
    private final static QName _SaveFileResponse_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "saveFileResponse");
    private final static QName _ReadPageDefResponse_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "readPageDefResponse");
    private final static QName _ReadFile_QNAME = new QName("http://webservice.plateform.nim.poweruniverse.com/", "readFile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.poweruniverse.nim.plateform.wsclient.designer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadCmpDef }
     * 
     */
    public ReadCmpDef createReadCmpDef() {
        return new ReadCmpDef();
    }

    /**
     * Create an instance of {@link SaveFile }
     * 
     */
    public SaveFile createSaveFile() {
        return new SaveFile();
    }

    /**
     * Create an instance of {@link SavePageDef }
     * 
     */
    public SavePageDef createSavePageDef() {
        return new SavePageDef();
    }

    /**
     * Create an instance of {@link ReadCmpDefResponse }
     * 
     */
    public ReadCmpDefResponse createReadCmpDefResponse() {
        return new ReadCmpDefResponse();
    }

    /**
     * Create an instance of {@link SavePageDefResponse }
     * 
     */
    public SavePageDefResponse createSavePageDefResponse() {
        return new SavePageDefResponse();
    }

    /**
     * Create an instance of {@link ReadPageDef }
     * 
     */
    public ReadPageDef createReadPageDef() {
        return new ReadPageDef();
    }

    /**
     * Create an instance of {@link ReadFileResponse }
     * 
     */
    public ReadFileResponse createReadFileResponse() {
        return new ReadFileResponse();
    }

    /**
     * Create an instance of {@link ReadFile }
     * 
     */
    public ReadFile createReadFile() {
        return new ReadFile();
    }

    /**
     * Create an instance of {@link ReadPageDefResponse }
     * 
     */
    public ReadPageDefResponse createReadPageDefResponse() {
        return new ReadPageDefResponse();
    }

    /**
     * Create an instance of {@link SaveFileResponse }
     * 
     */
    public SaveFileResponse createSaveFileResponse() {
        return new SaveFileResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "saveFile")
    public JAXBElement<SaveFile> createSaveFile(SaveFile value) {
        return new JAXBElement<SaveFile>(_SaveFile_QNAME, SaveFile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCmpDef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "readCmpDef")
    public JAXBElement<ReadCmpDef> createReadCmpDef(ReadCmpDef value) {
        return new JAXBElement<ReadCmpDef>(_ReadCmpDef_QNAME, ReadCmpDef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "readFileResponse")
    public JAXBElement<ReadFileResponse> createReadFileResponse(ReadFileResponse value) {
        return new JAXBElement<ReadFileResponse>(_ReadFileResponse_QNAME, ReadFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPageDef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "readPageDef")
    public JAXBElement<ReadPageDef> createReadPageDef(ReadPageDef value) {
        return new JAXBElement<ReadPageDef>(_ReadPageDef_QNAME, ReadPageDef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePageDefResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "savePageDefResponse")
    public JAXBElement<SavePageDefResponse> createSavePageDefResponse(SavePageDefResponse value) {
        return new JAXBElement<SavePageDefResponse>(_SavePageDefResponse_QNAME, SavePageDefResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadCmpDefResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "readCmpDefResponse")
    public JAXBElement<ReadCmpDefResponse> createReadCmpDefResponse(ReadCmpDefResponse value) {
        return new JAXBElement<ReadCmpDefResponse>(_ReadCmpDefResponse_QNAME, ReadCmpDefResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePageDef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "savePageDef")
    public JAXBElement<SavePageDef> createSavePageDef(SavePageDef value) {
        return new JAXBElement<SavePageDef>(_SavePageDef_QNAME, SavePageDef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveFileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "saveFileResponse")
    public JAXBElement<SaveFileResponse> createSaveFileResponse(SaveFileResponse value) {
        return new JAXBElement<SaveFileResponse>(_SaveFileResponse_QNAME, SaveFileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPageDefResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "readPageDefResponse")
    public JAXBElement<ReadPageDefResponse> createReadPageDefResponse(ReadPageDefResponse value) {
        return new JAXBElement<ReadPageDefResponse>(_ReadPageDefResponse_QNAME, ReadPageDefResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadFile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.plateform.nim.poweruniverse.com/", name = "readFile")
    public JAXBElement<ReadFile> createReadFile(ReadFile value) {
        return new JAXBElement<ReadFile>(_ReadFile_QNAME, ReadFile.class, null, value);
    }

}
