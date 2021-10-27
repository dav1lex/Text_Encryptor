package com.omer.encryptor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.omer.encryptorbum.R;

public class Credits extends AppCompatActivity {



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.normalmenu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mainpage:
                Intent int0 = new Intent(this, MainActivity.class);
                startActivity(int0);
                finish();
                break;

            case R.id.checkalp:
                Intent int1 = new Intent(this, Menu_alfabe.class);
                startActivity(int1);
                break;

            case R.id.credits:
                Intent int2 = new Intent(this, Credits.class);
                startActivity(int2);
                break;

        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credityeri);



       ImageButton insta =  findViewById(R.id.instagrambutonu);
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.instagram.com/exilus.dll");
                Intent instagram = new Intent(Intent.ACTION_VIEW, uri);
                instagram.setPackage("com.instagram.android");
                try {
                    startActivity(instagram);
                }catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/exilus.dll")));
                }
            }
        });





    }
}