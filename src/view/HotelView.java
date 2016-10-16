package view;

import VO.HotelVO;
import businesslogic.HotelBLService_Stub;
import businesslogicsevice.HotelBLService;
import businesslogicsevice.ResultMessage;

public class HotelView {
	public HotelView(){
		
		HotelBLService hotelBL = new HotelBLService_Stub("学则路金鹰15号","学则路商圈","汉庭",
				"价格优惠环境舒适","提供住宿洗浴","可用","大型房",5,300,"01","好评");
		
		//测试hotel_checkInfo
				HotelVO hotelVO = hotelBL.hotel_checkInfo();
				System.out.println(hotelVO.getname());
				System.out.println(hotelVO.getaddress());
				System.out.println(hotelVO.getbussiness_address());
				System.out.println(hotelVO.getintroduction());
				System.out.println(hotelVO.getservice());
				System.out.println(hotelVO.getevaluation());
				System.out.println(hotelVO.getroom_state());
				System.out.println(hotelVO.getorder());
				System.out.println(hotelVO.getroom_type());
				System.out.println(hotelVO.getroom_price());
				System.out.println(hotelVO.getroom_number());

				

				//测试hotel_updateInfo
				ResultMessage resultMessage = hotelBL.hotel_updateInfo(
						new HotelVO("南京","新街口", "如家", "如家酒店", "酒店所有服务", "可用", "双人房", 1, 100, "", "good"));
				if(resultMessage == ResultMessage.Success){
					System.out.println("更新酒店信息成功");
				}
				else {
					System.out.println("更新酒店信息失败");
				}

				

				//测试hotel_importRoom
				resultMessage = hotelBL.hotel_importRoom("双人房");
				if (resultMessage==ResultMessage.Success) {
					System.out.println("录入可用房间成功");
				}
				else {
					System.out.println("录入可用房间失败");
				}

				

				//测试hotel_updateAccomdation
				resultMessage = hotelBL.hotel_updateAccomodation("一人入住房间001号");
				if (resultMessage == ResultMessage.Success) {
					System.out.println("更新入住信息成功");
				}
				else {
					System.out.println("更新入住信息失败");
				}
				
	}
}
