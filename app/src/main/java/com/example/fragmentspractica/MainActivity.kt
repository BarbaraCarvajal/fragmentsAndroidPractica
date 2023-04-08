package com.example.fragmentspractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.fragmentspractica.BlankFragment.Companion.ADDRESS_BUNDLE
import com.example.fragmentspractica.BlankFragment.Companion.NAME_BUNDLE

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if(savedInstanceState == null){
            val bundle = bundleOf(NAME_BUNDLE to "AristiDevs",
                ADDRESS_BUNDLE to "casa 123")
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<BlankFragment>(R.id.fragmentContainer, args = bundle)
            }
        }

    }
}