public class Findmissingnumber {
    public int findnumber(int [] arr, int n){
        int total= n*(n+1)/2;
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return total-sum;
    }
}
