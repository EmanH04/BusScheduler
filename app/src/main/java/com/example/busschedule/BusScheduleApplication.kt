package com.example.busschedule
/*Eman*/
import android.app.Application
import com.example.busschedule.database.AppDatabase

class BusScheduleApplication {



    class BusScheduleApplication : Application() {
        val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}}