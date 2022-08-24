package com.example.demo.TransactionModel;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerDetails {
	@Id
	int customer_id;
	String accountholdername;
	long accountno;
	String bankName;
	float balance;
	boolean overdraft;
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDetails(int customer_id, String accountholdername, long accountno, String bankName, float balance,
			boolean overdraft) {
		super();
		this.customer_id = customer_id;
		this.accountholdername = accountholdername;
		this.accountno = accountno;
		this.bankName = bankName;
		this.balance = balance;
		this.overdraft = overdraft;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public boolean isOverdraft() {
		return overdraft;
	}
	public void setOverdraft(boolean overdraft) {
		this.overdraft = overdraft;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customer_id=" + customer_id + ", accountholdername=" + accountholdername
				+ ", accountno=" + accountno + ", bankName=" + bankName + ", balance=" + balance + ", overdraft="
				+ overdraft + "]";
	}
	
		}
