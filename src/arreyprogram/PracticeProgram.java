package arreyprogram;

public class PracticeProgram
{
	public static void main(String[] args) 
	{
		
		  // program 1
		 
		//   for(int i=1;i<=3;i++)
		//   {
//		     for(int j=1;j<=3;j++)
//		     {
		//   System.out.println(j);
//		     }
		//   if(i==1)
		//   {
		//   System.out.println("AA");
		//   }
		//   else if(i==2)
		//   {
		//   System.out.println("BB");
		//   }
		//   else
		//   {
		//   System.out.println("CC");
		//   }
		//   }
		 
		  // 1. Java Program to print the elements of an array
		//   int a[]= {10,20,50,40,50};
		//  
		//   for(int i=0;i<a.length;i++)
		//   {
		//   System.out.println(a[i]);
		//   }
		 
		  // 2. Java Program to print the elements of an array in reverse order
		 
		//   int a[]= new int[5];
		//   a[0]=10;
		//   a[1]=20;
		//   a[2]=30;
		//   a[3]=40;
		//   a[4]=50;
		//  
		//   for(int i=a.length-1;i>=0;i--)
		//   {
		//   System.out.println(a[i]);
		//   }
		 
		  // 3. Java Program to print the elements of an array present on even position
		 
		//   int a[]= {10,20,30,40,50};
		//  
		//   for(int i=0;i<a.length;i=i+2)
		//   {
		//   System.out.println(a[i]);
		//   }
		  // 4. Java Program to print the elements of an array present on odd position
		 
		//   int a[]= {10,20,30,40,50};
		//  
		//   for(int i=1;i<a.length;i=i+2)
		//   {
		//   System.out.println(a[i]);
		//   }
		  // 5. Java Program to print the largest element in an array
		 
		//   int a[]= {10,20,30,40,50};
		//  
		//   int max=a[0];
		//   for(int i=0;i<a.length;i++)
		//   {
		//   if(a[i]>max)
		//   {
		//   max=a[i];
		//   }
		//   }
		//   System.out.println("Largest Element is: "+ max);
		 
		// 6. Java Program to print the smallest element in an array
		 
		//   int a[]= {50,20,30,40,10};
		//  
		//   int min=a[0];
		//   for(int i=0;i<a.length;i++)
		//   {
		//   if(a[i]<min)
		//   {
		//   min=a[i];
		//   }
		//   }
		//   System.out.println("Smallest Element is: "+ min);
		 // 7. Java Program to Print Odd and Even Numbers from an array
		 
		//   int a[]= {11,22,33,44,55};
		//  
		//   for(int i= 0;i<a.length;i++)
		//   {
		//  
		//   if(a[i]%2==0)
		//   {
		//   System.out.println(a[i]+ " Even Number");
		//   }
		//   else
		//   {
		//   System.out.println(a[i]+ " Odd Number");
		//   }
		//   }
		 
		 //8. Java Program to copy all elements of one array into another array
		 
		//   int a[]= {10,20,30,40,50};
		//   int b[]= new int [5];
		//  
		//   b[0]=a[0];
		//   b[1]=a[1];
		//   b[2]=a[2];
		//   b[3]=a[3];
		//   b[4]=a[4];
		//  
		//   for(int i=0;i<b.length;i++)
		//   {
		//   System.out.println(b[i]);
		//   }
		 
		// 9. Java Program to sort the elements of an array in ascending order
		 
		//   int a[]= {20,10,50,40,30};
		//  
		//   System.out.print("Orignal Array;-");
		//  
		//   for(int i=0;i<a.length;i++)
		//   {
		//   System.out.print(a[i]+ ",");
		//   }
		//  
		//   for(int j=0;j<a.length;j++)
		//   {
		//   for(int k=j+1;k<a.length;k++)
		//   {
		//   if(a[j]>a[k])
		//   {
		//   int temp= a[j];
		//   a[j]=a[k];
		//   a[k]=temp;
		//   }
		//   }
		//   }
		//  
		//   System.out.println();
		//   System.out.print("Ascending order Array;-");
		//  
		//   for(int i=0;i<a.length;i++)
		//   {
		//   System.out.print(a[i]+ ",");
		//   }
		// 10. Java Program to sort the elements of an array in descending order
		 
		//   int a[]= {60,82,10,32,52};
		//  
		//   System.out.print("Orignal Array:-");
		//   for(int i=0;i<a.length;i++)
		//   {
		//   System.out.print(a[i] + ",");
		//   }
		//  
		//   for(int j=0;j<a.length;j++)
		//   {
		//   for(int k=j+1;k<a.length;k++)
		//   {
		//   if(a[j]<a[k])
		//   {
		//   int temp= a[j];
		//   a[j]=a[k];
		//   a[k]=temp;
		//   }
		//   }
		//   }
		//   System.out.println();
		//   System.out.print("Discending Array:-");
		//   for(int i=0;i<a.length;i++)
		//   {
		//   System.out.print(a[i] + ",");
		//   }
		 
		//12. Java Program to print the duplicate elements of an array
		//   int a[]= {10,20,45,10,90,45};
		//  
		//   for(int i=0;i<a.length;i++)
		//   {
//		    for(int j=i+1;j<a.length;j++)
//		    {
//		    if(a[i]==a[j])
//		    {
//		    System.out.println(a[i]);
//		    }
//		    }
		//   }
		 // 13. Java Program to Find 2nd Largest Number in an array
		 
//		  int a[]= {10,55,66,22,11};
//		 
//		  for(int i=0;i<a.length;i++)
//		  {
//		  for(int j=i+1;j<a.length;j++)
//		  {
//		  if(a[i]>a[j])
//		  {
//		  int temp=a[i];
//		  a[i]=a[j];
//		  a[j]=temp;
//		  }
//		  }
//		  }
//		 
//		  int size =a.length;
//		  System.out.println("Second Largest is -" +a[size-2]);
//		//  
//	}	
			  	 
//		 public class array
//		 {
//		  public static void main(String[] args)
//		  {
		  // program 1
		 
		//   for(int i=1;i<=3;i++)
		//   {
//		     for(int j=1;j<=3;j++)
//		     {
		//   System.out.println(j);
//		     }
		//   if(i==1)
		//   {
		//   System.out.println("AA");
		//   }
		//   else if(i==2)
		//   {
		//   System.out.println("BB");
		//   }
		//   else
		//   {
		//   System.out.println("CC");
		//   }
		//   }
		 
		  // 1. Java Program to print the elements of an array
		//   int a[]= {10,20,50,40,50};
		//  
		//   for(int i=0;i<a.length;i++)
		//   {
		//   System.out.println(a[i]);
		//   }
		 
		  // 2. Java Program to print the elements of an array in reverse order
		 
		//   int a[]= new int[5];
		//   a[0]=10;
		//   a[1]=20;
		//   a[2]=30;
		//   a[3]=40;
		//   a[4]=50;
		//  
		//   for(int i=a.length-1;i>=0;i--)
		//   {
		//   System.out.println(a[i]);
		//   }
		 
		  // 3. Java Program to print the elements of an array present on even position
		 
		//   int a[]= {10,20,30,40,50};
		//  
		//   for(int i=0;i<a.length;i=i+2)
		//   {
		//   System.out.println(a[i]);
		//   }
		  // 4. Java Program to print the elements of an array present on odd position
		 
		//   int a[]= {10,20,30,40,50};
		//  
		//   for(int i=1;i<a.length;i=i+2)
		//   {
		//   System.out.println(a[i]);
		//   }
		  // 5. Java Program to print the largest element in an array
		 
		//   int a[]= {10,20,30,40,50};
		//  
		//   int max=a[0];
		//   for(int i=0;i<a.length;i++)
		//   {
		//   if(a[i]>max)
		//   {
		//   max=a[i];
		//   }
		//   }
		//   System.out.println("Largest Element is: "+ max);
		 
		// 6. Java Program to print the smallest element in an array
		 
		//   int a[]= {50,20,30,40,10};
		//  
		//   int min=a[0];
		//   for(int i=0;i<a.length;i++)
		//   {
		//   if(a[i]<min)
		//   {
		//   min=a[i];
		//   }
		//   }
		//   System.out.println("Smallest Element is: "+ min);
		 // 7. Java Program to Print Odd and Even Numbers from an array
		 
		//   int a[]= {11,22,33,44,55};
		//  
		//   for(int i= 0;i<a.length;i++)
		//   {
		//  
		//   if(a[i]%2==0)
		//   {
		//   System.out.println(a[i]+ " Even Number");
		//   }
		//   else
		//   {
		//   System.out.println(a[i]+ " Odd Number");
		//   }
		//   }
		 
		 //8. Java Program to copy all elements of one array into another array
		 
		//   int a[]= {10,20,30,40,50};
		//   int b[]= new int [5];
		//  
		//   b[0]=a[0];
		//   b[1]=a[1];
		//   b[2]=a[2];
		//   b[3]=a[3];
		//   b[4]=a[4];
		//  
		//   for(int i=0;i<b.length;i++)
		//   {
		//   System.out.println(b[i]);
		//   }
		 
		// 9. Java Program to sort the elements of an array in ascending order
		 
		//   int a[]= {20,10,50,40,30};
		//  
		//   System.out.print("Orignal Array;-");
		//  
		//   for(int i=0;i<a.length;i++)
		//   {
		//   System.out.print(a[i]+ ",");
		//   }
		//  
		//   for(int j=0;j<a.length;j++)
		//   {
		//   for(int k=j+1;k<a.length;k++)
		//   {
		//   if(a[j]>a[k])
		//   {
		//   int temp= a[j];
		//   a[j]=a[k];
		//   a[k]=temp;
		//   }
		//   }
		//   }
		//  
		//   System.out.println();
		//   System.out.print("Ascending order Array;-");
		//  
		//   for(int i=0;i<a.length;i++)
		//   {
		//   System.out.print(a[i]+ ",");
		//   }
		// 10. Java Program to sort the elements of an array in descending order
		 
		//   int a[]= {60,82,10,32,52};
		//  
		//   System.out.print("Orignal Array:-");
		//   for(int i=0;i<a.length;i++)
		//   {
		//   System.out.print(a[i] + ",");
		//   }
		//  
		//   for(int j=0;j<a.length;j++)
		//   {
		//   for(int k=j+1;k<a.length;k++)
		//   {
		//   if(a[j]<a[k])
		//   {
		//   int temp= a[j];
		//   a[j]=a[k];
		//   a[k]=temp;
		//   }
		//   }
		//   }
		//   System.out.println();
		//   System.out.print("Discending Array:-");
		//   for(int i=0;i<a.length;i++)
		//   {
		//   System.out.print(a[i] + ",");
		//   }
		 
		//12. Java Program to print the duplicate elements of an array
		//   int a[]= {10,20,45,10,90,45};
		//  
		//   for(int i=0;i<a.length;i++)
		//   {
//		    for(int j=i+1;j<a.length;j++)
//		    {
//		    if(a[i]==a[j])
//		    {
//		    System.out.println(a[i]);
//		    }
//		    }
		//   }
		 // 13. Java Program to Find 2nd Largest Number in an array
		 
//		  int a[]= {10,55,66,22,11};
//		 
//		  for(int i=0;i<a.length;i++)
//		  {
//		  for(int j=i+1;j<a.length;j++)
//		  {
//		  if(a[i]>a[j])
//		  {
//		  int temp=a[i];
//		  a[i]=a[j];
//		  a[j]=temp;
//		  }
//		  }
//		  }
//		 
//		  int size =a.length;
//		  System.out.println("Second Largest is -" +a[size-2]);
//		//  
//		 
//		 }
//		 }
//		 
		int a[]= {2,8,9,7,2,6,6,3};
		int b[]=new int[a.length];
		int visited=-1;
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=visited;
				}
			}
			if(b[i]!=visited)
			{
				b[i]=count;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=visited)
			{
				System.out.println(a[i] + " "+ b[i]);
			}
		}
	}		
}		
		

		
