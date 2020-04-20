package adapter;
//1.使用继承的适配器
public class PrintBanner extends Banner implements Print{
	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
}


//2.使用委托的适配器
//public class PrintBanner implements Print{
//	private Banner banner;
//	public PrintBanner(String string) {
//		this.banner = new Banner(string);
//	}
//
//	@Override
//	public void printWeak() {
//		banner.showWithParen();
//	}
//
//	@Override
//	public void printStrong() {
//		banner.showWithAster();
//	}
//}