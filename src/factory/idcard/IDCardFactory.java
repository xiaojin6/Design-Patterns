package factory.idcard;

import factory.framework.*;
import java.util.*;

public class IDCardFactory extends Factory{
	private List<String> owners = new ArrayList<String>();
	@Override
	public Product createPoduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	public void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}
	
	public List<String> getOwners() {
		return owners;
	}

}
