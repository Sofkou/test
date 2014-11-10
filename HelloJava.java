public class HelloJava{
    public static void main(String[] args){
	HelloJavaObject app1=new HelloJavaObject();
	HelloJavaObject app2=new HelloJavaObject();
	int num=Integer.parseInt(args[0]);
	for(int i=1;i<=num;i++){
	    app1.sayHello();
	    app2.sayHello();
	}
    }
}

/*
shin-no-MacBook-Air:desktop misa$ javac HelloJava.java
Picked up _JAVA_OPTIONS: -Dfile.encoding=utf8
shin-no-MacBook-Air:desktop misa$ java HelloJava 3
Picked up _JAVA_OPTIONS: -Dfile.encoding=utf8
Hello Java!1回目
Hello Java!2回目
Hello Java!3回目
Hello Java!4回目
Hello Java!5回目
Hello Java!6回目
shin-no-MacBook-Air:desktop misa$ 
 */