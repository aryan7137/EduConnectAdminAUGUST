package com.example.educonnectadmin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.educonnectadmin.Assignment.AssignmentList;
import com.example.educonnectadmin.OnlineClass.OnlineMeeting;
import com.example.educonnectadmin.faculty.UpdateFaculty;
import com.example.educonnectadmin.notice.DeleteNoticeActivity;
import com.example.educonnectadmin.notice.UploadNotice;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uplaodNotice, addGalaryimage, addEbook, faculty, deletenotice, somethingMore, addAsssignment, addClasses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uplaodNotice = findViewById(R.id.addnotice);
        addGalaryimage = findViewById(R.id.addGalaryimage);
        addEbook = findViewById(R.id.addEbook);
        faculty = findViewById(R.id.faculty);
        deletenotice = findViewById(R.id.deletenotice);
        somethingMore = findViewById(R.id.something_more);
        addAsssignment = findViewById(R.id.addAssignment);
        addClasses = findViewById(R.id.meeting);

        uplaodNotice.setOnClickListener(this);
        addGalaryimage.setOnClickListener(this);
        addEbook.setOnClickListener(this);
        faculty.setOnClickListener(this);
        deletenotice.setOnClickListener(this);
        somethingMore.setOnClickListener(this);
        addAsssignment.setOnClickListener(this);
        addClasses.setOnClickListener(this);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        if (view.getId() == R.id.addnotice){
            intent = new Intent(MainActivity.this, UploadNotice.class);
            startActivity(intent);
        }else   if (view.getId() == R.id.addGalaryimage){
            intent = new Intent(MainActivity.this, UploadImage.class);
            startActivity(intent);
        }else   if (view.getId() == R.id.addEbook){
            intent = new Intent(MainActivity.this, UploadPdfActivity.class);
            startActivity(intent);
        }else   if (view.getId() == R.id.faculty){
            intent = new Intent(MainActivity.this, UpdateFaculty.class);
            startActivity(intent);
        }else   if (view.getId() == R.id.deletenotice){
            intent = new Intent(MainActivity.this, DeleteNoticeActivity.class);
            startActivity(intent);
        }else   if (view.getId() == R.id.something_more){
            intent = new Intent(MainActivity.this, SomethingNew.class);
            startActivity(intent);
        }else   if (view.getId() == R.id.addAssignment){
            intent = new Intent(MainActivity.this, AssignmentList.class);
            startActivity(intent);
        }else  if (view.getId() == R.id.meeting){
            intent = new Intent(MainActivity.this, OnlineMeeting.class);
            startActivity(intent);
        }


    }
}
