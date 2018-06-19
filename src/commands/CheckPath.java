package commands;

public class CheckPath {

	public static void main(String[] args) {
		final String mysqlsh = "mysqlsh";
		final String path = "java.library.path";
		String[] pathArray;
		String[] pathArray2 = new String[500];
		String returnedPath;
		
		returnedPath = System.getProperty("java.library.path");
		pathArray = returnedPath.split("(c|C):|\\\\|/| ");
		
		/*for(String x: pathArray){
			System.out.println(x);
		}*/
		
		boolean flag = false;
		for(String x: pathArray){
			if (x.contains(args[0])){
				flag = true;
			}
			
		}
		
		System.out.println("path contains " + args[0]+ ": " + flag);
		
		
		
	/*	for(int i = 0; i<pathArray.length; i++){
			
			String [] temp = pathArray[i].split("[A-Za-z]+:");
			
		}*/

	}

} 