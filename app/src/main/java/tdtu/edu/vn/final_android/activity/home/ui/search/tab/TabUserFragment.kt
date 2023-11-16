package tdtu.edu.vn.final_android.activity.home.ui.search.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tdtu.edu.vn.final_android.databinding.FragmentTabUserBinding

class TabUserFragment : Fragment() {
    private var _binding: FragmentTabUserBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentTabUserBinding.inflate(inflater, container, false)
        val root: View = binding.root
        // Inflate the layout for this fragment
        binding.txtUser.text = "xin chào người dùng"
        return root
    }
}