package Test;

public class PersonAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,78,56,7,12,67,20,50};
		int children=0;
		int adult=0;
		int citizen=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]<18)
			{
				children++;
			}
			else if(a[i]>18 && a[i]<55)
			{
				adult++;

			}
			else
				citizen++;
		}
			System.out.println("Children "+children);
			System.out.println("Adult "+adult);
			System.out.println("Senior Citizen "+citizen);

		}
	}


