package com.example.tugastablayout

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.tugastablayout.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            signUp.setOnClickListener {
                val loginArgs = Bundle().apply {
                    putString("nama", nama.text.toString())
                    putString("email", email.text.toString())
                    putString("password", password.text.toString())
                    putString("hp", nomor.text.toString())
                }

                val sectionPagerAdapter = SectionPagerAdapter(requireActivity() as AppCompatActivity, loginArgs)
                val viewPager: ViewPager2 = requireActivity().findViewById(R.id.view_pager)
                viewPager.adapter = sectionPagerAdapter
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}