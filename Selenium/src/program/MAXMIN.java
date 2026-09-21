package program;

public class MAXMIN {
	public static void main(String[] args) {
		int[] num= {10,20,30,40,50,60};
		int max = num[0];
		int min = num[0];
		
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]>max)
			{
				 max=num[i];
			}
			else if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		}
	
		
	}


