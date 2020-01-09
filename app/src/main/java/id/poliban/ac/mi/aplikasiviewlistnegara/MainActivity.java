package id.poliban.ac.mi.aplikasiviewlistnegara;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import  android.view.Menu;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String[] countryList = {"Indonesia", "Malaysia", "Singapore", "Italia", "Inggris"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.listviewnegara, R.id.textView
                , countryList);
        simpleList.setAdapter(arrayAdapter);

    }
}
