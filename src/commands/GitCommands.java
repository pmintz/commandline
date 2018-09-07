package commands;

public class GitCommands {
	
	public static void main(String []agrs){
	System.out.println("******************");
	System.out.println("push existing repo");
	System.out.println("git init");
	System.out.println("git remote add origin https://github.com/pmintz/katalon.git");
	System.out.println("git push -u origin master");
	System.out.println("*******************");
	System.out.println("create new repo");
	System.out.println("git init");
	System.out.println("git add README.md");
	System.out.println("git commit -m \"first commit\"");
	System.out.println("git remote add origin https://github.com/pmintz/katalon.git");
	System.out.println("git push -u origin master");
	System.out.println("*******************");
	System.out.println("remove git from local repo");
	System.out.println("rm -rf .git");
	
	}

}
