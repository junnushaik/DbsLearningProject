package com.example.demo.TransactionModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TerrorList {
@Id
int Customer_id;
long raccountno;
String Receiver_Account_Holder_Name;
public TerrorList() {
	super();
	// TODO Auto-generated constructor stub
}
public TerrorList(int customer_id, Long raccountno, String receiver_Account_Holder_Name) {
	super();
	Customer_id = customer_id;
	this.raccountno = raccountno;
	Receiver_Account_Holder_Name = receiver_Account_Holder_Name;
}
public int getCustomer_id() {
	return Customer_id;
}
public void setCustomer_id(int customer_id) {
	Customer_id = customer_id;
}
public Long getRaccountno() {
	return raccountno;
}
public void setRaccountno(Long raccountno) {
	this.raccountno = raccountno;
}
public String getReceiver_Account_Holder_Name() {
	return Receiver_Account_Holder_Name;
}
public void setReceiver_Account_Holder_Name(String receiver_Account_Holder_Name) {
	Receiver_Account_Holder_Name = receiver_Account_Holder_Name;
}
@Override
public String toString() {
	return "TerrorList [Customer_id=" + Customer_id + ", raccountno=" + raccountno + ", Receiver_Account_Holder_Name="
			+ Receiver_Account_Holder_Name + "]";
}

}
