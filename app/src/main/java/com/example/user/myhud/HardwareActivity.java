package com.example.user.myhud;

import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HardwareActivity extends AppCompatActivity {
    private ListView list01;
    private SensorManager sensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware);

        list01 = (ListView)findViewById(R.id.list01);
        sensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);

        List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        List<String> listSensorType = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, listSensorType);

        for (Sensor sensor : sensors) {
            listSensorType.add(sensor.getName());

        }

        list01.setAdapter(adapter);
    }
}
