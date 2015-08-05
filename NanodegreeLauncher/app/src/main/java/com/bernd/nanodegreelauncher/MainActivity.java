package com.bernd.nanodegreelauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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


    public void onButtonSpotifyClicked(View v) {

        ((Button) v).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                Log.d("Button", "clicked");
                doToast(getString(R.string.toast_spotify));

            }
        });

    }

    public void onButtonScoresClicked(View v) {

        ((Button) v).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                doToast(getString(R.string.toast_scores));

            }
        });

    }

    public void onButtonLibraryClicked(View v) {

        ((Button) v).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                doToast(getString(R.string.toast_library));

            }
        });

    }

    public void onButtonBuildItBiggerClicked(View v) {

        ((Button) v).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                doToast(getString(R.string.toast_buildItBigger));

            }
        });

    }

    public void onButtonXYZReaderClicked(View v) {

        ((Button) v).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                doToast(getString(R.string.toast_xyzReader));

            }
        });

    }

    public void onButtonCapstoneClicked(View v) {

        ((Button) v).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                doToast(getString(R.string.toast_capstoneMyOwnApp));

            }
        });

    }


    public void doToast(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();

    }
}
