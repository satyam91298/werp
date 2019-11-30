import java.util.*;
class I
{
	public static void main(String ar[])
	{
		Scanner in=new Scanner(System.in);
		int temp,k,j;
		int n=in.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			k=a[i];
            j=i;
			while((j>0)&&(a[j]>k))
			{
				a[j+1]=a[j];
				 j=j-1;
				a[j+1]=k;
				
		}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		
	}

}