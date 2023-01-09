package br.com.dio.gof.singleton;

//This Singleton has: 1. Static factory, 2. Lazy initialization and 3. Thread safe 

public class SingletonLazyHolder {
	private static class InstanceHolder {
		private static SingletonLazyHolder instance = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {super();}
	
	public static SingletonLazyHolder getInstance(){return InstanceHolder.instance;}

}