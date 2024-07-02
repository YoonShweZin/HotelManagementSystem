package hotelmanagement;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Receptionist extends People
{
	private String gender;
	public static Scanner sc = new Scanner(System.in);
	private List<Reserve>re = new ArrayList<Reserve>();
	private List<Room> roomroom = new ArrayList<Room>();
	private List<Booking>book = new ArrayList<Booking>();
	
	public Receptionist()
		{
		
		}
	
	public Receptionist(int id, String name, String phone, String gender) 
	{
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		loadRoom();
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}  
	
	@Override
	public String toString() 
	{
		return "Receptionist [gender=" + gender + "]";
	}
	
	public static void main(String[] args) throws Exception
	{
		String confirm = "No";
		int option;
		Receptionist r = new Receptionist(1,"Lily","09 1213134","Female");
		do {
			System.out.println("\n*********************************************");
			System.out.println("*Welcome Rose Garden Hotel Management System*");
			System.out.println("*********************************************");
			System.out.println("\nChoose options in Below");
			System.out.println("\n1.Book");
			System.out.println("\n2.Cancel");
			System.out.println("\n3.Check in");
			System.out.println("\n4.Check out");
			System.out.println("\n5.Number of Available Room Size");
			System.out.println("\n6.Exit");
			System.out.println("_________________________________________________");
			System.out.print("Choose Number : ");
			option= sc.nextInt();
			switch(option)
			{
				case 1:r.book();
				break;
				case 2 : r.cancel();
				break;
				case 3 : r.checkIn();
				break;
				case 4 : r.checkOut();
				break;
				case 5:r.avaliableRoom();
				break;
				default : System.exit(0);
			}
			
			System.out.println("\nDo you want to do again? (Yes or No)");
			confirm = sc.next();
		}while(confirm.equalsIgnoreCase("Y"));
	}

	private void book() 
	{
		// TODO Auto-generated method stub
		Customer c = new Customer();
		System.out.print("\nEnter Customer id: ");
		
		c.setId(sc.nextInt());
		
		System.out.print("\nEnter Customer name :");
		c.setName(sc.next());
		
		System.out.print("\nEnter Phone No :");
		c.setPhone(sc.next());
		
		System.out.print("\nEnter Email :");
		c.setEmail(sc.next());
		
		System.out.println("\nHere is the Avaliable Room list....");
		System.out.println();
		
		avaliableRoom();
		System.out.print("\nEnter your room number :");
		String rno = sc.next();
		Room br = new Room();
		
		for (Room rr :roomroom) 
		{
			if(rr.getRoomNo().equals(rno)) 
			{
				br = rr;
				br.setStatus("P");
			}
		}
		System.out.print("\nBooking Id: ");
		int bid=sc.nextInt();
		
		System.out.print("\nEnter booking Date: ");
		String bdate=sc.next();
		Booking b = new Booking(bid, bdate, c, br);
		
		book.add(b);
		System.out.println("\nBooking processing...." + br);
		System.out.println("\nBooking information"+b);
		for(Room rr :roomroom) 
		{
			System.out.println(rr);
		}
		
	}

	private void cancel()
	{
		// TODO Auto-generated method stub
		Booking bok= new Booking();
		int count=0;
		System.out.print("\nEnter Booking Id to delete : ");
		int id=sc.nextInt();
		for(Booking b:book)
		{
			if(b.getId()==id)
			{
				bok=b;
				count ++;
				break;
			}
		}
		book.remove(count-1);
		System.out.println("\nCancel Booking ");
		System.out.println();
//		for (Room rr:roomroom)
//		{
//		
//			if(rr.getRoomNo()==bok.getRoom().getRoomNo())
//			{
//				Room r = new Room();				
//				r = rr;	
//				r.setStatus("A");
//				roomroom.remove(rr);
//				System.out.println("Now become Available Room\n");
//				System.out.println(r);
//			}
//			
//		}	
		
		for (Room rr :roomroom) 
		{
			if(rr.getRoomNo()==bok.getRoom().getRoomNo()) 
			{
				rr.setStatus("A");
			}
		}

		//loadRoom();
	}

	private void checkIn() 
	{
		// TODO Auto-generated method stub
		String confirm = "N";
		String bname ;
		boolean flag = false;
		Booking b = new Booking();
		System.out.println("\nDo you have booking?");
		confirm = sc.next();
		if(confirm.equalsIgnoreCase("Y")) 
		{
			System.out.print("\nEnter Your booking name: ");
			bname = sc.next();
			System.out.println("Name " + bname);
			for(Booking bk:book)
			{
				if(bk.getCus().getName().equals(bname)) 
				{
					b =bk;
					b.getRoom().setStatus("U");
					flag = true;
				}
				
			}
			if(flag) 
			{
				System.out.println("Enter reception id :");
				int rid = sc.nextInt();
				System.out.println("Enter check in date");
				String cki = sc.next();
				
				Reserve reserve = new Reserve(rid,b.getCus(),b.getRoom(),cki,null);
				re.add(reserve);
				System.out.println("Finished check in transaction.");
			}
			else 
			{
				System.out.println("Please try again...");
			}		
		}
		else
		{
			System.out.println("\nEnter Customer information");
			Customer c = new Customer();
			System.out.print("\nEnter Customer Id : ");
			
			c.setId(sc.nextInt());
			
			System.out.print("\nEnter Customer Name :");
			c.setName(sc.next());
			
			System.out.print("\nEnter Phone No :");
			c.setPhone(sc.next());
			
			System.out.print("\nEnter Email : ");
			c.setEmail(sc.next());
			avaliableRoom();
			System.out.print("\nEnter Room number : ");
			String rno = sc.next();
			Room br = new Room();
			
			for (Room rr :roomroom) 
			{
				if(rr.getRoomNo().equals(rno)) 
				{
					br = rr;
					br.setStatus("U");
				}
			}
			Reserve res = new Reserve(1, c, br, "2/2/2020", "4/2/2020");
			re.add(res);
			System.out.println("Finished check in transaction....");
		}
		
	}
	private void avaliableRoom() 
	{	
		int count=0;
		for(Room rr :roomroom) 
		{
			if(rr.getStatus().equals("A"))
				System.out.println(rr);
				count ++;
		}
		System.out.print("No of Available Room : "+count);
		System.out.println();
	}
	
	private void checkOut() throws Exception
	{
		// TODO Auto-generated method stub
		System.out.print("\nEnter check out room : ");
		String couRoom = sc.next();
		
		for(Reserve res:re) 
		{
			if(res.getR().getRoomNo().equalsIgnoreCase(couRoom))
			{
				System.out.println(res);
				System.out.print("\nEnter check out date: ");
				res.setCheckout(sc.next());
				String s = res.getCheckin();
				Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(s); 
				Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(res.getCheckout());
				long diffInMillies = Math.abs(date2.getTime() - date1.getTime());
			    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
			    System.out.println("Number of stay in hotel " + diff);
			    long payment = res.getR().getPrices()*diff;
			    System.out.println("Payment ..."+ payment);
			    res.getR().setStatus("A");
			    
			}
		}
	}
	
	private void loadRoom() 
	{
		// TODO Auto-generated method stub
		Room r1 = new Room("R101","Single",20000,"A");
		Room r2 = new Room("R102","Double",45000,"A");
		Room r3 = new Room("R103","Family",60000,"A");
		Room r4 = new Room("R104","Double",45000,"A");
		roomroom.add(r1);
		roomroom.add(r2);
		roomroom.add(r3);
		roomroom.add(r4);
		
		for (Iterator iterator = roomroom.iterator(); iterator.hasNext();) 
		{
			Room roo = (Room) iterator.next();
			System.out.println(roo);	
		}
		roomroom.size();	
	}
}

