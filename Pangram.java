 
import java.util.Arrays;


public class Pangram 
{
    public static void main(String[] args) 
    {
       boolean flag=false;
        String str="THE QUICK ROWN FOX JUMPS OVER LAZY DOG";
        String str2="abcdefghijklmnopqrstuvwxyz";
        str2=str2.toUpperCase();
        str=str.replace(" ", "");
        char []ch=str2.toCharArray();
        int ar[]=new int[26];

        for(int i=0;i<ch.length;i++)
        {
            ar[ch[i]-65]++;
            
            
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==0)
            {
                System.out.println("Its not pangram");
                flag=true;
            }
        }
        
        if(flag==false)
        {
            System.out.println("Its pangram");
        }
        
        
    
    }
    
}
