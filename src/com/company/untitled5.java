package com.company;

public class untitled5 {

    public static void main (String[] args) {
        int a[] = {11,15,44,313,12,2,5,7,9,66,44,13,1,4,6};
        System.out.println("не отсортированный");
        for (int i:a){
            System.out.print(i + ",");
        }
        System.out.println();

        Vstavka(a);
        System.out.println("отсортированный");
        for (int i:a) {
            System.out.print(i+",");
        }
    }

    public static void Vstavka(int numbers[]) {
        int min, tmp;
        for (int i = 0; i < numbers.length; i++) {
            min = i;
            for (int check = i + 1; check < numbers.length; check++) {
                if (numbers[check] < numbers[min]) {
                    min = check;
                }
            }

                tmp = numbers[min];
                numbers[min] = numbers[i];
                numbers[i] = tmp;
            }
        }
    }
