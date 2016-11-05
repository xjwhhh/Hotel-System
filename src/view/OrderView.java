package view;

import java.util.ArrayList;

import VO.ClientVO;
import VO.OrderVO;
import businesslogic.OrderBLService_Stub;
import businesslogicsevice.OrderBLService;
import businesslogicsevice.OrderState;
import businesslogicsevice.ResultMessage;

public class OrderView {
	public OrderView(){
		
		OrderBLService orderBL = new OrderBLService_Stub(10,OrderState.Noraml,true,"��ͥ","10-16","10-19",
				"10-17","���ͷ�",5,"����",810,2);
		
		//�ͻ��鿴����
				ArrayList<OrderVO> OrderList_Client=new ArrayList<OrderVO>();
				OrderList_Client=orderBL.order_client_browse(1);
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
				
				//�Ƶ깤����Ա�鿴����
				ArrayList<OrderVO> OrderList_Hotel=new ArrayList<OrderVO>();
				OrderList_Hotel=orderBL.order_hotel_browse(1);
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
				
				//�ͻ���������
				ResultMessage result_client=orderBL.order_client_cancel(1);
				if(result_client==ResultMessage.Success){
					System.out.println("�����ɹ�");
				}
				else{
					System.out.println("����ʧ��");
				}
				
				//�ͻ����ɶ���
				OrderVO neworder=new OrderVO(1,OrderState.Noraml, false, "��ͥ","10-16","10-19","10-17", "�󴲷�",200,"����", 1, 1);
				OrderVO order1=orderBL.order_client_generate(neworder);
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
				
				//�Ƶ깤����Աִ�ж���
				ClientVO c=new ClientVO("Jack","11111111111",0,"��",000001,"���˻�Ա","1997-1-1","��");
				ResultMessage result_hotel=orderBL.order_hotel_execute(1);
				if(result_hotel==ResultMessage.Success){
					System.out.println("ִ�ж����ɹ�");
				}
				else{
					System.out.println("ִ�ж���ʧ��");
				}
	}
}
