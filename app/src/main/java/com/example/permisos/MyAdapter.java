package com.example.permisos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<DataInfo> list;
    public MyAdapter(Context context, ArrayList<DataInfo> list){
        this.context = context;
        this.list = list;
    }
    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater inflate = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflate.inflate(R.layout.item, null);
        }

        ImageView imagen = convertView.findViewById(R.id.imagen);
        TextView nombre =convertView.findViewById(R.id.nombre);
        TextView descripcion = convertView.findViewById(R.id.descripcion);
        final TextView cantidad = convertView.findViewById(R.id.cantidad);

        imagen.setImageResource(this.list.get(position).getImagen());
        nombre.setText(this.list.get(position).getNombre());
        descripcion.setText(this.list.get(position).getDescripcion());
        cantidad.setText(String.valueOf(this.list.get(position).getCantidad()));

        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int conta = (MyAdapter.this.list.get(position).getCantidad());
                if (conta < 10){
                    MyAdapter.this.list.get(position).setCantidad((conta+1));
                    cantidad.setText(String.valueOf(MyAdapter.this.list.get(position).getCantidad()));
                }
                else {
                    Toast.makeText(context, "Cantidad limite 10", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return convertView;
    }
}
