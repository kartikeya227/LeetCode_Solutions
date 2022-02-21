class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int a[], int b[]){
                if(a[0]==b[0]) return a[1]-b[1];
                return a[0]-b[0];
            }
        });
        
        int ans=arr.length;
        int prevl=arr[0][0], prevr = arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]==prevl){
                if(arr[i][1]>prevr){
                    ans--;
                    prevr = arr[i][1];
                }
            }
            else{
                if(arr[i][1]<=prevr){
                    ans--;
                }
                else{
                    prevl=arr[i][0];
                    prevr = arr[i][1];
                }
            }
        }
        return ans;
        
    }
}