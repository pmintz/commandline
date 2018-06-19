package commands;

public class Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String returnedPath;
		returnedPath = System.getProperty("java.library.path");
		String[] pathArray = returnedPath.split(";");
		for(String x : pathArray){
			System.out.println(x);
		}

	}

}
