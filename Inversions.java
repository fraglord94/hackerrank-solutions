package hackerrank.algorithms;

class Inversions {
    public boolean isIdealPermutation(int[] a) {
        int localInversion = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                localInversion++;
        }

        for (int d = 1; d < a.length - 1; d++) {
            for (int i = 0; i < a.length - d; i++) {
                if (a[i] > a[i + d]) {
                    localInversion--;
                }
                if (localInversion < 0)
                    return false;
            }
        }
        return localInversion == 0;
    }
}