package ru.startandroid.rabotaspolyamiipodskazkivspliv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText pswrd;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }
    public void addListenerOnButton() {
        pswrd = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button) ;
        btn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v) {
                        Toast.makeText(
                                MainActivity.this, pswrd.getText(),
                                Toast.LENGTH_SHORT
                        ).show();

                    }
                }
        );
    }
}
