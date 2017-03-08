package com.example.voongjame.guessinggame;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "MyPrefsFile";
    Random rand = new Random();
    String page;

    //fields for higher or lower
    int targetNum;
    EditText guess;
    TextView highLow;
    TextView prev;

    //fields for colour game
    TextView display;
    EditText red;
    EditText blue;
    EditText green;
    TextView redPrev;
    TextView redResp;
    TextView bluePrev;
    TextView blueResp;
    TextView greenPrev;
    TextView greenResp;
    TextView guessCol;
    int redRand, blueRand, greenRand;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        page = "main";

        if (savedInstanceState != null) {
//            String state = savedInstanceState.getString("page");
//            if (state.equals("main")) {
//                setContentView(R.layout.activity_main);
//            }
//            if (state.equals("number")) {
//                setContentView(R.layout.numbergamelayout);
//            }
//            if (state.equals("colour")) {
//                setContentView(R.layout.colourgamelayout);
//            }
        }

        Button btn2 = (Button) findViewById(R.id.numbtn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.numbergamelayout);
                page = "number";
                guess = (EditText) findViewById(R.id.guessBox);
                highLow = (TextView) findViewById(R.id.highLow);
                prev = (TextView) findViewById(R.id.prev);
                higherOrLower();
                //getting values for number game
