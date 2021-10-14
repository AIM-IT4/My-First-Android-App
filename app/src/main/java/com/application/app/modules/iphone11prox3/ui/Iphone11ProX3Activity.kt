package com.application.app.modules.iphone11prox3.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone11ProX3Binding
import com.application.app.modules.iphone11prox3.`data`.viewmodel.Iphone11ProX3VM
import com.application.app.modules.iphone11prox4.ui.Iphone11ProX4Activity
import kotlin.String
import kotlin.Unit

public class Iphone11ProX3Activity :
    BaseActivity<ActivityIphone11ProX3Binding>(R.layout.activity_iphone_11_pro_x_3) {
  private val viewModel: Iphone11ProX3VM by viewModels<Iphone11ProX3VM>()

  public override fun setUpClicks(): Unit {
    binding.image2.setOnClickListener {

      val destIntent = Iphone11ProX4Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.iphone11ProX3VM = viewModel
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X3ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX3Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
