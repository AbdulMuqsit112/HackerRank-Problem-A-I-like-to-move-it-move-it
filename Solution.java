import java.io.*;
import java.util.*;

public class Solution {

    public static int[] calculatePosition(int r, int c,int p,int upper)
    {
        int row =r,col =c;
        int n[] = new int[2];
        
        if(p==0)
        {
            row=r-1;
        }
        else if(p==1)
        {
            row=r-1;
            col=c+1;
        }
        else if(p==2)
        {
            col=c+1;
        }
        else if(p==3)
        {
            row=r+1;
            col=c+1;
        }
       else if(p==4)
        {
            row=r+1;

        }
        else if(p==5)
        {
            row=r+1;
            col=c-1;
        }
        else if(p==6)
        {

            col=c-1;
        }
        else if(p==7)
        {
            row=r-1;
            col=c-1;
        }
        else 
        {
            return null;
        }
        if(col==upper)
        {
            col =0;
        }
        else if(col ==-1)
        {
            col=upper-1;
        }
        
        if(row ==upper)
        {
            row--;
        }
        if(row==-1)
        {
            row=0;
        }
        
        n[0]=row;
        n[1]=col;
        return n;
        
    }
     public static int[] getpos(int a,int n)
     {
         int[] pos = new int[2];
         pos[0]= a/n;
         pos[1]=a%n;
         return pos;
     }
    public static int getposnumber(int a,int b,int n)
     {
         int p =0;
         p=a*n;
         p+=b;
         return p;
     }
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int no = 0;
        no = sc.nextInt();
        int n =0;
        int pos = 0;
        int savedp[]= new int[no];
        for(int j =0;j<no;j++)
        {
        
        n = sc.nextInt();
        pos = sc.nextInt();
        sc.nextLine();
        String input =" "; 
            input = sc.nextLine();
        String[] numbers = numbers=input.split(" ");
      
        
        
        int p[] = new int[2];
        
        int p1[] = new int[2];
        p = getpos(pos,n);  
        p1=p;
        for(int i=0;i<numbers.length;i++)
        {
            
            p1 = calculatePosition(p1[0],p1[1],Integer.parseInt(numbers[i]),n );
          
        }
        savedp[j]=getposnumber(p1[0],p1[1],n);
        }
        for(int l=1;l<=no;l++)
        {
            System.out.println("Case" + l +": "+savedp[l-1]);
        }
        
        
    }
}