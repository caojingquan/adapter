package adapter;

public class TransferLanguage {
	
	void transferEnglish(String lanuage){
		process(lanuage,EnglishAdapter.class);
	}
	
	void transferChinese(String lanuage){
		process(lanuage,ChineseAdapter.class);
	}
	
	void process(String lanuage,Class<? extends ITransferLanguage> clazz){
		try{
			ITransferLanguage newInstance = clazz.newInstance();
			//感觉这一步只是检查适配器中的类与这边对应传入的类是否为同一个而已
			if(newInstance.canTransferLanguage(newInstance)){
				newInstance.transferLangyage();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
