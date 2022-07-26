package Package1;
import java.util.regex.*;
public class RegularExpression {
	public static void main(String[] args) {

		String pat = "[a-z]+";
		String chec = "Regular Expressions";
		Pattern p = Pattern.compile(pat);
		Matcher c = p.matcher(chec);
		
		while (c.find())
	      	System.out.println( chec.substring( c.start(), c.end() ) );
		}

}
