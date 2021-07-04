import java.util.Scanner;
publi class even
{
public static void mainn(String args[])
{
Scannerr sc=new scanner(System.in);
int start,end,i;
System.out.println("enter first range ");
start=sc.nextInt();
System.out.println("enter second range ");
end=sc.nextInt();
i=end;
while(i>=start)
{
if(i%2==0)
{
System.out.println("i");
}
i--;
}
}
}


