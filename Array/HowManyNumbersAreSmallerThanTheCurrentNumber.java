class Solution {
    public int[] smallerNumbersThanCurrent(int[] a) {
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[j]<a[i]){
                    c=c+1;
                }
            }b[i]=c;
        }return b;
    }
}