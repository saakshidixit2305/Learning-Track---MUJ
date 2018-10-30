import java.util.Scanner;
class Cities
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        String n[]=new String[num];
        System.out.println("Enter the names of the people");
        for(int x=0;x<n.length;x++)
        {
            n[x]=sc.nextLine();
        }
        System.out.println("\nArranged in alphabetical order:\n");
        for(int x=0;x<n.length;x++)
        {
            for(int y=0;y<n.length-1;y++)
            {
                if(n[y].compareToIgnoreCase(n[y+1])>0)
                {
                    String t=n[y];
                    n[y]=n[y+1];
                    n[y+1]=t;
                }
            }
        }
        for (int x=0;x<n.length;x++)
        {
            System.out.println(n[x]);
        }
    }
}
