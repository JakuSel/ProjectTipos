package sk.akademiasovy.tipos;


import java.util.Arrays;
import java.util.Random;

public class Tipos {
    //pole intov s nazvvom arr
    private int[] arr;

    public Tipos() {
        this.arr = new int[5];
    }

    public int[] getArr() {
        return arr;
    }

    public void generateJava8(){

    final int[] arr=new Random().ints(1,35).distinct().limit(5).toArray();
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
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                while (this.arr[i] == this.arr[j])
                {
                    this.arr[i] = random.nextInt(34)+1;
                }
            }
        }
        Arrays.sort(this.arr);
    }

    public void printArr(){
        for (int i = 0; i < 5; i++) {
            System.out.println(this.arr[i]);
        }
    }



}
