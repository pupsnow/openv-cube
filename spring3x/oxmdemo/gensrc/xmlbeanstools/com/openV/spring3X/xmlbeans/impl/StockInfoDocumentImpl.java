/*
 * An XML document type.
 * Localname: StockInfo
 * Namespace: http://www.open-v.com/spring3x/xmlbeans
 * Java type: com.openV.spring3X.xmlbeans.StockInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.openV.spring3X.xmlbeans.impl;
/**
 * A document containing one StockInfo(@http://www.open-v.com/spring3x/xmlbeans) element.
 *
 * This is a complex type.
 */
public class StockInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.openV.spring3X.xmlbeans.StockInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public StockInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STOCKINFO$0 = 
        new javax.xml.namespace.QName("http://www.open-v.com/spring3x/xmlbeans", "StockInfo");
    
    
    /**
     * Gets the "StockInfo" element
     */
    public com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo getStockInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo target = null;
            target = (com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo)get_store().find_element_user(STOCKINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StockInfo" element
     */
    public void setStockInfo(com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo stockInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo target = null;
            target = (com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo)get_store().find_element_user(STOCKINFO$0, 0);
            if (target == null)
            {
                target = (com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo)get_store().add_element_user(STOCKINFO$0);
            }
            target.set(stockInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "StockInfo" element
     */
    public com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo addNewStockInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo target = null;
            target = (com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo)get_store().add_element_user(STOCKINFO$0);
            return target;
        }
    }
    /**
     * An XML StockInfo(@http://www.open-v.com/spring3x/xmlbeans).
     *
     * This is a complex type.
     */
    public static class StockInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.openV.spring3X.xmlbeans.StockInfoDocument.StockInfo
    {
        private static final long serialVersionUID = 1L;
        
        public StockInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.open-v.com/spring3x/xmlbeans", "name");
        private static final javax.xml.namespace.QName CODE$2 = 
            new javax.xml.namespace.QName("http://www.open-v.com/spring3x/xmlbeans", "code");
        private static final javax.xml.namespace.QName DESC$4 = 
            new javax.xml.namespace.QName("http://www.open-v.com/spring3x/xmlbeans", "desc");
        private static final javax.xml.namespace.QName PRICE$6 = 
            new javax.xml.namespace.QName("http://www.open-v.com/spring3x/xmlbeans", "price");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "code" element
         */
        public int getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" element
         */
        public org.apache.xmlbeans.XmlInt xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "code" element
         */
        public void setCode(int code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$2);
                }
                target.setIntValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" element
         */
        public void xsetCode(org.apache.xmlbeans.XmlInt code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CODE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CODE$2);
                }
                target.set(code);
            }
        }
        
        /**
         * Gets the "desc" element
         */
        public java.lang.String getDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESC$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "desc" element
         */
        public org.apache.xmlbeans.XmlString xgetDesc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESC$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "desc" element
         */
        public void setDesc(java.lang.String desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESC$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESC$4);
                }
                target.setStringValue(desc);
            }
        }
        
        /**
         * Sets (as xml) the "desc" element
         */
        public void xsetDesc(org.apache.xmlbeans.XmlString desc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESC$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESC$4);
                }
                target.set(desc);
            }
        }
        
        /**
         * Gets the "price" element
         */
        public double getPrice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$6, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "price" element
         */
        public org.apache.xmlbeans.XmlDouble xgetPrice()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PRICE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "price" element
         */
        public void setPrice(double price)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICE$6);
                }
                target.setDoubleValue(price);
            }
        }
        
        /**
         * Sets (as xml) the "price" element
         */
        public void xsetPrice(org.apache.xmlbeans.XmlDouble price)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PRICE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PRICE$6);
                }
                target.set(price);
            }
        }
    }
}
