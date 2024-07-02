package hotelmanagement;

public class Room 
{
	private String roomNo;
	private String roomType;
	private int Prices;
	private String status;
	
	public Room() 
	{
		
	}
	
	public Room(String roomNo, String roomType, int prices,String status) 
	{
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		Prices = prices;
		this.status = status;
	}

	public String getRoomNo()
	{
		return roomNo;
	}

	public void setRoomNo(String roomNo) 
	{
		this.roomNo = roomNo;
	}

	public String getRoomType()
	{
		return roomType;
	}

	public void setRoomType(String roomType) 
	{
		this.roomType = roomType;
	}

	public int getPrices() 
	{
		return Prices;
	}

	public void setPrices(int prices)
	{
		Prices = prices;
	}
//	public void loadRoom() {
//		// TODO Auto-generated method stub
//		Room r1 = new Room(101, "Single",15000);
//		Room r2 = new Room(102, "Double",35000);
//		Room r3 = new Room(103, "Family",60000);
//		Room r4 = new Room(104, "Single",15000);
//		room.add(r1);
//		room.add(r2);
//		room.add(r3);
//		room.add(r4);
//		for (Iterator iterator = room.iterator(); iterator.hasNext();) {
//			Room roo = (Room) iterator.next();
//			System.out.println(roo);
//			
//		}
//		
//	}
	
	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}
	@Override
	public String toString() 
	{
		return "Room [roomNo=" + roomNo + ", roomType=" + roomType + ", Prices=" + Prices + ", status=" + status + "]";
	}

}
