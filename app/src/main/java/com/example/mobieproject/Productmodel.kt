package com.example.mobieproject

class Productmodel {
    var name: String? = null
    var Price: Int? = null
    var detail: String? = null
    var key: String? = null
    var image: String? = null

    constructor()
    constructor(name: String?, Price: Int?, detail: String?, key: String?, image: String?) {
        this.name = name
        this.Price = Price
        this.detail = detail
        this.key = key
        this.image = image
    }
    fun toMap(): Map<String, Any>{
        val result = HashMap<String, Any>()
        result.put("name",name!!)
        result.put("Price",Price!!)
        result.put("detail",detail!!)
        result.put("key",key!!)
        result.put("image",image!!)
        return result
    }
}