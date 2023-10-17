package com.example.exploringnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.exploringnavigation.PersonModel
import com.example.exploringnavigation.databinding.FragmentAddressBinding
import com.example.exploringnavigation.databinding.FragmentPersonalDataBinding
import com.example.exploringnavigation.extensions.text

class AddressFragment : Fragment() {
    private var _binding: FragmentAddressBinding? = null
    private val binding get() = _binding!!
    private val args by navArgs<AddressFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val person = PersonModel(
                street = binding.tilStreet.text,
                addressNumber = binding.tilNumber.text
            )
            // TODO: Mandar os dados para o outro fragment
            // TODO: Navegar entre os fragments
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}