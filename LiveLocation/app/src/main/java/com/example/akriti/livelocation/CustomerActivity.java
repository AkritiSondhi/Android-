package com.example.akriti.livelocation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem switchCustomer = menu.findItem(R.id.menu_switch_customer);
        MenuItem switchDriver = menu.findItem(R.id.menu_switch_driver);

        switchCustomer.setVisible(false);
        switchDriver.setVisible(true);

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_switch_driver:
                startActivity(new Intent(CustomerActivity.this, TrackerActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
