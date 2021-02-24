public class Home2 {

    public static void main(String[] args) {
        System.out.println("\n Задание 1");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + "");
        }

        System.out.println("\n Задание 2");
        int[] arr2 = new int[8];
        for (int i = 1, j = 0; i < arr2.length; i++) arr2[i] = j += 3;
        for (int x : arr2) System.out.print(x + " ");


        System.out.println("\n Задание 3");
        int [] arr3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }

        System.out.println("\n Задание 4");
        int [][] arr4 = new int[6][6];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4 [i][j] = 1;
                System.out.print(arr4 [i][j] + " ");
            }
            System.out.print("\r\n");
        }

        System.out.println("\n Задание 5");
        int[] arr5 = {1,5,3,2,11,4,5,2,4,8,9,1};
        int min = arr5 [0], max = arr5[0], indMax = 0, indMin = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max){
                max = arr5[i];
                indMax = i;
            }
            if (arr5[i] < min){
                min = arr5[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент находится в индексе : " + indMax + " = " + max);
        System.out.println("Минимальный элеменет находится в индексе : " + indMin + " = " + min);
    }
    }

