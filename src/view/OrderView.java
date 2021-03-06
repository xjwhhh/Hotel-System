package view;

import java.util.ArrayList;

import VO.ClientVO;
import VO.OrderVO;
import businesslogic.OrderBLService_Stub;
import businesslogicsevice.OrderBLService;
import businesslogicsevice.ResultMessage;

public class OrderView {
	public OrderView(){
		
		OrderBLService orderBL = new OrderBLService_Stub(10,"已执行",true,"汉庭","10-16","10-19",
				"10-17","大型房",5,"九折",810,2);
		
		//客户查看订单
				ArrayList<OrderVO> OrderList_Client=new ArrayList<OrderVO>();
				OrderList_Client=orderBL.order_client_browse();
				OrderVO order=OrderList_Client.get(0);
				System.out.println(order.getid());
				System.out.println(order.getstate());
				System.out.println(order.getexecute());
				System.out.println(order.gethotel());
				System.out.println(order.getstart_time());
				System.out.println(order.getend_time());
				System.out.println(order.getlatest_execute_time());
				System.out.println(order.getroom_type());
				System.out.println(order.getroom_number());
				System.out.println(order.getstrategy());
				System.out.println(order.getprice());
				System.out.println(order.getexpect_number_of_people());
				
				//酒店工作人员查看订单
				ArrayList<OrderVO> OrderList_Hotel=new ArrayList<OrderVO>();
				OrderList_Hotel=orderBL.order_hotel_browse();
				OrderVO hotel=OrderList_Hotel.get(0);
				System.out.println(hotel.getid());
				System.out.println(hotel.getstate());
				System.out.println(hotel.getexecute());
				System.out.println(hotel.gethotel());
				System.out.println(hotel.getstart_time());
				System.out.println(hotel.getend_time());
				System.out.println(hotel.getlatest_execute_time());
				System.out.println(hotel.getroom_type());
				System.out.println(hotel.getroom_number());
				System.out.println(hotel.getstrategy());
				System.out.println(hotel.getprice());
				System.out.println(hotel.getexpect_number_of_people());
				
				//客户撤销订单
				ResultMessage result_client=orderBL.order_client_cancel();
				if(result_client==ResultMessage.Success){
					System.out.println("撤销成功");
				}
				else{
					System.out.println("撤销失败");
				}
				
				//客户生成订单
				OrderVO order1=orderBL.order_client_generate("input");
				System.out.println(order1.getid());
				System.out.println(order1.getstate());
				System.out.println(order1.getexecute());
				System.out.println(order1.gethotel());
				System.out.println(order1.getstart_time());
				System.out.println(order1.getend_time());
				System.out.println(order1.getlatest_execute_time());
				System.out.println(order1.getroom_type());
				System.out.println(order1.getroom_number());
				System.out.println(order1.getstrategy());
				System.out.println(order1.getprice());
				System.out.println(order1.getexpect_number_of_people());
				
				//酒店工作人员执行订单
				ClientVO c=new ClientVO("Jack","11111111111",0,"无",000001,"个人会员","1997-1-1","无");
				ResultMessage result_hotel=orderBL.order_hotel_execute(c);
				if(result_hotel==ResultMessage.Success){
					System.out.println("执行订单成功");
				}
				else{
					System.out.println("执行订单失败");
				}
	}
}
