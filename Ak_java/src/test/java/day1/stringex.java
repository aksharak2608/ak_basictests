package day1;

public class stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="the login for the user abc is sucess";
String name1="               the login        for the user abc    is sucess           ";
char ch= name.charAt(3);
System.out.println(ch);

String subs=name.substring(23,30);
System.out.println(subs);
boolean result=name.contains("abc2");
System.out.println(result);
String[] arrs=name.split("\\s",6);
System.out.println(arrs[5]);
System.out.println(
name.concat(subs));

System.out.println(name.indexOf("the",1));
System.out.println(name1);
System.out.println(name1.trim());
System.out.println(name1.replaceAll("\\s+", " "));

	}

}
