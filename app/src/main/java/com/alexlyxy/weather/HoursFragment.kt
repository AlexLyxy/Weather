package com.alexlyxy.weather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.alexlyxy.weather.adapters.WeatherAdapter
import com.alexlyxy.weather.adapters.WeatherModel
import com.alexlyxy.weather.databinding.FragmentHoursBinding

class HoursFragment : Fragment() {
    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding) {
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel(
                "", "12:00", "Sunny",
                "25", "", "",
                "", ""
            ),
            WeatherModel(
                "", "15:00", "SunnySunny",
                "30", "", "",
                "", ""
            ),
            WeatherModel(
                "", "18:00", "SunnyRain",
                "35", "", "",
                "", ""
            )
        )
        adapter.submitList(list)
    }

    companion object {
        @JvmStatic
        fun newInstance() = HoursFragment()
    }
}