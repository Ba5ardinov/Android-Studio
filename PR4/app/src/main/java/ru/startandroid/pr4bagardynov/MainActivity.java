package ru.startandroid.pr4bagardynov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tvInfo;
    EditText etInput;
    Button bControl;

    int guess;
    boolean gameFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = findViewById(R.id.textview);
        etInput = findViewById(R.id.edittext);
        bControl = findViewById(R.id.button);

        guess = (int) (Math.random() * 100);
        gameFinish = false;
    }

    public void onClick(View view)
    {
        if(!gameFinish)
        {
            String inptxt = etInput.getText().toString();

            if(inptxt.equals(""))
                tvInfo.setText(R.string.error_empty);
            else
            {
                int inp = Integer.parseInt(etInput.getText().toString());

                if((inp > 100) || (inp < 0))
                {
                    tvInfo.setText(R.string.error);
                }
                else
                {
                    if(inp > guess)
                        tvInfo.setText(R.string.behind);

                    if(inp < guess)
                        tvInfo.setText(R.string.ahead);

                    if(inp == guess)
                    {
                        tvInfo.setText(R.string.hit);
                        bControl.setText(R.string.play_more);
                        gameFinish = true;
                    }
                }
            }
        }
        else
        {
            guess = (int) (Math.random() * 100);
            bControl.setText(R.string.input_value);
            tvInfo.setText(R.string.try_to_guess);
            gameFinish = false;
        }

        etInput.setText("");
    }
}