package hotelmanagement;

public class People
{
	protected int id;
	protected String name;
	protected String phone;
	
	public People()
	{
		
	}
	public People(int id, String name, String phone) 
	{
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	@Override
	public String toString()
	{
		return "People [id=" + id + ", name=" + name + ", phone=" + phone + "]\n"+super.toString();
	}
		
	
}
