package logiccontroller;

import java.util.ArrayList;

import VO.ClientVO;
import VO.OrderVO;
import businesslogicsevice.OrderBLService;
import businesslogicsevice.OrderState;
import businesslogicsevice.ResultMessage;

public class OrderController implements OrderBLService{
	//订单参数
		int id=000001;
		OrderState state=OrderState.Noraml;
		boolean execute=false;
		String hotel="如家";
		String start_time="2016-10-16-19:00";
		String end_time="2016-10-20-12:00";
		String latest_execute_time="2016-10-17-12:00";
		String room_type="双人房";
		int room_number=1;
		String strategy="无";
		int price=800;
		int expect_number_of_people=2;
		
		
		
		//客户浏览订单
		public ArrayList<OrderVO> order_client_browse(int client_id){
			ArrayList<OrderVO> OrderList_Client=new ArrayList<OrderVO>();
			OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			OrderList_Client.add(neworder);
			return OrderList_Client;
		}
		
		//酒店工作人员浏览订单
		public ArrayList<OrderVO> order_hotel_browse(int hotel_id){
			ArrayList<OrderVO> OrderList_Hotel=new ArrayList<OrderVO>();
			OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			OrderList_Hotel.add(neworder);
			return OrderList_Hotel;
		}
		
		//客户撤销订单
		public ResultMessage order_client_cancel(int order_id){
			return ResultMessage.Success;
		}
		
		//客户生成订单
		public OrderVO order_client_generate(OrderVO order_inputinfo){
			OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			return neworder;
		}
		
		//酒店工作人员执行订单
		public ResultMessage order_hotel_execute(int order_id){
			return ResultMessage.Success;
		}
		
		//网站营销人员浏览异常订单
		public ArrayList<OrderVO> order_market_browseUnfilled(){
			ArrayList<OrderVO> OrderList_Hotel=new ArrayList<OrderVO>();
			OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			OrderList_Hotel.add(neworder);
			return OrderList_Hotel;
		}
		
		//网站营销人员撤销异常订单
		public ResultMessage order_market_cancelAbnormal(int order_id){
			return ResultMessage.Success;
		}
		
		//计算订单总价
		public int order_calculateTotal(OrderVO order){
			return 100;
		}
}
