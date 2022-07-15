public class arrayFindUnique {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 1, 5};
        int unique = findUnique(arr);
        System.out.println(unique);
    }

    public static int findUnique(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<n;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        break;
                    }
                }
            }
            if(j==n)
            //means we check i for every j and
            //found no match for that i value,
            //showing that arr[i] is unique
            {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
}