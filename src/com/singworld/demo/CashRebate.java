package com.singworld.demo;

public class CashRebate implements CashSuper {
	private double moneyRebate = 1.0;
	public CashRebate(String moneyRebate)
	{
		this.moneyRebate = Double.parseDouble(moneyRebate);
	}
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money*moneyRebate;
	}

}
