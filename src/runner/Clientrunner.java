package runner;

import businesslogicsevice.ClientBLService;
import businesslogicsevice.HotelBLService;
import businesslogicsevice.ManageBLService;
import businesslogicsevice.OrderBLService;
import businesslogicsevice.StrategyBLService;
import businesslogicsevice.UserBLService;
import driver.ClientBLService_driver;
import driver.HotelBLService_driver;
import driver.ManageBLService_driver;
import driver.OrderBLService_driver;
import driver.StrategyBLService_driver;
import driver.UserBLService_driver;
import logiccontroller.ClientController;
import logiccontroller.HotelController;
import logiccontroller.ManageController;
import logiccontroller.OrderController;
import logiccontroller.StrategyController;
import logiccontroller.UserController;
import view.ClientView;
import view.HotelView;
import view.ManageView;
import view.OrderView;
import view.StrategyView;
import view.UserView;

public class Clientrunner {
	public static void main(String[] args){
		
	    System.out.println("���Կͻ�����");
	    ClientView cv=new ClientView();
		System.out.println("");
		
		System.out.println("���ԾƵ����");
		HotelView hv=new HotelView();
		System.out.println("");
		
		System.out.println("���Թ������");
		ManageView mv=new ManageView();
		System.out.println("");
		
		System.out.println("���Զ�������");
		OrderView ov=new OrderView();
		System.out.println("");
		
		System.out.println("���Բ��Խ���");
		StrategyView sv=new StrategyView();
		System.out.println("");
		
		System.out.println("���Ե�¼����");
		UserView uv=new UserView();
		System.out.println("");
		
		System.out.println("���Կͻ��߼�");
		ClientBLService clientController=new ClientController();
		ClientBLService_driver clientdriver=new ClientBLService_driver();
		clientdriver.drive(clientController);
		System.out.println("");
		
		System.out.println("���ԾƵ��߼�");
		HotelBLService hotelController=new HotelController();
		HotelBLService_driver hoteldriver=new HotelBLService_driver();
		hoteldriver.drive(hotelController);
		System.out.println("");
		
		System.out.println("���Թ����߼�");
		ManageBLService manageController=new ManageController();
		ManageBLService_driver managedriver=new ManageBLService_driver();
		managedriver.drive(manageController);
		System.out.println("");
		
		System.out.println("���Զ����߼�");
		OrderBLService orderController=new OrderController();
		OrderBLService_driver orderdriver=new OrderBLService_driver();
		orderdriver.drive(orderController);
		System.out.println("");
		
		System.out.println("���Բ����߼�");
		StrategyBLService strategyController=new StrategyController();
		StrategyBLService_driver strategydriver=new StrategyBLService_driver();
		strategydriver.drive(strategyController);
		System.out.println("");
		
		
		System.out.println("���Ե�¼�߼�");
		UserBLService userController=new UserController();
		UserBLService_driver userdriver=new UserBLService_driver();
		userdriver.drive(userController);
		System.out.println("");
	}
}
