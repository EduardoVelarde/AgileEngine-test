package main;

public class Calculate {
    public static int solution(int[] D, int X) {
        int count = 0;
        int index = 0;
        int position=1;
        int maxlength=D.length;
        for ( index = 0; index < maxlength; index++) {
            int maxvalue= index+position;
            if(maxvalue==maxlength){
                count++;
                return count;
            }
            int result =maxvalue==maxlength?D[index]:D[index + position] - D[index];

            System.out.println("Result: "+result+" loop position: "+index+"value 1: "+D[index]+" value 2: "+D[index+1]);
            if (result <= X) {
                count++;
                index ++;
            } else {
                count++;
            }
        }
        return count;

    }
}