//                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
//                if (savedInstanceState != null) {
//                    targetNum = savedInstanceState.getInt("targetNum");
//                    guess.setText(savedInstanceState.getString("guess"));
//                }
//                targetNum = settings.getInt("targetNum", 50);
//                guess.setText(settings.getString("guess", ""));
//                highLow.setText(settings.getString("highLow", ""));
//                prev.setText(settings.getString("prev", ""));


            }
        });

        Button btn = (Button) findViewById(R.id.colorbtn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setContentView(R.layout.colourgamelayout);
                page = "colour";
                display = (TextView) findViewById(R.id.display);
                red = (EditText) findViewById(R.id.red);
                blue = (EditText) findViewById(R.id.blue);
                green = (EditText) findViewById(R.id.green);
                redPrev = (TextView) findViewById(R.id.redPrev);
                redResp = (TextView) findViewById(R.id.redResp);
                bluePrev = (TextView) findViewById(R.id.bluePrev);
                blueResp = (TextView) findViewById(R.id.blueResp);
                greenPrev = (TextView) findViewById(R.id.greenPrev);
                greenResp = (TextView) findViewById(R.id.greenResp);
                guessCol = (TextView) findViewById(R.id.guessCol);
                colourGame();
//                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                //getting values for colour game
//                display.setText(settings.getString("display", ""));
//                redPrev.setText(settings.getString("redPrev", ""));
//                redResp.setText(settings.getString("redResp", ""));
//                bluePrev.setText(settings.getString("bluePrev", ""));
//                blueResp.setText(settings.getString("blueResp", ""));
//                greenPrev.setText(settings.getString("greenPrev", ""));
//                greenResp.setText(settings.getString("greenResp", ""));
//                guessCol.setText(settings.getString("display", ""));
//                red.setText(settings.getString("red", ""));
//                blue.setText(settings.getString("blue", ""));
//                green.setText(settings.getString("green", ""));
//                redRand = settings.getInt("redRand", 0);
//                blueRand = settings.getInt("blueRand", 0);
//                greenRand = settings.getInt("greenRand", 0);

            }
        });
    }

    @Override
    public void onBackPressed() {
        setContentView(R.layout.activity_main);
        page = "main";

        Button btn2 = (Button) findViewById(R.id.numbtn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.numbergamelayout);
                page = "number";
                guess = (EditText) findViewById(R.id.guessBox);
                highLow = (TextView) findViewById(R.id.highLow);
                prev = (TextView) findViewById(R.id.prev);
                higherOrLower();
                //getting values for number game
//                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
//                targetNum = settings.getInt("targetNum", 50);
//                guess.setText(settings.getString("guess", ""));
//                highLow.setText(settings.getString("highLow", ""));
//                prev.setText(settings.getString("prev", ""));


            }
        });
        Button btn = (Button) findViewById(R.id.colorbtn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setContentView(R.layout.colourgamelayout);
                page = "colour";
                display = (TextView) findViewById(R.id.display);
                red = (EditText) findViewById(R.id.red);
                blue = (EditText) findViewById(R.id.blue);
                green = (EditText) findViewById(R.id.green);
                redPrev = (TextView) findViewById(R.id.redPrev);
                redResp = (TextView) findViewById(R.id.redResp);
                bluePrev = (TextView) findViewById(R.id.bluePrev);
                blueResp = (TextView) findViewById(R.id.blueResp);
                greenPrev = (TextView) findViewById(R.id.greenPrev);
                greenResp = (TextView) findViewById(R.id.greenResp);
                guessCol = (TextView) findViewById(R.id.guessCol);
                colourGame();
//                SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
                //getting values for colour game
//                display.setText(settings.getString("display", ""));
//                redPrev.setText(settings.getString("redPrev", ""));
//                redResp.setText(settings.getString("redResp", ""));
//                bluePrev.setText(settings.getString("bluePrev", ""));
//                blueResp.setText(settings.getString("blueResp", ""));
//                greenPrev.setText(settings.getString("greenPrev", ""));
//                greenResp.setText(settings.getString("greenResp", ""));
//                guessCol.setText(settings.getString("display", ""));
//                red.setText(settings.getString("red", ""));
//                blue.setText(settings.getString("blue", ""));
//                green.setText(settings.getString("green", ""));
//                redRand = settings.getInt("redRand", 0);
//                blueRand = settings.getInt("blueRand", 0);
//                greenRand = settings.getInt("greenRand", 0);

            }
        });
    }

    public void higherOrLower() {
        final Button submit = (Button) findViewById(R.id.submitCol);
        int guessCount = 0;
        targetNum = rand.nextInt(100);
        if (submit.getText().toString().equals("SUBMIT")) {
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        int currentGuess = Integer.parseInt(guess.getText().toString());
                    } catch (Exception e) {
                        return;
                    }
                    int currentGuess = Integer.parseInt(guess.getText().toString());
                    if (currentGuess == targetNum) {
                        highLow.setText("Congratulations, you've won!");
                        submit.setText("NEW GAME");
                        higherOrLower();
                    } else if (currentGuess > targetNum) {
                        highLow.setText("Target number is lower");
                        prev.setText("Previous guess: " + currentGuess);
                    } else if (currentGuess < targetNum) {
                        highLow.setText("Target number is higher");
                        prev.setText("Previous guess: " + currentGuess);
                    }
                }
            });
        }
        if (submit.getText().toString().equals("NEW GAME")) {
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    submit.setText("SUBMIT");
                    highLow.setText("");
                    prev.setText("");
                    guess.setText("");
                    higherOrLower();
                }
            });
        }
    }

    public void colourGame() {
        redRand = rand.nextInt(255);
        blueRand = rand.nextInt(255);
        greenRand = rand.nextInt(255);
        final Button submitCol = (Button) findViewById(R.id.submitCol);

        TextView targetCol = (TextView) findViewById(R.id.targetCol);
        targetCol.setBackgroundColor(Color.rgb(redRand, greenRand, blueRand));

        if (submitCol.getText().toString().equals("SUBMIT")) {
            submitCol.setOnClickListener(new View.OnClickListener() {
                int redVal, blueVal, greenVal;
                int guesses = 15;


                @Override
                public void onClick(View v) {
                    try {
                        redVal = Integer.parseInt(red.getText().toString());
                        blueVal = Integer.parseInt(blue.getText().toString());
                        greenVal = Integer.parseInt(green.getText().toString());
                    } catch (Exception e) {
                        return;
                    }
                    redVal = Integer.parseInt(red.getText().toString());
                    blueVal = Integer.parseInt(blue.getText().toString());
                    greenVal = Integer.parseInt(green.getText().toString());
                    if (redVal == redRand) {
                        redResp.setText("Correct!");
                    } else if (redVal > redRand) {
                        redResp.setText("Go lower");
                        redPrev.setText("Previous guess " + redVal);
                    } else if (redVal < redRand) {
                        redResp.setText("Go higher");
                        redPrev.setText("Previous guess " + redVal);
                    }
                    if (blueVal == blueRand) {
                        blueResp.setText("Correct!");
                    } else if (blueVal > blueRand) {
                        blueResp.setText("Go lower");
                        bluePrev.setText("Previous guess " + blueVal);
                    } else if (blueVal < blueRand) {
                        blueResp.setText("Go higher");
                        bluePrev.setText("Previous guess " + blueVal);
                    }
                    if (greenVal == greenRand) {
                        greenResp.setText("Correct!");
                    } else if (greenVal > greenRand) {
                        greenResp.setText("Go lower");
                        greenPrev.setText("Previous guess " + greenVal);
                    } else if (greenVal < greenRand) {
                        greenResp.setText("Go higher");
                        greenPrev.setText("Previous guess " + greenVal);
                    }
                    guesses--;
                    guessCol.setBackgroundColor(Color.rgb(redVal, greenVal, blueVal));
                    guessCol.setText("Your colour");
                    display.setText("Number of guesses left: " + guesses);
                    if (redVal == redRand && blueVal == blueRand && greenVal == greenRand) {
                        int guessUsed = 15 - guesses;
                        display.setText("Congratulations! You won in " + guessUsed + " guesses!");
                        submitCol.setText("NEW GAME");
                        colourGame();
                    } else if (guesses <= 0) {
                        display.setText("You've run out of guesses and have lost this game!");
                        submitCol.setText("NEW GAME");
                        colourGame();
                    }

                }
            });
        }
        if (submitCol.getText().toString().equals("NEW GAME")) {
            submitCol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    guessCol.setBackgroundColor(Color.TRANSPARENT);
                    guessCol.setText("");
                    redPrev.setText("");
                    bluePrev.setText("");
                    greenPrev.setText("");
                    redResp.setText("");
                    blueResp.setText("");
                    greenResp.setText("");
                    red.setText("");
                    blue.setText("");
                    green.setText("");
                    display.setText("New game started! Have fun!");
                    submitCol.setText("SUBMIT");
                    colourGame();
                }
            });
        }
    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
