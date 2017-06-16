package com.example.raj.spinnerhomework;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String[] names={"Select image","Lion","Tiger","Elephant","Zeebra","Rabbit"};
    int[] index={R.drawable.lion,R.drawable.tiger,R.drawable.elephant,R.drawable.zeebra,R.drawable.rabbit};
    Spinner spn;
    ImageView iv;
    RatingBar rb;
    TextView tv;
    float[] res=new float[]{1f,2f,3f,4f,5f,6f};
    int i=0;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn=(Spinner)findViewById(R.id.spn);
        iv=(ImageView)findViewById(R.id.iv);
        rb=(RatingBar)findViewById(R.id.rb);
        b=(Button)findViewById(R.id.save);
        b.setOnClickListener(this);

        tv=(TextView)findViewById(R.id.tv);
        ArrayAdapter aa=new ArrayAdapter(this,R.layout.mylayout,names);
        spn.setAdapter(aa);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                i=position;
             if(position!=0)
             {
                 tv.setText(names[position]);
                 iv.setImageResource(index[position-1]);
                rb.setRating(res[i]);


             }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        //Toast.makeText(getApplicationContext(),"Select Item",Toast.LENGTH_SHORT).show();
       if(i==0)
        {
            Toast.makeText(this,"Select Item",Toast.LENGTH_SHORT).show();
        }
     else if(i==1)
     {
        res[i]=rb.getRating();
         Toast.makeText(this,"Rating saved",Toast.LENGTH_SHORT).show();
     }
        else if (i==2)
     {

        res[i]=rb.getRating();
         Toast.makeText(this,"Rating saved",Toast.LENGTH_SHORT).show();
     }
     else if (i==3)
     {

        res[i]=rb.getRating();
         Toast.makeText(this,"Rating saved",Toast.LENGTH_SHORT).show();
     }
     else if (i==4)
     {

         res[i]=rb.getRating();
         Toast.makeText(this,"Rating saved",Toast.LENGTH_SHORT).show();
     }
     else if (i==5)
     {

         res[i]=rb.getRating();
         Toast.makeText(this,"Rating saved",Toast.LENGTH_SHORT).show();
     }
    }
}
