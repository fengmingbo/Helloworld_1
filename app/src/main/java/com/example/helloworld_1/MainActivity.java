package com.example.helloworld_1;

import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Leader firstLeader=new FirstLeader();
        Leader secondLeader=new SecondLeader();
        firstLeader.setNextLeader(secondLeader);
        firstLeader.handlerRequest(3);
    }
}
