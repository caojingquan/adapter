package adapter;

public class EnglishAdapter implements ITransferLanguage{

	@Override
	public boolean canTransferLanguage(ITransferLanguage transfer) {
		return transfer instanceof EnglishAdapter;
	}

	@Override
	public void transferLangyage() {
		System.out.println("正在翻译英语中。。。。");
	}

}
