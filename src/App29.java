public class App29 {
    public static void main(String[] args) {
        int i, s = 0;
        int m[] = {1, 2, 3, 4, 5, 6, 7, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 99, 100};
        for (i = 0; i < 100; i++) {
            if (m[i + 1] > m[i - 1]) {
                s++;
            }
        }

        if (s == 100) {
            System.out.print("Yes!");
        } else {
            System.out.print("No!");
        }
    }
}
