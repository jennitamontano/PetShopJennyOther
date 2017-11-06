package mx.jennifermontano.otropetshopjenny;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button img_star;
    ActionBar actionBar;
    ArrayList<Pets> pets;
    private RecyclerView petList;
    public PetsAdapter petadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        ActionBar actionBar = getSupportActionBar();//
        actionBar.show();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img_star = (Button) findViewById(R.id.petShopProjectStar);
        img_star.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FavoritePets.class);
                startActivity(intent);
            }
        });

        petList = (RecyclerView) findViewById(R.id.rvPets);
        //Forma cómo se mostrará el RecyclerView:
        LinearLayoutManager linlama= new LinearLayoutManager(this);
        linlama .setOrientation(LinearLayoutManager.VERTICAL);
        petList.setLayoutManager(linlama);
        beginPetList();
        beginAdapter();
    }
    public void beginAdapter(){
        PetsAdapter petadapter = new PetsAdapter(pets,this);
        petList.setAdapter(petadapter);
    }
    public void beginPetList(){
        pets = new ArrayList<Pets>();
        //Se crea lista de mascotas:
        pets.add(new Pets(R.drawable.perro,"Doki","4"));
        pets.add(new Pets(R.drawable.perro2,"Tuxie","6"));
        pets.add(new Pets(R.drawable.perro3,"Príncipe","3"));
        pets.add(new Pets(R.drawable.perro4,"Lucky","3"));
        pets.add(new Pets(R.drawable.perro5,"Chiquis","9"));
        pets.add(new Pets(R.drawable.perro6,"Kiwi","10"));
        pets.add(new Pets(R.drawable.perro7,"Ronny","4"));
        pets.add(new Pets(R.drawable.perro8,"Shoko","12"));
        pets.add(new Pets(R.drawable.perro9,"Scottie","3"));
        pets.add(new Pets(R.drawable.perro10,"Kiara","15"));
    }

}
