package hotelmanagement;

public class Customer extends People
{
	private String email;
	
	
	public Customer()
	{
		
	}
	public Customer(int id, String name, String phone, String email) 
	{
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	

	@Override
	public String toString() 
	{
		return "\nCustomer [email=" + email + "]\n"+super.toString();
	}
	
}
