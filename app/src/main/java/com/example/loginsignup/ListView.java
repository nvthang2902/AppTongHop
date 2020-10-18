package com.example.loginsignup;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
//    class MyAdapter extends ArrayAdapter<String> {
//
//            Context context;
//            String rTitle[];
//            String rDescription[];
//            int rImgs[];
//
//            MyAdapter (Context c, String title[], String description[], int imgs[]) {
//                super(c, R.layout.items_listview, R.id.textView1, title);
//                this.context = c;
//                this.rTitle = title;
//                this.rDescription = description;
//                this.rImgs = imgs;
//
//            }
//
//            @NonNull
//            @Override
//            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                View row = layoutInflater.inflate(R.layout.items_listview, parent, false);
//                ImageView images = row.findViewById(R.id.image);
//                TextView myTitle = row.findViewById(R.id.textView1);
//                TextView myDescription = row.findViewById(R.id.textView2);
//
//                // now set our resources on views
//                images.setImageResource(rImgs[position]);
//                myTitle.setText(rTitle[position]);
//                myDescription.setText(rDescription[position]);
//
//
//
//
//                return row;
//            }
//        }
    }
}
