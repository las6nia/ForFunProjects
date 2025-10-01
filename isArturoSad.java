package sad;
import java.util.Scanner;

public class isArutoSad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
				
				char isArturoSad;
				int counter = 1;	

				while(true) {
				
				counter++;
				
				System.out.print("Is Arturo sad today? (Enter y / n ) ");
				isArturoSad = input.next().charAt(0);
				
				if (isArturoSad == 'y')
				{
					System.out.print("Call me - (608)888-4632 ");
					break;
				}
				else
				{
					System.out.print("Ve a traerme la llame nuda\n");
					System.out.print("NAH but fr... are you really ok though? (Enter y / n): ");
					isArturoSad = input.next().charAt(0);
					
					if(isArturoSad == 'n')
					{
						System.out.print("call me dude, (608)888-4632");
						break;
						
					}
					else if (isArturoSad == 'y') {
						System.out.print("I'm gonna ask you again.\n");
						}
				}
					
						
				
				
					
				
				
			
				
				
				

			}

		}


	}

}
