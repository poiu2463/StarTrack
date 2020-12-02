package com.example.startrack.Controller

import com.example.startrack.Model.CargoRun

class CargoRunController(var newcargoRunList: ArrayList<CargoRun>) {
    var cargoRunList = newcargoRunList

    fun addCargoRun(newCargoRun: CargoRun){
        cargoRunList.add(newCargoRun)
    }


}