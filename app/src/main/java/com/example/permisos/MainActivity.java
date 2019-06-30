package com.example.permisos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{


    private ArrayList<DataInfo> arrayList;
    private MyAdapter adapter;
    private ListView listView;
    ArrayList<String> nombres=new ArrayList<>();
    ArrayList<String> id=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        loadComponents();
    }

    private void loadComponents() {
        listView = findViewById(R.id.listView);
        arrayList = new ArrayList<>();

        adapter = new MyAdapter(this, arrayList);
        registerForContextMenu(listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = this.getMenuInflater();
        inflate.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.cherries:{
                DataInfo info = new DataInfo();
                info.setImagen(R.drawable.cherries);
                info.setNombre("CEREZA");
                info.setDescripcion("Cereza: fruta  ");
                info.setCantidad(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getNombre().equals("CEREZA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La Fruta Cereza ya se agrego", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.coconut:{
                DataInfo info = new DataInfo();
                info.setImagen(R.drawable.coconut);
                info.setNombre("COCO");
                info.setDescripcion("Coco: fruta");
                info.setCantidad(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getNombre().equals("COCO"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La Fruta Coco ya se agrego", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.grapes:{
                DataInfo info = new DataInfo();
                info.setImagen(R.drawable.grapes);
                info.setNombre("UVA");
                info.setDescripcion("Uva: fruta");
                info.setCantidad(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getNombre().equals("UVA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La Fruta Uva ya se agrego", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.raspberry:{
                DataInfo info = new DataInfo();
                info.setImagen(R.drawable.raspberry);
                info.setNombre("FRAMBUESA");
                info.setDescripcion("Frambuesa: fruta");
                info.setCantidad(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getNombre().equals("FRAMBUESA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La Fruta Frambuesa ya se agrego", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.strawberry:{
                DataInfo info = new DataInfo();
                info.setImagen(R.drawable.strawberry);
                info.setNombre("FRESA");
                info.setDescripcion("Fresa: fruta");
                info.setCantidad(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getNombre().equals("FRESA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La Fruta Fresa ya se agrego", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.orange:{
                DataInfo info = new DataInfo();
                info.setImagen(R.drawable.orange);
                info.setNombre("NARANJA");
                info.setDescripcion("Naranja : fruta");
                info.setCantidad(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getNombre().equals("NARANJA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La Fruta Naranja ya se agrego", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.pineapple:{
                DataInfo info = new DataInfo();
                info.setImagen(R.drawable.pineapple);
                info.setNombre("PIÑA");
                info.setDescripcion("Piña: fruta");
                info.setCantidad(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i ++) {
                    if (arrayList.get(i).getNombre().equals("PIÑA"))
                        cont = 1;
                }
                if (cont == 0){
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La Fruta Piña ya se agrego", Toast.LENGTH_SHORT).show();
                }
                break;
            }
            case R.id.watermelon: {
                DataInfo info = new DataInfo();
                info.setImagen(R.drawable.watermelon);
                info.setNombre("SANDÍA");
                info.setDescripcion("Sandía: fruta");
                info.setCantidad(1);
                int cont = 0;
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).getNombre().equals("SANDÍA"))
                        cont = 1;
                }
                if (cont == 0) {
                    arrayList.add(info);
                } else {
                    Toast.makeText(this, "La Fruta Sandia ya se agrego", Toast.LENGTH_SHORT).show();
                }
                break;
            }
        }
        listView.setAdapter(adapter);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;

        getMenuInflater().inflate(R.menu.item_menu, menu);
        menu.setHeaderTitle(arrayList.get(info.position).getNombre());

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.item_reset: {
                arrayList.get(info.position).setCantidad(0);
                listView.setAdapter(adapter);
                break;
            }
            case R.id.item_delete: {
                arrayList.remove(info.position);
                listView.setAdapter(adapter);
                break;
            }
            default:
                Toast.makeText(this, "Frutas", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }
}
