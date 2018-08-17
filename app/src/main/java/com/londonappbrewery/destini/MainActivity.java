package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryText;
    private Button mButtonTop;
    private Button mButtonBottom;
    private int mChapter = 0;


    private CHAPTER[] mStory = new CHAPTER[] {
            new CHAPTER(false, R.string.T1_Story,R.string.T1_Ans1,2,R.string.T1_Ans2,1),
            new CHAPTER(false, R.string.T2_Story,R.string.T2_Ans1,2,R.string.T2_Ans2,3),
            new CHAPTER(false, R.string.T3_Story,R.string.T3_Ans1,5,R.string.T3_Ans2,4),
            new CHAPTER(true, R.string.T4_End,R.string.reset,0,R.string.reset,0),
            new CHAPTER(true, R.string.T5_End,R.string.reset,0,R.string.reset,0),
            new CHAPTER(true, R.string.T6_End,R.string.reset,0,R.string.reset,0)
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = (TextView)findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextChapter(mStory[mChapter].getPath1());
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextChapter(mStory[mChapter].getPath2());
            }
        });

    }

    private void nextChapter(int path){
        mChapter = path;
        mStoryText.setText(mStory[path].getStory());
        if (!mStory[path].isEnding()){
            mButtonTop.setText(mStory[path].getAns1());
            mButtonBottom.setText(mStory[path].getAns2());
        }else{
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        }
    }
}
