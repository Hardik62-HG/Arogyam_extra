package com.Hardik.Arogyam2.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.Hardik.Arogyam2.ReceiptHandlingActivity
import com.Hardik.Arogyam2.fragments.OwnReceiptFragment
import com.Hardik.Arogyam2.fragments.ParentalReceiptFragment

class ReceiptPagerAdapter(activity: ReceiptHandlingActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> OwnReceiptFragment()
            1 -> ParentalReceiptFragment()
            else -> OwnReceiptFragment()
        }
    }
}
