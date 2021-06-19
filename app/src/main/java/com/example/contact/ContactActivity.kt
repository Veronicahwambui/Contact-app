package com.example.contact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        var rvcontacts=findViewById<RecyclerView>(R.id.rvcontacts)
        var contactList= listOf(
            Contacts("Pemala's Contact","Pamela Umutoni","0765444567","pameraumutoni@gmail.com"),
            Contacts("Sharon's Contact","Sharon Oito ","0765343509","sharonoito@gmail.com"),
            Contacts("Jane's Contact","Jane Wanjiru","076524563","janewanjiru@gmail.com"),
            Contacts("Sarah's Contact","Sarah Matishoi","0773456789","sarahmatishoi@gmail.com"),
            Contacts("Hunter's Contact","Hunter Achieng","0723457653","hunterachieng@gmail.com"),
            Contacts("kay's,Contact","Kay Linda","0723457653","kaylinda@gmail.com"),
            Contacts("Florence's Contact","Florence Kyarikunda","0723457653","florencekyarikunda@gmail.com"),
        )
        var contactAdapter=ContactAdapter(contactList)
        rvcontacts.layoutManager=LinearLayoutManager(baseContext)
        rvcontacts.adapter=contactAdapter

    }
}