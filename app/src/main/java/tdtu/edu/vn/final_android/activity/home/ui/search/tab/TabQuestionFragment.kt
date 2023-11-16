package tdtu.edu.vn.final_android.activity.home.ui.search.tab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tdtu.edu.vn.final_android.R
import tdtu.edu.vn.final_android.databinding.FragmentTabBookBinding
import tdtu.edu.vn.final_android.databinding.FragmentTabQuestionBinding

class TabQuestionFragment : Fragment() {
    private var _binding: FragmentTabQuestionBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentTabQuestionBinding.inflate(inflater, container, false)
        val root: View = binding.root
        // Inflate the layout for this fragment
        binding.txtAsk.text = "xin chào câu hỏi"
        return root
    }
}