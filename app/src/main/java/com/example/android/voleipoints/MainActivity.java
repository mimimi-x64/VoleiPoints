package com.example.android.voleipoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    private int pontosA = 0;
    private int cortadA = 0;

    private int pontosB = 0;
    private int cortadB = 0;

    private int set = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adiciona e Exibe a Pontuação do Time A.
     */
    public void addPontosA(View v) {
        pontosA = pontosA + 1;
        displayForTeamA(pontosA);
    }

    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.pontoTimeA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adiciona e Exibe as Cortadas ao Time A.
     */
    public void addCortadaA(View v) {
        cortadA = cortadA + 1;
        displayCortadA(cortadA);
    }

    private void displayCortadA(int pontos) {
        TextView pontosView = (TextView) findViewById(R.id.cortadA);
        pontosView.setText(String.valueOf(pontos));
    }

    /**
     * Adiciona e Exibe a Pontuação do Time B.
     */
    public void addPontosB(View v) {
        pontosB = pontosB + 1;
        displayPontosB(pontosB);
    }

    private void displayPontosB(int pontos) {
        TextView pontosView = (TextView) findViewById(R.id.pontoTimeB);
        pontosView.setText(String.valueOf(pontos));
    }

    /**
     * Adiciona e Exibe as Cortadas do Time B.
     */
    public void addCortadaB(View v) {
        cortadB = cortadB + 1;
        displayCortadB(cortadB);
    }

    private void displayCortadB(int cortadas) {
        TextView cortadasView = (TextView) findViewById(R.id.cortadB);
        cortadasView.setText(String.valueOf(cortadas));
    }

    /**
     * Adiciona e Exibe os Sets dos Times.
     */
    public void addSet(View v) {
        set = set + 1;
        displaySet(set);
    }

    private void displaySet(int sets) {
        TextView setsView = (TextView) findViewById(R.id.set);
        setsView.setText(String.valueOf(sets));
    }

    public void reset(View v) {
        cortadB = 0;
        cortadA = 0;
        pontosB = 0;
        pontosA = 0;
        set = 0;
        displayCortadA(cortadA);
        displayCortadB(cortadB);
        displayForTeamA(pontosA);
        displayPontosB(pontosB);
        displaySet(set);
    }
}