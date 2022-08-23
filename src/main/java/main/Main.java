package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test1ng solution 1:");
        int i = 3;
        int array2[]={5,8,2,7};
        System.out.println(Calculate.solution(array2, i));
        System.out.println("Test1ng solution 2:");
        i = 3;
        int array3[]={2,5,9,2,1,4};
        i=4;
        System.out.println(Calculate.solution(array3, i));
        System.out.println("Test1ng solution 3:");
        i = 3;
        int[] array4 = new int[6];
        array4[0]=1;
        array4[1]=12;
        array4[2]=10;
        array4[3]=4;
        array4[4]=5;
        array4[5]=2;
        i=2;
        System.out.println(Calculate.solution(array4, i));
    }

}
