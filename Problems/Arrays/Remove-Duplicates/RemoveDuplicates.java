public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {

        int left = 0;
        int right = 1;

        while (right < arr.length) {

            if (arr[left] != arr[right]) {

                left++;
                arr[left] = arr[right];

            }

            right++;
        }

        return left + 1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int k = removeDuplicates(arr);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Modified Array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public static int maxProfit(int[] prices){
    int minimumPrice = prices[0];
    int maximumProfit = 0;

    for(int i=1;i<prices.length;i++){
        if(prices[i]<minimumPrice){
            minimumPrice=prices[i];
        }
        else{
            int profit = prices[i]-minimumPrice;
            
            if(profit>maximumProfit){
            maximumProfit=profit;
        }
        }
        
    }
    return maximumProfit;
}