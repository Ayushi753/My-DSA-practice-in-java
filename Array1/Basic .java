package Array1 ;
import java .util.*;
class Basic
{
    public static void main(String args[])
    {
        System.out.println( "Enter any basic salary");
        Scanner sc=new Scanner(System.in);
        double salary= sc.nextDouble();
        double hra= (salary*10)/100;
        double ta = (salary*18)/100;
        double da = (salary*23)/100;
        double pf = (salary*24)/100;
        double gs = salary+ hra+ta+da;
        System.out.println("gs="+gs);
        double ns = gs-pf;
        System.out.println("ns ="+ns);
    }
    }

