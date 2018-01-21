package Enity;


import java.sql.Date;

public class Bill {

	private String idBill;
    private float price;
    private Date date;
    private String payment;
    private String referOfNo;
    private float fee;


	public String getIdBill() {
		return idBill;
	}
	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getReferOfNo() {
		return referOfNo;
	}
	public void setReferOfNo(String referOfNo) {
		this.referOfNo = referOfNo;
	}
    public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
    

}