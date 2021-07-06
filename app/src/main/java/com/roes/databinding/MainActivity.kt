package com.roes.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.roes.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var layoutBind : ActivityMainBinding
    private var aPerson :Person = Person ("Wills Chew","12345678","chewwl-wm19@student.tar.edu.my","taman bukit maluri")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutBind = DataBindingUtil.setContentView(this, R.layout.activity_main)
        layoutBind.personData = aPerson

        /*
        layoutBind.txtName.text = aPerson.name
        layoutBind.txtNRIC.text = aPerson.NRIC
        layoutBind.txtEmail.text = aPerson.email
        layoutBind.txtAdds.text = aPerson.address
        */

        layoutBind.btnUpdate.setOnClickListener(){

            layoutBind.txtEmail.text = "ggwp@gmail.com"

            layoutBind.apply { invalidateAll() }

        }

    }

}