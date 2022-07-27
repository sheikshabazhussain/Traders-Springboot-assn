package com.Traders.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Trade_Dtls
{
	@Id
	@GeneratedValue(generator ="trade",strategy = GenerationType.IDENTITY )
	@SequenceGenerator(name="trade", sequenceName = "Trade_Id", initialValue = 100, allocationSize = 100)
	@Column(name="Trade_Id")
   private int tradeid;
	
	@Column(name="Trade_Nm")
   private String tradename;
	
	@Column(name="Trade_Typ")
   private String tradetype;
	
	@Column(name="Trade_Cntry")
   private String tradecountry;
	
	@Column(name="Trade_Dt")
   private String tradedate;
	
	@Column(name="Trade_Amt")
   private String tradeamount;
   
	
	
public int getTradeid() {
	return tradeid;
}
public void setTradeid(int tradeid) {
	this.tradeid = tradeid;
}
public String getTradename() {
	return tradename;
}
public void setTradename(String tradename) {
	this.tradename = tradename;
}
public String getTradetype() {
	return tradetype;
}
public void setTradetype(String tradetype) {
	this.tradetype = tradetype;
}
public String getTradecountry() {
	return tradecountry;
}
public void setTradecountry(String tradecountry) {
	this.tradecountry = tradecountry;
}
public String getTradedate() {
	return tradedate;
}
public void setTradedate(String tradedate) {
	this.tradedate = tradedate;
}
public String getTradeamount() {
	return tradeamount;
}
public void setTradeamount(String tradeamount) {
	this.tradeamount = tradeamount;
}
   
   
}
