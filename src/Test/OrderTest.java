package Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import MockObject.MockClient1;
import MockObject.MockHotel1;
import VO.OrderVO;
import businesslogicsevice.OrderState;
import businesslogicsevice.ResultMessage;
import logiccontroller.OrderController;
public class OrderTest {

	@Test
	public void testorder_client_browse(){
		MockClient1 client1=new MockClient1(1);
		OrderController order=new OrderController();
		ArrayList<OrderVO> orderlist_client=order.order_client_browse(client1.getclient_id());
		
		assertEquals(000001,orderlist_client.get(0).getid());
	}
	
	
	@Test
	public void testorder_hotel_browse(){
		MockHotel1 hotel1=new MockHotel1(1);
		OrderController order=new OrderController();
		ArrayList<OrderVO> orderlist_hotel=order.order_client_browse(hotel1.gethotel_id());
		
		assertEquals(000001,orderlist_hotel.get(0).getid());
	}
	
	@Test
	public void testorder_client_cancel(){
		OrderController order=new OrderController();
		ResultMessage client_cancel_result=order.order_client_cancel(1);
		assertEquals(ResultMessage.Success,client_cancel_result);
	}
	
	@Ignore
	@Test 
	public void testorder_client_generate(){
		OrderController order=new OrderController();
		OrderVO orderinfo=new OrderVO(1,OrderState.Noraml, false, "∫∫Õ•","10-16","10-19","10-17", "¥Û¥≤∑ø",200,"æ≈’€", 1, 1);
		OrderVO order_generate=order.order_client_generate(orderinfo);
		assertEquals(1,order_generate.getid());
	}
	
	@Test
	public void testorder_execute(){
		OrderController order=new OrderController();
		ResultMessage client_execute_result=order.order_hotel_execute(1);
		assertEquals(ResultMessage.Success,client_execute_result);
	}
	
	@Ignore
	@Test
	public void testorder_market_browseUnfilled(){
		
	}
	
	@Test
	public void testorder_market_cancelAbnormal(){
		OrderController order=new OrderController();
		ResultMessage market_cancelAbnormal_result=order.order_market_cancelAbnormal(1);
		assertEquals(ResultMessage.Success,market_cancelAbnormal_result);
	}
	
	@Test
	public void testorder_calculateTotal(){
		OrderController order=new OrderController();
		OrderVO orderinfo=new OrderVO(1,OrderState.Noraml, false, "∫∫Õ•","10-16","10-19","10-17", "¥Û¥≤∑ø",200,"æ≈’€", 1, 1);
		int totalprice=order.order_calculateTotal(orderinfo);
		assertEquals(100,totalprice);
	}
	
	
}
