package Lab1Flowcontrol;

import java.util.Scanner;

class Test1{
    public boolean checkNumber(int n){
        boolean flag = Math.sqrt(n)%2==0 ? true:false;
        return flag;
    }
}


class Excersice_8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Test1 t = new Test1();
        System.out.print("Enter the number : ");
        int num;
        num= sc.nextInt();
        
        if(t.checkNumber(num)){
            System.out.println(num+" is power of 2");
        }else{
            System.out.println(num+" is not power of 2");
        }
    }
}