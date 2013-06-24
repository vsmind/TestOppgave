
/**
 * ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package no.altinn.www.services.authentication.systemauthentication._2009._10;

public class ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1372075213192L;
    
    private no.altinn.www.services.common.fault._2009._10.AltinnFaultE faultMessage;

    
        public ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage() {
            super("ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage");
        }

        public ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage(java.lang.String s) {
           super(s);
        }

        public ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ISystemAuthenticationExternal_Test_AltinnFaultFault_FaultMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(no.altinn.www.services.common.fault._2009._10.AltinnFaultE msg){
       faultMessage = msg;
    }
    
    public no.altinn.www.services.common.fault._2009._10.AltinnFaultE getFaultMessage(){
       return faultMessage;
    }
}
    