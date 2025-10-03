public class Trapping_RainWater {

                // MY LOGIC -> COMPLETE BRUTE FORCE TECHNIQUE <- :
    // public static void auxillary1(int arr[]){
    //     int[] aux1 = new int[arr.length];
    //     int[] aux2 = new int[arr.length];
    //     aux1[0] = arr[0];
    //     System.out.print(aux1[0] + " ");
    //     for(int i = 1; i<arr.length; i++){
    //         if(arr[i] >= aux1[i-1]){
    //             aux1[i] = arr[i];
    //         }else{
    //             aux1[i] = aux1[i-1];
    //         }
    //         System.out.print(aux1[i] + " ");
    //     }
    //     System.out.println();
    //     aux2[arr.length-1] = arr[arr.length-1];
    //     System.out.print(aux1[arr.length-1] + " ");
    //     for(int i = arr.length-2; i>=0; i--){
    //         if(arr[i] >= aux2[i+1]){
    //             aux2[i] = arr[i];
    //         }else{
    //             aux2[i] = aux2[i+1];
    //         }
    //         System.out.print(aux2[i] + " ");
    //     }
    // }

    public static int trappedWater(int height[]){
        //Calculate left max boundry -> auxillary array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1; i<height.length; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        //Calculate right max boundry -> auxillary array
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }
        //loop
        int water_trapped = 0;
        for(int i = 0; i<height.length; i++){
            //waterLevel = min(left max boundry, right max boundry)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            //water_trapped = waterLevel - height[i]
            water_trapped += waterLevel - height[i];
        }
        return water_trapped;
    }
    

    public static void main(String[] args) {
        // int[] arr = {4, 2, 0, 6, 3, 2, 5};
        //auxillary1(arr);
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.print("water trapped is : " + trappedWater(height));

    }
}