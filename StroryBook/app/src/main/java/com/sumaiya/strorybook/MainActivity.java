package com.sumaiya.strorybook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<Book> bookList;
private RecyclerView recyclerView;
private BookAdapter bookAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookList = new ArrayList<Book>();
        recyclerView = findViewById(R.id.bookRecyclearView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        bookAdapter = new BookAdapter(bookList, this);
        recyclerView.setAdapter(bookAdapter);
        //খোয়াবনামা

        bookList.add(new Book("পুতুল নাচের ইতিকথা", "মানিক বন্দ্যোপাধ্যায়", R.drawable.putul));
        bookList.add(new Book("খোয়াবনামা ", "আখতারুজ্জামান ইলিয়াস", R.drawable.khb));
        bookList.add(new Book("গল্পগুচ্ছ", "রবীন্দ্রনাথ ঠাকুর", R.drawable.golpo));
        bookList.add(new Book("দেয়াল", "হুমায়ূন আহমেদ", R.drawable.deyal));

        bookList.add(new Book("বরফ গলা নদী", "জহির রায়হান", R.drawable.borof));

        bookList.add(new Book("মা", "আনিসুল হক", R.drawable.ma));

        bookAdapter.notifyDataSetChanged();
    }
}
