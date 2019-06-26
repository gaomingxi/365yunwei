
package com.ruoyi.remoting.crmInventorystock.wsdlfile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡsaleCustCode���Ե�ֵ��
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
     * ����saleCustCode���Ե�ֵ��
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
     * ��ȡmainCustType���Ե�ֵ��
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
     * ����mainCustType���Ե�ֵ��
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
     * ��ȡdeptcode���Ե�ֵ��
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
     * ����deptcode���Ե�ֵ��
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
     * ��ȡinvcode���Ե�ֵ��
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
     * ����invcode���Ե�ֵ��
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
