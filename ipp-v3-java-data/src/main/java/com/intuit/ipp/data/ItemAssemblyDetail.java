//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.10 at 09:45:50 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Contains the details of an
 * 				inventory assembly item.
 * 			
 * 
 * <p>Java class for ItemAssemblyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAssemblyDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemAssemblyLine" type="{http://schema.intuit.com/finance/v3}ItemComponentLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAssemblyDetail", propOrder = {
    "itemAssemblyLine"
})
public class ItemAssemblyDetail implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ItemAssemblyLine")
    protected List<ItemComponentLine> itemAssemblyLine;

    /**
     * Gets the value of the itemAssemblyLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemAssemblyLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemAssemblyLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemComponentLine }
     * 
     * 
     */
    public List<ItemComponentLine> getItemAssemblyLine() {
        if (itemAssemblyLine == null) {
            itemAssemblyLine = new ArrayList<ItemComponentLine>();
        }
        return this.itemAssemblyLine;
    }

    /**
     * Sets the value of the itemAssemblyLine property.
     * 
     * @param itemAssemblyLine
     *     allowed object is
     *     {@link ItemComponentLine }
     *     
     */
    public void setItemAssemblyLine(List<ItemComponentLine> itemAssemblyLine) {
        this.itemAssemblyLine = itemAssemblyLine;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ItemAssemblyDetail that = ((ItemAssemblyDetail) object);
        {
            List<ItemComponentLine> lhsItemAssemblyLine;
            lhsItemAssemblyLine = (((this.itemAssemblyLine!= null)&&(!this.itemAssemblyLine.isEmpty()))?this.getItemAssemblyLine():null);
            List<ItemComponentLine> rhsItemAssemblyLine;
            rhsItemAssemblyLine = (((that.itemAssemblyLine!= null)&&(!that.itemAssemblyLine.isEmpty()))?that.getItemAssemblyLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "itemAssemblyLine", lhsItemAssemblyLine), LocatorUtils.property(thatLocator, "itemAssemblyLine", rhsItemAssemblyLine), lhsItemAssemblyLine, rhsItemAssemblyLine, ((this.itemAssemblyLine!= null)&&(!this.itemAssemblyLine.isEmpty())), ((that.itemAssemblyLine!= null)&&(!that.itemAssemblyLine.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            List<ItemComponentLine> theItemAssemblyLine;
            theItemAssemblyLine = (((this.itemAssemblyLine!= null)&&(!this.itemAssemblyLine.isEmpty()))?this.getItemAssemblyLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "itemAssemblyLine", theItemAssemblyLine), currentHashCode, theItemAssemblyLine, ((this.itemAssemblyLine!= null)&&(!this.itemAssemblyLine.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
