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
	//根据id查询对应user
		public UserPO find (String name){
			UserPO userpo = new UserPO(id,password);
			return userpo;
		}
		
		//添加用户
		public ResultMessage insert(UserPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//更新用户
		public ResultMessage update(UserPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//删除用户
		public ResultMessage delete(UserPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		
		//查询所有用户
		public ArrayList<UserPO> showUsers(){
			ArrayList<UserPO> userPOs = new ArrayList<UserPO>();
			userPOs.add(new UserPO(id,password));
			return userPOs;
		}

}
