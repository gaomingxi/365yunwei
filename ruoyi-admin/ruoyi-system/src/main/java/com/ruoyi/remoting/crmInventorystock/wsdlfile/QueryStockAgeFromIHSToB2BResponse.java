
package com.ruoyi.remoting.crmInventorystock.wsdlfile;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="SelectStockAgeOutput" type="{http://www.example.org/QueryStockAgeFromIHSToB2B/}SelectStockAgeOutput" maxOccurs="unbounded" minOccurs="0"/>
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
    "selectStockAgeOutput"
})
@XmlRootElement(name = "QueryStockAgeFromIHSToB2BResponse")
public class QueryStockAgeFromIHSToB2BResponse {

    @XmlElement(name = "SelectStockAgeOutput")
    protected List<SelectStockAgeOutput> selectStockAgeOutput;

    /**
     * Gets the value of the selectStockAgeOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectStockAgeOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectStockAgeOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectStockAgeOutput }
     * 
     * 
     */
    public List<SelectStockAgeOutput> getSelectStockAgeOutput() {
        if (selectStockAgeOutput == null) {
            selectStockAgeOutput = new ArrayList<SelectStockAgeOutput>();
        }
        return this.selectStockAgeOutput;
    }

}