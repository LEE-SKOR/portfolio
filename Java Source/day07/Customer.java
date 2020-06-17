package day07;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public void getCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customergrade) {
		this.customerGrade = customerGrade;
	}
	public String showCustomerInfo() {
		return customerName+"���� ����� "+customerGrade+ "�̸�, ���ʽ� ����Ʈ�� "+bonusPoint+"�Դϴ�";
	}
	
}
