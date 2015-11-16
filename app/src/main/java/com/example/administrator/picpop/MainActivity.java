package com.example.administrator.picpop;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.tencent.bugly.crashreport.CrashReport;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CrashHandler.getInstance().init(this);
        CrashReport.initCrashReport(this, "900012968", false);
       // CrashReport.testJavaCrash();
        int i = 10 /0;
    }
}
