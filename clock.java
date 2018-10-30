class Clock
{
    int h,m,s;
    public void Input(int h1,int m1,int s1)
    {
        h=h1;
        m=m1;
        s=s1;
        while(s>=60)
        {
            s=s-60;
            m++;
        }
        while(m>=60)
        {
            m=m-60;
            h++;
        }
    }
    public void Display()
    {
        System.out.print("\f\n\n\n\n\t\t\t\t");
        System.out.println( (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s);
    }
    public void Add1Sec()
    {
        Input(h,m,s+1);
    }
    public void Show(int n)throws Exception
    {
        for(int x=1;x<=n;x++)
        {
            Add1Sec();
            Display();
            Thread.sleep(1000);
        }
    }
    public static void main(String args[])throws Exception
    {
        Clock ob=new Clock();
        ob.Input(2,49,20);
        ob.Show(3600);
    }
}
