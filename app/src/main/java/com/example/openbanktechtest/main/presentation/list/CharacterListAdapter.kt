package com.example.openbanktechtest.main.presentation.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.openbanktechtest.databinding.CharacterListItemBinding
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import com.example.openbanktechtest.main.presentation.list.CharacterListAdapter.CharacterListViewHolder
import com.squareup.picasso.Picasso

class CharacterListAdapter(private val listener: (CharacterDomainModel) -> Unit)
    : ListAdapter<CharacterDomainModel, CharacterListViewHolder>(TaskDiffCallBack()){

    class TaskDiffCallBack : DiffUtil.ItemCallback<CharacterDomainModel>() {

        override fun areItemsTheSame(oldItem: CharacterDomainModel, newItem: CharacterDomainModel)
        : Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CharacterDomainModel, newItem: CharacterDomainModel)
        : Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val bindingView = CharacterListItemBinding.inflate(inflater, parent, false)
       return CharacterListViewHolder(bindingView, listener)
    }

    override fun onBindViewHolder(holder: CharacterListViewHolder, position: Int) =
        holder.bind(getItem(position))

    class CharacterListViewHolder(
        private val bindingView: CharacterListItemBinding,
        private val listener: (CharacterDomainModel) -> Unit):
            RecyclerView.ViewHolder(bindingView.root) {

                fun bind(item: CharacterDomainModel) {
                    bindingView.apply {
                        Picasso.get().load(item.imageUrl).into(this.characterImage)
                        this.characterName.text = item.name
                        itemView.setOnClickListener {listener(item)}
                    }
                }

            }
}