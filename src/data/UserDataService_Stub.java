package data;

import java.util.ArrayList;

import PO.OrderPO;
import PO.UserPO;
import PO.WebManagerPO;
import businesslogicsevice.ResultMessage;
import dataservice.UserDataService;

public class UserDataService_Stub implements UserDataService {
	
	int id;
	String password;
	//����id��ѯ��Ӧuser
		public UserPO find (String name){
			UserPO userpo = new UserPO(id,password);
			return userpo;
		}
		
		//����û�
		public ResultMessage insert(UserPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//�����û�
		public ResultMessage update(UserPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//ɾ���û�
		public ResultMessage delete(UserPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		
		//��ѯ�����û�
		public ArrayList<UserPO> showUsers(){
			ArrayList<UserPO> userPOs = new ArrayList<UserPO>();
			userPOs.add(new UserPO(id,password));
			return userPOs;
		}

}
