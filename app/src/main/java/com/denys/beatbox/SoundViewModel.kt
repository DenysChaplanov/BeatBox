package com.denys.beatbox

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class SoundViewModel(private val beatBox: BeatBox): BaseObservable() {
    var playbackSpeed = 1.0f
    fun onButtonClicked() {
        sound?.let {
            beatBox.play(it, playbackSpeed)
        }
    }

    var sound: Sound? = null
        set(sound){
            field = sound
            notifyChange()
        }

    @get:Bindable
    val title: String?
        get() = sound?.name
}