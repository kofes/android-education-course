package io.milkpp.kofes.eduject.presentation.foreground.main

import android.arch.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private enum class CODE(val value: Int) {
        REQUEST_READ(0),
        REQUEST_SAVE(1),
        PICK_IMAGE(2),
    }
}