package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button topButton;
    Button bottomBottom;
    TextView Text;
    int storyIndex = 1;
    // TODO: Steps 4 & 8 - Declare member variables here:


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topButton = (Button) findViewById(R.id.buttonTop);
        bottomBottom = (Button) findViewById(R.id.buttonBottom);
        Text = (TextView) findViewById(R.id.storyTextView);


        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (storyIndex == 1) {
                    Text.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    topButton.setText(R.string.T3_Ans2);
                    storyIndex = 3;
                }else if (storyIndex == 3){
                    Text.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    bottomBottom.setVisibility(View.GONE);
                } else if (storyIndex == 2 ){
                    Text.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    topButton.setText(R.string.T3_Ans2);
                    storyIndex = 3;
                }
            }
        });

        bottomBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(storyIndex == 1) {
                    Text.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    topButton.setText(R.string.T2_Ans2);
                    storyIndex = 2;
                }else if (storyIndex == 2){
                    Text.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    bottomBottom.setVisibility(View.GONE);
                } else if (storyIndex == 3){
                    Text.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    bottomBottom.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
