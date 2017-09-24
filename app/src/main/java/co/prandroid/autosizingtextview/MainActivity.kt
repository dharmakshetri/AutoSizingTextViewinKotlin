package co.prandroid.autosizingtextview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.TextViewCompat
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Autosizing from programmatically

        //configure uniform autosize
        textview.setAutoSizeTextTypeWithDefaults(TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM)
        // via support library
        TextViewCompat.setAutoSizeTextTypeWithDefaults(textview,TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM)

        //set properties of textview

        textview.setAutoSizeTextTypeUniformWithConfiguration(12,100,2,2)
        // via support library
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textview,12,100,2,2)

        //set preset sizes
        val  presetSize:IntArray = intArrayOf(10,12,30,40,100)
        textview.setAutoSizeTextTypeUniformWithPresetSizes(presetSize,2)
        // via support library
        TextViewCompat.setAutoSizeTextTypeUniformWithPresetSizes(textview,presetSize,2)
    }

}
