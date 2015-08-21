package com.wsl.library.indicator.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.wsl.library.indicator.IndicatorView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private IndicatorView tab1;
    private IndicatorView tab2;
    private IndicatorView tab3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tab1 = (IndicatorView) findViewById(R.id.tab1);
        tab2 = (IndicatorView) findViewById(R.id.tab2);
        tab3 = (IndicatorView) findViewById(R.id.tab3);

        tab1.setOnClickListener(this);
        tab2.setOnClickListener(this);
        tab3.setOnClickListener(this);

        tab1.setSelected(true);
    }

    private void resetTabStatus() {
        tab1.setSelected(false);
        tab2.setSelected(false);
        tab3.setSelected(false);
    }

    @Override
    public void onClick(View v) {
        resetTabStatus();
        switch (v.getId()) {
            case R.id.tab1:
                tab1.setSelected(true);
                break;
            case R.id.tab2:
                tab2.setSelected(true);
                break;
            case R.id.tab3:
                tab3.setSelected(true);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
