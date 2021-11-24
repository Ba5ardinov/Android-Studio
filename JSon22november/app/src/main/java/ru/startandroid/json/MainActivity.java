package ru.startandroid.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity
{
    TextView JSonSrcTextView, JSonObjectTextView, JSonResultTextView, JSonMySiteTextView, JSonURLTextView, JsonArrayTextview;

    String json_source;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSonSrcTextView = findViewById(R.id.tv1);
        JSonObjectTextView = findViewById(R.id.tv2);
        JSonResultTextView = findViewById(R.id.tv3);
        JSonMySiteTextView = findViewById(R.id.tv4);
        JSonURLTextView = findViewById(R.id.tv5);
        JsonArrayTextview = findViewById(R.id.tv6);

        json_source = getString(R.string.simple_json);

        JSonSrcTextView.setText(json_source);

        try
        {
            JSONObject jsonObject = new JSONObject(json_source);
            JSONObject result = jsonObject.getJSONObject("result");
            String mySiteName = result.getString("sitename");
            String myUrl = result.getString("url");

            JSonObjectTextView.setText("jsonObject:\n" + jsonObject.toString());
            JSonResultTextView.setText("result:\n" + result.toString());
            JSonMySiteTextView.setText("Имя сайта:\n" + mySiteName);
            JSonURLTextView.setText("Адрес сайта:\n" + myUrl);

            String stringArrayElement = "\n";
            JSONArray jsonArray = result.getJSONArray("array");

            for (int i = 0; i < jsonArray.length(); i++)
            {
                JSONObject arrayElement = jsonArray.getJSONObject(i);
                stringArrayElement += arrayElement.getString("element") + "\n";
            }

            JsonArrayTextview.setText(stringArrayElement);
        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }
    }
}











































































