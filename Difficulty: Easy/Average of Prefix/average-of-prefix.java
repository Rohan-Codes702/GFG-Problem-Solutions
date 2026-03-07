// User function Template for Java

class Solution {
    // Prints average of a stream of numbers
    public ArrayList<Integer> prefixAvg(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            
            list.add(sum/(i+1));
        }
        return list;
    }
}