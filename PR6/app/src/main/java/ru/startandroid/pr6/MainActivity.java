package ru.startandroid.pr6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button btnFon;
    ConstraintLayout constraintLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFon = findViewById(R.id.idbtn);
        constraintLayout = findViewById(R.id.idconstl);
        context = MainActivity.this;

        btnFon.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        final  CharSequence[] items =  {getText(R.string.red), getText(R.string.yellow), getText(R.string.green)};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);

        builder.setItems(items, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int item)
            {
                switch (item)
                {
                    case 0:
                        constraintLayout.setBackgroundColor(Color.parseColor("#FF0000"));
                        Toast.makeText(context, R.string.red, Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        constraintLayout.setBackgroundColor(Color.parseColor("#FFFF00"));
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        constraintLayout.setBackgroundColor(Color.parseColor("#00FF00"));
                        Toast.makeText(context, R.string.green, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}