package commands;

public class ClassPath {
	
	public static void main(String[] args) {
		
		try {
		final String mysqlsh = "mysqlsh";
		final String path = "java.library.path";
		String[] pathArray;
		String[] pathArray2 = new String[500];
		String returnedPath;
		
		returnedPath = System.getenv("CLASSPATH");
		pathArray = returnedPath.split("(c|C):|\\\\|/| ");
		
		for(String x: pathArray){
			System.out.println(x);
		}
		
		boolean flag = false;
		for(String x: pathArray){
			if (x.contains(args[0])){
				flag = true;
			}
			
		}
		
		
		
		System.out.println("path contains " + args[0] + ": " + flag);
		
		}catch(Exception e){
			System.out.println("No CLASSPATH variable present");
		}
	}
}