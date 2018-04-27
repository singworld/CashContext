package com.singworld.demo;

public class CashContext {
	private CashSuper cs;

	public CashContext(CashSuper cs) {
		super();
		this.cs = cs;
//		this.cs = csuper;
	}
	public double GetResult(double money){
		return cs.acceptCash(money);
	}
	

}
