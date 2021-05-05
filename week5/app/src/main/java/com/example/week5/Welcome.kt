package com.example.week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.button.MaterialButton

class Welcome : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_welcome, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button_sign_up = view.findViewById<MaterialButton>(R.id.btn_start)
        val button_sign_in = view.findViewById<TextView>(R.id.btn_sign_in)
        button_sign_up.setOnClickListener {
            parentFragmentManager.commit{
                setReorderingAllowed(true)
                replace<SignUp>(R.id.frag_container_view)
                addToBackStack(null)
            }
        }
        button_sign_in.setOnClickListener{
            parentFragmentManager.commit {
                setReorderingAllowed(true)
                replace<SignIn>(R.id.frag_container_view)
                addToBackStack(null)
            }
        }

    }
}