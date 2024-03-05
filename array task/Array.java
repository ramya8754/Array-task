import java.util.*;
class ArrayTask{

    //1.Declare an array of integers named numbers with a size of 5 and initialize it with values {1, 2, 3, 4, 5}.
public static void main(String[]  args){
int numbers[]={1,2,3,4,5}; 

//2.Print the third element of the array numbers.
System.out.println("The Third Element in Array is:"+numbers[2]);

 //3. Change the value of the second element of the array numbers to 10.  
numbers[1]=10; 

//4. Print the length of the array numbers.
System.out.println("Array Length is :"+numbers.length); 

//5.Calculate and print the sum of all elements in the array numbers.
int sum=0,avg;
for(int i=0;i<numbers.length;i++){
sum=sum+numbers[i];
}
System.out.println("Sum of all Element is :"+sum); 

//6. Calculate and print the average of all elements in the array numbers.
avg=sum/numbers.length;
System.out.println("Average of all Element is :"+avg);  

//7.Find and print the maximum element in the array numbers.
int min=numbers[0],max=numbers[0];
for(int i=1;i<numbers.length;i++){
if(min>numbers[i]){
min=numbers[i];
}
if(max<numbers[i]){
max=numbers[i];
}
}

//7.Find and print the minimum element in the array numbers.
System.out.println("Minimum is :"+min); 

 //8.Find and print the minimum element in the array numbers.
System.out.println("Maximum is :"+max);

//9.Create a new array copyNumbers and copy all elements from numbers to copyNumbers.
int copyNumbers[]=Arrays.copyOf(numbers,numbers.length);
System.out.print("Elements of copy Numbers is :"); 

//10.Reverse the elements of the array numbers in-place.
for(int i=0;i<numbers.length;i++){
System.out.print(numbers[i]+" ");
}
System.out.println();
for(int i=0,j=numbers.length-1;i<numbers.length/2;i++,j--){
int temp=numbers[i];
numbers[i]=numbers[j];
numbers[j]=temp;
}
System.out.print("Reveresed Array Element is :"); 
}
}