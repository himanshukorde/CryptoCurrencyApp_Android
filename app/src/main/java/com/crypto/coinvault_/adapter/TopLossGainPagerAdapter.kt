package com.crypto.coinvault_.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.crypto.coinvault_.fragment.TopLossGainFragment

class TopLossGainPageAdapter(fragment: Fragment): FragmentStateAdapter(fragment){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = TopLossGainFragment()
        val bundle = Bundle()
        bundle.putInt("position",position)
        fragment.arguments=bundle
        return fragment
    }
}