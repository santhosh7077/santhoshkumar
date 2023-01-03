package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("TCS");
	}
	private void compandId() {
		System.out.println("12345");
	}
	private void companyAddress() {
		System.out.println("Navalur");
	}
	public static void main(String[] args) {
		CompanyInfo com=new CompanyInfo();
		com.companyName();
		com.compandId();
		com.companyAddress();
	}

}
