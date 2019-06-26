
package com.ruoyi.remoting.crmInventorystock.wsdlfile;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SelectStockAgeOutput complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SelectStockAgeOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DEPTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REGIONNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="INVSTD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WHCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SITENAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SORTCODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SORTNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="QTY" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="AGE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectStockAgeOutput", propOrder = {
    "deptcode",
    "regionname",
    "invcode",
    "invstd",
    "whcode",
    "sitename",
    "sortcode",
    "sortname",
    "qty",
    "age"
})
public class SelectStockAgeOutput {

    @XmlElement(name = "DEPTCODE", required = true)
    protected String deptcode;
    @XmlElement(name = "REGIONNAME", required = true)
    protected String regionname;
    @XmlElement(name = "INVCODE", required = true)
    protected String invcode;
    @XmlElement(name = "INVSTD", required = true)
    protected String invstd;
    @XmlElement(name = "WHCODE", required = true)
    protected String whcode;
    @XmlElement(name = "SITENAME", required = true)
    protected String sitename;
    @XmlElement(name = "SORTCODE", required = true)
    protected String sortcode;
    @XmlElement(name = "SORTNAME", required = true)
    protected String sortname;
    @XmlElement(name = "QTY", required = true)
    protected BigDecimal qty;
    @XmlElement(name = "AGE", required = true)
    protected BigDecimal age;

    /**
     * 获取deptcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPTCODE() {
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
    public void setDEPTCODE(String value) {
        this.deptcode = value;
    }

    /**
     * 获取regionname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGIONNAME() {
        return regionname;
    }

    /**
     * 设置regionname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGIONNAME(String value) {
        this.regionname = value;
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

    /**
     * 获取invstd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINVSTD() {
        return invstd;
    }

    /**
     * 设置invstd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINVSTD(String value) {
        this.invstd = value;
    }

    /**
     * 获取whcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWHCODE() {
        return whcode;
    }

    /**
     * 设置whcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWHCODE(String value) {
        this.whcode = value;
    }

    /**
     * 获取sitename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITENAME() {
        return sitename;
    }

    /**
     * 设置sitename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITENAME(String value) {
        this.sitename = value;
    }

    /**
     * 获取sortcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSORTCODE() {
        return sortcode;
    }

    /**
     * 设置sortcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSORTCODE(String value) {
        this.sortcode = value;
    }

    /**
     * 获取sortname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSORTNAME() {
        return sortname;
    }

    /**
     * 设置sortname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSORTNAME(String value) {
        this.sortname = value;
    }

    /**
     * 获取qty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQTY() {
        return qty;
    }

    /**
     * 设置qty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQTY(BigDecimal value) {
        this.qty = value;
    }

    /**
     * 获取age属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAGE() {
        return age;
    }

    /**
     * 设置age属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAGE(BigDecimal value) {
        this.age = value;
    }

}
