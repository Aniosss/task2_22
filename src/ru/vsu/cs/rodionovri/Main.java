package ru.vsu.cs.rodionovri;

import java.util.*;

public class Main {
    public static void inputSizeOfBox(int array[]) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; ++i) {
            array[i] = scanner.nextInt();
        }
    }

    public static void output(int var) {
        switch (var) {
            case 0:
                System.out.println("equals");
                break;
            case 1:
                System.out.println("first is bigger");
                break;
            case 2:
                System.out.println("second is bigger");
                break;
            default:
                System.out.println("no");
                break;
        }
    }

    public static int compareTwoBoxes(int firstBox[], int secondBox[]) {
        Arrays.sort(firstBox);
        Arrays.sort(secondBox);
        if (firstBox[0] == secondBox[0] && firstBox[1] == secondBox[1] && firstBox[2] == secondBox[2]) {
            return 0;
        } else if (firstBox[0] >= secondBox[0] && firstBox[1] >= secondBox[1] && firstBox[2] >= secondBox[2]) {
            return 1;
        } else if (firstBox[0] <= secondBox[0] && firstBox[1] <= secondBox[1] && firstBox[2] <= secondBox[2]) {
            return 2;
        } else return 3;
    }


    public static void main(String[] args) {
        int firstBox[] = new int[3];
        int secondBox[] = new int[3];
        inputSizeOfBox(firstBox);
        inputSizeOfBox(secondBox);
        output(compareTwoBoxes(firstBox, secondBox));
    }
}