package Switch;

public class MovieTicket {
		void getTicketPrice(String day) {
			switch(day) {
			case "Monday","Tuesday","Wednesday","Thursday" : 
				System.out.println("Monday to Thursday : 200");
				break;
			case "Friday" : System.out.println("Friday : 250");
				break;
			case "Saturday","Sunday":
				System.out.println("Saturday & Sunday : 300");
				break;
			default :
				System.out.println("Invalid input ");
			}
		}
		
		public static void main(String[] args) {
			MovieTicket obj=new MovieTicket();
			obj.getTicketPrice("Monday");
			obj.getTicketPrice("Friday");
			obj.getTicketPrice("Saturday");
			obj.getTicketPrice("Thursday");
		}
		
}
