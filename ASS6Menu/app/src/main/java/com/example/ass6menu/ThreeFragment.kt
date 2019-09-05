package com.example.ass6menu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_three.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_three,container,false)
        view.btnClick_2.setOnClickListener(){
            var fragment2: Fragment? = null
            fragment2 = OneFragment()
            val transaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.frameLayout,fragment2)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        return view
    }


}
