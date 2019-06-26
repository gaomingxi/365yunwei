
package com.ruoyi.remoting.crmInventorystock.wsdlfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleCustCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MainCustType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Deptcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "saleCustCode",
    "mainCustType",
    "deptcode",
    "invcode"
})
@XmlRootElement(name = "QueryStockAgeFromIHSToB2B")
public class QueryStockAgeFromIHSToB2B_Type {

    @XmlElement(name = "SaleCustCode", required = true)
    protected String saleCustCode;
    @XmlElement(name = "MainCustType", required = true)
    protected String mainCustType;
    @XmlElement(name = "Deptcode", required = true)
    protected String deptcode;
    @XmlElement(name = "INVCODE", required = true)
    protected String invcode;

    /**
     * 获取saleCustCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleCustCode() {
        return saleCustCode;
    }

    /**
     * 设置saleCustCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleCustCode(String value) {
        this.saleCustCode = value;
    }

    /**
     * 获取mainCustType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainCustType() {
        return mainCustType;
    }

    /**
     * 设置mainCustType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainCustType(String value) {
        this.mainCustType = value;
    }

    /**
     * 获取deptcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptcode() {
        return deptcode;
    }

    /**
     * 设置deptcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptcode(String value) {
        this.deptcode = value;
    }

    /**
     * 获取invcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVCODE() {
        return invcode;
    }

    /**
     * 设置invcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVCODE(String value) {
        this.invcode = value;
    }

}
