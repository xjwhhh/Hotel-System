package view;

import businesslogic.UserBLService_Stub;
import businesslogicsevice.ResultMessage;
import businesslogicsevice.UserBLService;

public class UserView {
	public UserView(){
		
		UserBLService userBL = new UserBLService_Stub();
		
		//µÇÂ¼
				ResultMessage result_login=userBL.login(1, "123456");
				if(result_login==ResultMessage.Success){
					System.out.println("µÇÂ¼³É¹¦");
				}
				else{
					System.out.println("µÇÂ¼Ê§°Ü");
				}
				
	}
}
