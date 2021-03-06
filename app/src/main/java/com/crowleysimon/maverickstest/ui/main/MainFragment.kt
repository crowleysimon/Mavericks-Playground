package com.crowleysimon.maverickstest.ui.main

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.airbnb.mvrx.MavericksView
import com.airbnb.mvrx.fragmentViewModel
import com.airbnb.mvrx.withState
import com.crowleysimon.maverickstest.R

class MainFragment : Fragment(R.layout.main_fragment), MavericksView {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by fragmentViewModel()

    lateinit var messageView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        messageView = view.findViewById(R.id.message)
        messageView.setOnClickListener { viewModel.incrementCount() }
    }

    override fun invalidate() = withState(viewModel) { state ->
        messageView.text = state.count.toString()
    }

}