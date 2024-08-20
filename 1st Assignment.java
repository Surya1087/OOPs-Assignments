import java.util.Scanner;


public class Main {
int real1 ;
    int img1;
int real2;
int img2;
Main()
{
System.out.println("Program to show arithmetic operations on two complex numbers");
}
Main(int r1,int r2,int i1,int i2)  {
this.real1=r1;
this.real2=r2;
this.img1=i1;
this.img2=i2;

}
void accept() {
Scanner sc=new Scanner(System.in);
System.out.println("Enter real part:");
this.real1=sc.nextInt();
System.out.println("Enter imaginary part 1:");
this.img1=sc.nextInt();
System.out.println("Enter real part 2:");
this.real2=sc.nextInt();
System.out.println("Enter imaginary part 2:");

this.img2=sc.nextInt();

}
void display() {
int sum_r= this.real1 + this.real2;
int sum_i=img1+img2;
int diff_r=real1-real2;
int diff_i=img1-img2;
int multi_r=(real1*real2)-(img1*img2);
int multi_i=(real1*img2)-(real2*img1);
//int div_r= (real1*real2+img1*img2)/(real2*2);
System.out.println("Sum of two complex number is:"+(sum_r)+ "+"+sum_i+"i");
System.out.println("Difference of two complex number is:"+diff_r+ "+"+diff_i+"i");
System.out.println("Product  of two complex number is:"+multi_r+ "+"+multi_i+"i");
//System.out.println("Divison of two complex number is:"+div_r+ "+"+div_i+"i");
}
public static void main(String[] args) {

	Main c=new Main();

c.accept();
c.display();
}
}