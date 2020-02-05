package com.ruoyi.remoting.crmInventorystock.wsdlfile;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2019-05-14T14:47:00.345+08:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "QueryStockAgeFromIHSToB2B", 
                  wsdlLocation = "file:/E:/workspace-stu/demo_365/resource/wsdl/QueryStockAgeFromIHSToB2B.wsdl",
                  targetNamespace = "http://www.example.org/QueryStockAgeFromIHSToB2B/") 
public class QueryStockAgeFromIHSToB2B_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/QueryStockAgeFromIHSToB2B/", "QueryStockAgeFromIHSToB2B");
    public final static QName QueryStockAgeFromIHSToB2BSOAP = new QName("http://www.example.org/QueryStockAgeFromIHSToB2B/", "QueryStockAgeFromIHSToB2BSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/E:/workspace-stu/demo_365/resource/wsdl/QueryStockAgeFromIHSToB2B.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(QueryStockAgeFromIHSToB2B_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/E:/workspace-stu/demo_365/resource/wsdl/QueryStockAgeFromIHSToB2B.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public QueryStockAgeFromIHSToB2B_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QueryStockAgeFromIHSToB2B_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QueryStockAgeFromIHSToB2B_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public QueryStockAgeFromIHSToB2B_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public QueryStockAgeFromIHSToB2B_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public QueryStockAgeFromIHSToB2B_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns QueryStockAgeFromIHSToB2B
     */
    @WebEndpoint(name = "QueryStockAgeFromIHSToB2BSOAP")
    public QueryStockAgeFromIHSToB2B getQueryStockAgeFromIHSToB2BSOAP() {
        return super.getPort(QueryStockAgeFromIHSToB2BSOAP, QueryStockAgeFromIHSToB2B.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QueryStockAgeFromIHSToB2B
     */
    @WebEndpoint(name = "QueryStockAgeFromIHSToB2BSOAP")
    public QueryStockAgeFromIHSToB2B getQueryStockAgeFromIHSToB2BSOAP(WebServiceFeature... features) {
        return super.getPort(QueryStockAgeFromIHSToB2BSOAP, QueryStockAgeFromIHSToB2B.class, features);
    }

}