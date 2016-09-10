import java.util.Random;

/**
 * Created by Rafael on 8/1/2016.
 */


class Number{
    Integer[] temp;
    String binary;
    Random rand;
    public Number(int size){
        for(int i=0;i<size;i++){
            temp[i] = rand.nextInt()%40;
        }
    }

    public void show(){
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }

}

public class BinarySwitch {
    public static void main(String args[]){
        Number number = new Number(5);
        number.show();
    }
}
