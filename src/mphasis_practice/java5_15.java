package mphasis_practice;

class java5_15{
public void mergeSort(int arr[],int l,int r)
{
if(l<r) 
{
int mid;  
mid = (l+r)/2;
mergeSort(arr,l,mid); 
mergeSort(arr,mid+1,r);
merge(arr,l,mid,r);
}
}
public void merge(int arr[],int l,int mid,int r)
{
int n1=(mid-l+1);  
int n2=r-mid;  
int  left[]=new int[n1];
int right[]= new int[n2];
int i;
for (i=0;i<n1;i++)
{
left[i]=arr[l+i];  
}
for (i=0;i<n2;i++)
{
right[i]=arr[mid+1+i];
}
int li,ri,ai;    
li=0; 
ri=0; 
ai=l; 
while (li<n1 && ri <n2)
{
if(left[li]<=right[ri]) 
{
    arr[ai]= left[li];
ai++;
li++;
}
else
{
arr[ai]= right[ri];
ai++;
ri++;
}
}
while(li < n1) 
{
arr[ai]= left[li];
ai++;
li++;
}
while(ri < n2) 
{
arr[ai]= right[ri];
ai++;
ri++;
}
}
public void printArray(int arr[])
{
int n = arr.length;
for (int i=0; i<n; ++i)
System.out.print(arr[i] + " ");
System.out.println();
}
public static void main(String args[])
{
    int arr[]={1,8,6,2,3,5,4,9};
java5_15 obj= new java5_15();
System.out.println("array before applying merge sort");
obj.printArray(arr);
obj.mergeSort(arr,0,7);
System.out.println("\narray after applying merge sort");
obj.printArray(arr);
}
}