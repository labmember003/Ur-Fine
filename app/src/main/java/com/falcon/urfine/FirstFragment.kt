package com.falcon.urfine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.falcon.urfine.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        binding.year1.setOnClickListener {
////            findNavController().navigate(R.id.action_FirstFragment_to_reminderFragment)
//        }

        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        var currentYear = 0
        listOf(binding.year1, binding.year2, binding.year3, binding.year4, binding.year5, binding.year6).forEach{
            currentYear++
            val bundle = Bundle()
            bundle.putInt("Year", currentYear)
            it.setOnClickListener {
                findNavController().navigate(R.id.action_FirstFragment_to_feedFragment, bundle)
            }
        }

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}