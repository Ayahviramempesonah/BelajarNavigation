package viratech.layout.belajarnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import viratech.layout.belajarnavigation.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    val text = "error disini"
   val duration = Toast.LENGTH_SHORT

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        val view =binding.root

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_categoryFragment)
        )
            binding.button2.setOnClickListener { view ->
                view.findNavController().navigate(R.id.action_homeFragment_to_profileActivity)
                val toast = Toast.makeText(context,text,duration)
                toast.show()
            }


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }



}