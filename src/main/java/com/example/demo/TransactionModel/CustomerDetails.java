package com.example.demo.TransactionModel;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerDetails {
	@Id
	int Customer_id;
	String Account_holder_Name;
	Long Account_No;
	String BankName;
	float Balance;
	boolean overdraft;
	boolean TerrorHistory;
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDetails(int customer_id, String account_holder_Name, Long account_No, String bankName, float balance,
			boolean overdraft, boolean terrorHistory) {
		super();
		Customer_id = customer_id;
		Account_holder_Name = account_holder_Name;
		Account_No = account_No;
		BankName = bankName;
		Balance = balance;
		this.overdraft = overdraft;
		TerrorHistory = terrorHistory;
	}
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public String getAccount_holder_Name() {
		return Account_holder_Name;
	}
	public void setAccount_holder_Name(String account_holder_Name) {
		Account_holder_Name = account_holder_Name;
	}
	public Long getAccount_No() {
		return Account_No;
	}
	public void setAccount_No(Long account_No) {
		Account_No = account_No;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	public boolean isOverdraft() {
		return overdraft;
	}
	public void setOverdraft(boolean overdraft) {
		this.overdraft = overdraft;
	}
	public boolean isTerrorHistory() {
		return TerrorHistory;
	}
	public void setTerrorHistory(boolean terrorHistory) {
		TerrorHistory = terrorHistory;
	}
	@Override
	public String toString() {
		return "CustomerDetails [Customer_id=" + Customer_id + ", Account_holder_Name=" + Account_holder_Name
				+ ", Account_No=" + Account_No + ", BankName=" + BankName + ", Balance=" + Balance + ", overdraft="
				+ overdraft + ", TerrorHistory=" + TerrorHistory + "]";
	}
	
	
	
	
	}
