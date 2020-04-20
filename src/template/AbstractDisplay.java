package template;

public abstract class AbstractDisplay {
	//实现循环展示五次
	public abstract void open();
	public abstract void print();
	public abstract void close();
	public final void display() {
		open();
		for(int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
