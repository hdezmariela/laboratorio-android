package com.example.myfirstapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // MediaPlayer Array
    private MediaPlayer soundPlayer [] = new MediaPlayer[8];

    // Resources Array
    private int soundResources [] = {R.raw.landslide, R.raw.windy, R.raw.snow, R.raw.fire, R.raw.forest, R.raw.thunder, R.raw.ocean, R.raw.volcano};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the Media Player objects and assign them
        // sounds from the soundResources Array
        for (int i = 0; i < soundPlayer.length; i++) {
            soundPlayer[i] = MediaPlayer.create(this, soundResources[i]);
        } // end for
    }

    public void buttonClicked(View view) {
        // Init image buttons
        ImageButton btn0 = (ImageButton)findViewById(R.id.imageButtonLandslide);
        ImageButton btn1 = (ImageButton)findViewById(R.id.imageButtonWind);
        ImageButton btn2 = (ImageButton)findViewById(R.id.imageButtonSnow);
        ImageButton btn3 = (ImageButton)findViewById(R.id.imageButtonFire);
        ImageButton btn4 = (ImageButton)findViewById(R.id.imageButtonForest);
        ImageButton btn5 = (ImageButton)findViewById(R.id.imageButtonThunder);
        ImageButton btn6 = (ImageButton)findViewById(R.id.imageButtonOcean);
        ImageButton btn7 = (ImageButton)findViewById(R.id.imageButtonVolcano);

        // Switch Case to listen for buttons
        switch (view.getId()) {
            case R.id.imageButtonLandslide:
                // if sound is playing
                if (soundPlayer[0].isPlaying()) {
                    soundPlayer[0].pause(); // pause sound
                    soundPlayer[0].seekTo(0); // rewind to beginning
                    btn0.setImageResource(R.drawable.landslide);
                } // end if
                else {
                    soundPlayer[0].start();
                    soundPlayer[0].setLooping(true);
                    btn0.setImageResource(R.drawable.landslidep);
                }
                break;

            case R.id.imageButtonWind:
                // if sound is playing
                if (soundPlayer[1].isPlaying()) {
                    soundPlayer[1].pause(); // pause sound
                    soundPlayer[1].seekTo(0); // rewind to beginning
                    btn1.setImageResource(R.drawable.wind);
                } // end if
                else {
                    soundPlayer[1].start();
                    soundPlayer[1].setLooping(true);
                    btn1.setImageResource(R.drawable.windp);
                }
                break;

            case R.id.imageButtonSnow:
                // if sound is playing
                if (soundPlayer[2].isPlaying()) {
                    soundPlayer[2].pause(); // pause sound
                    soundPlayer[2].seekTo(0); // rewind to beginning
                    btn2.setImageResource(R.drawable.snow);
                } // end if
                else {
                    btn2.setImageResource(R.drawable.snowp);
                    soundPlayer[2].start();
                    soundPlayer[2].setLooping(true);
                }
                break;

            case R.id.imageButtonFire:
                // if sound is playing
                if (soundPlayer[3].isPlaying()) {
                    soundPlayer[3].pause(); // pause sound
                    soundPlayer[3].seekTo(0); // rewind to beginning
                    btn3.setImageResource(R.drawable.fire);
                } // end if
                else {
                    soundPlayer[3].start();
                    soundPlayer[3].setLooping(true);
                    btn3.setImageResource(R.drawable.firep);
                }
                break;

            case R.id.imageButtonForest:
                // if sound is playing
                if (soundPlayer[4].isPlaying()) {
                    soundPlayer[4].pause(); // pause sound
                    soundPlayer[4].seekTo(0); // rewind to beginning
                    btn4.setImageResource(R.drawable.forest);
                } // end if
                else {
                    soundPlayer[4].start();
                    soundPlayer[4].setLooping(true);
                    btn4.setImageResource(R.drawable.forestp);
                }
                break;

            case R.id.imageButtonThunder:
                // if sound is playing
                if (soundPlayer[5].isPlaying()) {
                    soundPlayer[5].pause(); // pause sound
                    soundPlayer[5].seekTo(0); // rewind to beginning
                    btn5.setImageResource(R.drawable.thunder);
                } // end if
                else {
                    soundPlayer[5].start();
                    soundPlayer[5].setLooping(true);
                    btn5.setImageResource(R.drawable.thunderp);
                }
                break;

            case R.id.imageButtonOcean:
                // if sound is playing
                if (soundPlayer[6].isPlaying()) {
                    soundPlayer[6].pause(); // pause sound
                    soundPlayer[6].seekTo(0); // rewind to beginning
                    btn6.setImageResource(R.drawable.ocean);
                } // end if
                else {
                    soundPlayer[6].start();
                    soundPlayer[6].setLooping(true);
                    btn6.setImageResource(R.drawable.oceanp);
                }
                break;

            case R.id.imageButtonVolcano:
                // if sound is playing
                if (soundPlayer[7].isPlaying()) {
                    soundPlayer[7].pause(); // pause sound
                    soundPlayer[7].seekTo(0); // rewind to beginning
                    btn7.setImageResource(R.drawable.volcano);
                } // end if
                else {
                    soundPlayer[7].start();
                    soundPlayer[7].setLooping(true);
                    btn7.setImageResource(R.drawable.volcanop);
                }
                break;

            case R.id.button:
                // Return button images to initial images
                btn0.setImageResource(R.drawable.landslide);
                btn1.setImageResource(R.drawable.wind);
                btn2.setImageResource(R.drawable.snow);
                btn3.setImageResource(R.drawable.fire);
                btn4.setImageResource(R.drawable.forest);
                btn5.setImageResource(R.drawable.thunder);
                btn6.setImageResource(R.drawable.ocean);
                btn7.setImageResource(R.drawable.volcano);

                // Iterate through all the sounds
                for (int s = 0; s < soundPlayer.length; s++) {
                    // if sound is playing
                    if (soundPlayer[s].isPlaying()) {
                        soundPlayer[s].pause(); // pause sound
                        soundPlayer[s].seekTo(0); // rewind to beginning
                    } // end if
                } // end for

            default:
                break;
        } // end switch
    } // end buttonClicked()
}