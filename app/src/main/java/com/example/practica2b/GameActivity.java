package com.example.practica2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    private ImageView mImgView;

    private Toast mEmpate;

    private Toast mVictoria;

    private Toast mDerrota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mImgView = findViewById(R.id.img_maquina);
        mEmpate = Toast.makeText(this, R.string.empate,Toast.LENGTH_SHORT);
        mVictoria = Toast.makeText(this,R.string.victoria,Toast.LENGTH_SHORT);
        mDerrota = Toast.makeText(this,R.string.derrota,Toast.LENGTH_SHORT);
    }

    public void piedra(View view) {
        int num = (int) (Math.random() * 3);
        if (num == 0) {
            mImgView.setImageResource(R.drawable.piedra);
        } else if (num == 1) {
            mImgView.setImageResource(R.drawable.papel);
        } else {
            mImgView.setImageResource(R.drawable.tijeras);
        }

        if (mImgView.getVisibility() != View.VISIBLE) {
            mImgView.setVisibility(View.VISIBLE);
        }

        if (num == 0) {
            mEmpate.show();
        } else if (num == 1) {
            mDerrota.show();
        } else {
            mVictoria.show();
        }
    }

    public void papel(View view) {
        int num = (int) (Math.random() * 3);
        if (num == 0) {
            mImgView.setImageResource(R.drawable.piedra);
        } else if (num == 1) {
            mImgView.setImageResource(R.drawable.papel);
        } else {
            mImgView.setImageResource(R.drawable.tijeras);
        }

        if (mImgView.getVisibility() != View.VISIBLE) {
            mImgView.setVisibility(View.VISIBLE);
        }

        if (num == 0) {
            mVictoria.show();
        } else if (num == 1) {
            mEmpate.show();
        } else {
            mDerrota.show();
        }
    }

    public void tijeras(View view) {
        int num = (int) (Math.random() * 3);
        if (num == 0) {
            mImgView.setImageResource(R.drawable.piedra);
        } else if (num == 1) {
            mImgView.setImageResource(R.drawable.papel);
        } else {
            mImgView.setImageResource(R.drawable.tijeras);
        }

        if (mImgView.getVisibility() != View.VISIBLE) {
            mImgView.setVisibility(View.VISIBLE);
        }

        if (num == 0) {
            mDerrota.show();
        } else if (num == 1) {
            mVictoria.show();
        } else {
            mEmpate.show();
        }
    }
}