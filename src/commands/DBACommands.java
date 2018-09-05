package commands;

public class DBACommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GRANT ALL PRIVILEGES ON *.* TO \'tolkien\'@\'%\';");
		System.out.println("*.* = alldatabase.alltables");
		System.out.println("% = any valid host (in place of localhost or specific host) ");
		System.out.println("Show all databases");
		System.out.println("Show all tables");
		System.out.println("To connect using mysql shell: "+"\\connect mscarpace:password@localhost:3306/addressbook");
		System.out.println("*******************");
		System.out.println("lsnrctl commands");
		System.out.println("lsnrctl start");
		System.out.println("lsnrctl stop");
		System.out.println("lsnrctl reload");
		System.out.println("*********************");
		System.out.println("admin commands");
		System.out.println("sqlplus /nolog");
		System.out.println("connect /as sysdba");
		System.out.println("once connected you can run the following:");
		System.out.println("ALTER USER sys IDENTIFIED BY new_password;");
		System.out.println("shutdown");
	}

}
