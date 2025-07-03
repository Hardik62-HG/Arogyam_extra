package com.Hardik.Arogyam2.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.Hardik.Arogyam2.fragments.OwnReportFragment
import com.Hardik.Arogyam2.fragments.ParentalReportsFragment

class NestedFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 2 // Two tabs

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> OwnReportFragment() // User reports
            1 -> ParentalReportsFragment() // Parental reports
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }
}
