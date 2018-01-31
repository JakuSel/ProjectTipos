package sk.akademiasovy.tipos;

import java.util.*;

public class Tipos {
    //pole intov s nazvvom arr
    private int[] arr;

    public Tipos() {
        this.arr = new int[5];
    }

    public void generateRandom(){

            this.arr=new Random().ints(1,35).distinct().limit(5).toArray();
            Arrays.sort(this.arr);

    }

    public void generate()
    {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            this.arr[i] = random.nextInt(34)+1;
            if (i > 0)
            {
                for (int j = 0; j < i; j++) {
                    while (this.arr[i] == this.arr[j])
                    {
                        this.arr[i] = random.nextInt(34)+1;
                    }
                }
            }
        }
        Arrays.sort(this.arr);

    }

    public void printArr(){

        System.out.println(Arrays.toString(this.arr));
    }

    //getter
    public int[] getArr() {
        return arr;
    }




}
