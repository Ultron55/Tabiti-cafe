package com.example.tabiticafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public ViewGroup.LayoutParams[] lp = new LinearLayout.LayoutParams[3];
    public LinearLayout[] ll = new LinearLayout[3];
    public boolean[] llb = new boolean[3];
    public LinearLayout Mmi;
    public FrameLayout[] fl = new FrameLayout[4];
    public LinearLayout Menuframe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Menuframe = (LinearLayout) findViewById(R.id.Menu);
        Mmi = (LinearLayout) findViewById(R.id.Fmi);
        for (int i = 0; i < llb.length; i++)
        {
            llb[i] = false;
        }
        ll[0] = (LinearLayout) findViewById(R.id.fitmenu);
        ll[1] = (LinearLayout) findViewById(R.id.cofelist);
        ll[2] = (LinearLayout) findViewById(R.id.drinklist);
        for (int i = 0; i < ll.length; i++)
        {
            lp[i] = ll[i].getLayoutParams();
        }
        for (int i = 0; i < ll.length; i++)
        {
            ll[i].setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        }
        fl[0] = (FrameLayout) findViewById(R.id.HomeFrame);
        fl[1] = (FrameLayout) findViewById(R.id.MainMenuFrame);
        fl[2] = (FrameLayout) findViewById(R.id.FitnesMenuFrame);
        fl[3] = (FrameLayout) findViewById(R.id.ContactFrame);
    }

    public void burgerClick(View view)
    {

        if (Menuframe.getVisibility() == View.VISIBLE)
        {
            Menuframe.setVisibility(View.INVISIBLE);
        }
        else
        {
            Menuframe.setVisibility(View.VISIBLE);
        }
    }

    public void razdelclick(View view)
    {
        int index;
        index = Mmi.indexOfChild(view) / 2;
        if (llb[index])
        {
            ll[index].setLayoutParams(new LinearLayout.LayoutParams(0, 0));
            llb[index] = false;
        }
        else
        {
            ll[index].setLayoutParams(lp[index]);
            llb[index] = true;
        }
    }

    public void MenuChoiceClick(View view)
    {
        int index = Menuframe.indexOfChild(view);
        for (int i = 0; i < fl.length; i++)
        {
            if (i == index)
            {
                fl[i].setVisibility(View.VISIBLE);
            }
            else
            {
                fl[i].setVisibility(View.INVISIBLE);
            }
        }
        Menuframe.setVisibility(View.INVISIBLE);
    }

    public void btnMainclick(View view)
    {
        int index = 1;
        for (int i = 0; i < fl.length; i++)
        {
            if (i == index)
            {
                fl[i].setVisibility(View.VISIBLE);
            }
            else
            {
                fl[i].setVisibility(View.INVISIBLE);
            }
        }
    }

    public void btnFitclick(View view)
    {
        int index = 2;
        for (int i = 0; i < fl.length; i++)
        {
            if (i == index)
            {
                fl[i].setVisibility(View.VISIBLE);
            }
            else
            {
                fl[i].setVisibility(View.INVISIBLE);
            }
        }
    }


}