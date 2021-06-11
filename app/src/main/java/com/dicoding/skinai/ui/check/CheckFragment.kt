package com.dicoding.skinai.ui.check

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dicoding.skinai.databinding.FragmentCheckBinding
import com.dicoding.skinai.ui.CameraActivity


class CheckFragment : Fragment() {

    private var _binding: FragmentCheckBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentCheckBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.apply {
            imgCheckLocation.setOnClickListener {
                val intent = Intent(activity, CameraActivity::class.java)
                startActivity(intent)
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}