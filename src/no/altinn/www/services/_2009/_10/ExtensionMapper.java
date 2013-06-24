
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

        
            package no.altinn.www.services._2009._10;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://schemas.altinn.no/services/Authentication/2009/10".equals(namespaceURI) &&
                  "AuthenticationChallengeBE".equals(typeName)){
                   
                            return  no.altinn.schemas.services.authentication._2009._10.AuthenticationChallengeBE.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "guid".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.Guid.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "duration".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization.Duration.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.microsoft.com/2003/10/Serialization/".equals(namespaceURI) &&
                  "char".equals(typeName)){
                   
                            return  com.microsoft.schemas._2003._10.serialization._char.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.altinn.no/services/Authentication/2009/10".equals(namespaceURI) &&
                  "AuthenticationChallengeRequestBE".equals(typeName)){
                   
                            return  no.altinn.schemas.services.authentication._2009._10.AuthenticationChallengeRequestBE.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://schemas.altinn.no/services/Authentication/2009/10".equals(namespaceURI) &&
                  "ChallengeRequestResult".equals(typeName)){
                   
                            return  no.altinn.schemas.services.authentication._2009._10.ChallengeRequestResult.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.altinn.no/services/common/fault/2009/10".equals(namespaceURI) &&
                  "AltinnFault".equals(typeName)){
                   
                            return  no.altinn.www.services.common.fault._2009._10.AltinnFault.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    