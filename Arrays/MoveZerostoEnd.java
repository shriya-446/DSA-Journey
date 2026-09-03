public class MoveZerostoEnd {
    public void movezeros(int arr[], int n){
        int j=0;
        for (int i=0; i<n; i++){
            if (arr[i] != 0){
                arr[j]= arr[i];
                j++;
            }            
        }
            while (j < arr.length) {
            arr[j] = 0;
            j++;
            }
    }       
}
    

