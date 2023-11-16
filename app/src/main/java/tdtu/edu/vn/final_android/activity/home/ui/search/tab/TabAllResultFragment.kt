package tdtu.edu.vn.final_android.activity.home.ui.search.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import tdtu.edu.vn.final_android.R
import tdtu.edu.vn.final_android.databinding.FragmentSearchBinding
import tdtu.edu.vn.final_android.databinding.FragmentTabAllResultBinding

class TabAllResultFragment : Fragment() {
    private var _binding: FragmentTabAllResultBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentTabAllResultBinding.inflate(inflater, container, false)
        val root: View = binding.root
        // Inflate the layout for this fragment
        binding.txtAllresult.text = "xin chào tất cả result"
        return root
    }
}