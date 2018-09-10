/**
 * 
 */
package com.biller.billler;

import java.util.Date;

/**
 * @author Murthy's
 *
 */
public class Bill {
	
	private int billId;
	private Date bilDate;
	private Double billAmoujt;

	public Bill() {
		super();
	}
	public Bill(int billId, Date bilDate, Double billAmoujt) {
		this.billId = billId;
		this.bilDate = bilDate;
		this.billAmoujt = billAmoujt;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public Date getBilDate() {
		return bilDate;
	}
	public void setBilDate(Date bilDate) {
		this.bilDate = bilDate;
	}
	public Double getBillAmoujt() {
		return billAmoujt;
	}
	public void setBillAmoujt(Double billAmoujt) {
		this.billAmoujt = billAmoujt;
	}
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", bilDate=" + bilDate + ", billAmoujt=" + billAmoujt + "]";
	}
}