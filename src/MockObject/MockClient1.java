package MockObject;

import logiccontroller.ClientController;

public class MockClient1 extends ClientController{
	int client_id;
	
	public MockClient1(int id){
		client_id=id;
	}
	
	public int getclient_id(){
		return client_id;
	}
}
