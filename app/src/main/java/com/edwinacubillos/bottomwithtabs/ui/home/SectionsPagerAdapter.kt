package com.edwinacubillos.bottomwithtabs.ui.home

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.edwinacubillos.bottomwithtabs.R
import com.edwinacubillos.bottomwithtabs.ui.dashboard.DashboardFragment
import com.edwinacubillos.bottomwithtabs.ui.notifications.NotificationsFragment

private val TAB_TITLES = arrayOf(
    R.string.title_dashboard,
    R.string.title_notifications
)

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> DashboardFragment()
            else -> NotificationsFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 2
    }
}