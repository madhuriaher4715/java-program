
import java.util.Scanner;

public class ses {

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int t,sum=0,r=0;
		t=sum;
		while(n>0) {
			n=n%10;
			sum=sum+r*r*r;
			n=n/10;	
        }
    
		if t==sum
				{
			System.out.println("it is armstrong number");
		}else {
			System.out.println("it not armstrong numbert");
		}
		
	}

}
