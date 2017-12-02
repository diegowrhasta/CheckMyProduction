package com.example.diego.checkmyproduction;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Proceso> nodes = new ArrayList<Proceso>();
    double matrix[][];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view)
    {
        Intent i=new Intent(this,Main2Activity.class);
        startActivity(i);
        finish();
    }
    /*public void recorridoida()
    {
        try {
            int s=0;
            for(int i=0;i<nodes.size();i++)
            {
                for(int j=0;j<nodes.size();j++)
                {
                    if(matrix[i][j]!=0) {
                        s = nodes.get(i).getStart() + matrix[i][j];
                        if(s>nodes.get(j).getStart()) {
                            nodes.get(j).setStart(s);
                        }
                    }
                }
            }
            for(Nodo ver:nodes)
            {
                Log.e("Starts",""+ver.getStart()+" Nodo "+ver.getId()+"\n");
            }
        }
        catch(Exception e)
        {
            Toast.makeText(MainActivity.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void recorridovuelta()
    {
        try {
            ArrayList<Integer> finales=new ArrayList<Integer>();
            int s=0;
            int flag=0;
            for(int i=0;i<nodes.size();i++) //Ahora analiza la matriz para encontrar principios, los principios son los que tienen columna donde tod es 0
            {
                flag = 0;
                for (int j = 0; j < nodes.size(); j++) {
                    if (matrix[i][j] != 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) //Si encuentra una columna con 0 encuentra un nodo de principio y recupera ese nodo (EL id para luego comparar)
                {
                    Log.e("Final", "" + i);
                    finales.add(i);
                    nodes.get(i).setFeed(nodes.get(i).getStart());
                }
            }
            for(int i=nodes.size()-1;i>=0;i--)
            {
                for(int j=nodes.size()-1;j>=0;j--)
                {
                    if(matrix[i][j]!=0) {
                        s = nodes.get(j).getFeed() - matrix[i][j];
                        if(s<nodes.get(i).getFeed()) {
                            nodes.get(i).setFeed(s);
                        }
                    }
                }
            }
            for(Nodo ver:nodes)
            {
                Log.e("Feeds",""+ver.getFeed()+" Nodo "+ver.getId()+"\n");
            }
        }
        catch(Exception e)
        {
            Toast.makeText(MainActivity.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void holguras()
    {
        try {
            int s=0;
            int flag=0;
            for(int i=nodes.size()-1;i>=0;i--)
            {
                for(int j=nodes.size()-1;j>=0;j--)
                {
                    if(matrix[i][j]!=0) {
                        s = nodes.get(j).getFeed() - nodes.get(i).getStart() - matrix[i][j];
                        String cad="";
                        cad=cad+i+j;
                        int comp=Integer.parseInt(cad);
                        if(s<0)
                        {
                            s=0;
                        }
                        for(Arista aux:edgesD)
                        {
                            if(aux.getId()==comp)
                            {
                                aux.setHolgura(s);
                            }
                        }
                    }
                }
            }
            for(Arista aux:edgesD)
            {
                Log.e("Holguras: ",""+aux.getHolgura());
            }
            for(Nodo ver:nodes)
            {
                Log.e("Feeds",""+ver.getFeed()+" Nodo "+ver.getId()+"\n");
            }
        }
        catch(Exception e)
        {
            Toast.makeText(MainActivity.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }*/
}
