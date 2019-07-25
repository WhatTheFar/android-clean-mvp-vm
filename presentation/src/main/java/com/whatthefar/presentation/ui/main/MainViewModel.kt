package com.whatthefar.presentation.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.databinding.Bindable
import android.text.TextWatcher
import android.view.View
import com.whatthefar.presentation.BR
import com.whatthefar.presentation.ui.core.ObservableViewModel
import javax.inject.Inject

class MainViewModel
@Inject constructor() : ObservableViewModel() {

    var messageText: String = ""
        @Bindable get() = field
        set(value) {
            if (field != value) {
                field = value
                notifyPropertyChanged(BR.messageText)
            }
        }
    val weatherText = MutableLiveData<String>()

    val onButtonClickListener = MutableLiveData<View.OnClickListener>()
    val onTextChanged = MutableLiveData<TextWatcher>()
}
