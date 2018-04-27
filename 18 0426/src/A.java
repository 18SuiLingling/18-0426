
public class A {
 public static void main(String[] args) {
	byte b = 127;// 8位; 1 个字节
	int age = 1999999999;// 32位; 4个字节
	long l =30000; // 64位; 8 个字节
	l =99L; l =88l; //99是int;此处说明是long
	
	//非整型
	float f =99; // 32位; 4 个字节
	double d =100.99;// 64位; 8个字节
	d =100d;
	
	// 布尔型
	boolean isMarried = true;// 1 位
	isMarried = false;
	
	//字符型
	char c ='a'; //char 是16位, 2个字节
	c='中'; //一个汉字2个字节;一个英文字母一个字节
	
	//字符串类型(类类型)
	String s ="Hi..";
	
	//字符串拼接
	System.out.println();
}
}