//        SharedPreferences.Editor editor = settings.edit();
//
//        //Saving values for the highLow game
//        editor.putInt("targetNum", targetNum);
//        editor.putString("guess", guess.getText().toString());
//        editor.putString("highLow", highLow.getText().toString());
//        editor.putString("prev", prev.getText().toString());
//
//        //Saving values for the colour game
//        editor.putString("display", display.getText().toString());
//        editor.putString("redPrev", redPrev.getText().toString());
//        editor.putString("redResp", redResp.getText().toString());
//        editor.putString("bluePrev", bluePrev.getText().toString());
//        editor.putString("blueResp", blueResp.getText().toString());
//        editor.putString("greenPrev", greenPrev.getText().toString());
//        editor.putString("greenResp", greenResp.getText().toString());
//        editor.putString("guessCol", guessCol.getText().toString());
//        editor.putString("red", red.getText().toString());
//        editor.putString("blue", blue.getText().toString());
//        editor.putString("green", green.getText().toString());
//        editor.putInt("redRand", redRand);
//        editor.putInt("blueRand", blueRand);
//        editor.putInt("greenRand", greenRand);
//
//
//        editor.commit();
//
//    }

//    @Override
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//        savedInstanceState.putString("page", page);
//        super.onSaveInstanceState(savedInstanceState);
//        //Saving values for the highLow game
//        savedInstanceState.putInt("targetNum", targetNum);
//        savedInstanceState.putString("guess", guess.getText().toString());
//        savedInstanceState.putString("highLow", highLow.getText().toString());
//        savedInstanceState.putString("prev", prev.getText().toString());
//
//        //Saving values for the colour game
//        savedInstanceState.putString("display", display.getText().toString());
//        savedInstanceState.putString("redPrev", redPrev.getText().toString());
//        savedInstanceState.putString("redResp", redResp.getText().toString());
//        savedInstanceState.putString("bluePrev", bluePrev.getText().toString());
//        savedInstanceState.putString("blueResp", blueResp.getText().toString());
//        savedInstanceState.putString("greenPrev", greenPrev.getText().toString());
//        savedInstanceState.putString("greenResp", greenResp.getText().toString());
//        savedInstanceState.putString("guessCol", guessCol.getText().toString());
//        savedInstanceState.putString("red", red.getText().toString());
//        savedInstanceState.putString("blue", blue.getText().toString());
//        savedInstanceState.putString("green", green.getText().toString());
//        savedInstanceState.putInt("redRand", redRand);
//        savedInstanceState.putInt("blueRand", blueRand);
//        savedInstanceState.putInt("greenRand", greenRand);
//    }

//    @Override
//    public void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//        String state = savedInstanceState.getString("page");
//        if (state.equals("main")) {
//            setContentView(R.layout.activity_main);
//        }
//        if (state.equals("number")) {
//            setContentView(R.layout.numbergamelayout);
//        }
//        if (state.equals("colour")) {
//            setContentView(R.layout.colourgamelayout);
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            setContentView(R.layout.settings);
        }

        return super.onOptionsItemSelected(item);
    }
}
