package com.example.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

            public static String EXTRA_MESSAGE;
            private String Extra_MESSAGE;
            //public static final String EXTRA_MESSAGE = ;

            // protected String EXTRA_MESSAGE;
            //protected String Extra_MESSAGE;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
            }
            public void sendMessage(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                EditText editText = (EditText) findViewById(R.id.editText);
                String message = editText.getText().toString();
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, message);
                String chooserTitle = getString(R.string.chooser);
                Intent chosenIntent = Intent.createChooser(intent,chooserTitle);
                startActivity(chosenIntent);
                //startActivity(intent);


            }
}
