package command;

public class grant {

	
	public static void main(String [] args){
		if(args[0].equals("grant"))
		System.out.println("GRANT ALL PRIVILEGES ON *.* TO \'tolkien\'@\'%\';");
		
	}
}
