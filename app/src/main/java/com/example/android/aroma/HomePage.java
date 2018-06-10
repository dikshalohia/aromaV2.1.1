package com.example.android.aroma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class HomePage extends AppCompatActivity {

    Toolbar toolbar;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.commonmenus,menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        if(id==R.id.home)
        {
            Toast.makeText(this, "Home menu is Clicked", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, HomePage.class));
        }
        else if(id==R.id.liked)
        {
            Toast.makeText(this, "Liked Recipes is Clicked", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, HomePage.class));
        }
        else if(id==R.id.upload)
        {
            Toast.makeText(this, "Upload is Clicked", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, HomePage.class));
        }
        else if(id==R.id.account)
        {
            Toast.makeText(this, "My account Clicked", Toast.LENGTH_SHORT).show();
            FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser() ;

            mDatabase = FirebaseDatabase.getInstance().getReference();

            System.out.println("UserId"+currentFirebaseUser.getUid());

            mDatabase.child("Users").child(currentFirebaseUser.getUid()).addListenerForSingleValueEvent(new ValueEventListener()
            {

            @Override

            public void onDataChange(DataSnapshot dataSnapshot) {
                System.out.println("DataSnapShot "+ dataSnapshot.getValue());
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

                System.out.println("Error");

            }
        });

            startActivity(new Intent(this, HomePage.class));
        }
        else if(id==R.id.upload)
        {
            Toast.makeText(this, "Upload Recipe is Clicked", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, HomePage.class));
        }
        return super.onOptionsItemSelected(item);
    }

}
