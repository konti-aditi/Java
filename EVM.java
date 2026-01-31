import java.util.Scanner;

class EVM
{
	static int bjp,aap,cong,mns,nota;
	public static void main(String[]args)
	{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the population of the area");

	int population = sc.nextInt();

	for(int i = 1; i<=population; i++)

	{
		System.out.println("\n ******* WELCOME ********");
		
		System.out.println("Aapka ek vote desh nhi badal skta");
		System.out.println("1.BJP \n2.AAP \n3.CONG \n4.MNS \n5.NOTA");
		System.out.println("Enter your response: ");
		String resp = sc.next().toUpperCase();

		if(resp.equals("BJP"))
		{
			bjp++;
			System.out.println("You have voted for BJP");
			System.out.println("Mumbai Gujrat me hi jaayegi\n");

		}
		else if(resp.equals("AAP")){
			
			aap++;
			System.out.println("You have voted for AAP");
			System.out.println("Apka ek vote mujhe jail se nikaal skta hai\n");
			
		}
		else if(resp.equals("CONG")){
			cong++;
			System.out.println("You have voted for CONG");
			System.out.println("Bharat Todo\n");
		}
		else if(resp.equals("MNS")){
			mns++;

			System.out.println("You have voted for MNS");
			System.out.println("Marathi bol ayy");
		}
		else if(resp.equals("NOTA"))
		{
			nota++;

			System.out.println("You have voted for NOTA");
			System.out.println("OHH....You are educated!");
		}
		else{
			i--;
			System.out.println("Invalid response");

		}
			
	}

			System.out.println("bjp "+bjp);
			System.out.println("cong "+cong);
			System.out.println("mns "+mns);
			System.out.println("aap "+aap);
			System.out.println("nota "+nota);


		if(bjp>=cong && bjp>=mns && bjp>=aap && bjp>=nota){

			System.out.println("BJP has won the elections by " +bjp+ "votes");

		}else 	if(cong>=bjp && cong>=mns && cong>=aap && cong>=nota){

			System.out.println("Congress has won the elections by " +cong+ "votes");

		} else 	if(mns>=bjp && mns>=cong && mns>=aap && mns>=nota){

			System.out.println("MNS has won the elections by " +mns+ "votes");

		}else 	if(aap>=bjp && aap>=cong && aap>=mns && mns>=nota){

			System.out.println("MNS has won the elections by " +mns+ "votes");

		} else{
			System.out.println("The maximum votes given to none of the above");
	}

	
	}
}