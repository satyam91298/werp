import java.util.*;
class S
{
	public static void main(String ar[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,min;
		int n=in.nextInt();
		int a[]=new int [n];
		for( i=0;i<n-1;i++)
		{
			a[i]=in.nextInt();
		}
		for( i=0;i<n;i++)
		{ min=i;
		for( j=i+1;j<n-1;j++)
		{
		if(a[min]>a[j])
		{
			min=j;
		}
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		}
		}		
		
		for( i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}

}
