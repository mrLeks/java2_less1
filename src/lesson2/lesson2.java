package lesson2;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int i = scanner.nextInt();
        System.out.println("Введите количество столбцов: ");
        int j = scanner.nextInt();

        String[][] arr = new String[i][j];
        for(int i1 = 0; i1 < i; i1++){
            for(int j1 = 0; j1 < j; j1++){
                System.out.println("Введите число для ячейке[" + i1 + "," + j1 + "]: ");
                arr[i1][j1] = scanner.next();
            }
        }
        getSum(arr);

    }


    private static void getSum(String[][] arr){

        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException();
            }
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                inputDate(arr[i][j], i,j);
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        System.out.println("Результат: ");
        System.out.println(sum);
    }

    private static void inputDate(String arr, int x, int y){
        for(int i = 0; i < arr.length(); i++){
            if(arr.charAt(i) < '0' || arr.charAt(i) > '9') {
                throw new MyArrayDataException(x, y);
            }
        }
    }
}
