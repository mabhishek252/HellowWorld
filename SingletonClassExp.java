package basic;

public class SingletonClassExp {
	//Singleton class must have private constructor
	 private SingletonClassExp() {
	}
	//Approach-1
	//Private and static variable can not be changeable
	private static SingletonClassExp t = new SingletonClassExp();
	//Outside of this class, anyone can be call this class via this public method and they will only get 't' object
	public static SingletonClassExp getSingletonClassExp() {
		return t;
	}
	//Approach-2
	private static SingletonClassExp s = null;
	public static SingletonClassExp getSingletonClassExpS() {
		if (s == null){
			s = new SingletonClassExp();
		}
		return s;
	}
}
