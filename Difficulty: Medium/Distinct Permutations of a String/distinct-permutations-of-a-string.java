class Solution {
    static ArrayList<String> findPermutation(String s) {
        ArrayList<String> list = new ArrayList<>();

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        boolean[] used = new boolean[arr.length];

        backtrack(arr, list, new StringBuilder(), used);

        return list;
    }

    static void backtrack(char[] arr, ArrayList<String> list,
                          StringBuilder str, boolean[] used) {

        if (str.length() == arr.length) {
            list.add(str.toString());
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (used[i]) {
                continue;
            }

            // Skip duplicate characters at the same level
            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            str.append(arr[i]);

            backtrack(arr, list, str, used);

            str.deleteCharAt(str.length() - 1);
            used[i] = false;
        }
    }
}