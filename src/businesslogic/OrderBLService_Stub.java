package businesslogic;

import java.util.ArrayList;

import VO.ClientVO;
import VO.OrderVO;
import businesslogicsevice.OrderBLService;
import businesslogicsevice.OrderState;
import businesslogicsevice.ResultMessage;

public class OrderBLService_Stub implements OrderBLService{
	//订单参数
	int id;
	OrderState state;
	boolean execute;
	String hotel;
	String start_time;
	String end_time;
	String latest_execute_time;
	String room_type;
	int room_number;
	String strategy;
	int price;
	int expect_number_of_people;
	
	public OrderBLService_Stub(int i,OrderState s,boolean e,String h,String st,String et,String lt,String rt,int rm,String str,int p,int en){
		id=i;
		state=s;
		execute=e;
		hotel=h;
		start_time=st;
		end_time=et;
		latest_execute_time=lt;
		room_type=rt;
		room_number=rm;
		strategy=str;
		price=p;
		expect_number_of_people=en;
	}
	
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
