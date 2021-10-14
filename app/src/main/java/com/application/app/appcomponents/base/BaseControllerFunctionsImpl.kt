package com.application.app.appcomponents.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment

interface BaseControllerFunctionsImpl {

    /**
     * All initialization related work will be done in this method.
     * i.e. Handling lifecycle methods.
     */
    open fun onInitialized(){}

    /**
     * All observer listener code will be handled in this method inside controllers.
     */
    open fun addObservers(){}

    /**
     * All click action code will be handled in this method inside controllers.
     */
    abstract fun setUpClicks()

}