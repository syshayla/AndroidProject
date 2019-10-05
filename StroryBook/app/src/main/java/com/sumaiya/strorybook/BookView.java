package com.sumaiya.strorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookView extends AppCompatActivity {
    private ImageView nameIV;
    private TextView nameTV, authorTV;
    private String image, author, name;
int imagelink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_view);
        init();
        getData();
        setData();
    }

    private void setData() {
        nameIV.setImageResource(imagelink);
        nameTV.setText(name);
        authorTV.setText(author );
    }

    private void getData() {
        name = getIntent().getStringExtra("name");
        author = getIntent().getStringExtra("author");
        image = getIntent().getStringExtra("image");
        imagelink = Integer.valueOf(image);


    }


    private void init() {
        nameIV = findViewById(R.id.nameIV);
        nameTV = findViewById(R.id.nameTV);
        authorTV = findViewById(R.id.authorTV);
    }
}
