package client;

import java.rmi.RemoteException;

import no.altinn.schemas.services.authentication._2009._10.AuthenticationChallengeRequestBE;
import no.altinn.www.services.authentication.systemauthentication._2009._10.GetAuthenticationChallenge;
import no.altinn.www.services.authentication.systemauthentication._2009._10.ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage;
import no.altinn.www.services.authentication.systemauthentication._2009._10.SystemAuthenticationSIStub;

public class testclient {

	/**
	 * @param args
	 * @throws ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage 
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException, ISystemAuthenticationExternal_GetAuthenticationChallenge_AltinnFaultFault_FaultMessage {

		//
		AuthenticationChallengeRequestBE request = new AuthenticationChallengeRequestBE();
		//deklarerer variabler og setter verdier
		String systemUserName = "1487";
		String authMethod = "SMSPin";
		String userSSN = "15054301542";
		String userPassword = "test123";
		//
		request.setSystemUserName(systemUserName);
		request.setAuthMethod(authMethod);
		request.setUserSSN(userSSN);
		request.setUserPassword(userPassword);
		//
		SystemAuthenticationSIStub sa = new SystemAuthenticationSIStub("https://tt02.altinn.basefarm.net/AuthenticationExternal/SystemAuthentication.svc");
		//
		GetAuthenticationChallenge getAuthenticationChallenge4 = new GetAuthenticationChallenge();
		getAuthenticationChallenge4.setChallengeRequest(request);
		System.out.println("************************************");
		System.out.println(sa.getAuthenticationChallenge(getAuthenticationChallenge4).getGetAuthenticationChallengeResult().getStatus());
		System.out.println("************************************");
	}
	

}
