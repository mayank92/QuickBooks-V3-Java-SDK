//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.09.10 at 09:45:50 AM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Defines VendorAndPurchase Prefs details
 * 			
 * 
 * <p>Java class for VendorAndPurchasesPrefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorAndPurchasesPrefs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnableBills" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TrackingByCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BillableExpenseTracking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultTerms" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="DefaultMarkup" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DefaultMarkupAccount" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticBillPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TPAREnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="POCustomField" type="{http://schema.intuit.com/finance/v3}CustomFieldDefinition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MsgToVendors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsingInventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UsingMultiLocationInventory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DaysBillsAreDue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DiscountAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorAndPurchasesPrefs", propOrder = {
    "enableBills",
    "trackingByCustomer",
    "billableExpenseTracking",
    "defaultTerms",
    "defaultMarkup",
    "defaultMarkupAccount",
    "automaticBillPayment",
    "tparEnabled",
    "poCustomField",
    "msgToVendors",
    "usingInventory",
    "usingMultiLocationInventory",
    "daysBillsAreDue",
    "discountAccountRef"
})
public class VendorAndPurchasesPrefs implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EnableBills")
    protected Boolean enableBills;
    @XmlElement(name = "TrackingByCustomer")
    protected Boolean trackingByCustomer;
    @XmlElement(name = "BillableExpenseTracking")
    protected Boolean billableExpenseTracking;
    @XmlElement(name = "DefaultTerms")
    protected ReferenceType defaultTerms;
    @XmlElement(name = "DefaultMarkup")
    protected BigDecimal defaultMarkup;
    @XmlElement(name = "DefaultMarkupAccount")
    protected ReferenceType defaultMarkupAccount;
    @XmlElement(name = "AutomaticBillPayment")
    protected Boolean automaticBillPayment;
    @XmlElement(name = "TPAREnabled")
    protected Boolean tparEnabled;
    @XmlElement(name = "POCustomField")
    protected List<CustomFieldDefinition> poCustomField;
    @XmlElement(name = "MsgToVendors")
    protected String msgToVendors;
    @XmlElement(name = "UsingInventory")
    protected Boolean usingInventory;
    @XmlElement(name = "UsingMultiLocationInventory")
    protected Boolean usingMultiLocationInventory;
    @XmlElement(name = "DaysBillsAreDue")
    protected Integer daysBillsAreDue;
    @XmlElement(name = "DiscountAccountRef")
    protected ReferenceType discountAccountRef;

    /**
     * Gets the value of the enableBills property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableBills() {
        return enableBills;
    }

    /**
     * Sets the value of the enableBills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableBills(Boolean value) {
        this.enableBills = value;
    }

    /**
     * Gets the value of the trackingByCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackingByCustomer() {
        return trackingByCustomer;
    }

    /**
     * Sets the value of the trackingByCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackingByCustomer(Boolean value) {
        this.trackingByCustomer = value;
    }

    /**
     * Gets the value of the billableExpenseTracking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBillableExpenseTracking() {
        return billableExpenseTracking;
    }

    /**
     * Sets the value of the billableExpenseTracking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBillableExpenseTracking(Boolean value) {
        this.billableExpenseTracking = value;
    }

    /**
     * Gets the value of the defaultTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDefaultTerms() {
        return defaultTerms;
    }

    /**
     * Sets the value of the defaultTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDefaultTerms(ReferenceType value) {
        this.defaultTerms = value;
    }

    /**
     * Gets the value of the defaultMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDefaultMarkup() {
        return defaultMarkup;
    }

    /**
     * Sets the value of the defaultMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDefaultMarkup(BigDecimal value) {
        this.defaultMarkup = value;
    }

    /**
     * Gets the value of the defaultMarkupAccount property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDefaultMarkupAccount() {
        return defaultMarkupAccount;
    }

    /**
     * Sets the value of the defaultMarkupAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDefaultMarkupAccount(ReferenceType value) {
        this.defaultMarkupAccount = value;
    }

    /**
     * Gets the value of the automaticBillPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticBillPayment() {
        return automaticBillPayment;
    }

    /**
     * Sets the value of the automaticBillPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticBillPayment(Boolean value) {
        this.automaticBillPayment = value;
    }

    /**
     * Gets the value of the tparEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTPAREnabled() {
        return tparEnabled;
    }

    /**
     * Sets the value of the tparEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTPAREnabled(Boolean value) {
        this.tparEnabled = value;
    }

    /**
     * Gets the value of the poCustomField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poCustomField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOCustomField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomFieldDefinition }
     * 
     * 
     */
    public List<CustomFieldDefinition> getPOCustomField() {
        if (poCustomField == null) {
            poCustomField = new ArrayList<CustomFieldDefinition>();
        }
        return this.poCustomField;
    }

    /**
     * Gets the value of the msgToVendors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgToVendors() {
        return msgToVendors;
    }

    /**
     * Sets the value of the msgToVendors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgToVendors(String value) {
        this.msgToVendors = value;
    }

    /**
     * Gets the value of the usingInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsingInventory() {
        return usingInventory;
    }

    /**
     * Sets the value of the usingInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsingInventory(Boolean value) {
        this.usingInventory = value;
    }

    /**
     * Gets the value of the usingMultiLocationInventory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsingMultiLocationInventory() {
        return usingMultiLocationInventory;
    }

    /**
     * Sets the value of the usingMultiLocationInventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsingMultiLocationInventory(Boolean value) {
        this.usingMultiLocationInventory = value;
    }

    /**
     * Gets the value of the daysBillsAreDue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysBillsAreDue() {
        return daysBillsAreDue;
    }

    /**
     * Sets the value of the daysBillsAreDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysBillsAreDue(Integer value) {
        this.daysBillsAreDue = value;
    }

    /**
     * Gets the value of the discountAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getDiscountAccountRef() {
        return discountAccountRef;
    }

    /**
     * Sets the value of the discountAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setDiscountAccountRef(ReferenceType value) {
        this.discountAccountRef = value;
    }

    /**
     * Sets the value of the poCustomField property.
     * 
     * @param poCustomField
     *     allowed object is
     *     {@link CustomFieldDefinition }
     *     
     */
    public void setPOCustomField(List<CustomFieldDefinition> poCustomField) {
        this.poCustomField = poCustomField;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VendorAndPurchasesPrefs that = ((VendorAndPurchasesPrefs) object);
        {
            Boolean lhsEnableBills;
            lhsEnableBills = this.isEnableBills();
            Boolean rhsEnableBills;
            rhsEnableBills = that.isEnableBills();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enableBills", lhsEnableBills), LocatorUtils.property(thatLocator, "enableBills", rhsEnableBills), lhsEnableBills, rhsEnableBills, (this.enableBills!= null), (that.enableBills!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTrackingByCustomer;
            lhsTrackingByCustomer = this.isTrackingByCustomer();
            Boolean rhsTrackingByCustomer;
            rhsTrackingByCustomer = that.isTrackingByCustomer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trackingByCustomer", lhsTrackingByCustomer), LocatorUtils.property(thatLocator, "trackingByCustomer", rhsTrackingByCustomer), lhsTrackingByCustomer, rhsTrackingByCustomer, (this.trackingByCustomer!= null), (that.trackingByCustomer!= null))) {
                return false;
            }
        }
        {
            Boolean lhsBillableExpenseTracking;
            lhsBillableExpenseTracking = this.isBillableExpenseTracking();
            Boolean rhsBillableExpenseTracking;
            rhsBillableExpenseTracking = that.isBillableExpenseTracking();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billableExpenseTracking", lhsBillableExpenseTracking), LocatorUtils.property(thatLocator, "billableExpenseTracking", rhsBillableExpenseTracking), lhsBillableExpenseTracking, rhsBillableExpenseTracking, (this.billableExpenseTracking!= null), (that.billableExpenseTracking!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsDefaultTerms;
            lhsDefaultTerms = this.getDefaultTerms();
            ReferenceType rhsDefaultTerms;
            rhsDefaultTerms = that.getDefaultTerms();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultTerms", lhsDefaultTerms), LocatorUtils.property(thatLocator, "defaultTerms", rhsDefaultTerms), lhsDefaultTerms, rhsDefaultTerms, (this.defaultTerms!= null), (that.defaultTerms!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsDefaultMarkup;
            lhsDefaultMarkup = this.getDefaultMarkup();
            BigDecimal rhsDefaultMarkup;
            rhsDefaultMarkup = that.getDefaultMarkup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultMarkup", lhsDefaultMarkup), LocatorUtils.property(thatLocator, "defaultMarkup", rhsDefaultMarkup), lhsDefaultMarkup, rhsDefaultMarkup, (this.defaultMarkup!= null), (that.defaultMarkup!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsDefaultMarkupAccount;
            lhsDefaultMarkupAccount = this.getDefaultMarkupAccount();
            ReferenceType rhsDefaultMarkupAccount;
            rhsDefaultMarkupAccount = that.getDefaultMarkupAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "defaultMarkupAccount", lhsDefaultMarkupAccount), LocatorUtils.property(thatLocator, "defaultMarkupAccount", rhsDefaultMarkupAccount), lhsDefaultMarkupAccount, rhsDefaultMarkupAccount, (this.defaultMarkupAccount!= null), (that.defaultMarkupAccount!= null))) {
                return false;
            }
        }
        {
            Boolean lhsAutomaticBillPayment;
            lhsAutomaticBillPayment = this.isAutomaticBillPayment();
            Boolean rhsAutomaticBillPayment;
            rhsAutomaticBillPayment = that.isAutomaticBillPayment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "automaticBillPayment", lhsAutomaticBillPayment), LocatorUtils.property(thatLocator, "automaticBillPayment", rhsAutomaticBillPayment), lhsAutomaticBillPayment, rhsAutomaticBillPayment, (this.automaticBillPayment!= null), (that.automaticBillPayment!= null))) {
                return false;
            }
        }
        {
            Boolean lhsTPAREnabled;
            lhsTPAREnabled = this.isTPAREnabled();
            Boolean rhsTPAREnabled;
            rhsTPAREnabled = that.isTPAREnabled();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tparEnabled", lhsTPAREnabled), LocatorUtils.property(thatLocator, "tparEnabled", rhsTPAREnabled), lhsTPAREnabled, rhsTPAREnabled, (this.tparEnabled!= null), (that.tparEnabled!= null))) {
                return false;
            }
        }
        {
            List<CustomFieldDefinition> lhsPOCustomField;
            lhsPOCustomField = (((this.poCustomField!= null)&&(!this.poCustomField.isEmpty()))?this.getPOCustomField():null);
            List<CustomFieldDefinition> rhsPOCustomField;
            rhsPOCustomField = (((that.poCustomField!= null)&&(!that.poCustomField.isEmpty()))?that.getPOCustomField():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "poCustomField", lhsPOCustomField), LocatorUtils.property(thatLocator, "poCustomField", rhsPOCustomField), lhsPOCustomField, rhsPOCustomField, ((this.poCustomField!= null)&&(!this.poCustomField.isEmpty())), ((that.poCustomField!= null)&&(!that.poCustomField.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsMsgToVendors;
            lhsMsgToVendors = this.getMsgToVendors();
            String rhsMsgToVendors;
            rhsMsgToVendors = that.getMsgToVendors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgToVendors", lhsMsgToVendors), LocatorUtils.property(thatLocator, "msgToVendors", rhsMsgToVendors), lhsMsgToVendors, rhsMsgToVendors, (this.msgToVendors!= null), (that.msgToVendors!= null))) {
                return false;
            }
        }
        {
            Boolean lhsUsingInventory;
            lhsUsingInventory = this.isUsingInventory();
            Boolean rhsUsingInventory;
            rhsUsingInventory = that.isUsingInventory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usingInventory", lhsUsingInventory), LocatorUtils.property(thatLocator, "usingInventory", rhsUsingInventory), lhsUsingInventory, rhsUsingInventory, (this.usingInventory!= null), (that.usingInventory!= null))) {
                return false;
            }
        }
        {
            Boolean lhsUsingMultiLocationInventory;
            lhsUsingMultiLocationInventory = this.isUsingMultiLocationInventory();
            Boolean rhsUsingMultiLocationInventory;
            rhsUsingMultiLocationInventory = that.isUsingMultiLocationInventory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usingMultiLocationInventory", lhsUsingMultiLocationInventory), LocatorUtils.property(thatLocator, "usingMultiLocationInventory", rhsUsingMultiLocationInventory), lhsUsingMultiLocationInventory, rhsUsingMultiLocationInventory, (this.usingMultiLocationInventory!= null), (that.usingMultiLocationInventory!= null))) {
                return false;
            }
        }
        {
            Integer lhsDaysBillsAreDue;
            lhsDaysBillsAreDue = this.getDaysBillsAreDue();
            Integer rhsDaysBillsAreDue;
            rhsDaysBillsAreDue = that.getDaysBillsAreDue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "daysBillsAreDue", lhsDaysBillsAreDue), LocatorUtils.property(thatLocator, "daysBillsAreDue", rhsDaysBillsAreDue), lhsDaysBillsAreDue, rhsDaysBillsAreDue, (this.daysBillsAreDue!= null), (that.daysBillsAreDue!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsDiscountAccountRef;
            lhsDiscountAccountRef = this.getDiscountAccountRef();
            ReferenceType rhsDiscountAccountRef;
            rhsDiscountAccountRef = that.getDiscountAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "discountAccountRef", lhsDiscountAccountRef), LocatorUtils.property(thatLocator, "discountAccountRef", rhsDiscountAccountRef), lhsDiscountAccountRef, rhsDiscountAccountRef, (this.discountAccountRef!= null), (that.discountAccountRef!= null))) {
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
            Boolean theEnableBills;
            theEnableBills = this.isEnableBills();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enableBills", theEnableBills), currentHashCode, theEnableBills, (this.enableBills!= null));
        }
        {
            Boolean theTrackingByCustomer;
            theTrackingByCustomer = this.isTrackingByCustomer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trackingByCustomer", theTrackingByCustomer), currentHashCode, theTrackingByCustomer, (this.trackingByCustomer!= null));
        }
        {
            Boolean theBillableExpenseTracking;
            theBillableExpenseTracking = this.isBillableExpenseTracking();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billableExpenseTracking", theBillableExpenseTracking), currentHashCode, theBillableExpenseTracking, (this.billableExpenseTracking!= null));
        }
        {
            ReferenceType theDefaultTerms;
            theDefaultTerms = this.getDefaultTerms();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultTerms", theDefaultTerms), currentHashCode, theDefaultTerms, (this.defaultTerms!= null));
        }
        {
            BigDecimal theDefaultMarkup;
            theDefaultMarkup = this.getDefaultMarkup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultMarkup", theDefaultMarkup), currentHashCode, theDefaultMarkup, (this.defaultMarkup!= null));
        }
        {
            ReferenceType theDefaultMarkupAccount;
            theDefaultMarkupAccount = this.getDefaultMarkupAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "defaultMarkupAccount", theDefaultMarkupAccount), currentHashCode, theDefaultMarkupAccount, (this.defaultMarkupAccount!= null));
        }
        {
            Boolean theAutomaticBillPayment;
            theAutomaticBillPayment = this.isAutomaticBillPayment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "automaticBillPayment", theAutomaticBillPayment), currentHashCode, theAutomaticBillPayment, (this.automaticBillPayment!= null));
        }
        {
            Boolean theTPAREnabled;
            theTPAREnabled = this.isTPAREnabled();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tparEnabled", theTPAREnabled), currentHashCode, theTPAREnabled, (this.tparEnabled!= null));
        }
        {
            List<CustomFieldDefinition> thePOCustomField;
            thePOCustomField = (((this.poCustomField!= null)&&(!this.poCustomField.isEmpty()))?this.getPOCustomField():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "poCustomField", thePOCustomField), currentHashCode, thePOCustomField, ((this.poCustomField!= null)&&(!this.poCustomField.isEmpty())));
        }
        {
            String theMsgToVendors;
            theMsgToVendors = this.getMsgToVendors();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgToVendors", theMsgToVendors), currentHashCode, theMsgToVendors, (this.msgToVendors!= null));
        }
        {
            Boolean theUsingInventory;
            theUsingInventory = this.isUsingInventory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usingInventory", theUsingInventory), currentHashCode, theUsingInventory, (this.usingInventory!= null));
        }
        {
            Boolean theUsingMultiLocationInventory;
            theUsingMultiLocationInventory = this.isUsingMultiLocationInventory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usingMultiLocationInventory", theUsingMultiLocationInventory), currentHashCode, theUsingMultiLocationInventory, (this.usingMultiLocationInventory!= null));
        }
        {
            Integer theDaysBillsAreDue;
            theDaysBillsAreDue = this.getDaysBillsAreDue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "daysBillsAreDue", theDaysBillsAreDue), currentHashCode, theDaysBillsAreDue, (this.daysBillsAreDue!= null));
        }
        {
            ReferenceType theDiscountAccountRef;
            theDiscountAccountRef = this.getDiscountAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "discountAccountRef", theDiscountAccountRef), currentHashCode, theDiscountAccountRef, (this.discountAccountRef!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
