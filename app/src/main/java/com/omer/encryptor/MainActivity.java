package com.omer.encryptor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.omer.encryptorbum.R;


public class MainActivity extends AppCompatActivity {

    EditText passtotext, textTopass, resultpass, passresult;
    Button button_passtoText, button_texttopass;
    Button clear1, clear2;


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
        setContentView(R.layout.activity_main);

        textTopass = findViewById(R.id.text_pass_et);//turkce normal girdisi
        button_texttopass = findViewById(R.id.butonenc);
        passresult = findViewById(R.id.text_pass_result);
        clear1 = findViewById(R.id.clear1);

        passtotext = findViewById(R.id.sifre_turkce_ET);//sifrelenmis kufur girdisi
        button_passtoText = findViewById(R.id.butonenc2);
        resultpass = findViewById(R.id.pass_text_result);
        clear2 = findViewById(R.id.clear2);


        button_texttopass.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
              texttopass();
            }

            public void texttopass() {

                String abc = textTopass.getText().toString().trim();
                StringBuilder abc2 = new StringBuilder(abc);

                for (int i = 0; i < abc.length(); i++) {

                     if(abc.charAt(i) =='a'){
                        abc2.setCharAt(i,'e');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'b'){
                        abc2.setCharAt(i,'z');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'c'){
                        abc2.setCharAt(i,'v');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'ç'){
                        abc2.setCharAt(i,'y');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'd'){
                        abc2.setCharAt(i,'p');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'e'){
                        abc2.setCharAt(i,'a');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'f'){
                        abc2.setCharAt(i,'j');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'g'){
                        abc2.setCharAt(i,'k');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'ğ'){
                        abc2.setCharAt(i,'l');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'h'){
                        abc2.setCharAt(i,'r');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'ı'){
                        abc2.setCharAt(i,'ö');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'i'){
                        abc2.setCharAt(i,'o');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'j'){
                        abc2.setCharAt(i,'f');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'k'){
                        abc2.setCharAt(i,'g');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'l'){
                        abc2.setCharAt(i,'ğ');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'm'){
                        abc2.setCharAt(i,'c');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'n'){
                        abc2.setCharAt(i,'ç');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'o'){
                        abc2.setCharAt(i,'u');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'ö'){
                        abc2.setCharAt(i,'ü');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'p'){
                        abc2.setCharAt(i,'b');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'r'){
                        abc2.setCharAt(i,'d');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 's'){
                        abc2.setCharAt(i,'m');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'ş'){
                        abc2.setCharAt(i,'n');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 't'){
                        abc2.setCharAt(i,'h');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'u'){
                        abc2.setCharAt(i,'ı');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'ü'){
                        abc2.setCharAt(i,'i');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'v'){
                        abc2.setCharAt(i,'s');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'y'){
                        abc2.setCharAt(i,'ş');
                        passresult.setText(""+abc2);
                    }else if(abc.charAt(i) == 'z'){
                        abc2.setCharAt(i,'t');
                        passresult.setText(""+abc2);
                    }



                }

            }
        });

        button_passtoText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                passtoText();

            }
            public void passtoText() {

                String bcd = passtotext.getText().toString().trim();
                StringBuilder abc2 = new StringBuilder(bcd);

                for (int i = 0; i < bcd.length(); i++) {
                    if(bcd.charAt(i) =='e'){
                        abc2.setCharAt(i,'a');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'z'){
                        abc2.setCharAt(i,'b');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'v'){
                        abc2.setCharAt(i,'c');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'y'){
                        abc2.setCharAt(i,'ç');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'p'){
                        abc2.setCharAt(i,'d');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'a'){
                        abc2.setCharAt(i,'e');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'j'){
                        abc2.setCharAt(i,'f');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'k'){
                        abc2.setCharAt(i,'g');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'l'){
                        abc2.setCharAt(i,'ğ');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'r'){
                        abc2.setCharAt(i,'h');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'ö'){
                        abc2.setCharAt(i,'ı');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'o'){
                        abc2.setCharAt(i,'i');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'f'){
                        abc2.setCharAt(i,'j');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'g'){
                        abc2.setCharAt(i,'k');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'ğ'){
                        abc2.setCharAt(i,'l');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'c'){
                        abc2.setCharAt(i,'m');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'ç'){
                        abc2.setCharAt(i,'n');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'u'){
                        abc2.setCharAt(i,'o');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'ü'){
                        abc2.setCharAt(i,'ö');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'b'){
                        abc2.setCharAt(i,'p');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'd'){
                        abc2.setCharAt(i,'r');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'm'){
                        abc2.setCharAt(i,'s');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'n'){
                        abc2.setCharAt(i,'ş');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'h'){
                        abc2.setCharAt(i,'t');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'ı'){
                        abc2.setCharAt(i,'u');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'i'){
                        abc2.setCharAt(i,'ü');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 's'){
                        abc2.setCharAt(i,'v');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 'ş'){
                        abc2.setCharAt(i,'y');
                        resultpass.setText(""+abc2);
                    }else if(bcd.charAt(i) == 't'){
                        abc2.setCharAt(i,'z');
                        resultpass.setText(""+abc2);
                    }



                }

            }
        });

        clear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textTopass.setText(""+"");
                passresult.setText(""+"");

            }
        });
        clear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passtotext.setText(""+"");
                resultpass.setText(""+"");
            }
        });


    }


}