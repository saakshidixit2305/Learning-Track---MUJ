class Replace3
{
    public static void main(String args[])
    {
        String s="January 26 is celebrated as Republic Day of India";
        String s1=s.replace("26","15");
        String s2=s1.replace("January","August");
        String s3=s2.replace("Republic","Independence");
        System.out.println(s);
        System.out.println("\n"+s3);
    }
}
