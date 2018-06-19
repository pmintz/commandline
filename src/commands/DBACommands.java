package commands;

public class DBACommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GRANT ALL PRIVILEGES ON *.* TO \'tolkien\'@\'%\';");
		System.out.println("Show all databases");
		System.out.println("Show all tables");
		System.out.println("To connect using mysql shell: "+"\\connect mscarpace:password@localhost:3306/addressbook");
	}

}
