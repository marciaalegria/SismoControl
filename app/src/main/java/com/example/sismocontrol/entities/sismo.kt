package com.example.sismocontrol.entities

data class Sismo (
    val id : String,
    val lugar: String,
    val magnitud: Double,
    val time : Long= 0,
    val longitud: Double= 0.0,
    val latitud: Double= 0.0
){
    companion object{
       val dataSismos= mutableListOf(
           Sismo("S1","Los Andes", 4.2 ),
           Sismo("S1","Los Lagos", 5.2 ),
        Sismo("S1","La Calera", 2.5 ),
        Sismo("S1","Chimbarongo" , 4.7 ),
        Sismo("S1","Santiago", 3.2 ),
        Sismo("S1","Castro", 2.9 ),
        Sismo("S1","Puerto Montt", 3.7 ),
        Sismo("S1","Arica", 5.2 ),
           Sismo("S1","Iquique", 4.2 )


       )
        val dataEmpty = mutableListOf<Sismo>()
    }
}