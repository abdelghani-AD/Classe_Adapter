package com.example.interface_graphiquep1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //activity 1
//        EditText nom = findViewById(R.id.nom);
//        EditText age = findViewById(R.id.age);
//        EditText mail = findViewById(R.id.email);
//        Button btn = findViewById(R.id.btnClick);
//        GridView liste = findViewById(R.id.Liste);
//        ArrayList<String> countries = new ArrayList<>();
//        ClassAdapter adapter = new ClassAdapter(countries,this);
//        btn.setOnClickListener((View)->{
//            String n = nom.getText().toString();
//            String a = age.getText().toString();
//            String e = mail.getText().toString();
//            if (n != null && a != null && e != null){
//                countries.add("Name : "+ n + "\n L'age : " + a +" ans" + "\n Email : "+  e);
//                adapter.notifyDataSetChanged();
//            }
//            liste.setAdapter(adapter);
//        });


//        btn.setOnClickListener((View)->{
//            String text = entry.getText().toString();
//
//            if (text != null) {
//                ArrayAdapter<String> data = (ArrayAdapter<String>) liste.getAdapter();
//                if (data == null) {
//                    data = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1);
//                    liste.setAdapter(data);
//                }
//                data.add(text);
//                data.notifyDataSetChanged();
//            }
//        });


//        ArrayList<String> countries = new ArrayList<>();
//        for (int i=0 ; i<3 ; i++){
//            countries.add("Colombie");
//            countries.add("Morocco");
//            countries.add("Pelestin");
//            countries.add("Canada");
//            countries.add("Egypt");
//            countries.add("Qatar");
//        }
//        ClassAdapter adapter = new ClassAdapter(countries,this);
//        liste.setAdapter(adapter);



//        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_single_choice,countries);
//        liste.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
//        liste.setAdapter(adapter);

        //activity 2
        EditText name = findViewById(R.id.name);
        EditText pre = findViewById(R.id.prenom);
        EditText phone = findViewById(R.id.numMobile);
        EditText age = findViewById(R.id.age);
        EditText niveau = findViewById(R.id.niveau);

        RadioGroup sexe = findViewById(R.id.sexe);
        RadioButton f = findViewById(R.id.femme);
        RadioButton m = findViewById(R.id.home);

        ListView histoire = findViewById(R.id.historique);
        Button btn = findViewById(R.id.submit);

        ArrayList<String> list = new ArrayList<>();
        ClassAdapter adapter = new ClassAdapter(list,this);
        btn.setOnClickListener((View)->{
            String n = name.getText().toString();
            String p = pre.getText().toString();
            String ph = phone.getText().toString();
            String a = age.getText().toString();
            String ni = niveau.getText().toString();
            String gender = m.isChecked() ? "homme" : "femme";
            if (n != null && p != null && ph != null && a != null && ni != null){
                list.add("Name : "+n + "\n Prenom : " + p + "\n number phone : " + ph + "\n l'age : " + a +" ans" +
                        "\n Niveau Scolaire : " + ni + "\n sexe : " + gender);
                adapter.notifyDataSetChanged();
            }
            histoire.setAdapter(adapter);
        });
    }
}