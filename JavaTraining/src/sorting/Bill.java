package sorting;

public class Bill {
	int billId;
	String billNumber;
	double billAmount;
	public Bill(int billId,String billNumber,double billAmount){
		this.billId=billId;
		this.billNumber=billNumber;
		this.billAmount=billAmount;
	}
	public void setBillId(int billId){
		this.billId=billId;
	}
	public int getBillId(){
		return billId;
	}
	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	
	
}
