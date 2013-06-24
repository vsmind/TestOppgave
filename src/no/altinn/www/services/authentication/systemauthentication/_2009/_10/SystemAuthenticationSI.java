

/**
 * SystemAuthenticationSI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package no.altinn.www.services.authentication.systemauthentication._2009._10;

    /*
     *  SystemAuthenticationSI java interface
     */

    public interface SystemAuthenticationSI {
          

        /**
          * Auto generated method signature
          * &lt;summary&gt;
            This method is used to get information about what authentication token to use
            &lt;/summary&gt;
            &lt;param name=&quot;challengeRequest&quot;&gt;Entity that is used to state authentication information and define the authentication method - mandatory parameter&lt;/param&gt;
            &lt;returns&gt;AuthenticationChallengeBE that contains information about how to procede with authentication&lt;/returns&gt;
                    * @param getAuthenticationChallenge0
                
             * @throws no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage : 
         */

         
                     public no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallengeResponse getAuthenticationChallenge(

                        no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge getAuthenticationChallenge0)
                        throws java.rmi.RemoteException
             
          ,no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * &lt;summary&gt;
            This method is used to get information about what authentication token to use
            &lt;/summary&gt;
            &lt;param name=&quot;challengeRequest&quot;&gt;Entity that is used to state authentication information and define the authentication method - mandatory parameter&lt;/param&gt;
            &lt;returns&gt;AuthenticationChallengeBE that contains information about how to procede with authentication&lt;/returns&gt;
                * @param getAuthenticationChallenge0
            
          */
        public void startgetAuthenticationChallenge(

            no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge getAuthenticationChallenge0,

            final no.altinn.www.services.authentication.systemauthentication._2009._10.SystemAuthenticationSICallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param test2
                
             * @throws no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage : 
         */

         
                     public no.altinn.www.services._2009._10.TestResponse test(

                        no.altinn.www.services._2009._10.Test test2)
                        throws java.rmi.RemoteException
             
          ,no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param test2
            
          */
        public void starttest(

            no.altinn.www.services._2009._10.Test test2,

            final no.altinn.www.services.authentication.systemauthentication._2009._10.SystemAuthenticationSICallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    