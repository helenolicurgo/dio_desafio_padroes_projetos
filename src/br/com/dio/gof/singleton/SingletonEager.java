package br.com.dio.gof.singleton;

//This Singleton is Eager to work with Java!
//Don't need to check if the object is null 

public class SingletonEager {
	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {super();}
	
	public static SingletonEager getInstance(){return instance;}

}