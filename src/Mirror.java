import java.util.Random;
import java.util.Arrays;

public class Mirror{

    public static void main(String []args){

        Random random = new Random();
        int k = 10;
        int[] table = new int[k];
        int[] table2 = new int[2*k];
        for (int i = 0; i<table.length;i++){
            table[i] = random.nextInt(10);
        }
        for (int i = table.length-1; i>=0; i--){
            table2[k+i] = table[i];
            table2[k-1-i] = table[i];
        }
        System.out.println(Arrays.toString(table2));
    }
}