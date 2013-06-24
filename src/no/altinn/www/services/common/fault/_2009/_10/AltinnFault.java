
/**
 * AltinnFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package no.altinn.www.services.common.fault._2009._10;
            

            /**
            *  AltinnFault bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class AltinnFault
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = AltinnFault
                Namespace URI = http://www.altinn.no/services/common/fault/2009/10
                Namespace Prefix = ns2
                */
            

                        /**
                        * field for AltinnErrorMessage
                        */

                        
                                    protected java.lang.String localAltinnErrorMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAltinnErrorMessageTracker = false ;

                           public boolean isAltinnErrorMessageSpecified(){
                               return localAltinnErrorMessageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAltinnErrorMessage(){
                               return localAltinnErrorMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AltinnErrorMessage
                               */
                               public void setAltinnErrorMessage(java.lang.String param){
                            localAltinnErrorMessageTracker = true;
                                   
                                            this.localAltinnErrorMessage=param;
                                    

                               }
                            

                        /**
                        * field for AltinnExtendedErrorMessage
                        */

                        
                                    protected java.lang.String localAltinnExtendedErrorMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAltinnExtendedErrorMessageTracker = false ;

                           public boolean isAltinnExtendedErrorMessageSpecified(){
                               return localAltinnExtendedErrorMessageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAltinnExtendedErrorMessage(){
                               return localAltinnExtendedErrorMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AltinnExtendedErrorMessage
                               */
                               public void setAltinnExtendedErrorMessage(java.lang.String param){
                            localAltinnExtendedErrorMessageTracker = true;
                                   
                                            this.localAltinnExtendedErrorMessage=param;
                                    

                               }
                            

                        /**
                        * field for AltinnLocalizedErrorMessage
                        */

                        
                                    protected java.lang.String localAltinnLocalizedErrorMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAltinnLocalizedErrorMessageTracker = false ;

                           public boolean isAltinnLocalizedErrorMessageSpecified(){
                               return localAltinnLocalizedErrorMessageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAltinnLocalizedErrorMessage(){
                               return localAltinnLocalizedErrorMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AltinnLocalizedErrorMessage
                               */
                               public void setAltinnLocalizedErrorMessage(java.lang.String param){
                            localAltinnLocalizedErrorMessageTracker = true;
                                   
                                            this.localAltinnLocalizedErrorMessage=param;
                                    

                               }
                            

                        /**
                        * field for ErrorGuid
                        */

                        
                                    protected java.lang.String localErrorGuid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorGuidTracker = false ;

                           public boolean isErrorGuidSpecified(){
                               return localErrorGuidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorGuid(){
                               return localErrorGuid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorGuid
                               */
                               public void setErrorGuid(java.lang.String param){
                            localErrorGuidTracker = true;
                                   
                                            this.localErrorGuid=param;
                                    

                               }
                            

                        /**
                        * field for ErrorID
                        */

                        
                                    protected int localErrorID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorIDTracker = false ;

                           public boolean isErrorIDSpecified(){
                               return localErrorIDTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getErrorID(){
                               return localErrorID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorID
                               */
                               public void setErrorID(int param){
                            
                                       // setting primitive attribute tracker to true
                                       localErrorIDTracker =
                                       param != java.lang.Integer.MIN_VALUE;
                                   
                                            this.localErrorID=param;
                                    

                               }
                            

                        /**
                        * field for UserGuid
                        */

                        
                                    protected java.lang.String localUserGuid ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserGuidTracker = false ;

                           public boolean isUserGuidSpecified(){
                               return localUserGuidTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserGuid(){
                               return localUserGuid;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserGuid
                               */
                               public void setUserGuid(java.lang.String param){
                            localUserGuidTracker = true;
                                   
                                            this.localUserGuid=param;
                                    

                               }
                            

                        /**
                        * field for UserId
                        */

                        
                                    protected java.lang.String localUserId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserIdTracker = false ;

                           public boolean isUserIdSpecified(){
                               return localUserIdTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getUserId(){
                               return localUserId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UserId
                               */
                               public void setUserId(java.lang.String param){
                            localUserIdTracker = true;
                                   
                                            this.localUserId=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.altinn.no/services/common/fault/2009/10");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":AltinnFault",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "AltinnFault",
                           xmlWriter);
                   }

               
                   }
                if (localAltinnErrorMessageTracker){
                                    namespace = "http://www.altinn.no/services/common/fault/2009/10";
                                    writeStartElement(null, namespace, "AltinnErrorMessage", xmlWriter);
                             

                                          if (localAltinnErrorMessage==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAltinnErrorMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAltinnExtendedErrorMessageTracker){
                                    namespace = "http://www.altinn.no/services/common/fault/2009/10";
                                    writeStartElement(null, namespace, "AltinnExtendedErrorMessage", xmlWriter);
                             

                                          if (localAltinnExtendedErrorMessage==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAltinnExtendedErrorMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAltinnLocalizedErrorMessageTracker){
                                    namespace = "http://www.altinn.no/services/common/fault/2009/10";
                                    writeStartElement(null, namespace, "AltinnLocalizedErrorMessage", xmlWriter);
                             

                                          if (localAltinnLocalizedErrorMessage==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAltinnLocalizedErrorMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorGuidTracker){
                                    namespace = "http://www.altinn.no/services/common/fault/2009/10";
                                    writeStartElement(null, namespace, "ErrorGuid", xmlWriter);
                             

                                          if (localErrorGuid==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorGuid);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorIDTracker){
                                    namespace = "http://www.altinn.no/services/common/fault/2009/10";
                                    writeStartElement(null, namespace, "ErrorID", xmlWriter);
                             
                                               if (localErrorID==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("ErrorID cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorID));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserGuidTracker){
                                    namespace = "http://www.altinn.no/services/common/fault/2009/10";
                                    writeStartElement(null, namespace, "UserGuid", xmlWriter);
                             

                                          if (localUserGuid==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserGuid);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserIdTracker){
                                    namespace = "http://www.altinn.no/services/common/fault/2009/10";
                                    writeStartElement(null, namespace, "UserId", xmlWriter);
                             

                                          if (localUserId==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localUserId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.altinn.no/services/common/fault/2009/10")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAltinnErrorMessageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10",
                                                                      "AltinnErrorMessage"));
                                 
                                         elementList.add(localAltinnErrorMessage==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAltinnErrorMessage));
                                    } if (localAltinnExtendedErrorMessageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10",
                                                                      "AltinnExtendedErrorMessage"));
                                 
                                         elementList.add(localAltinnExtendedErrorMessage==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAltinnExtendedErrorMessage));
                                    } if (localAltinnLocalizedErrorMessageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10",
                                                                      "AltinnLocalizedErrorMessage"));
                                 
                                         elementList.add(localAltinnLocalizedErrorMessage==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAltinnLocalizedErrorMessage));
                                    } if (localErrorGuidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10",
                                                                      "ErrorGuid"));
                                 
                                         elementList.add(localErrorGuid==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorGuid));
                                    } if (localErrorIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10",
                                                                      "ErrorID"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorID));
                            } if (localUserGuidTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10",
                                                                      "UserGuid"));
                                 
                                         elementList.add(localUserGuid==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserGuid));
                                    } if (localUserIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10",
                                                                      "UserId"));
                                 
                                         elementList.add(localUserId==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserId));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static AltinnFault parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            AltinnFault object =
                new AltinnFault();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"AltinnFault".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (AltinnFault)no.altinn.www.services._2009._10.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","AltinnErrorMessage").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAltinnErrorMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","AltinnExtendedErrorMessage").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAltinnExtendedErrorMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","AltinnLocalizedErrorMessage").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAltinnLocalizedErrorMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","ErrorGuid").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorGuid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","ErrorID").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"ErrorID" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setErrorID(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","UserGuid").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserGuid(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","UserId").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setUserId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    