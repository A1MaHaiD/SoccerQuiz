package com.example.soccerquiz

import android.os.Binder
import android.os.Bundle
import android.renderscript.ScriptGroup
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.soccerquiz.databinding.FragmentWelcomeScreenBinding


/**
 * A simple [Fragment] subclass.
 */
class WelcomeScreenFragment : Fragment() {

    // lateinit var binding: FragmentWelcomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentWelcomeScreenBinding =
            DataBindingUtil.inflate(
                inflater, R.layout.fragment_welcome_screen, container, false
            )

        binding.letsPlayButton.setOnClickListener { view: View->

            Navigation.findNavController(view).navigate(R.id.action_welcomeScreenFragment_to_quizFragment)
        }

        (activity as AppCompatActivity).supportActionBar?.title

        return binding.root
    }

}