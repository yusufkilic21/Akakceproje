package kutuphane;

public class MyFunc {
    public static void Bekle(int sn){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
