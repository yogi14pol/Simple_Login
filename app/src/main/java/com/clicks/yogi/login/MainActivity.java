package com.clicks.yogi.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    EditText edt1,edt2;
    String s1,s2,s3="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.UserId);
        edt2 = (EditText)findViewById(R.id.PasswordId);
        btn1 = (Button)findViewById(R.id.LoginId);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s1 = edt1.getText().toString();
                s2 = edt2.getText().toString();

                if ((s1.equals(s3)) || (s2.equals(s3))) {

                    Toast.makeText(MainActivity.this, "PLEASE FILL ALL DETAILS",
                            Toast.LENGTH_SHORT).show();

                }else if((s1.equals("a")) && (s2.equals("b"))){

                    Toast toast = Toast.makeText(MainActivity.this, "Login done",
                            Toast.LENGTH_SHORT);

                    edt1.setText("");
                    edt2.setText("");
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();

                }else{
                    Toast.makeText(MainActivity.this, "Enter correct details",
                            Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
