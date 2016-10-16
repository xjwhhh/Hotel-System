package view;

import VO.ClientVO;
import VO.HotelWorkerVO;
import VO.WebMarketVO;
import businesslogic.ManageBLService_Stub;
import businesslogicsevice.ManageBLService;
import businesslogicsevice.ResultMessage;

public class ManageView {
	public ManageView(){
		
		ManageBLService manageBL = new ManageBLService_Stub("张三","11111111111",100,"无记录",000001,"普通会员",
				"01-01","谷歌","小李","11111111111","汉庭","王五","11111111111");
		
		//测试manage_searchClient
				ClientVO clientVO = manageBL.manage_searchClient(1);
				System.out.println(clientVO.getname());
				System.out.println(clientVO.getcontact());
				System.out.println(clientVO.getcredit());
				System.out.println(clientVO.getcredit_record());
				System.out.println(clientVO.getmemberid());
				System.out.println(clientVO.getmember_type());
				if(clientVO.getmember_type().equals("PERSON"))
					System.out.println(clientVO.getbirthday());
				else
					System.out.println(clientVO.getcompany());

				

				//测试manage_updateClient
				ResultMessage resultMessage = manageBL.manage_updateClient(1);
				if(resultMessage==ResultMessage.Success){
					System.out.println("更新客户信息成功");
				}

				else
					System.out.println("更新客户信息失败");

				

				//测试manage_addHotel
				resultMessage = manageBL.manage_addHotel("格林豪泰");
				if(resultMessage==ResultMessage.Success)
					System.out.println("添加酒店成功");
				else
					System.out.println("添加酒店失败");

				

				//测试manage_addHotelWorker
				resultMessage = manageBL.manage_addHotelWorker("格林豪泰", new HotelWorkerVO("lucy","11111111111", "格林豪泰"));
				if(resultMessage==ResultMessage.Success)
					System.out.println("添加酒店工作人员成功");
				else
					System.out.println("添加酒店工作人员失败");

				

				//测试manage_searchHotelWorker
				HotelWorkerVO hWorkerVO = manageBL.manage_searchHotelWorker("如家");
				System.out.println(hWorkerVO.gethotel());
				System.out.println(hWorkerVO.getname());
				System.out.println(hWorkerVO.getcontact());

				

				//测试manage_updateHotelWorker
				resultMessage = manageBL.manage_updateHotelWorker("如家");
				if(resultMessage==ResultMessage.Success)
					System.out.println("更新酒店工作人员信息成功");
				else
					System.out.println("更新酒店工作人员信息失败");

				

				//测试manage_addMarketWorker
				resultMessage = manageBL.manage_addMarketWorker(new WebMarketVO("jack", "11111111111"));
				if(resultMessage==ResultMessage.Success)
					System.out.println("添加网络营销人员成功");
				else
					System.out.println("添加网络营销人员失败");

				

				//测试manage_searchMarketWorker
				WebMarketVO webMarketVO = manageBL.manage_searchMarketWorker(1);
			    System.out.println(webMarketVO.getname());
				System.out.println(webMarketVO.getcontact());

				

				//测试manage_updateMarketWorker
				resultMessage = manageBL.manage_web_updateMarketWorker(new WebMarketVO("tom", "11111111111"));
				if(resultMessage==ResultMessage.Success)
					System.out.println("更新网络营销人员信息成功");
				else
					System.out.println("更新网络营销人员信息失败");

	}
}
