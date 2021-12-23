package com.example.openbanktechtest.main.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.ProgressBar
import com.example.openbanktechtest.databinding.FragmentCharacterListBinding
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import android.widget.RelativeLayout
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.navigation.fragment.findNavController
import com.example.openbanktechtest.R
import com.example.openbanktechtest.main.presentation.detail.ARG_CHARACTER


class CharacterListFragment : Fragment() {

    private val listViewModel: ListFragmentViewModel by viewModel()

    private var bindingView: FragmentCharacterListBinding? = null

    private lateinit var progressBar: ProgressBar

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingView = FragmentCharacterListBinding.inflate(layoutInflater)
        return bindingView?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createProgressBar()
        initObservers()
        listViewModel.dispatch(ListFragmentEvent.InitEvent)
    }

    private fun createProgressBar() {
        progressBar = ProgressBar(context, null, android.R.attr.progressBarStyleLarge)
        val params = RelativeLayout.LayoutParams(100, 100)
        params.addRule(RelativeLayout.CENTER_IN_PARENT)
        bindingView?.root?.addView(progressBar, params)
    }

    private fun initObservers() {
        listViewModel.viewState.observe(viewLifecycleOwner, ::handleStatus)
    }

    private fun handleStatus(state: ListFragmentViewState) {
        when (state) {
            is ListFragmentViewState.ShowData -> {
                setupList(state.list)
            }
            ListFragmentViewState.Error -> showErrorMessage()
            ListFragmentViewState.Loading -> showLoadingView()
        }
    }

    private fun showErrorMessage() {
        Toast.makeText(context, "There was an error", LENGTH_LONG).show()
    }

    private fun setupList(characterList: List<CharacterDomainModel>) {
        val adapter = CharacterListAdapter(::handleCharacterClick)
        bindingView?.characterList?.adapter = adapter
        adapter.submitList(characterList)
        progressBar.visibility = GONE
        bindingView?.characterList?.visibility = VISIBLE
    }

    private fun showLoadingView() {
        bindingView?.characterList?.visibility = GONE
        progressBar.visibility = VISIBLE
    }

    private fun handleCharacterClick(character: CharacterDomainModel) {
        findNavController().navigate(
            R.id.action_characterListFragment_to_characterDetailFragment,
            Bundle().apply {
                putParcelable(ARG_CHARACTER, character)
            }
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        bindingView = null
    }

}