package api.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;


@WebServlet("/bill")
public class BillServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


            Bill bill = new Bill();
            bill.setPayment("coco");
            bill.setIdBill("1212312121");
            bill.setPrice(55);
//            bill.setDate(17/01/18);
            bill.setReferOfno("987654321");
            bill.setFee(1);

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(resp.getOutputStream(), bill);

            }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse response)
            throws ServletException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        Bill sendBill = mapper.readValue(req.getInputStream(), Bill.class);

        Bill bill = new Bill();
        bill.setIdBill("2018011700000000028509745");
        bill.setPayment("Response from POST form " + sendBill.getPayment());

        mapper.writeValue(response.getOutputStream(), bill);

    }    


public class Bill {

	private String idBill;
    private float price;
//    private Date date;
    private String payment;
    private String referOfno;
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
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getReferOfno() {
		return referOfno;
	}
	public void setReferOfno(String referOfno) {
		this.referOfno = referOfno;
	}
    public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
    

}
}
