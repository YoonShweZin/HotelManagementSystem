package hotelmanagement;

public class Booking 
{
	private int id;
	private String bdate;
	private hotelmanagement.Customer c;
	private hotelmanagement.Room br;
	
	public Booking() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(int id, String bdate, hotelmanagement.Customer c, hotelmanagement.Room br)
	{
		super();
		this.id = id;
		this.bdate = bdate;
		this.c = c;
		this.br = br;
	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getBdate() 
	{
		return bdate;
	}
	public void setBdate(String bdate)
	{
		this.bdate = bdate;
	}
	public Customer getCus() 
	{
		return c;
	}
	public void setCus(Customer cus) 
	{
		this.c = cus;
	}
	public Room getRoom() 
	{
		return br;
	}
	public void setRoom(Room room)
	{
		this.br = room;
	}
	@Override
	public String toString() {
		return "Booking [id=" + id + ", bdate=" + bdate + ", cus=" + c + ", room=" + br + "]";
	}
	

}
