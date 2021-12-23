package com.example.openbanktechtest.main.presentation.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.openbanktechtest.R
import com.example.openbanktechtest.databinding.FragmentCharacterDetailBinding
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import com.squareup.picasso.Picasso

const val ARG_CHARACTER = "Character"

class CharacterDetailFragment : Fragment() {

    private var bindingView: FragmentCharacterDetailBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingView = FragmentCharacterDetailBinding.inflate(layoutInflater)
        return bindingView?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val character: CharacterDomainModel? = arguments?.getParcelable(ARG_CHARACTER)
        setupView(character)
    }

    private fun setupView(character: CharacterDomainModel?) {
        bindingView?.apply {
            character?.let {
                Picasso.get().load(it.imageUrl).into(characterImage)
                characterName.text = character.name
                if (character.description.isEmpty()) {
                    characterDescription.text = "This character has no description"
                } else {
                    characterDescription.text = character.description
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        bindingView = null
    }

}