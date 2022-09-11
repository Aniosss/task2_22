package ru.vsu.cs.rodionovri;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static int input() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public static void output(int var) {
        if (var == 0) {
            System.out.println("equals");
        } else if (var == 1) {
            System.out.println("first is bigger");
        } else if (var == 2) {
            System.out.println("second is bigger");
        }
        else{
            System.out.println("no");
        }
    }
    public static int compare(int first[], int second[]){
        Arrays.sort(first);
        Arrays.sort(second);
        if (first[0] == second[0] && first[1] == second[1] && first[2] == second[2]){
            return 0;
        }
        else if (first[0] >= second[0] && first[1] >= second[1] && first[2] >= second[2]){
            return 1;
        }
        else if (first[0] <= second[0] && first[1] <= second[1] && first[2] <= second[2]){
            return 2;
        }
        else return 3;
    }


    public static void main(String[] args) {
        int first[] = new int[3];
        int second[] = new int[3];
        for(int i = 0; i < 3; ++i){
            first[i] = input();
        }
        for(int i = 0; i < 3; ++i){
            second[i] = input();
        }
        output(compare(first, second));
    }
}