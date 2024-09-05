import java.util.*;
import java.util.logging.StreamHandler;
public class javaBasics {


    //tax caculator
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income<500000){
            tax=0;
        }
        else if(income >=500000 && income<1000000){
            tax= (int)(income*0.2);
        }
        else{
            tax =(int)(income * 0.3);
        }
        System.out.println("your tax is "+tax);
    }
    */


    //ternary operater
    //check if a student will pass or fail
    /* 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String reportcard = (marks >= 33)?"pass":"fail";
        System.out.println(reportcard);
    }*/


    //swiitch case
    //calculator
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a= sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the operater: ");
        char operater = sc.next().charAt(0);
        switch (operater) {
            case '+':System.out.println(a+b);
            break;
            case '-': System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '%': System.out.println(a%b);
            break;
            case '/': System.out.println(a/b);
            break;
            default: System.out.println("Wrong operater");
            break;
        }
    }
    */



    //print number 1 to 10
    /* 
    public static void main(String[] args) {
    int Counter = 1;
    while(Counter <= 10){
        System.out.println(Counter);
        Counter++;
        }
    }
    */


    //print number from 1 to n
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int Counter = 1;
        while(Counter<=range) {
            System.out.println(Counter + " ");
            Counter++;
            
        }
    }
    */


    //print sum of N natural number
    /*  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int i= 1;
        while (i<=n) {
            sum = sum +i;
            i++;
            
        }
        System.out.println("Sum is :"+ sum);
    }
    */


    //print reverse of a number
    /* 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int Lastdigit = n%10;
            System.out.print(Lastdigit);
            n=n/10;
        }
        System.out.println();
    }*/
    
    /* 

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int Lastdigit = n%10;
            rev=(rev*10)+Lastdigit;
            n=n/10;
        }
        System.out.println(rev);
    }*/
    
    
    //keep entering  the number till user enters a multiple of 10
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the number");
            int n= sc.nextInt();
        
        if(n%10==0){
            break;
        }
        System.out.println(n);
        }
        while(true);
    }
    */

    //continue statement to skip an itaraataion 
    /* 
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
    }
    */

    //check if a number is prime or not
    /* 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("n is prime number");
        }
        else{
            boolean isPrime=true;
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
            System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
        }
    }
   */

    //Pattern
    /* 
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of pattern: ");
        int n= sc.nextInt();
        for(int line=1; line<=n;line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */

    //Pattern of number
    /* 
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of pattern: ");
        int n= sc.nextInt();
        for(int line=1; line<=n;line++){
            for(int number=1; number<=line; number++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
    */

    //charcter pattern
    /* 
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n= sc.nextInt();
        char ch='A';//(Character Sequence Continuation Across Lines)
        for(int line=1; line<=n; line++){
           // char ch='A';//(Reset ch to 'A' for each line)
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    */
    
//Function method

    /* 
    public static void helloWorld(){
        System.out.println("Hello world");
    }
    public static void main(String arg[]){
        helloWorld();
    }
    */

    //product 0f two number
    /* 
    public static int multiple(int a, int b){
        int product= a*b;
        return product;
    }
    public static void main(String arg[]){
        int a=3;
        int b=5;
        int prod = multiple(a, b);
        System.out.println("a*b= "+prod);
    }
    */

    //Find factorial
    /* 
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    // public static void main(String arg[]){
    //     System.out.println(factorial(6));
    // }
    */

    //Binomial cofficient
    /* 
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static int binomialCoff(int n, int r){
        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int fact_nmr= factorial(n-r);

        int binomialCoff= fact_n/(fact_r*fact_nmr);
        return binomialCoff;
    }
    public static void main(String args[]) {
        System.out.println(binomialCoff(5, 2));
    }
    */

    //Function overloading
    /* 
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String arg[]){
        System.out.println(sum(3,5));
        System.out.println(sum(4,3,5));
    }
    */

    //Find prime or not using function
    /* 
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2; i<=n-1;i++){
        // if(n==2){
        //     return true;
        // }
        // for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime= false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String arg[]){
        System.out.println(isPrime(7));
    }
    */

    // //print all prime in a range
    // public static boolean isPrime(int n){
    //     boolean isPrime=true;
    //     for(int i=2; i<=n-1;i++){
    //     // if(n==2){
    //     //     return true;
    //     // }
    //     // for(int i=2; i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             isPrime= false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    // public static void primeInRangea(int n){
    //     for(int i = 2; i<=n; i++){
    //         if(Isprime(i)){
    //             System.out.println(i+" ");
    //         }
    //     }
    //     System.out.println();
    // }
    // public static void main(String arg[]){
    //     int n=sc.nextInt();
    //     primeInRangea(20);
    // }

    //convert binary to decimal
    /* 
    public static void binToDec(int binNum){
        int pow=0;
        int decNum=0;

        while(binNum>0){
            int Lastdigit=binNum%10;
            decNum=decNum+Lastdigit*(int)Math.pow(2, pow);
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of "+ binNum +"=" +decNum);
    }
    public static void main(String args[]) {
        binToDec(101);
    }
    */

    //convert decimal to binary
    /* 
    public static void decToBin(int n){
        int pow=0;
        int binNum=0;

        while(n>0){
            System.out.println("Binary form of " + n );
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary form of " + n + "=" + binNum);
    }
    public static void main(String args[]) {
        decToBin(34);
    }
    */

    //Pattern(part 2) Advanced
    
    //Hollow rectangle
    /* 
    public static void hollowRectangle(int totrow, int totcol){
        for(int i=1;i<=totrow;i++){
            for(int j=1;j<=totcol;j++){
                if(i==1||i==totrow||j==1||j==totcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        hollowRectangle(4,5);
    }
    */

    //Inverted & rotated half pyramid
    /* 
    public static void invertedHalf(int n){
        for(int i=1;i<=n;i++){
            //for(int j=n;j>i;j--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        invertedHalf(6);
    }
    */

    //Inverted half pyramid with number
    /* 
    public static void invertedHalfNumber(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        invertedHalfNumber(6);
    }
    */

    //Floyd's Traingle
    /* 
    public static void floydTraingle(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        floydTraingle(5);
    }
    */

    //0-1 trangle
    /* 
    public static void zeroOneTraingle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        zeroOneTraingle(6);
    }
    */

    //Butterfly Pattern
    /* 
    public static void Butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1; i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Butterfly(5);
    }
    */

    //Solid Rhombus

    /* 
    public static void SolidRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        SolidRhombus(6);
    }
    */

    //Hollow Rhombus pattern

    /* 
    public static void HollowRhombous(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1|| i==n|| j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        HollowRhombous(5);
    }
    */

    //Diamond pattern
    
    /* 
    public static void Diamond(int n){
        for(int i=1; i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        Diamond(5);
    }
    */

    

}