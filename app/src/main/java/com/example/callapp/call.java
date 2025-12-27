package com.example.callapp;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;

public class call extends Activity {
    EditText t1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call);
        t1=findViewById(R.id.t1);

        t1.setMovementMethod(new ScrollingMovementMethod());

    }

    public void f1(View v){
    t1.setText(t1.getText().toString()+"1");
}
    public void f2(View v){
        t1.setText(t1.getText().toString()+"2");
    }
    public void f3(View v){
        t1.setText(t1.getText().toString()+"3");
    }
    public void f4(View v){
        t1.setText(t1.getText().toString()+"4");
    }
    public void f5(View v){
        t1.setText(t1.getText().toString()+"5");
    }
    public void f6(View v){
        t1.setText(t1.getText().toString()+"6");
    }
    public void f7(View v){
        t1.setText(t1.getText().toString()+"7");
    }
    public void f8(View v){
        t1.setText(t1.getText().toString()+"8");
    }
    public void f9(View v){
        t1.setText(t1.getText().toString()+"9");
    }
    public void f10(View v){
        t1.setText(t1.getText().toString()+"*");
    }
    public void f11(View v){
        t1.setText(t1.getText().toString()+"0");
    }
    public void f12(View v){
        t1.setText(t1.getText().toString()+"#");
    }
    public void f15(View v) {



        String currentText=t1.getText().toString();
        if (!currentText.isEmpty()) {
            String newText = currentText.substring(0, currentText.length() - 1);
            t1.setText(newText);
            t1.setSelection(newText.length());
        }

    }
    public void f14(View v){

            if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                return;
            }

            String s1=t1.getText().toString();

            Intent obj = new Intent(Intent.ACTION_CALL);
            obj.setData(Uri.parse("tel:"+s1));
            startActivity(obj);
        }
    }



