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
            Contacts("Pamera's Contact","Pamera Umotini","0773456789","sarahmatishoi@gmail.com","https://africanhype.com/wp-content/uploads/2019/04/1952ae27ae83baa8fe6124c5047f8bfe.jpg?baa2ea&baa2ea"),
            Contacts("Vero's","veronicah","0773456789","sarahmatishoi@gmail.com","https://thumbs.dreamstime.com/b/african-girl-nice-smile-portrait-african-girl-nice-smile-straight-white-teeth-close-up-99011500.jpg"),
            Contacts("Sara's Contact" ,"Sarah Matishoi","0773456789","sarahmatishoi@gmail.com","https://4.bp.blogspot.com/-YkP0TcTa7X0/WCfjS0WAoQI/AAAAAAAABys/impqsKTcfxcH0N0IrwlxrY6tSGo75t_5QCLcB/s1600/Baby.jpg"),
            Contacts("Sarah's Contact","Sarah Sindeti","0773456789","sarahmatishoi@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFKdhgq9dWtldEla6xEZA4TYHMHgx6mqJFOK0yfiNRIP8JsOGrYVr1pihfyLN6nwmPQx0&usqp=CAU"),
            Contacts("Hunter's Contact","Hunter Achieng","0723457653","hunterachieng@gmail.com","https://1.bp.blogspot.com/-ussdmBPJN00/X3f2xUi8v9I/AAAAAAAAAsE/pfqSHD88MrEBJaSlVRWdmN-vswQOp8C6wCLcBGAsYHQ/s1286/beautiful%2Bgirls.jpg"),
            Contacts("kay's,Contact","Kay Linda","0723457653","kaylinda@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrvLJW2r-2pXFHkl07DzT-6qMWhCGHTms-Lgtr8la15x3hxh2o0wOiEkpHOLLeeg0JMz0&usqp=CAU"),
            Contacts("Florence's Contact","Florence Kyarikunda","0723457653","florencekyarikunda@gmail.com","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToFJTmdjKwsBu3ZlzVz7e_XT4W8jBxehu-Aw&usqp=CAU"),
            Contacts("Jane","jane Wanjiru","0773456789","sarahmatishoi@gmail.com","https://4.bp.blogspot.com/-YkP0TcTa7X0/WCfjS0WAoQI/AAAAAAAABys/impqsKTcfxcH0N0IrwlxrY6tSGo75t_5QCLcB/s1600/Baby.jpg"),

            )
        var contactAdapter=ContactAdapter(contactList,baseContext)
         
        rvcontacts.layoutManager=LinearLayoutManager(baseContext)
        rvcontacts.adapter=contactAdapter

    }
}