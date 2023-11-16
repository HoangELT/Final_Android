package tdtu.edu.vn.final_android.activity.home.ui.search.tab

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        // Tạo và trả về Fragment tương ứng với từng tab
        when (position) {
            0 -> return TabAllResultFragment()
            1 -> return TabTermFragment()
            2 -> return TabBookFragment()
            3 -> return TabQuestionFragment()
            4 -> return TabUserFragment()
            // Thêm các tab khác nếu cần
            else -> return TabClassRoomFragment()
        }
    }

    override fun getCount(): Int {
        // Số lượng tab
        return 6
    }

    override fun getPageTitle(position: Int): CharSequence {
        // Tiêu đề của từng tab
        when (position) {
            0 -> return "TẤT CẢ KẾT QUẢ"
            1 -> return "HỌC PHẦN"
            2 -> return "SÁCH GIÁO KHOA"
            3 -> return "CÂU HỎI"
            4 -> return "NGƯỜI DÙNG"
            // Thêm các tiêu đề khác nếu cần
            else -> return "LỚP HỌC"
        }
    }
}
