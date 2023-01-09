package br.com.dio.gof.subsystem.postalcode;

public class PostalCodeApi {
	
	private static PostalCodeApi instance = new PostalCodeApi();
	
	private PostalCodeApi() {super();}
	
	public static PostalCodeApi getInstancia(){return instance;}
	
	public String showCityName(String postalCode) {return "Forno do Iguaçu";}
	
	public String showCountyName(String postalCode) {return "Forno do Iguaçu, Terra das Cataratas";}
	
	public String showStateName(String postalCode) {return "Paraná, a Rússia Brasileira";}
	
}
