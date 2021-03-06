package com.crowleysimon.maverickstest.ui.main

import com.airbnb.mvrx.MavericksState
import com.airbnb.mvrx.MavericksViewModel

class MainViewModel(initialState: CounterState) : MavericksViewModel<CounterState>(initialState) {
    fun incrementCount() = setState { copy(count = count + 1) }
}

data class CounterState(val count: Int = 0) : MavericksState