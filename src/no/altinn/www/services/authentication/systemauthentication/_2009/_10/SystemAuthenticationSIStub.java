
/**
 * SystemAuthenticationSIStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package no.altinn.www.services.authentication.systemauthentication._2009._10;

        

        /*
        *  SystemAuthenticationSIStub java implementation
        */

        
        public class SystemAuthenticationSIStub extends org.apache.axis2.client.Stub
        implements SystemAuthenticationSI{
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("SystemAuthenticationSI" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[2];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10", "getAuthenticationChallenge"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10", "test"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","AltinnFault"), "GetAuthenticationChallenge"),"no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","AltinnFault"), "GetAuthenticationChallenge"),"no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","AltinnFault"), "GetAuthenticationChallenge"),"no.altinn.www.services.common.fault._2009._10.AltinnFaultE");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","AltinnFault"), "Test"),"no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","AltinnFault"), "Test"),"no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.altinn.no/services/common/fault/2009/10","AltinnFault"), "Test"),"no.altinn.www.services.common.fault._2009._10.AltinnFaultE");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public SystemAuthenticationSIStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public SystemAuthenticationSIStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public SystemAuthenticationSIStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://www.altinn.no/AuthenticationExternal/SystemAuthentication.svc" );
                
    }

    /**
     * Default Constructor
     */
    public SystemAuthenticationSIStub() throws org.apache.axis2.AxisFault {
        
                    this("http://www.altinn.no/AuthenticationExternal/SystemAuthentication.svc" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public SystemAuthenticationSIStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * &lt;summary&gt;
            This method is used to get information about what authentication token to use
            &lt;/summary&gt;
            &lt;param name=&quot;challengeRequest&quot;&gt;Entity that is used to state authentication information and define the authentication method - mandatory parameter&lt;/param&gt;
            &lt;returns&gt;AuthenticationChallengeBE that contains information about how to procede with authentication&lt;/returns&gt;
                     * @see no.altinn.www.services.authentication.systemauthentication._2009._10.SystemAuthenticationSI#getAuthenticationChallenge
                     * @param getAuthenticationChallenge4
                    
                     * @throws no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage : 
                     */

                    

                            public  no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallengeResponse getAuthenticationChallenge(

                            no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge getAuthenticationChallenge4)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10/ISystemAuthenticationExternal/GetAuthenticationChallenge");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getAuthenticationChallenge4,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10",
                                                    "getAuthenticationChallenge")), new javax.xml.namespace.QName("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10",
                                                    "getAuthenticationChallenge"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallengeResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallengeResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetAuthenticationChallenge"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetAuthenticationChallenge"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetAuthenticationChallenge"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage){
                          throw (no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * &lt;summary&gt;
            This method is used to get information about what authentication token to use
            &lt;/summary&gt;
            &lt;param name=&quot;challengeRequest&quot;&gt;Entity that is used to state authentication information and define the authentication method - mandatory parameter&lt;/param&gt;
            &lt;returns&gt;AuthenticationChallengeBE that contains information about how to procede with authentication&lt;/returns&gt;
                * @see no.altinn.www.services.authentication.systemauthentication._2009._10.SystemAuthenticationSI#startgetAuthenticationChallenge
                    * @param getAuthenticationChallenge4
                
                */
                public  void startgetAuthenticationChallenge(

                 no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge getAuthenticationChallenge4,

                  final no.altinn.www.services.authentication.systemauthentication._2009._10.SystemAuthenticationSICallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10/ISystemAuthenticationExternal/GetAuthenticationChallenge");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getAuthenticationChallenge4,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10",
                                                    "getAuthenticationChallenge")), new javax.xml.namespace.QName("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10",
                                                    "getAuthenticationChallenge"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallengeResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultgetAuthenticationChallenge(
                                        (no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallengeResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorgetAuthenticationChallenge(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetAuthenticationChallenge"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetAuthenticationChallenge"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetAuthenticationChallenge"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage){
														callback.receiveErrorgetAuthenticationChallenge((no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorgetAuthenticationChallenge(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAuthenticationChallenge(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAuthenticationChallenge(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAuthenticationChallenge(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAuthenticationChallenge(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAuthenticationChallenge(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAuthenticationChallenge(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorgetAuthenticationChallenge(f);
                                            }
									    } else {
										    callback.receiveErrorgetAuthenticationChallenge(f);
									    }
									} else {
									    callback.receiveErrorgetAuthenticationChallenge(f);
									}
								} else {
								    callback.receiveErrorgetAuthenticationChallenge(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorgetAuthenticationChallenge(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * 
                     * @see no.altinn.www.services.authentication.systemauthentication._2009._10.SystemAuthenticationSI#test
                     * @param test6
                    
                     * @throws no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage : 
                     */

                    

                            public  no.altinn.www.services._2009._10.TestResponse test(

                            no.altinn.www.services._2009._10.Test test6)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://www.altinn.no/services/2009/10/IAltinnContractBase/Test");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    test6,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10",
                                                    "test")), new javax.xml.namespace.QName("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10",
                                                    "test"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             no.altinn.www.services._2009._10.TestResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (no.altinn.www.services._2009._10.TestResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Test"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Test"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Test"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage){
                          throw (no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see no.altinn.www.services.authentication.systemauthentication._2009._10.SystemAuthenticationSI#starttest
                    * @param test6
                
                */
                public  void starttest(

                 no.altinn.www.services._2009._10.Test test6,

                  final no.altinn.www.services.authentication.systemauthentication._2009._10.SystemAuthenticationSICallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("http://www.altinn.no/services/2009/10/IAltinnContractBase/Test");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    test6,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10",
                                                    "test")), new javax.xml.namespace.QName("http://www.altinn.no/services/Authentication/SystemAuthentication/2009/10",
                                                    "test"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         no.altinn.www.services._2009._10.TestResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResulttest(
                                        (no.altinn.www.services._2009._10.TestResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrortest(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Test"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Test"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Test"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage){
														callback.receiveErrortest((no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage)ex);
											            return;
										            }
										            
					
										            callback.receiveErrortest(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortest(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortest(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortest(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortest(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortest(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortest(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrortest(f);
                                            }
									    } else {
										    callback.receiveErrortest(f);
									    }
									} else {
									    callback.receiveErrortest(f);
									}
								} else {
								    callback.receiveErrortest(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrortest(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://www.altinn.no/AuthenticationExternal/SystemAuthentication.svc
            private  org.apache.axiom.om.OMElement  toOM(no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallengeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallengeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(no.altinn.www.services.common.fault._2009._10.AltinnFaultE param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(no.altinn.www.services.common.fault._2009._10.AltinnFaultE.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(no.altinn.www.services._2009._10.Test param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(no.altinn.www.services._2009._10.Test.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(no.altinn.www.services._2009._10.TestResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(no.altinn.www.services._2009._10.TestResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, no.altinn.www.services._2009._10.Test param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(no.altinn.www.services._2009._10.Test.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge.class.equals(type)){
                
                           return no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallengeResponse.class.equals(type)){
                
                           return no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallengeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (no.altinn.www.services.common.fault._2009._10.AltinnFaultE.class.equals(type)){
                
                           return no.altinn.www.services.common.fault._2009._10.AltinnFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (no.altinn.www.services._2009._10.Test.class.equals(type)){
                
                           return no.altinn.www.services._2009._10.Test.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (no.altinn.www.services._2009._10.TestResponse.class.equals(type)){
                
                           return no.altinn.www.services._2009._10.TestResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (no.altinn.www.services.common.fault._2009._10.AltinnFaultE.class.equals(type)){
                
                           return no.altinn.www.services.common.fault._2009._10.AltinnFaultE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   