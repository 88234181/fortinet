// 4. Implements of  Singleton or Dynamic Proxy
// Assume you are using Java 7+
public class SingletonExample{
	private static Singleton instance = null;
	
	// set access for instance instantiation
	protected SingletonExample();
	
	public static SingletonExample getInstance(){
		if(instance == null} instance = new SingletonExample();
		return instance;
	}
}