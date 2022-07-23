package java_17_july_2022;

import org.apache.commons.lang3.StringUtils;


public class july_class {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	distance x=new distance();
	x.averageSpeed();
	x.distance();
	int y=x.a();
	x.b(y, y);
	String z="km";
	x.c(y, z);
	byte a=(byte)128;
	System.out.println(a+1);
	
	
	
	//String abc="Welcome to java";
	//abc.concat("Besant");
	//abc=abc.concat("Besant");
	//System.out.println(abc);
	//System.out.println(abc.length());
	//System.out.println(abc.startsWith("W"));
	//System.out.println(abc.endsWith("b"));
	
	String abc="Welcome";
	String bcd="Welcome";
	
	if(abc.equals(bcd))
	{
		System.out.println("both are equal");
	}
		else
		{
			System.out.println("not equal");
		}
	
		//String bx="taj mahal in agra";
		//System.out.println(bx.trim());
		//System.out.println(bx.replaceAll("agra", "up"));
		//System.out.println(bx.charAt(0));
	//String bx="welcome";
		//System.out.println(bx.substring(2));
		//String ab="welcome";
		//System.out.println(ab.substring(1, 4));
		//System.out.println(abc.equalsIgnoreCase(bcd));
		
		//String e="10";
		//String f="20";
		//System.out.println(e.compareTo(f));
		
		Integer h=30;
		Integer i=20;
		System.out.println(h.compareTo(i));
		
		
		
		
		String u="beasant tech yfffyyfyfygfu";
		System.out.println(StringUtils.substringAfter(u, "tech"));
		
		String l="today is saturday";
		System.out.println(StringUtils.substringBefore(l, "is"));
			
		
		
	
	
			
}
}
