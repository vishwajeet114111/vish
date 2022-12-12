package stringStudy17;

public class stringMethods {

	public static void main(String[] args) {
	
	String a="vishwajeet"; 		//printing statement without reference 
		
	System.out.println(a.length());//printing statement with reference
		 
	int b =a.length();
	System.out.println(b);
	System.out.println("========string UPPERCASE===============");
		
//============================================================================
//============================================================================
	//string UPPERCASE

	String c ="vishwajeet ";
	System.out.println(c.toUpperCase());
		
	String vish =c.toUpperCase();		//with reference
	System.out.println(vish);
		System.out.println("===========lowercase===================");
//==========================================================================
//==========================================================================
	//lowercase
		
	String c1="VISHWAJEET";
	System.out.println(c1.toLowerCase());
		
	String vis =c1.toLowerCase();
	System.out.println(vis);
	System.out.println("============equals====================");
//===========================================================================
//===========================================================================		
		//equals
		
	String d ="vishwajeet";	
	String e ="vishwajeet";
	String f ="VISHWAJEET";
	String g = new String("ambhore");
	String h = new String("ambhore");
	String i = new String("AMBHORE");	
	System.out.println(d==e);
	System.out.println(d==f);
	System.out.println(d==g);
	System.out.println(g.equals(h));
	System.out.println(h.equals(i));
	System.out.println(g.equalsIgnoreCase(i));
	System.out.println("========conatins=========");
//====================================================================	
//====================================================================
	//conatins
	
	String j ="vishwajeet";
	System.out.println(j.contains("vi"));
	System.out.println(j.contains(j));
	System.out.println(j.contains("vs"));
	boolean	name =j.contains("wa");
	System.out.println(name);
	System.out.println("======isEmpty & isBlank====================");
	
//===================================================================	
//===================================================================
	//isEmpty & isBlank
	String k ="pune";
	System.out.println("a1 result is "+k.isEmpty());
	System.out.println("a1 result is "+k.isBlank());
	
	boolean memory=k.isEmpty();
	System.out.println(memory);
	
	String k1 ="";
	System.out.println("a2 result is "+k1.isEmpty());
	System.out.println("a2 result is "+k1.isBlank());
	
	boolean memory1=k1.isBlank();
	System.out.println(memory1);
	
	String k2=" ";
	System.out.println("a3 result is "+k2.isEmpty());
	System.out.println("a3 result is "+k2.isBlank());
	System.out.println("======charAt========================");
//======================================================================
//======================================================================
	//charAt
	
	String l="hi india";
	System.out.println(l.charAt(4));
	char l1=l.charAt(3);
	System.out.println(l1);
	System.out.println("======endSwitch========================");
	
//======================================================================
//======================================================================
	//endSwitch
	
	String m="travelling";
	System.out.println(m.endsWith("ing"));
	boolean m1 = m.endsWith("tra");
	System.out.println(m1);
	System.out.println("=====startSwitch=========================");
//======================================================================
//======================================================================
	//startSwitch
	
	String n="travelling";
	System.out.println(n.startsWith("ing"));
	boolean n1= n.startsWith("tra");
	System.out.println(n1);
	System.out.println("======subString========================");
//======================================================================
//======================================================================
	//subString
	
	String p="I am in pune";
	
	System.out.println(p.substring(5));
	System.out.println(p.substring(5,7));
	String p1 = p.substring(5);
	System.out.println("substring is "+p1);
	
	System.out.println("======concat========================");
//======================================================================
//======================================================================
	//concat
	
	String q1="good";
	String q2=" morning";
	
	System.out.println( q1. concat ( q2));
	System.out.println(q1.concat(" vishwajeet"));
	System.out.println("======indexof========================");
//======================================================================
//======================================================================
	//indexof
	
	String r="hi hello";
	System.out.println(r.indexOf("e"));
	System.out.println(r.indexOf("h"));
	System.out.println(r.indexOf("he"));
	String r1="hello hello";
	System.out.println(r1.indexOf("h", 2));
	System.out.println(r1.indexOf("o", 8));
	System.out.println(r1.lastIndexOf("l"));
	System.out.println(r1.lastIndexOf("l",6));
	System.out.println("======replace========================");
//======================================================================
//======================================================================
	//replace
	
	String s="unhappy";
	System.out.println(s.replace("un", ""));
	System.out.println(s.replace("un", "very "));
	System.out.println("======END STRING========================");
//======================================================================
//======================================================================	
	
	
	}

}
