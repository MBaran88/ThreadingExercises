package Threading;

/**
 * Created by RENT on 2017-06-21.
 */
public class HiLoValueFinder extends Thread {
    private int lo, hi;
    private int [] arr;
    private int max = 0;

    public HiLoValueFinder(int[] arr, int lo, int hi) {
        this.arr = arr;
        this.lo = lo;
        this.hi = hi;
    }


    @Override
    public void run(){
        for (int i = lo; i <hi ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
    }

    public static int findMax (int[]arr){
        int leng = arr.length;
        int foundMax = 0;

        HiLoValueFinder[] maxThread = new HiLoValueFinder[4];
        for (int i = 0; i <4 ; i++) {
            maxThread[i] = maxThread(arr,(i*leng)/4,((i+1)*leng/4))
            
        }

    }
    return foundMax;
}
