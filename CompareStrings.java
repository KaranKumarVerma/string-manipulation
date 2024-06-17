public class CompareStrings {

    public static void main(String[] args) {
        String str1,str2;
        str1="Karan";
        str2="Karan";
        String str3=new String("Karan");
        
        System.out.println(str1==str2);
        if(str1.equals(str3))
        {
            System.out.println(str1+" and "+str2+" are identical");
        }
        else
        {
            System.out.println(str1+" and "+str2+" are not identical");
        }
    }
}
