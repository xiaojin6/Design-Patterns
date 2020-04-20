package template;

public class StringDisplay extends AbstractDisplay{
	private String string;
	private int width;
	
	public StringDisplay(String string) {
		this.string = string;
		//先获取bytes长度,然后获取bytes长度
		this.width = string.getBytes().length;
	}
	
	@Override
	public void open() {
		printLine();
	}

	private void printLine() {
		// TODO Auto-generated method stub
		System.out.print("+");
		for(int i = 0; i < this.width; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

	@Override
	public void print() {
		System.out.println("|" + this.string + "|");
	}

	@Override
	public void close() {
		printLine();
	}
}
