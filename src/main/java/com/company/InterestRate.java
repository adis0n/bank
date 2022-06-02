package com.company;


//class to make calculations nice
public class InterestRate {
	double value;
	String endDate;
	String startDate;
	public InterestRate(double value, String startDate, String endDate) {
		this.value = value;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public double calculateInterest(double amount){
		double rate = Math.pow((value/100+1),calculateTime());
		return rate*amount;

	}
	public int calculateTime(){
		System.out.println(this.startDate);
		String startMonth = this.startDate.substring(3,5);
		String endMonth = this.endDate.substring(3,5);
		return Integer.parseInt(endMonth) - Integer.parseInt(startMonth);
	}

	public double getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
