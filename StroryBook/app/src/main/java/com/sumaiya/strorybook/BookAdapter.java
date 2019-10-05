package com.sumaiya.strorybook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {
   private List<Book> list;
    private Context context;

    public BookAdapter(List<Book> list) {
        this.list = list;
    }

    public BookAdapter(List<Book> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_design,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Book book = list.get(position);
        holder.nameTV.setText(book.getName());
        holder.authorTV.setText(book.getAuthor());
        holder.nameIV.setImageResource(book.getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BookView.class);
                intent.putExtra("name", book.getName());
                intent.putExtra("author", book.getAuthor());
                intent.putExtra("image", String.valueOf(book.getImage()));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView nameIV;
        TextView nameTV, authorTV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTV = itemView.findViewById(R.id.nameTV);
            authorTV = itemView.findViewById(R.id.authorTV);
            nameIV = itemView.findViewById(R.id.nameIV);
        }
    }
}
