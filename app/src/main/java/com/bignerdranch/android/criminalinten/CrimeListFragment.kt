package com.bignerdranch.android.criminalinten

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import java.util.EnumSet.of

val TAG = CrimeListFragment;

class CrimeListFragment : Fragment() {
    private val crimeListViewModel:
            CrimeListViewModel by lazy()
    {
        ViewModelProviders.of(this).get(CrimeListViewModel::class.java)
    }

    override fun onCreate(savedInstanceState:
                          Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, Total crimes:${crimeListViewModel.crimes.size})
    }

    companion object {
        fun newInstance(): CrimeListFragment {
            return CrimeListFragment()

            5

        }
    }
}

class ViewModelProviders {

}
