package com.gnirt69.customlistviewadapterexam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView list;
    private listAdapter adapter;
    private List<contact> mycontact;

    // To store values in a String of names and number in String phone
    String[] name;
    String[] phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listview);

        mycontact = new ArrayList<>();

        name = getResources().getStringArray(R.array.Name);
        phone = getResources().getStringArray(R.array.Phone);


        for (int i = 0; i < name.length; i++) {
            mycontact.add(new contact((i + 1), name[i],phone[i], getFirstLetter(name[i])));
        }


        adapter = new listAdapter(getApplicationContext(), mycontact);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this, contact_detail.class);
                i.putExtra("Name",name[position]);
                i.putExtra("Number",phone[position]);
                i.putExtra("nickname",mycontact.get(position).getNickname());
                startActivity(i);
            }

        });
    }

    public String getFirstLetter(String name) {
        String[] myName = name.split(" ");
        String s = "";
        for (int i = 0; i < myName.length; i++) {
            s += String.valueOf((myName[i]).charAt(0));
        }
        return s;
    }
}