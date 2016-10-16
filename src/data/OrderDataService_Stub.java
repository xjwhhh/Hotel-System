package data;

import java.util.ArrayList;

import PO.OrderPO;
import businesslogicsevice.ResultMessage;
import dataservice.OrderDataService;

public class OrderDataService_Stub implements OrderDataService{
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
	
	//根据订单id查找对应订单
		@Override
		public OrderPO find (int id){
			OrderPO orderpo  = new OrderPO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			return orderpo; 
		}
		
		//根据酒店name查找对应订单列表
		@Override
		public ArrayList<OrderPO> find (String name){
			ArrayList<OrderPO> orderPOs = new ArrayList<OrderPO>();
			orderPOs.add(new OrderPO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people));
			return orderPOs;
		}
		
		//添加订单
		@Override
		public ResultMessage insert(OrderPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//删除订单
		@Override
		public ResultMessage delete(OrderPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//更新订单
		@Override
		public ResultMessage update(OrderPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
}
