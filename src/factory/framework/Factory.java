package factory.framework;

public abstract class Factory {
	public final Product create(String owner) {
		Product p = createPoduct(owner);
		registerProduct(p);
		return p;
	}
	
	public abstract Product createPoduct(String owner);
	public abstract void registerProduct(Product product);
}
