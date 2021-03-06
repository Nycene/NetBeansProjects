
package services;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TimeWS", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/TimeWS/TimeWS?wsdl")
public class TimeWS_Service
    extends Service
{

    private final static URL TIMEWS_WSDL_LOCATION;
    private final static WebServiceException TIMEWS_EXCEPTION;
    private final static QName TIMEWS_QNAME = new QName("http://services/", "TimeWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/TimeWS/TimeWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TIMEWS_WSDL_LOCATION = url;
        TIMEWS_EXCEPTION = e;
    }

    public TimeWS_Service() {
        super(__getWsdlLocation(), TIMEWS_QNAME);
    }

    public TimeWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TIMEWS_QNAME, features);
    }

    public TimeWS_Service(URL wsdlLocation) {
        super(wsdlLocation, TIMEWS_QNAME);
    }

    public TimeWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TIMEWS_QNAME, features);
    }

    public TimeWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TimeWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TimeWS
     */
    @WebEndpoint(name = "TimeWSPort")
    public TimeWS getTimeWSPort() {
        return super.getPort(new QName("http://services/", "TimeWSPort"), TimeWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TimeWS
     */
    @WebEndpoint(name = "TimeWSPort")
    public TimeWS getTimeWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "TimeWSPort"), TimeWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TIMEWS_EXCEPTION!= null) {
            throw TIMEWS_EXCEPTION;
        }
        return TIMEWS_WSDL_LOCATION;
    }

}
