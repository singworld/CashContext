package com.singworld.demo;

public class test {
	private double total = 0.0;

	public static void main(String[] args) {
		CashContext cc = null;
		switch("打八折")
		{
		case "正常收费":
			cc = new CashContext(new CashNormal());
			break;
		case "满300减100":
			cc = new CashContext(new CashReturn("300", "100"));
			break;
		case "打八折":
			cc = new CashContext(new CashRebate("0.8"));
			break;
		
		}
		double totalPrices = 0.0;
		totalPrices = cc.GetResult(500.0)*20;
		System.out.println(totalPrices);
		

	}

}
