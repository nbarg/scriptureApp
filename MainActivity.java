package com.cs246.nathanael.twoactivites;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.cs246.nathanael.twoactivites.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void transfer(View view) {
        // make intent
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        String line;

        // get info from editText
        EditText editText = (EditText)findViewById(R.id.editText);
        String book = editText.getText().toString();

        editText = (EditText)findViewById(R.id.editText2);
        String chapter = editText.getText().toString();

        editText = (EditText)findViewById(R.id.editText3);
        String verse = editText.getText().toString();

        line = "Your favorite scripture is: " + book + " " + chapter + ":" + verse;

        // set extra message
        intent.putExtra(EXTRA_MESSAGE, line);

        startActivity(intent);

        //TextView txt = (TextView)findViewById();
    }
}
