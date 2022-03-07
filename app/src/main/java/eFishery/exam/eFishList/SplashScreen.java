package eFishery.exam.eFishList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Bayu Dwi Rizkyadha P on 02/12/2016.
 */

//Untuk keperluan Splash Screen (Layar Pembuka aplikasi)
public class SplashScreen extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);                    //Memanggil file layout activity_splash_screen.

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);                                        //Beri delay waktu selama 5s (5000ms) untuk menampilkan gabar pembuka
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);       //Memanggil activity lain apabila sudah habis waktu tayang gambar splash screen nya
                    startActivity(intent);
                }
            }
        };
        timerThread.start();                                //Start Timer
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
