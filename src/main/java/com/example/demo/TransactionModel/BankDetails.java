package com.example.demo.TransactionModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BankDetails {
	@Id
	String Bic;
	String BankName;
	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankDetails(String bic, String bankName) {
		super();
		Bic = bic;
		BankName = bankName;
	}
	public String getBic() {
		return Bic;
	}
	public void setBic(String bic) {
		Bic = bic;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	
	@Override
	public String toString() {
		return "BankDetails [Bic=" + Bic + ", BankName=" + BankName + "]";
	}
	

}
