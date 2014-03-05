
package com.google.api.ads.adwords.jaxws.v201306.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service used to get and mutate Feeds.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.1
 * 
 */
@WebService(name = "FeedServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FeedServiceInterface {


    /**
     * 
     *         Returns a list of Feeds that meet the selector criteria.
     *         
     *         @param selector Determines which Feeds to return. If empty all
     *         Feeds are returned.
     *         @return The list of Feeds.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201306.cm.FeedPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.cm.FeedServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.cm.FeedServiceInterfacegetResponse")
    public FeedPage get(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Add, remove, and set Feeds.
     *         
     *         @param operations The operations to apply.
     *         @return The resulting Feeds.
     *         @throws ApiException Indicates a problem with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201306.cm.FeedReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.cm.FeedServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306", className = "com.google.api.ads.adwords.jaxws.v201306.cm.FeedServiceInterfacemutateResponse")
    public FeedReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201306")
        List<FeedOperation> operations)
        throws ApiException_Exception
    ;

}