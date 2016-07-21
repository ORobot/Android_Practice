package com.example.keith.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();

        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void initFruits() {
        Fruit apple = new Fruit("Apple", R.drawable.apple512);
        fruitList.add(apple);
        Fruit apricot = new Fruit("Apricot", R.drawable.apricot512);
        fruitList.add(apricot);
        Fruit banana = new Fruit("Banana", R.drawable.banana512);
        fruitList.add(banana);
        Fruit cherry = new Fruit("Cherry", R.drawable.cherry512);
        fruitList.add(cherry);
        Fruit kiwi = new Fruit("Kiwi", R.drawable.kiwi512);
        fruitList.add(kiwi);
        Fruit lemon = new Fruit("Lemon", R.drawable.lemon512);
        fruitList.add(lemon);
        Fruit mango = new Fruit("Mango", R.drawable.mango512);
        fruitList.add(mango);
        Fruit orange = new Fruit("Orange", R.drawable.orange512);
        fruitList.add(orange);
        Fruit peach = new Fruit("Peach", R.drawable.peach512);
        fruitList.add(peach);
        Fruit pear = new Fruit("Pear", R.drawable.pear512);
        fruitList.add(pear);
        Fruit strawberry = new Fruit("Strawberry", R.drawable.strawberry512);
        fruitList.add(strawberry);
        Fruit tomato = new Fruit("Tomato", R.drawable.tomato512);
        fruitList.add(tomato);
    }
}
