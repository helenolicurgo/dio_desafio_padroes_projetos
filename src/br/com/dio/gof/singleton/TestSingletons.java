package br.com.dio.gof.singleton;

//Testing 3 types of Singleton (Lazy, Eager and LazyHolder)

public class TestSingletons {

	public static void main(String[] args) {
		
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
	}

}
