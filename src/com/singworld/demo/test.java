package com.singworld.demo;

public class test {
	private double total = 0.0;

	public static void main(String[] args) {
		CashContext cc = null;
		switch("�����")
		{
		case "�����շ�":
			cc = new CashContext(new CashNormal());
			break;
		case "��300��100":
			cc = new CashContext(new CashReturn("300", "100"));
			break;
		case "�����":
			cc = new CashContext(new CashRebate("0.8"));
			break;
		
		}
		double totalPrices = 0.0;
		totalPrices = cc.GetResult(500.0)*20;
		System.out.println(totalPrices);
		

	}

}
