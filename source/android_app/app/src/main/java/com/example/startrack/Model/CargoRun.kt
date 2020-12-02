package com.example.startrack.Model

import java.util.*

data class CargoRun(val date : Date, val cargoType: String?, val startCurrency: Int?, val endCurrency: Int?, val route:String?, val shipLost: Boolean, var notes: String? )


