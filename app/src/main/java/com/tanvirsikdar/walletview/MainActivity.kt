package com.tanvirsikdar.walletview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tanvirsikdar.walletviewer.WalletViewer

class MainActivity : AppCompatActivity() {

    lateinit var _walletViewer:WalletViewer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        _walletViewer=findViewById(R.id.viewr)
        _walletViewer.setOnClickListener { _walletViewer.show() }



    }
}