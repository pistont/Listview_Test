package com.fubic.naingthu92.listview_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listV;
    private String[] ary;
    private CustomListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        listV = (ListView)findViewById(R.id.listview);
        ary = getResources().getStringArray(R.array.subject);
        listV.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ary));
        listV.setOnItemClickListener(new test());
        adapter = new CustomListAdapter(getApplicationContext(),ary);
        listV.setAdapter(adapter);
    }
    private class test implements android.widget.AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(getApplicationContext(),"github の　っっｈテスト"+ary[position],Toast.LENGTH_SHORT).show();
        }
    }
}
