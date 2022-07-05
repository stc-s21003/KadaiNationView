package jp.suntech.s21003.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView Countries =findViewById(R.id.Countries);

        Countries.setOnItemClickListener(new ListItemClickListener());
        //
    }

    public class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           String item=(String) parent.getItemAtPosition(position);
           TextView output = findViewById(R.id.tv_top);
           output.setText(item);

         }
    }
}