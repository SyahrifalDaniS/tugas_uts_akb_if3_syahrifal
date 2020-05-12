package com.example.tugas_uts_akb_if3_10117093.View;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.example.tugas_uts_akb_if3_10117093.MainActivity;
import com.example.tugas_uts_akb_if3_10117093.R;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

/** NIM : 10117093
 * Nama : Syahrifal Dani
 * Kelas : IF 3
 * Tanggal : 12-05-2020**/
public class OnBoardView extends TutorialActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addFragment(new Step.Builder().setTitle("Tambah Data Teman")
                .setContent("Menambahkan Profil Teman")
                .setBackgroundColor(Color.parseColor("#0decdb")) // int background color
                .setDrawable(R.drawable.vp1) // int top drawable
                .setSummary("Dapat mencatat data profil teman")
                .build());
        addFragment(new Step.Builder().setTitle("Mengubah Data Teman")
                .setContent("Mengubah Data Profil Teman")
                .setBackgroundColor(Color.parseColor("#0decdb")) // int background color
                .setDrawable(R.drawable.vp2) // int top drawable
                .setSummary("Dapat mengubah data profil teman")
                .build());
        addFragment(new Step.Builder().setTitle("Tampil Data Teman")
                .setContent("Menampilkan Daftar Teman")
                .setBackgroundColor(Color.parseColor("#0decdb")) // int background color
                .setDrawable(R.drawable.vp3) // int top drawable
                .setSummary("Dapat menampilkan daftar teman yang sudah di tambahkan")
                .build());
        setCancelText("Skip");

    }

    @Override
    public void finishTutorial() {
        super.finishTutorial();
        Intent intent = new Intent(OnBoardView.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
