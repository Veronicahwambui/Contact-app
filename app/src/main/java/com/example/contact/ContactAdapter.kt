package com.example.contact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter( var contactlist :List<Contacts>): RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView =LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactlist.get(position)
        holder.tvName.text = currentContact.personName
        holder.tvPhonenumber.text=currentContact.personPhoneNumber
        holder.tvemail.text=currentContact.personEmail
        holder.tvcontact.text=currentContact.personDetails


    }

    override fun getItemCount(): Int {
        return contactlist.size
    }
}


class ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhonenumber=itemView.findViewById<TextView>(R.id.tvPhonenumber)
    var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
    var tvcontact=itemView.findViewById<TextView>(R.id.tvcontact)
}