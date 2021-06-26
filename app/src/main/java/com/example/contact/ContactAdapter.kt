package com.example.contact

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter( var contactlist :List<Contacts>,var context:Context): RecyclerView.Adapter<ContactViewHolder>(){
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


        Picasso.get().load(currentContact.imageUrl).into(holder.imgContacts)
        holder.clContact.setOnClickListener {
            var intent = Intent(context,ViewContactActivity::class.java)
            intent.putExtra("Name",currentContact.personName)
            intent.putExtra("PhoneNumber",currentContact.personPhoneNumber)
            intent.putExtra("Email",currentContact.personEmail)
            intent.putExtra("img",currentContact.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)

        }

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
    var imgContacts=itemView.findViewById<ImageView>(R.id.imgcontacts)
    var clContact=itemView.findViewById<CardView>(R.id.clContact)
}