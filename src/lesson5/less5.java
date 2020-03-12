package lesson5;

public class less5 {
    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];

    public static void main(String[] args){
        for(int i = 0; i < size; i++){
            arr[i] = 1;
        }

       singleThreadTime(arr);
       multiThreadTime(arr);

    }

    private static long singleThreadTime(float[] arr){
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long time = System.currentTimeMillis() - timeStart;

        System.out.println("Single thread time: " + time);

        return time;
    }

    private static long multiThreadTime(float[] arr) {
        float[] a = new float[h];
        float[] b = new float[h];
        long timeStart = System.currentTimeMillis();

        System.arraycopy(arr, 0, a, 0, h);
        System.arraycopy(arr, h, b, 0, h);

        MyThread t1 = new MyThread("a", a);
        MyThread t2 = new MyThread("b", b);

        t1.start();
        t2.start();

        System.arraycopy(a, 0, arr, 0, h);
        System.arraycopy(b, 0, arr, h, h);

        long multiTime = System.currentTimeMillis() - timeStart;

        System.out.printf("Multi thread time: " + multiTime);

        return multiTime;
    }
}
