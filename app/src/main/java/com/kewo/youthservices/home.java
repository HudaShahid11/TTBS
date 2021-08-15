package com.kewo.youthservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
Button auto,beautician,building_painter, carpenter,civil_draftsman,computer,conveyor_belt,dress_making,e_m_technician,e_filing,electrician,electronics,embroidery,fabricator,
        fitter,generator,hair_dresser,hvac,lift_technician,machinist,maintenanctTechnician,mobile,motor,
        plumber,refrigeration,stenography,tailoring,telecomm,tile, welder ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       auto = findViewById(R.id.auto);
       auto.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),cat_auto.class);
                startActivity(i);
           }
       });
        beautician = findViewById(R.id.beautician);
        beautician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Beautician");
                startActivity(i);
            }
        });
        building_painter = findViewById(R.id.building_painter);
        building_painter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Building Painter");
                startActivity(i);
            }
        });
        carpenter = findViewById(R.id.carpenter);
        carpenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Carpenter");
                startActivity(i);
            }
        });
        civil_draftsman = findViewById(R.id.civil);
        civil_draftsman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Civil Draftsman");
                startActivity(i);
            }
        });
        computer = findViewById(R.id.computer);
        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),cat_computer.class);
                startActivity(i);
            }
        });
        conveyor_belt = findViewById(R.id.conveyor_belt_technician);
        conveyor_belt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Conveyor Belt Technician");
                startActivity(i);
            }
        });
        dress_making = findViewById(R.id.dress_making_and_designing);
        dress_making.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Dress Making and Designing");
                startActivity(i);
            }
        });
        e_m_technician = findViewById(R.id.e_m);
        e_m_technician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","E/M Technician");
                startActivity(i);
            }
        });
        e_filing = findViewById(R.id.e_filing);
        e_filing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","E-Filing");
                startActivity(i);

            }
        });
        electrician = findViewById(R.id.electrician);
        electrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),cat_electrician.class);
                startActivity(i);
            }
        });
        electronics = findViewById(R.id.electronics);
        electronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),cat_electronics.class);
                startActivity(i);
            }
        });
        embroidery = findViewById(R.id.embroidery_machine);
        embroidery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Embroidery Machine Operator (Manual)");
                startActivity(i);

            }
        });
        fabricator = findViewById(R.id.fabricator);
        fabricator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Fabricator");
                startActivity(i);

            }
        });
        fitter = findViewById(R.id.fitter);
        fitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),cat_fitter.class);
                startActivity(i);
            }
        });
        generator = findViewById(R.id.generator);
        generator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),cat_generator.class);
                startActivity(i);
            }
        });
        hair_dresser = findViewById(R.id.hair_dresser);
        hair_dresser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Hair Dresser");
                startActivity(i);

            }
        });
        hvac = findViewById(R.id.hvac_technician);
        hvac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","HVAC Technician");
                startActivity(i);

            }
        });
        lift_technician = findViewById(R.id.lift_technician);
        lift_technician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Lift Technician");
                startActivity(i);

            }
        });
        machinist = findViewById(R.id.machinist);
        machinist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Machinist");
                startActivity(i);

            }
        });
        maintenanctTechnician = findViewById(R.id.maintenance_technician_mechanical);
        maintenanctTechnician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Maintenance Technician Mechanical");
                startActivity(i);
            }
        });
        mobile = findViewById(R.id.mobile_phone_repairing);
        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Mobile Phone Repairing");
                startActivity(i);

            }
        });
        motor = findViewById(R.id.motor_pump);
        motor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),cat_motor_pump.class);
                startActivity(i);
            }
        });
        plumber = findViewById(R.id.plumber);
        plumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Plumber");
                startActivity(i);

            }
        });
        refrigeration = findViewById(R.id.refrigeration);
        refrigeration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),cat_refrigeration.class);
                startActivity(i);
            }
        });
        stenography = findViewById(R.id.stenography);
        stenography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Stenography");
                startActivity(i);

            }
        });
        tailoring = findViewById(R.id.tailoring);
        tailoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Tailoring");
                startActivity(i);

            }
        });
        telecomm = findViewById(R.id.telecommunication_technician);
        telecomm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Telecommunication Technician");
                startActivity(i);

            }
        });
        tile = findViewById(R.id.tile_fixer);
        tile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),CourseActivity.class);
                i.putExtra("category","Tile Fixer");
                startActivity(i);

            }
        });
        welder = findViewById(R.id.welder);
        welder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),cat_welder.class);
                startActivity(i);
            }
        });
    }
}
