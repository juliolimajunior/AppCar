package sp.senac.br.appcartao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBarMenuApp);
        setSupportActionBar(toolbar);

        //Itens Menu

        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(MainActivity.this, MusicaActivity.class));
        finish();
        return;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mMusica:
                Intent intent = new Intent(MainActivity.this, MusicaActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Musica",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mMoeda:
                Intent intent1 = new Intent(MainActivity.this, MusicaActivity.class);
                startActivity(intent1);
                Toast.makeText(getApplicationContext(), "Moeda",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mMercado:
                Intent intent2 = new Intent(MainActivity.this, MusicaActivity.class);
                startActivity(intent2);
                Toast.makeText(getApplicationContext(), "Mercado",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mTempo:
                Intent intent3 = new Intent(MainActivity.this, MusicaActivity.class);
                startActivity(intent3);
                Toast.makeText(getApplicationContext(), "Tempo",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mNoticia:
                Intent intent4 = new Intent(MainActivity.this, MusicaActivity.class);
                startActivity(intent4);
                Toast.makeText(getApplicationContext(), "Noticia",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mCartao:
                Intent intent5 = new Intent(MainActivity.this, MusicaActivity.class);
                startActivity(intent5);
                Toast.makeText(getApplicationContext(), "Musica",
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.mPaises:
                Intent intent6 = new Intent(MainActivity.this, MusicaActivity.class);
                startActivity(intent6);
                Toast.makeText(getApplicationContext(), "Musica",
                        Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);

    }
}
