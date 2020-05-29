package com.aminmin.destini;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class    MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView =(TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
//                } else if (mStoryIndex == 2){
//                    mStoryTextView.setText(R.string.T3_Story);
//                    mButtonTop.setText(R.string.T3_Ans1);
//                    mButtonBottom.setText(R.string.T3_Ans2);
//                    mStoryIndex = 3;
                } else {
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility((View.GONE));
                    mButtonBottom.setVisibility((View.GONE));
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(mStoryIndex == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if(mStoryIndex == 2){
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility((View.GONE));
                    mButtonBottom.setVisibility((View.GONE));
                } else {
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility((View.GONE));
                    mButtonBottom.setVisibility((View.GONE));
                }
            }
        });

    }
}

