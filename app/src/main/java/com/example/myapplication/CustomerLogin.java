package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomerLogin extends AppCompatActivity {

    SearchView containersearchView;
    ListView containerSearchListView;
    ArrayList<String> containersearchlist;
    ArrayAdapter<String > searchadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);



        containersearchView = (SearchView) findViewById(R.id.containersearchView);
        containerSearchListView = (ListView) findViewById(R.id.containerSearchList);
        //Add Item to the Arraylist
        containersearchlist = new ArrayList<>();
        containersearchlist.add("Pulao");
        containersearchlist.add("Vada Pav");
        containersearchlist.add("Noodles");
        containersearchlist.add("Fried Rice");
        containersearchlist.add("Ladoo");

        searchadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,containersearchlist);
        containerSearchListView.setAdapter(searchadapter);
        containersearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(containersearchlist.contains(query)){
                    searchadapter.getFilter().filter(query);
                }else{
                    Toast.makeText(CustomerLogin.this, "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                searchadapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
