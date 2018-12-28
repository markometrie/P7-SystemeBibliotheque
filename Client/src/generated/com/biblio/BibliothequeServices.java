package com.biblio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2018-12-27T20:27:40.951+01:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://biblio.com/", name = "BibliothequeServices")
@XmlSeeAlso({ObjectFactory.class})
public interface BibliothequeServices {

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/searchBiblioRequest", output = "http://biblio.com/BibliothequeServices/searchBiblioResponse")
    @RequestWrapper(localName = "searchBiblio", targetNamespace = "http://biblio.com/", className = "com.biblio.SearchBiblio")
    @ResponseWrapper(localName = "searchBiblioResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.SearchBiblioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.BibliothequeResponse searchBiblio(
        @WebParam(name = "refbibliotheque", targetNamespace = "")
        int refbibliotheque
    );

    @WebMethod(operationName = "BibliothequeServices")
    @Action(input = "http://biblio.com/BibliothequeServices/BibliothequeServicesRequest", output = "http://biblio.com/BibliothequeServices/BibliothequeServicesResponse")
    @RequestWrapper(localName = "BibliothequeServices", targetNamespace = "http://biblio.com/", className = "com.biblio.BibliothequeServices_Type")
    @ResponseWrapper(localName = "BibliothequeServicesResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.BibliothequeServicesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.BibliothequeResponse bibliothequeServices(
        @WebParam(name = "refbibliotheque", targetNamespace = "")
        int refbibliotheque,
        @WebParam(name = "nom", targetNamespace = "")
        java.lang.String nom,
        @WebParam(name = "adresse", targetNamespace = "")
        java.lang.String adresse,
        @WebParam(name = "ville", targetNamespace = "")
        java.lang.String ville,
        @WebParam(name = "codepostal", targetNamespace = "")
        java.lang.String codepostal,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description
    );
}
