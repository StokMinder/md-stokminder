package com.example.stockminder.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

class ProfileActivity : Fragment() {
    private val auth = FirebaseAuth.getInstance()
    private val stockminderViewModel:StockMinderViewModel by viewModels()
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ProfileFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pref = PreferenceUser(requireContext())
        val token = pref.getToken().toString()

        setupItemProfile()
        stockminderViewModel.getDatadiri(token)

        stockminderViewModel.dataDiri.observe(viewLifecycleOwner){datadiri->
            when(datadiri){
                is ApiResult.Loading->{

                }
                is ApiResult.Error->{

                }
                is ApiResult.Success->{
                    binding.apply {
                        tvNamaProfile.text = datadiri.data.data.nama
                        if(datadiri.data.data.foto_profile.isNotEmpty()){
                            Glide.with(requireContext())
                                .load(datadiri.data.data.foto_profile)
                                .into(circleImageView2)
                        }
                    }
                }
            }
        }
}