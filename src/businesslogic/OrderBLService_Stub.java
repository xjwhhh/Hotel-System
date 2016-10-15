package businesslogic;

import java.util.ArrayList;

import VO.ClientVO;
import VO.OrderVO;
import businesslogicsevice.OrderBLService;
import businesslogicsevice.ResultMessage;

public class OrderBLService_Stub implements OrderBLService{
	//��������
	int id;
	String state;
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
	
	public OrderBLService_Stub(int i,String s,boolean e,String h,String st,String et,String lt,String rt,int rm,String str,int p,int en){
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
	
	//�ͻ��������
	public ArrayList<OrderVO> order_client_browse(){
		ArrayList<OrderVO> OrderList_Client=new ArrayList<OrderVO>();
		OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
		OrderList_Client.add(neworder);
		return OrderList_Client;
	}
	
	//�Ƶ깤����Ա�������
	public ArrayList<OrderVO> order_hotel_browse(){
		ArrayList<OrderVO> OrderList_Hotel=new ArrayList<OrderVO>();
		OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
		OrderList_Hotel.add(neworder);
		return OrderList_Hotel;
	}
	
	//�ͻ���������
	public ResultMessage order_client_cancel(){
		return ResultMessage.Success;
	}
	
	//�ͻ����ɶ���
	public OrderVO order_client_generate(){
		OrderVO neworder=new OrderVO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
		return neworder;
	}
	
	//�Ƶ깤����Աִ�ж���
	public ResultMessage order_hotel_execute(ClientVO c){
		return ResultMessage.Success;
	}
}
