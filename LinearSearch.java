import java.util.*;
class Main{
  
      public static int linearSearch(int arr[],int n,int x){ //function to implement linear search
    int index;
    for(int i=0;i<n;i++){
      if(arr[i]==x){
        index=i;
    }
      else{
        index=-1;  //if key element is not present in array
      }
      return index;
  }
      }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int size=sc.nextInt(); //size of array
    int arr[]=new int[size];
    for(int i=0;i<n;i++){ //input array
      arr[i]=sc.nextInt();
  }
   int key=sc.nextInt();//key elemet to find in array
    System.out.println(linearSearch(arr,size,key));//
  }

}
