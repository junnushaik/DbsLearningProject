package com.example.demo.TransactionModel;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransactionDetails {
	@Id
    int tid;
	int Customer_id;
	Long Sender_Account_No;
	Long Received_Account_NO;
	String Sender_Account_Holder_Name;
	String Receiver_Account_Holder_Name;
   String Transaction_Status;
    String Transaction_Type;
    Date Transaction_date;
	public TransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionDetails(int tid, int customer_id, Long sender_Account_No, Long received_Account_NO,
			String sender_Account_Holder_Name, String receiver_Account_Holder_Name, String transaction_Status,
			String transaction_Type, Date transaction_date) {
		super();
		this.tid = tid;
		Customer_id = customer_id;
		Sender_Account_No = sender_Account_No;
		Received_Account_NO = received_Account_NO;
		Sender_Account_Holder_Name = sender_Account_Holder_Name;
		Receiver_Account_Holder_Name = receiver_Account_Holder_Name;
		Transaction_Status = transaction_Status;
		Transaction_Type = transaction_Type;
		Transaction_date = transaction_date;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public Long getSender_Account_No() {
		return Sender_Account_No;
	}
	public void setSender_Account_No(Long sender_Account_No) {
		Sender_Account_No = sender_Account_No;
	}
	public Long getReceived_Account_NO() {
		return Received_Account_NO;
	}
	public void setReceived_Account_NO(Long received_Account_NO) {
		Received_Account_NO = received_Account_NO;
	}
	public String getSender_Account_Holder_Name() {
		return Sender_Account_Holder_Name;
	}
	public void setSender_Account_Holder_Name(String sender_Account_Holder_Name) {
		Sender_Account_Holder_Name = sender_Account_Holder_Name;
	}
	public String getReceiver_Account_Holder_Name() {
		return Receiver_Account_Holder_Name;
	}
	public void setReceiver_Account_Holder_Name(String receiver_Account_Holder_Name) {
		Receiver_Account_Holder_Name = receiver_Account_Holder_Name;
	}
	public String getTransaction_Status() {
		return Transaction_Status;
	}
	public void setTransaction_Status(String transaction_Status) {
		Transaction_Status = transaction_Status;
	}
	public String getTransaction_Type() {
		return Transaction_Type;
	}
	public void setTransaction_Type(String transaction_Type) {
		Transaction_Type = transaction_Type;
	}
	public Date getTransaction_date() {
		return Transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		Transaction_date = transaction_date;
	}
	@Override
	public String toString() {
		return "TransactionDetails [tid=" + tid + ", Customer_id=" + Customer_id + ", Sender_Account_No="
				+ Sender_Account_No + ", Received_Account_NO=" + Received_Account_NO + ", Sender_Account_Holder_Name="
				+ Sender_Account_Holder_Name + ", Receiver_Account_Holder_Name=" + Receiver_Account_Holder_Name
				+ ", Transaction_Status=" + Transaction_Status + ", Transaction_Type=" + Transaction_Type
				+ ", Transaction_date=" + Transaction_date + "]";
	}
	
	
			
}
