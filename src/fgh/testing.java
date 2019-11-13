package fgh;
import java.util.Random;
import java.util.Scanner;
public class testing {
	public static void main(String[]args)
	{
		Suanshi();
	}
	private static void Suanshi()
	{
		Random random1=new Random();
		Random random2=new Random();
		char array[]=new char[]{'-','+'};
		for(int x=0;x<50;x++)
		{
			int i=random1.nextInt(100);
			int j=random1.nextInt(100);
			int k=random2.nextInt(2);
			if(i+j<100)
			{
				if(i-j>0)
				{
					System.out.println("No."+(x+1));
					System.out.print(""+i);
					System.out.print(""+array[k]);
					System.out.print(""+j);
					System.out.println("=");
					boolean isTrue=false;
					int answer=0,answerPeople=0;
					if(array[k]=='+')
					{
						answer=i+j;
					}
					else
					{
						answer=i-j;
					}
					Scanner s=new Scanner(System.in);
					answerPeople=s.nextInt();
					if(answer==answerPeople)
					{
						System.out.println("回答正确!");
					}
					else
					{
						System.out.println("回答错误!");
					}
					if(k==0)
						System.out.println("正确答案:"+(i-j));
						else
						System.out.println("正确答案:"+(i+j));
				}
				else x--;
			}
			else x--;
		}
	}

}
