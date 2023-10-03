package com.example.myporfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSkills = findViewById<Button>(R.id.btnSkills)
        val btnEducation = findViewById<Button>(R.id.btnEducation)
        val btnProject = findViewById<Button>(R.id.btnProjects)
        val btnExperience = findViewById<Button>(R.id.btnExperience)

        btnSkills.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        btnEducation.setOnClickListener {
            val intent1 = Intent(this, EducationActivity::class.java)
            startActivity(intent1)
        }

        btnProject.setOnClickListener {
            val intent2 = Intent(this, ProjectActivity::class.java)
            startActivity(intent2)
        }
        btnExperience.setOnClickListener {
            val intent3 = Intent(this, ExperienceActivity::class.java)
            startActivity(intent3)
        }
    }
}