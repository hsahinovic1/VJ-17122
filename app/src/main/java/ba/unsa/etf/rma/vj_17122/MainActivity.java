package ba.unsa.etf.rma.vj_17122;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button button ;
    private ListView lista;
    private ArrayList<String> entries;
    private EditText editText ;
    private ArrayAdapter<String> adapter;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button2);
        lista = findViewById(R.id.lista);
        entries=new ArrayList<String>();
        editText = findViewById(R.id.editText);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, entries);
        this.lista.setAdapter(adapter);
        this.button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                entries.add(0,editText.getText().toString());
                adapter.notifyDataSetChanged();
                editText.setText("");
            }

        });
    }
}
