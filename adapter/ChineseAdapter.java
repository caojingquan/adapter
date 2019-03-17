package adapter;

public class ChineseAdapter implements ITransferLanguage{

	@Override
	public boolean canTransferLanguage(ITransferLanguage transfer) {
		return transfer instanceof ChineseAdapter;
	}

	@Override
	public void transferLangyage() {
		System.out.println("正在翻译中文中。。。。");
		
	}

}
