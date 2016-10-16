package businesslogicsevice;

import java.util.ArrayList;

import VO.ClientVO;
import VO.OrderVO;

public interface OrderBLService {
	//客户浏览订单
		public ArrayList<OrderVO> order_client_browse();
		
		//酒店工作人员浏览订单
		public ArrayList<OrderVO> order_hotel_browse();
		
		//客户撤销订单
		public ResultMessage order_client_cancel();
		
		//客户生成订单
		public OrderVO order_client_generate(String input);
		
		//酒店工作人员执行订单
		public ResultMessage order_hotel_execute(ClientVO c);
}
