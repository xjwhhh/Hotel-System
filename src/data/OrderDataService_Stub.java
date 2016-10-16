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
	
	//���ݶ���id���Ҷ�Ӧ����
		@Override
		public OrderPO find (int id){
			OrderPO orderpo  = new OrderPO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people);
			return orderpo; 
		}
		
		//���ݾƵ�name���Ҷ�Ӧ�����б�
		@Override
		public ArrayList<OrderPO> find (String name){
			ArrayList<OrderPO> orderPOs = new ArrayList<OrderPO>();
			orderPOs.add(new OrderPO(id,state,execute,hotel,start_time,end_time,latest_execute_time,room_type,room_number,strategy,price,expect_number_of_people));
			return orderPOs;
		}
		
		//��Ӷ���
		@Override
		public ResultMessage insert(OrderPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//ɾ������
		@Override
		public ResultMessage delete(OrderPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
		
		//���¶���
		@Override
		public ResultMessage update(OrderPO po){
			if(po!=null){
				return ResultMessage.Success;
			}
			else
				return ResultMessage.Fail;
		}
}
