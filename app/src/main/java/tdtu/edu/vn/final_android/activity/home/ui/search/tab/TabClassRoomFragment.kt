package tdtu.edu.vn.final_android.activity.home.ui.search.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tdtu.edu.vn.final_android.R
import tdtu.edu.vn.final_android.databinding.FragmentTabBookBinding
import tdtu.edu.vn.final_android.databinding.FragmentTabClassRoomBinding

class TabClassRoomFragment : Fragment() {
    private var _binding: FragmentTabClassRoomBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentTabClassRoomBinding.inflate(inflater, container, false)
        val root: View = binding.root
        // Inflate the layout for this fragment
        binding.txtClass.text = "xin chào lớp học"
        return root
    }
}