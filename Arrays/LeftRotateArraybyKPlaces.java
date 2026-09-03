class LeftRotateArraybyKPlaces {
    public void leftRotate(int arr[], int n, int k) {
        k = k % n; 
        for (int j=0; j<k;j++){
            int first= arr[0];
            for (int i = 0; i < n-1; i++) {
                arr[i] = arr[i + 1];
            }        
        arr[n-1]= first;
        }        
    }
}
