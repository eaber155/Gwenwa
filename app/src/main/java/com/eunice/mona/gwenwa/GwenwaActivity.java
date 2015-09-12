package com.eunice.mona.gwenwa;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class GwenwaActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gwenwa);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_direction, menu);
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

    public void allInformation(View view){
        Intent intent = new Intent(this, InformationActivity.class );
        startActivity(intent);
    }

    public void monitorGrowth(View view){
        Intent intent = new Intent(this, MonitorGrowthActivity.class );
        startActivity(intent);
    }

    public void accessDoctor(View view){
        Intent intent = new Intent(this, AccessDoctorActivity.class );
        startActivity(intent);
    }

    public void viewForum(View view){
        Intent intent = new Intent(this, ForumActivity.class );
        startActivity(intent);
    }

}
