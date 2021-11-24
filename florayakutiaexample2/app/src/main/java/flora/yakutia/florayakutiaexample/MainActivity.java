package flora.yakutia.florayakutiaexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView plList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plList = findViewById(R.id.txt_greetings);
        String [] names = {"Java" , "Python", "Ruby", "JavaScript", "Matlab", "C", "C++", "Swift", "Objective", "Haskell", "Lisp", "Rust", "asdf"};
        plList.setText("");
        for (String name : names)
        {
            plList.append(name + "\n");
        }
    }
}
