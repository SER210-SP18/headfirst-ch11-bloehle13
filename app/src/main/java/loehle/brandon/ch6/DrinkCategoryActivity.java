package loehle.brandon.ch6;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);
        ListView listDrinks = getListView();
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this, android.R.layout.simple_list_item_1, Drink.drinks);
        listDrinks.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent i = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        i.putExtra(DrinkActivity.EXTRA_DRINKNO, (int)id);
        startActivity(i);
    }
}
