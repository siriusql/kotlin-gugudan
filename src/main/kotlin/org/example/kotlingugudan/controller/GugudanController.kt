package org.example.kotlingugudan.controller

import org.example.kotlingugudan.service.GugudanService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/gugudan")
class GugudanController (
    private val gugudanService: GugudanService
){

    @GetMapping("/{dan}")
    fun gugudan(@PathVariable dan: Int) : ResponseEntity<List<String>>{

        var result:List<String> = gugudanService.gugudan(dan)

        return ResponseEntity.ok(result)
    }
}