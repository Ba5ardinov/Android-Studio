package flora.yakutia.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick (View v) {
        EditText element1 = (EditText) findViewById(R.id.Num1) ;
        EditText element2 = (EditText) findViewById(R.id.Num2) ;
        TextView resText = (TextView) findViewById(R.id.Result) ;
        int num1 = Integer.parseInt(element1.getText().toString()) ;
        int num2 = Integer.parseInt(element2.getText().toString()) ;
        int resSum = num1 + num2 ;
        resText.setText(Integer.toString(resSum));

    }
}
