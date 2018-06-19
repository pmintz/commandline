package command;

public class Classpath {
	
	public static void main(String []args){
		String classpath = System.getenv("CLASSPATH");
		String[] classpathArray = classpath.split(";");
		for(String x : classpathArray){
			System.out.println(x);
		}
		
	}

}
