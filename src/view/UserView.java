package view;

import businesslogic.UserBLService_Stub;
import businesslogicsevice.ResultMessage;
import businesslogicsevice.UserBLService;

public class UserView {
	public UserView(){
		
		UserBLService userBL = new UserBLService_Stub();
		
		//��¼
				ResultMessage result_login=userBL.login(1, "123456");
				if(result_login==ResultMessage.Success){
					System.out.println("��¼�ɹ�");
				}
				else{
					System.out.println("��¼ʧ��");
				}
				
	}
}
