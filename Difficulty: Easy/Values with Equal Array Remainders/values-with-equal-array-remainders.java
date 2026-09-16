class Solution {
    public int sameMod(int[] arr) {
        int count = 0;

        Arrays.sort(arr);

        if (arr[0] == arr[arr.length - 1]) {
            return -1;
        }

        int diff = arr[arr.length - 1] - arr[0];

        for (int i = 1; i <= diff; i++) {
            int rem = arr[0] % i;
            boolean istrue = true;

            for (int j = 1; j < arr.length; j++) {
                if (arr[j] % i != rem) {
                    istrue = false;
                    break;
                }
            }

            if (istrue) {
                count++;
            }
        }

        return count;
    }
}