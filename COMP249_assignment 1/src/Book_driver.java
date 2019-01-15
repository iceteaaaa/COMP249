import java.util.Scanner;
public class Book_driver 
{
	
	public static void main(String[] args)
	{
		final String password="password";
		int counter=0;
		Book[] inventory;
		int choice;
		Scanner kb=new Scanner(System.in);
		System.out.println("Welcome to bookstore manager!"+"\n_______________________________");
		
		/**
		 * prompting user input 
		 */
		System.out.print("Please enter the maximum number of books in your bookstore: ");
		int max_num_of_books=kb.nextInt();
		inventory=new Book[max_num_of_books];
		
		do
		{
			/**
			 * counter for program termination 
			 */
			if(counter==4)
			{
				System.out.println("\nProgram detected suspicious activities and will terminate immediately!");
				System.exit(0);
			}
			
			System.out.println("\nWhat do you want to do?");
			System.out.println("\t1. Enter new books (password required)");
			System.out.println("\t2. Change information of a book (password required)");
			System.out.println("\t3. Display all books by a specific author");
			System.out.println("\t4. Display all books under a certain price");
			System.out.println("\t5. Quit");
			System.out.print("Please enter your choice: ");
			choice=kb.nextInt();
			
			outer: switch(choice)
			{
			case 1:
				int counter2=0;
				System.out.print("\nPlease enter your password: ");
				while(!kb.next().equals(password))
				{
					counter2++;
					if(counter2<3)
						System.out.print("Wrong password, try again: ");
					if(counter2==3)
					{
						choice=0;
						counter++;
						break outer;
					}
				}
					
				System.out.print("\nEnter number of books to add to inventory: ");
				
				/**
				 * checking number of empty spaces in inventory 
				 */
				int empty_spaces_in_inventory=0;
				int position_in_inventory=0;
				for(int i=0;i<inventory.length;i++)
					if(inventory[i]==null)
						empty_spaces_in_inventory++;
					else
						position_in_inventory++;
					
				/**
				 * loop if more books than spaces 
				 */
				int number_of_books_to_add=kb.nextInt();
				while(number_of_books_to_add>empty_spaces_in_inventory)
					System.out.print("Sorry inventory has only "+ empty_spaces_in_inventory+" places left for books. Enter a lesser number of books to add:");
				
				/**
				 * placing new books
				 */
				System.out.println("\nPlease enter your new books, enter title, author, ISBN and price in order, press enter after each entry.");
				for(int i=0;i<number_of_books_to_add;i++)
				{
					System.out.println("book "+(i+1)+": ");
					inventory[i+position_in_inventory]=new Book(kb.next(), kb.next(), kb.nextLong(), kb.nextDouble());
				}
					
			case 2:
				
	
			}
		}while(choice<1||choice>5);
		
		
		
		
		
	}
	
	
	
}
