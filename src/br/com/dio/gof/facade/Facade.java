package br.com.dio.gof.facade;

import br.com.dio.gof.subsystem.crm.CrmService;
import br.com.dio.gof.subsystem.postalcode.PostalCodeApi;

public class Facade {
	public void clientMigration(String name, String postalCode) {
		String cityName = PostalCodeApi.getInstancia().showCityName(postalCode);
		String countyName = PostalCodeApi.getInstancia().showCountyName(postalCode);
		String stateName = PostalCodeApi.getInstancia().showStateName(postalCode);
		
		CrmService.recieveClientData(name, postalCode, stateName, countyName, cityName);
	}
}
