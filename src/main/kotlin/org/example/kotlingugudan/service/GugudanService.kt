package org.example.kotlingugudan.service

import org.springframework.stereotype.Service

@Service
class GugudanService {
    fun gugudan(dan:Int):List<String>{

        var result = mutableListOf<String>()

        for(i in 1..9){
            result.add("${dan} x ${i} = ${dan*i}")
        }

        return result;
    }
}