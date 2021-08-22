import java.lang.Math;

class Square{
public static void main(String args[]){

int[] arr= new int[10];
for(int i=0; i<args.length; i++)
 {
 arr[i]=Integer.parseInt(args[i]);
 }

double sum=0;

for(int i=0; i<arr.length; i++)
 {
 sum=sum+(Math.pow(arr[i],2));
 }

System.out.println(""+sum);

}
}