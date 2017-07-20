package com.example.deepa.implicitintent;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEdit;
    String query;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mEdit   = (EditText)findViewById(R.id.edittext1);

         button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        next_page(v);

    }
    public void next_page(View v){
        query = "http://www.google.com/#q="+mEdit.getText().toString();

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(query));
        startActivity(intent);
    }

    //Intent intent = new Intent(Intent.ACTION_WEB_SEARCH );
    //intent.putExtra(SearchManager.QUERY, q);
    //startActivity(intent);



}
