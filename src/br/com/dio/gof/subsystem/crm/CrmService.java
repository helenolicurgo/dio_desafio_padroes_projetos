package br.com.dio.gof.subsystem.crm;

public class CrmService {
	private CrmService() {super();}
	
	public static void recieveClientData (String name, String postalCode, String state, String county, String city) {
		System.out.println("Client data recived = OK");
		System.out.println("Client name = " + name);
		System.out.println("Client postalcode = " + postalCode);
		System.out.println("Client state = " + state);
		System.out.println("Client county = " + county);
		System.out.println("Client city = " + city);
	}

}
