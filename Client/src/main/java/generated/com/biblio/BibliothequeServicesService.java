package com.biblio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2019-01-24T17:53:27.278+01:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "BibliothequeServicesService", 
                  wsdlLocation = "http://localhost:8084/bibliotheque/bibliothequeB?wsdl",
                  targetNamespace = "http://biblio.com/") 
public class BibliothequeServicesService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://biblio.com/", "BibliothequeServicesService");
    public final static QName BibliothequeServicesPort = new QName("http://biblio.com/", "BibliothequeServicesPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8084/bibliotheque/bibliothequeB?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BibliothequeServicesService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8084/bibliotheque/bibliothequeB?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BibliothequeServicesService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BibliothequeServicesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BibliothequeServicesService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BibliothequeServicesService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BibliothequeServicesService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BibliothequeServicesService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns BibliothequeServices
     */
    @WebEndpoint(name = "BibliothequeServicesPort")
    public BibliothequeServices getBibliothequeServicesPort() {
        return super.getPort(BibliothequeServicesPort, BibliothequeServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BibliothequeServices
     */
    @WebEndpoint(name = "BibliothequeServicesPort")
    public BibliothequeServices getBibliothequeServicesPort(WebServiceFeature... features) {
        return super.getPort(BibliothequeServicesPort, BibliothequeServices.class, features);
    }

}
