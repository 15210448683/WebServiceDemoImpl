
package com.moon.cxf.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.moon.cxf.client package. 
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

    private final static QName _Greeting_QNAME = new QName("http://server.cxfWebservice.moon.com/", "greeting");
    private final static QName _GreetingResponse_QNAME = new QName("http://server.cxfWebservice.moon.com/", "greetingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.moon.cxf.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Greeting_Type }
     * 
     */
    public Greeting_Type createGreeting_Type() {
        return new Greeting_Type();
    }

    /**
     * Create an instance of {@link GreetingResponse }
     * 
     */
    public GreetingResponse createGreetingResponse() {
        return new GreetingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Greeting_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.cxfWebservice.moon.com/", name = "greeting")
    public JAXBElement<Greeting_Type> createGreeting(Greeting_Type value) {
        return new JAXBElement<Greeting_Type>(_Greeting_QNAME, Greeting_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.cxfWebservice.moon.com/", name = "greetingResponse")
    public JAXBElement<GreetingResponse> createGreetingResponse(GreetingResponse value) {
        return new JAXBElement<GreetingResponse>(_GreetingResponse_QNAME, GreetingResponse.class, null, value);
    }

}
