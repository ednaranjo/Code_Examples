
package com.deitel.welcomesoap;

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
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WelcomeSOAPService", targetNamespace = "http://welcomesoap.deitel.com/", wsdlLocation = "http://localhost:8080/WelcomeSOAP/WelcomeSOAPService?WSDL")
public class WelcomeSOAPService
    extends Service
{

    private final static URL WELCOMESOAPSERVICE_WSDL_LOCATION;
    private final static WebServiceException WELCOMESOAPSERVICE_EXCEPTION;
    private final static QName WELCOMESOAPSERVICE_QNAME = new QName("http://welcomesoap.deitel.com/", "WelcomeSOAPService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WelcomeSOAP/WelcomeSOAPService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WELCOMESOAPSERVICE_WSDL_LOCATION = url;
        WELCOMESOAPSERVICE_EXCEPTION = e;
    }

    public WelcomeSOAPService() {
        super(__getWsdlLocation(), WELCOMESOAPSERVICE_QNAME);
    }

    public WelcomeSOAPService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WELCOMESOAPSERVICE_QNAME, features);
    }

    public WelcomeSOAPService(URL wsdlLocation) {
        super(wsdlLocation, WELCOMESOAPSERVICE_QNAME);
    }

    public WelcomeSOAPService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WELCOMESOAPSERVICE_QNAME, features);
    }

    public WelcomeSOAPService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WelcomeSOAPService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WelcomeSOAP
     */
    @WebEndpoint(name = "WelcomeSOAPPort")
    public WelcomeSOAP getWelcomeSOAPPort() {
        return super.getPort(new QName("http://welcomesoap.deitel.com/", "WelcomeSOAPPort"), WelcomeSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WelcomeSOAP
     */
    @WebEndpoint(name = "WelcomeSOAPPort")
    public WelcomeSOAP getWelcomeSOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://welcomesoap.deitel.com/", "WelcomeSOAPPort"), WelcomeSOAP.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WELCOMESOAPSERVICE_EXCEPTION!= null) {
            throw WELCOMESOAPSERVICE_EXCEPTION;
        }
        return WELCOMESOAPSERVICE_WSDL_LOCATION;
    }

}
