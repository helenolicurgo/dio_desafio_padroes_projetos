package br.com.dio.gof.singleton;

//This Singleton is dominated by Laziness

public class SingletonLazy {
	private static SingletonLazy instance;
	
	private SingletonLazy() {super();}
	
	public static SingletonLazy getInstance(){
		if (instance == null) {instance = new SingletonLazy();}
		return instance;
	}

}
