public class LargestAndSmallNum{
    public static void main(String[] args){

        int[] arr = {12,3,2,89,0,-1};

        int largest_num = arr[0];
        int smallest_num = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest_num){
                largest_num = arr[i];
            }else if( arr[i] < smallest_num ){
                smallest_num = arr[i];
            }
        }

        System.out.println("largest num "+ largest_num);
        System.out.println("smallest num "+ smallest_num);

    }
}