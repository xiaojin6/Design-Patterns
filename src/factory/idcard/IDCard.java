package factory.idcard;
import factory.framework.*;

public class IDCard extends Product{
	private String owner;
	IDCard(String string){
		System.out.println("制作" + string + "的ID的卡。");
		this.owner = string;
	}
	public void use() {
		System.out.println("使用" + owner + "的ID的卡。");
	}
	public String getOwner() {
		return this.owner;
	}
}
