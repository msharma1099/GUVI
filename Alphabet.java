import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char a = sc.next().charAt(0);
	    if((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')){
		    System.out.println("Alphabet");
	    }
	    else{
	        System.out.println("No");
	    }
	}
}
