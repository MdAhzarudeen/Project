package org.bank;

public class BankInfo extends Axisbank {
public void Saving() {
	System.out.println();
}
@Override
	public void deposit1(int id) {
		super.deposit1(id);
		System.out.println("9% interest"+id);
	}
public static void main(String[] args) {
	BankInfo BI = new BankInfo();
	BI.Saving();
	BI.deposit1(9);
}
}