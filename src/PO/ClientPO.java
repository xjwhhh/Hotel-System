package PO;

import java.io.Serializable;

public class ClientPO implements Serializable{
	String name;
	long contact;
	int credit;
	String credit_record;
	int memberid;
	String member_type;
	String birthday;
	String company;
	String company2;
	
	
	public ClientPO(String n,long c,int c1,String cr,int m,String mt,String b,String co){
		name=n;
		contact=c;
		credit=c1;
		credit_record=cr;
		memberid=m;
		member_type=mt;
		birthday=b;
		company=co;
	}
	public String getname(){
		return name;
	}
	public long getcontact(){
		return contact;
	}
	public int getcredit(){
		return credit;
	}
	public String getcredit_record(){
		return credit_record;
	}
	public int getmemberid(){
		return memberid;
	}
	public String getmember_type(){
		return member_type;
	}
	public String getbirthday(){
		return birthday;
	}
	public String getcompany(){
		return company;
	}	
}
