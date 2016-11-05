package businesslogicsevice;

import java.util.ArrayList;

import VO.ClientVO;
import VO.OrderVO;

public interface OrderBLService {
		//客户浏览订单
		public ArrayList<OrderVO> order_client_browse(int client_id);
		
		//酒店工作人员浏览订单
		public ArrayList<OrderVO> order_hotel_browse(int hotel_id);
		
		//客户撤销订单
		public ResultMessage order_client_cancel(int order_id);
		
		//客户生成订单
		public OrderVO order_client_generate(OrderVO order);
		
		//酒店工作人员执行订单
		public ResultMessage order_hotel_execute(int order_id);
		
		//网站营销人员浏览异常订单
		public ArrayList<OrderVO> order_market_browseUnfilled();
		
		//网站营销人员撤销异常订单
		public ResultMessage order_market_cancelAbnormal(int order_id);
		
		//计算订单总价
		public int order_calculateTotal(OrderVO order);
}
