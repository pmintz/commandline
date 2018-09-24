package commands;

public class JavaCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************");
		System.out.println("Writing native code");
		System.out.println();
		System.out.println("Write method with native keyword and as if it were abstract for exmaple...");
		System.out.println();
		System.out.println("public class Sample1{");
		System.out.println();
		System.out.println("public native int intMethod(int n);");
		System.out.println();
		System.out.println("}");
		System.out.println();
		System.out.println("Compile and generate header");
		System.out.println();
		System.out.println("javac Sample1.java -h");
		System.out.println();
		System.out.println("This will generate Sample1.class and Sample1.h");
		System.out.println();
		System.out.println("Create Native Implementation in C or C++ (Following is C++)");
		System.out.println();
		System.out.println("#include \"Sample1.h\"");
		System.out.println("#include \"ctype.h\"");
		System.out.println("#include \"string.h\"");
		System.out.println("JNIEXPORT jint JNICALL Java_Sample1_intMethod\n"
								+ "(JNIEnv* env, jobject obj, jint num) {\n"
								+ "return num * num;\n"
								+ "}\n");
		System.out.println("compile Sample1.cpp(on MAC)");
		System.out.println();
		System.out.println("g++ -dynamiclib -O3\n" +
								"-I/usr/include\n" +
								"-I$JAVA_HOME/include\n" +
								"-I$JAVA_HOME/include/darwin\n" +
								"Sample1.cpp -o libSample1.dylib\n");
		System.out.println("run the code");
		System.out.println();
		System.out.println("# Assumes all files are in the same directory\n"+
                              "java -cp . -Djava.library.path=$(pwd) Sample1");
		

	}

}
