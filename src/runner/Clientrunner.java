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
		
	    System.out.println("²âÊÔ¿Í»§½çÃæ");
	    ClientView cv=new ClientView();
		System.out.println("");
		
		System.out.println("²âÊÔ¾Æµê½çÃæ");
		HotelView hv=new HotelView();
		System.out.println("");
		
		System.out.println("²âÊÔ¹ÜÀí½çÃæ");
		ManageView mv=new ManageView();
		System.out.println("");
		
		System.out.println("²âÊÔ¶©µ¥½çÃæ");
		OrderView ov=new OrderView();
		System.out.println("");
		
		System.out.println("²âÊÔ²ßÂÔ½çÃæ");
		StrategyView sv=new StrategyView();
		System.out.println("");
		
		System.out.println("²âÊÔµÇÂ¼½çÃæ");
		UserView uv=new UserView();
		System.out.println("");
		
		System.out.println("²âÊÔ¿Í»§Âß¼­");
		ClientBLService clientController=new ClientController();
		ClientBLService_driver clientdriver=new ClientBLService_driver();
		clientdriver.drive(clientController);
		System.out.println("");
		
		System.out.println("²âÊÔ¾ÆµêÂß¼­");
		HotelBLService hotelController=new HotelController();
		HotelBLService_driver hoteldriver=new HotelBLService_driver();
		hoteldriver.drive(hotelController);
		System.out.println("");
		
		System.out.println("²âÊÔ¹ÜÀíÂß¼­");
		ManageBLService manageController=new ManageController();
		ManageBLService_driver managedriver=new ManageBLService_driver();
		managedriver.drive(manageController);
		System.out.println("");
		
		System.out.println("²âÊÔ¶©µ¥Âß¼­");
		OrderBLService orderController=new OrderController();
		OrderBLService_driver orderdriver=new OrderBLService_driver();
		orderdriver.drive(orderController);
		System.out.println("");
		
		System.out.println("²âÊÔ²ßÂÔÂß¼­");
		StrategyBLService strategyController=new StrategyController();
		StrategyBLService_driver strategydriver=new StrategyBLService_driver();
		strategydriver.drive(strategyController);
		System.out.println("");
		
		
		System.out.println("²âÊÔµÇÂ¼Âß¼­");
		UserBLService userController=new UserController();
		UserBLService_driver userdriver=new UserBLService_driver();
		userdriver.drive(userController);
		System.out.println("");
	}
}
