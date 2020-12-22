package space.pashkov.denispashkovv19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_1, radioButton_1,radioButton_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_1=(Button)findViewById(R.id.button_1);
        radioButton_1=(Button)findViewById(R.id.radioButton_1);
        radioButton_2=(Button)findViewById(R.id.radioButton_2);
        radioButton_1.setVisibility(View.INVISIBLE);
        radioButton_2.setVisibility(View.INVISIBLE);
    }
    public void button_1Click (View view) {
        radioButton_1.setVisibility(View.VISIBLE);
        radioButton_2.setVisibility(View.VISIBLE);
    }
}