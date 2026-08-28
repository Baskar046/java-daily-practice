
import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] arr) {

        int Start = 0;
        int end = arr.length - 1;

        while (Start < end) {
            int temp = arr[Start];
            arr[Start] = arr[end];
            arr[end] = temp;

            Start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] Values = {10, 20, 30, 40, 50};

        reverse(Values);

        System.out.println(Arrays.toString(Values));

    }
}


/*


┌─────────────────────────────────────────────────────────────────────┐
│                    ARRAY REVERSE CALCULATION                        │
│                                                                     │
│ Initial Array: {10, 20, 30, 40, 50}                                 │
│                                                                     │
│ arr.length = 5                                                      │
│ Start = 0                                                           │
│ end = arr.length - 1 = 5 - 1 = 4                                    │
│                                                                     │
│ ───────────────────── ITERATION 1 ────────────────────────────────  │
│                                                                     │
│ Condition: Start < end                                              │
│           0 < 4  → TRUE                                             │
│                                                                     │
│ temp = arr[Start]                                                   │
│      = arr[0]                                                       │
│      = 10                                                           │
│                                                                     │
│ arr[Start] = arr[end]                                               │
│ arr[0] = arr[4]                                                     │
│ arr[0] = 50                                                         │
│                                                                     │
│ arr[end] = temp                                                     │
│ arr[4] = 10                                                         │
│                                                                     │
│ Array: {50, 20, 30, 40, 10}                                         │
│                                                                     │
│ Start++ → Start = 0 + 1 = 1                                         │
│ end--   → end   = 4 - 1 = 3                                         │
│                                                                     │
│ ───────────────────── ITERATION 2 ────────────────────────────────  │
│                                                                     │
│ Condition: Start < end                                              │
│           1 < 3  → TRUE                                             │
│                                                                     │
│ temp = arr[Start]                                                   │
│      = arr[1]                                                       │
│      = 20                                                           │
│                                                                     │
│ arr[Start] = arr[end]                                               │
│ arr[1] = arr[3]                                                     │
│ arr[1] = 40                                                         │
│                                                                     │
│ arr[end] = temp                                                     │
│ arr[3] = 20                                                         │
│                                                                     │
│ Array: {50, 40, 30, 20, 10}                                         │
│                                                                     │
│ Start++ → Start = 1 + 1 = 2                                         │
│ end--   → end   = 3 - 1 = 2                                         │
│                                                                     │
│ ───────────────────── ITERATION 3 ────────────────────────────────  │
│                                                                     │
│ Condition: Start < end                                              │
│           2 < 2  → FALSE                                            │
│                                                                     │
│ Loop stops.                                                         │
│                                                                     │
│ FINAL ARRAY: {50, 40, 30, 20, 10}                                   │
└─────────────────────────────────────────────────────────────────────┘

*/