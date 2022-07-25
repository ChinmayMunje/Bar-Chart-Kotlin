package com.gtappdevelopers.barchartinkotlin

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

class MainActivity : AppCompatActivity() {
    lateinit var barChart: BarChart
    lateinit var barData: BarData
    lateinit var barDataSet: BarDataSet
    lateinit var barEntryList: ArrayList<BarEntry>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        barChart = findViewById(R.id.idBarChart)
        getBarEntries()
        barDataSet = BarDataSet(barEntryList, "Geeks for Geeks")
        barData = BarData(barDataSet)
        barChart.data = barData
        barDataSet.color = resources.getColor(R.color.purple_200)
        barDataSet.valueTextColor = Color.BLACK
        barDataSet.valueTextSize = 16f
        barChart.description.isEnabled = false

    }

    private fun getBarEntries() {
        barEntryList = ArrayList()
        barEntryList.add(BarEntry(1f, 4f))
        barEntryList.add(BarEntry(2f, 6f))
        barEntryList.add(BarEntry(3f, 8f))
        barEntryList.add(BarEntry(4f, 2f))
        barEntryList.add(BarEntry(5f, 4f))
        barEntryList.add(BarEntry(6f, 1f))

    }


}