package com.example.josimargonzalez.Dafiti_pickup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 *
 */
public class CustomspinnerAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> listaOpciones;
    LayoutInflater inflter;

    public CustomspinnerAdapter(Context applicationContext, ArrayList<String> listaOpciones) {
        super();
        this.context = applicationContext;
        this.listaOpciones = listaOpciones;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listaOpciones.size();
    }

    @Override
    public Object getItem(int i) {
        return listaOpciones.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_item, null);

        TextView names = (TextView) view.findViewById(R.id.txt_opcion);
        names.setText(listaOpciones.get(i));
        return view;
    }
}
