package view;

import java.util.ArrayList;

import VO.ClientVO;
import VO.HotelVO;
import businesslogic.ClientBLService_Stub;
import businesslogicsevice.ClientBLService;
import businesslogicsevice.ResultMessage;

public class ClientView {
	public ClientView(){
		
		ClientBLService clientBL = new ClientBLService_Stub("张三","100000",100,"无记录",1,"普通会员","01-01","谷歌",
				"学则路金鹰15号","学则路商圈","汉庭","价格优惠环境舒适","提供住宿洗浴","可用",
				"大型房",5,300,"01","好评");
		
		//测试client_checkInfo
				ClientVO vo = clientBL.client_checkInfo();
				System.out.println(vo.getname());
				System.out.println(vo.getcontact());
				System.out.println(vo.getcredit());
				System.out.println(vo.getcredit_record());
				System.out.println(vo.getmemberid());
				System.out.println(vo.getmember_type());
				if(vo.getmember_type().equals("PERSON"))
					System.out.println(vo.getbirthday());
				else
					System.out.println(vo.getcompany());

				//测试client_updateInfo
				ResultMessage resultMessage = clientBL.client_updateInfo("input");
				if(resultMessage==ResultMessage.Success){
					System.out.println("更新客户信息成功");
				}
				else {
					System.out.println("更新客户信息失败");
				}

				//测试client_getpreviousHotelList
				ArrayList<HotelVO> list = clientBL.client_getpreviousHotelList();
				HotelVO vo2 = null;
				if(list.isEmpty()){
					System.out.println("客户未曾预定过酒店");
				}
				else{
					for(int i=0;i<list.size();i++){
						vo2 = list.get(i);
						System.out.println(vo2.getname());
						System.out.println(vo2.getevaluation());
					}
				}

				//测试client_checkCredit
				String credit_record = clientBL.client_checkCredit();
				System.out.println(credit_record);

				//测试client_setLocation
				list = clientBL.client_setLocation("南京");
				for(int i=0;i<list.size();i++){
					vo2 = list.get(i);
					System.out.println(vo2.getname());
					System.out.println(vo2.getevaluation());
				}

				//测试client_searchHotel
				list = clientBL.client_searchHotel("condition");
				for(int i=0;i<list.size();i++){
					vo2 = list.get(i);
					System.out.println(vo2.getname());
					System.out.println(vo2.getevaluation());
				}

				//测试client_checkHotelInfo
				vo2 = clientBL.client_checkHotelInfo();
				System.out.println(vo2.getname());
				System.out.println(vo2.getaddress());
				System.out.println(vo2.getbussiness_address());
				System.out.println(vo2.getintroduction());
				System.out.println(vo2.getservice());
				//此处省略一部分输出
				//。。。

				//测试client_evaluateHotel
				resultMessage = clientBL.client_evaluateHotel("evaluation");
				if(resultMessage == ResultMessage.Success){
					System.out.println("评价成功");
				}
				else
					System.out.println("评价失败");

				//测试client_enrollVIP
				resultMessage = clientBL.client_enrollVIP("info");
				if(resultMessage == ResultMessage.Success)
					System.out.println("注册会员成功");
				else
					System.out.println("注册会员失败");
				
	}
}
