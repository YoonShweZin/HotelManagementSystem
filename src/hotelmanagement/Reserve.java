package hotelmanagement;

public class Reserve 
{
	private int resid;
	private Customer cus;
	private Room r;
	private String checkin;
	private String checkout;
	
	public Reserve()
	{
		
	}

	public Reserve(int resid, hotelmanagement.Customer customer, hotelmanagement.Room room, String checkin, String checkout)
	{
		super();
		this.resid = resid;
		this.cus = customer;
		this.r = room;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public int getResid() {
		return resid;
	}

	public void setResid(int resid) {
		this.resid = resid;
	}

	public Customer getCus() {
		return cus;
	}

	public void setCus(Customer cus) {
		this.cus = cus;
	}

	public Room getR() {
		return r;
	}

	public void setR(Room r) {
		this.r = r;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	@Override
	public String toString() 
	{
		return "Reserve [resid=" + resid + ", cus=" + cus + ", r=" + r + ", checkin=" + checkin + ", checkout="
				+ checkout + "]";
	}

}
