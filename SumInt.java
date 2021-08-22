class SumInt{
public static void main(String args[]){

int sum=0;

for(int i=41; i<250; i++)
 {
 if(i%5==0)
  {
  sum=sum+i;
  }
 }

System.out.println("Sum of all the integers greater than 40 and less than 250 which are divisible by 5 is: "+sum);

}
}