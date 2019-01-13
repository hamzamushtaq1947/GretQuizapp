package com.example.hamza.gretquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private Button a;
    private EditText b;
    private EditText c;
    private DatabaseReference db_ref;
    Model obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(Button) findViewById(R.id.button1);
        b=(EditText) findViewById(R.id.edit_text_name);
        c=(EditText) findViewById(R.id.edit_text_surname);
        db_ref=FirebaseDatabase.getInstance().getReference();
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bus();
            }
        });
    }
    void bus()
    {
        Intent intent=new Intent(this,shugl.class);
        Model model = new Model(b.getText().toString(),c.getText().toString());
        db_ref.push().child("mss");
        startActivity(intent);
    }
}
