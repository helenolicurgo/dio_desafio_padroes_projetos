package br.com.dio.gof.facade;

public class TestFacade {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.clientMigration("Fulano", "18001-150");
	}

}
