package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    int quantity = 0;
    int price = 5;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void increaseQuantity(View view) {
        quantity = quantity+1;
        display(quantity);
    }

    public void decreaseQuantity(View view) {
        quantity = quantity-1;
        display(quantity);
    }

    public void submitOrder(View view) {

        displayPrice(price*quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.price_text_view);
        quantityTextView.setText("$" + number);
    }
}