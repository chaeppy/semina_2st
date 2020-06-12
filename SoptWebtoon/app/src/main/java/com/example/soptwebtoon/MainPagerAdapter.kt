package com.example.soptwebtoon

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> WebtoonFragment()
            1 -> RecommendFragment()
            2 -> BestFragment()
            3 -> MypageFragment()
            else -> MoreFragment()
        }
    }

    override fun getCount() = 5
}
