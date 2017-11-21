package com.example.gauravgoyal.kotlintricks.lifecycle

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.gauravgoyal.kotlintricks.R

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [BlankFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {

    // TODO: Rename and change types of paramete
    // rs
    private var mParam1: String? = null
    private var mParam2: String? = null
    val tag_ ="LifeCycleEvent"




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag_,"onFragmentCreate")
        if (arguments != null) {
            mParam1 = arguments.getString(ARG_PARAM1)
            mParam2 = arguments.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        Log.d(tag_,"onFragmentCreateView")
        isInLayout
        return inflater!!.inflate(R.layout.fragment_blank, container, false)
    }


    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d(tag_,"onAttach")

    }



    override fun onDetach() {
        Log.d(tag_,"onDetach")
        super.onDetach()

    }


    override fun onResume() {
        Log.d(tag_,"onFragmentResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tag_,"onFragmentPause")
        super.onPause()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        Log.d(tag_,"onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(tag_,"onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(tag_,"onFragmentStart")
        super.onStart()
    }

    override fun onStop() {
        Log.d(tag_,"onFragmentStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag_,"onFragmentDestroy")
        super.onDestroy()
    }

    override fun onDestroyView() {
        Log.d(tag_,"onFragmentDestroyView")
        super.onDestroyView()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d(tag_,"onFragmentSaveInstance")
        super.onSaveInstanceState(outState)
    }






    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */


    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private val ARG_PARAM1 = "param1"
        private val ARG_PARAM2 = "param2"

        fun newInstance():BlankFragment{
            return BlankFragment()
        }

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String, param2: String): BlankFragment {
            val fragment = BlankFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
}// Required empty public constructor
