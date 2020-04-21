package com.example.fibonacci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "BVN:" ;
    private TextView lbNhapA, lbNhapB, lbNhapC, lbKetQua;
    private EditText txtNhapA, txtNhapB, txtNhapC;
    private Button btnKiemTra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.my_layout);
        this.registerControlAndText();
        String message="onCreate: Activity/ Ứng dụng được mở chạy";
        Log.i(TAG,message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }
    private void registerControlAndText(){
        //gắn tham chiếu
        this.txtNhapA = this.findViewById(R.id.txtNhapA);
        this.txtNhapB = this.findViewById(R.id.txtNhapB);
        this.txtNhapC = this.findViewById(R.id.txtNhapC);
        this.lbKetQua = this.findViewById(R.id.lbKetQua);
        this.btnKiemTra = this.findViewById(R.id.btnKiemTra);
        // đăng ký sự kiện
        this.btnKiemTra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(txtNhapA.getText().toString()),
                    b = Integer.parseInt(txtNhapB.getText().toString()),
                    c = Integer.parseInt(txtNhapC.getText().toString());
                if(laFibonacci(a,b,c)) lbKetQua.setText("A B C LÀ CÁC ỨNG CỬ VIÊN CỦA CHUỖI FIBONACCI");
                else lbKetQua.setText("A B C KHÔNG LÀ ỨNG CỬ VIÊN CỦA CHUỖI FIBONACCI");
            }
        });
    }
    private boolean laFibonacci(int a, int b, int c){
         int f[]= new int[100];
         f[0]=1; f[1]=1;
         //chạy dãy Fibonacci với 100 phần tử đầu tiên
         for(int i=2;i<=99;i++) {
             f[i]=f[i-1]+f[i-2];
             if (a==f[i-2]&&b==f[i-1]&&c==f[i]) return true;
         }
         return false;
    }
    @Override
    protected void onStart(){
        super.onStart();
        // code cá biệt
        String message="onStart: Ứng dụng bắt đầu khởi động để thực thi";
        Log.i(TAG,message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }
    protected void onRestart(){
        super.onRestart();
        // code cá biệt
        String message="onRestart: Ứng dụng được khởi động lại";
        Log.i(TAG,message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        // code cá biệt
        String message="onResume: Ứng dụng được khôi phục tương tác";
        Log.i(TAG,message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }@Override
    protected void onPause(){
        super.onPause();
        // code cá biệt
        String message="onPause: Ứng dụng tạm dừng nhận tương tác (mất forcus)";
        Log.i(TAG,message);
    }@Override
    protected void onStop(){
        super.onStop();
        // code cá biệt
        String message="onStop: Ứng dụng bị đóng (bị ngắt tài nguyên)";
        Log.i(TAG,message);
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }
    protected void onDestroy(){
        String message="onDestroy: Ứng dụng bị thoát/ đóng lại ";
        Log.i(TAG,message);
        // code cá biệt
        super.onDestroy();
        Toast toast = Toast.makeText(
                this.getApplicationContext(),
                message,
                Toast.LENGTH_SHORT
        );
        toast.show();
    }
}
