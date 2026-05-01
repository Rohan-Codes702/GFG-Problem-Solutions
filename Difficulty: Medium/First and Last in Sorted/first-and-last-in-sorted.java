class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        int first=first(arr,x);
        int last=last(arr,x);
        
        list.add(first);
        list.add(last);
        return list;
       
    }
    public static int first(int arr[],int x){
        int n=arr.length;
        int ans=-1;
        
        int i=0;
        int j=n-1;
        
        while(i<=j){
            int mid=(i+j)/2;
            
            if(arr[mid]==x){
                ans=mid;
                j=mid-1;
            }
            
            else if(arr[mid]<x){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
    
    public static int last(int arr[],int x){
        int n=arr.length;
        int ans=-1;
        
        int i=0;
        int j=n-1;
        
        while(i<=j){
            int mid=i + (j - i) / 2;
            
            if(arr[mid]==x){
                ans=mid;
                i=mid+1;
            }
            
            else if(arr[mid]<x){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
    
    
}
